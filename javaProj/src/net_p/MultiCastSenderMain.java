package net_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class MultiCastSenderMain extends JFrame{
	
	MulticastSocket sender_ms = null;
	InetAddress sender_addr;
	
	class Mulreceiver extends Thread{
		MulticastSocket socket = null;
		
		@Override
		public void run() {
			try {
				socket = new MulticastSocket(Integer.parseInt(port.getText()));
				sender_addr = InetAddress.getByName(ip.getText());
				//socket.joinGroup(sender_addr);
				
			while(true) {
			
			byte [] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf, buf.length);
			socket.receive(dp);
			
			String msg = new String(buf);
			
			ta.append(dp.getAddress()+":"+msg+"\n");
			ta.setCaretPosition(ta.getDocument().getLength());
			
			}
			 } catch (Exception e) {
				// TODO: handle exception
				 e.printStackTrace();
			}finally {
				
			}
			
		}
		
	}
	
	JTextField ip, port, tf;
	JTextArea ta;
	JButton btnChat;
	
	Mulreceiver mr;
	
	
	public MultiCastSenderMain() {
		
		setBounds(50, 50, 400, 500);
		
		ip = new JTextField("192.168.150.54");
		port = new JTextField("8888");
		btnChat = new JButton("연결");
		
		JPanel np = new JPanel();
		np.add(ip);
		np.add(port);
		np.add(btnChat);
		
		add(np,"North");
		
		ta = new JTextArea();
		ta.setEditable(false);
		add(new JScrollPane(ta),"Center");
		
		tf = new JTextField();
		tf.setEditable(false);
		add(tf,"South");
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		tf.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
				if(btnChat.getText().equals("연결종료")) {
					try {
					byte [] buf = tf.getText().getBytes();
					
					DatagramPacket dp = new DatagramPacket(
							buf,
							buf.length,
							sender_addr,
							Integer.parseInt(port.getText()));
					
					
				     	sender_ms.send(dp);
						
						ta.append("[지원짱]:"+tf.getText()+"\n");
						ta.setCaretPosition(ta.getDocument().getLength());
						
						tf.setText("");
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		
		btnChat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(btnChat.getText().equals("연결")) {
					
					
					try {
						sender_ms = new MulticastSocket();
						sender_addr =  InetAddress.getByName(ip.getText());
						
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
					mr = new  Mulreceiver();
					mr.start();
					
					ip.setEditable(false);
					port.setEditable(false);
					
					btnChat.setText("연결종료");
					
				}else {
					sender_ms.close();
					sender_ms = null;
					
					mr.stop();
					mr.socket.close();
					mr.socket = null;
					
					ip.setEditable(true);
					port.setEditable(true);
					
					tf.setEditable(false);
					
					btnChat.setText("연결");
					
				}
				
			}
		});
		
				
	}
	
	public static void main(String[] args) {
		
		new MultiCastSenderMain();
		

	}
	

}
