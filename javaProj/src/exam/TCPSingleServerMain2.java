package exam;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class TCPSingleSender extends Thread{
	String name;
	ObjectOutputStream dos;
	public TCPSingleSender(Socket soc) {
		try {
			name = "["+InetAddress.getLocalHost()+"]";
			dos = new ObjectOutputStream(soc.getOutputStream());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		Scanner sc = new Scanner(System.in);
		try {
			while(dos!=null) {
				String str = sc.nextLine();
				dos.writeUTF(name+str);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}





class TCPSingleFrame extends JFrame implements ActionListener{
	
	String name;
	ObjectOutputStream dos;
	ObjectInputStream dis;
	
	JTextArea ta;
	JTextField tf;
	
	class TCPSingleReceiver extends Thread{
		
		@Override
		public void run() {
			try {
				while(dis!=null) {
					//System.out.println(dis.readUTF());
					ta.append(dis.readUTF()+"\n");
					ta.setCaretPosition(ta.getDocument().getLength());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	public TCPSingleFrame(Socket soc,String title) {
		super(title);
		
		try {
			name = "["+InetAddress.getLocalHost()+"]";
			dos = new ObjectOutputStream(soc.getOutputStream());
			dis = new ObjectInputStream(soc.getInputStream());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		setBounds(1920+50, 50, 400,500);
		ta = new JTextArea();
		tf = new JTextField();
		ta.setEditable(false);
		
		add(new JScrollPane(ta),"Center");
		add(tf,"South");
		
		setVisible(true);
		
		tf.requestFocus();
		tf.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		new TCPSingleReceiver().start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = tf.getText();
		//System.out.println(msg);
		
		//ta.append("[��] "+msg+"\n");
		//ta.setCaretPosition(ta.getDocument().getLength());
		try {
			dos.writeUTF(msg);
			
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		tf.setText("");
		tf.requestFocus();
		
		
	}
}



public class TCPSingleServerMain2 {

	public static void main(String[] args) {

		try {

			ServerSocket server = new ServerSocket(8888);
			Socket client = server.accept();
			System.out.println("���� : "+client.getInetAddress()+" ���Ӽ���");
			
		
			new TCPSingleFrame(client,"����");
			//new TCPSingleSender(client).start();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
