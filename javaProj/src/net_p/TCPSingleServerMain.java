package net_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net_p.TCPSingleFrame;

class TCPSingleSender extends Thread{  // Ŭ���� TCPSingleSender �� Thread ���
	String name;  // ���ڿ� ������� name ����
	ObjectOutputStream dos; // Data���� ������� dos ���� 
	
	public TCPSingleSender(Socket soc) { // ��𿡼��� ������ ������ (Socket ���Ƿ� �����ϴ� ��Ʈ ���� soc�� ����)
		 try {   // try catch ���(���� �߻��� �����Ҽ��ִ� ����)
			name = "["+InetAddress.getLocalHost()+"]"; // name�� InetAddress(ip�ּҸ��˱�����), getLocalHost(������� ip�ּҸ� �ҷ���)
			dos = new ObjectOutputStream(soc.getOutputStream()); //dos�� ObjectOutputStream ���� ip�ּҿ� ��Ʈ ��ȣ�� ����
			
		 } catch (Exception e) { // try catch ���
			// TODO Auto-generated catch block
			e.printStackTrace(); // ���� �߻����� ã�Ƴ� �ܰ躰�� �˷���
		}
		 
	 }
	
	@Override
	public void run() {  // run �޼ҵ带 �������̵� ��
		Scanner sc = new Scanner(System.in); // ����� �����Է��� ���� Scanner ���
	try { //try catch ���
		while(dos != null) {  // dos �� �����Ͱ��� ������ ���� ���ƶ�!!
			String str = sc.nextLine(); // ����ڰ� �Է��Ͽ� ���ڸ� �޾ƿ���
			dos.writeUTF(name+str);     // ���ڸ� ���� (ip�ּ�+���� �Է��� ���ڵ�)
		}
	} catch (Exception e) { // catch ��� ������ ��Ƴ�����
		// TODO: handle exception
    	}
	}
	
}



class TCPSingleFrame extends JFrame implements ActionListener{ // Ŭ����TCPSingleFrame ����, JFrame ���(ä��â�� ���� ����),
	                                                           //���߻���� ���� ActionListener ���
	
	String name;  // ������� name
	ObjectOutputStream dos; // ������� dos(�����͸� ����)
	ObjectInputStream dis; // ������� dis(������ �����Ѱ��� ������)
	
	JTextArea ta; // �������� ���ڿ��� �Է¹��� �� �ִ� â(�����Է��� ���ڰ� ȭ�鿡 ���̴�)
	JTextField tf; // ������ ���ڿ��� �Է¹޴� â (�ؽ�Ʈ �Է� ���� <����> Ű�� �ԷµǸ� Action �̺�Ʈ �߻�) 
	
	class TCPSingleReceiver extends Thread{ // Ŭ���� TCPSingleReceiver����, Thread ���
		
		@Override
		public void run() { // ������ ��������� �������̵� 
			try { // try catch ���
				while(dis != null) { // �ݺ����� ���� ��������� ������� ������ ���� ���ư�
					//System.out.println(dis.readUTF());
					ta.append("[��] "+dis.readUTF()+"\n"); // ���� �Է��� â�� ������ ����Ȱ� ip�ּҸ� �����ص� �ٹٲ���
					ta.setCaretPosition(ta.getDocument().getLength()); //â Ŀ���� ���� ����������(��ũ���� �ȴ�.)
				} 
			} catch (Exception e) { // ����ó�� 
				// TODO: handle exception
			}
		}
		
	}

	
	
	public TCPSingleFrame(Socket soc, String title) { // ��Ʈ�ѹ��� ���ڿ� title �־���
		super(title); // �������� title
		
		 try { // try catch
				name = "["+InetAddress.getLocalHost()+"]"; // name�� ip �ּҸ� �����ִ�(getLocalHost : �� pc �� �˷���)
				dos = new ObjectOutputStream(soc.getOutputStream());// dos �� �����͸� ����, ��Ʈ�ѹ� ����
				dis = new ObjectInputStream(soc.getInputStream());//dis �� ������ ������,  ��Ʈ�ѹ� ���
				
			 } catch (Exception e) { // catch ���� ��´�
				// TODO Auto-generated catch block
				e.printStackTrace(); // ��� ������ ��Ƴ��� �������
			}
		
		
		setBounds(50,50,400,500); // frame ������ ���� x��,y��,����,����
		ta = new JTextArea();  // ta �⺻�����ڸ� �������
		tf = new JTextField(); // tf �⺻�����ڸ� �������
		
		ta.setEditable(false); // �Էµ� ���ڿ� ��ȯ
		
		add(new JScrollPane(ta),"Center"); // jscrollpane �ȿ� ta �� �߾����� ����
		add(tf,"South"); // ���ʿ� ä��â~
		
	
		
		
		setVisible(true); // jframe ȭ�鿡 �������� ����
		
		tf.requestFocus(); // Ŀ���� �� ������ ���ٴµ� ���� �۾� �������
		tf.addActionListener(this); // ä��ġ�� ���ʹ����� ȭ������ ���������� ���(����Ű�� ����)
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // frame ����� ���α׷� ����
		
		new TCPSingleReceiver().start(); // TCPSingleReceiver ������ jfrmae �� ��������� �Է��ϱ� ���� ������ ����.
	}

	@Override
	
	public void actionPerformed(ActionEvent e) { // actionPerformed �������̵� (����ġ�� ȣ��ǰ�)
		String msg = tf.getText(); // ���ڿ� msg ���� ���� (ä���Է¹޴� ĭ �ؽ�Ʈ)
		//System.out.println(msg);
		
		//ta.append("[��] "+msg+"\n"); // frame ȭ�鿡 ���� ģ �۾����� ���´� ����ġ�� �ٹٲ�~
		//ta.setCaretPosition(ta.getDocument().getLength());
		try {
			dos.writeUTF(msg);
			//dos.writeUTF(name+msg);  //ä��ģ�� ����
			dos.flush();
			dos.reset();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		tf.setText(""); // �ؽ�Ʈ �ҷ���
		tf.requestFocus();// ������ �ǻ� ���ص� ����
		
	}	

}




public class TCPSingleServerMain { // ���� Ŭ����

	public static void main(String[] args) { // ����
		
		try { //try catch ���
			
			ServerSocket server = new ServerSocket(8888); // server ���� ���� ( ������ ���� ��Ʈ ��ȣ�� 8888)
			Socket client = server.accept(); // client ������ ��Ʈ�� 8888������ �����Ҷ����� ����� Ŭ���̾�Ʈ�� ����Ǹ� socket ��ü�� ��ȯ��
			System.out.println("���� : " + client.getInetAddress() + "���Ӽ���");// ��� Ŭ���̾�Ʈ,ip�ּ� 
			
			//TCPSingleFrame frmae =
			new TCPSingleFrame(client,"����");  //������ TCPSingleFrame ()
			//new TCPSingleSender(client).start();   // �� receiver ���� sender�� ���� �־���� 
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
