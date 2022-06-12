package exam;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;





class TCPMulFrame extends JFrame implements ActionListener{  // 클래스TCPMulFrame 에 JFrame 상속 에
	
	String name;
	ObjectOutputStream dos;
	ObjectInputStream dis;
	
	JTextArea ta;
	JTextField tf, mip, mid, mport;
	JButton jb;
	JComboBox<String> dstTF;
	
	
	
	class TCPSingleReceiver extends Thread{
		
		@Override
		public void run() {
			try {
				TCPChatData first = new TCPChatData();
				first.src = name;
				first.dst = "서버";
				first.msg = "서버는 처음이야";
				dos.writeObject(first);
				dos.flush();
				dos.reset();
				
				while(dis!=null) {
					//System.out.println(dis.readUTF());
					TCPChatData data = (TCPChatData)dis.readObject();
					System.out.println(data);
					
					if(data.dst.equals("서버")) {
						//화면을 갱신해주셈
						dstTF.removeAllItems();
						dstTF.addItem("a");
						
						for (String vv: data.mems) {
							dstTF.addItem(vv);	
						}
						
						getContentPane().revalidate();
					}
					
					
					if(name.equals(data.src)) {
						ta.append("[나]"+data.msg+"\n");
					}else {
						ta.append("["+data.src+"]"+data.msg+"\n");
					}
					
					
					ta.setCaretPosition(ta.getDocument().getLength());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		
	}
	
	public TCPMulFrame() {
		super("버디버디");
		
		
		
//		try {
//			//name = "["+InetAddress.getLocalHost()+"]";
//			this.name =  name;
//			dos = new ObjectOutputStream(soc.getOutputStream());
//			dis = new ObjectInputStream(soc.getInputStream());
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		
		setBounds(50, 50, 400,500);
		
		ta = new JTextArea();
		ta.setEditable(false);
		
		tf = new JTextField();
		jb = new JButton("연결");
		
		Vector<String>items = new Vector<String>();
		items.add("a");
		
	
		dstTF = new JComboBox<String>(items);
		
		dstTF.setPreferredSize(new Dimension(100, 50));
		tf.setPreferredSize(new Dimension(270, 50));
		
		
		add(new JScrollPane(ta),"Center");
		JPanel jp = new JPanel();
		JPanel jp2 = new JPanel();
		JLabel j1 = new JLabel("IP");
		JLabel j2 = new JLabel("닉네임");
		JLabel j3 = new JLabel("Port");
		mip = new JTextField();
		mid = new JTextField();
		mport = new JTextField();
		
		//mip.setPreferredSize((new Dimension(100, 30));
		mid.setPreferredSize(new Dimension(100, 50));
		mport.setPreferredSize(new Dimension(200, 50));
	
		
		jp2.add(j1);
		jp2.add(mip);
		
		jp2.add(j2);
		jp2.add(mid);

		jp2.add(j3);
		jp2.add(mport);

		jp2.add(jb);
		
		
		jp.add(dstTF);
		jp.add(tf);
		add(jp,"South");
		add(jp2,"North");
		
		setVisible(true);
		
		tf.requestFocus();
		tf.addActionListener(this);
		jb.addActionListener(this);		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//new TCPSingleReceiver().start();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()== jb) {
		
			
		}
		
		//String msg = tf.getText();
		//System.out.println(msg);
		
		//ta.append("[나] "+msg+"\n");
		//ta.setCaretPosition(ta.getDocument().getLength());
		try {
			//dos.writeUTF(msg);
			TCPChatData data = new TCPChatData();
			
			//String [] arr = msg.split("_");
			//data.dst = arr[0];
			//data.msg = arr[1];
			
			data.src = name;
			data.dst = (String)dstTF.getSelectedItem();
			data.msg = tf.getText();
			
			dos.writeObject(data);
			dos.flush();
			dos.reset();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		tf.setText("");
		tf.requestFocus();
		
		
	}
}


public class TCPMulClientMain2 {

	public static void main(String[] args) {
	
	
		try {
			//String name = JOptionPane.showInputDialog("닉네임 입력");
			
			String addr = "192.168.20.21";
			Socket socket = new Socket(addr, 8888);
			System.out.println("클라이언트 : "+addr+"접속 성공");
			
			new TCPMulFrame();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
	}

}
