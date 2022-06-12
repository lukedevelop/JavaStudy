package net_p;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class TCPChatData implements Serializable{
	
	private static final long serialVersionUID = 54890L;
	
	String msg;
	String dst, src;
	
	public TCPChatData(String src, String dst, String msg) {
		super();
		this.src = src;
		this.dst = dst;
		this.msg = msg;
	}
	

	@Override
	public String toString() {
		return "TCPChatData [src=" + src + ", dst=" + dst + ", msg=" + msg + "]";
	}
	
}


public class TCPMulServerMain { // TCPMulServerMain ����
	
	ArrayList<ObjectOutputStream> list; // ������� list�� ObjectOutputStream ���·θ� �ִ´ٴ�(������ ���� ���� (�迭������))
	
	
	public TCPMulServerMain() { // TCPMulServerMain 
		try { // try catch ���
			list = new ArrayList<ObjectOutputStream>(); // list ����
		
			
			ServerSocket server = new ServerSocket(8888); // ������ ��Ʈ�ѹ� 8888�� ����
		    System.out.println("��������");  // ��¹� ����
		    
		    while(true) { // �ڵ� 8888�� ���ö����� �ݺ���
		    	Socket client = server.accept();  //���� ��Ĺ�� ���� Ŭ���̾�Ʈ���� ����
//		    	System.out.println(client.getInetAddress()+"����");
		    	
		    	new TCPMulServerReceiver(client).start(); //Ŭ���̾�Ʈ�� ���ö����� ������ ����
		    }
		    
		} catch (IOException e) { // catch
			// TODO Auto-generated catch block
			e.printStackTrace(); // ������ ��Ƴ�����
		}
		
	}
	
	class TCPMulServerReceiver extends Thread{ // Ŭ���� TCPMulServerReceiver �� thread ���
		ObjectInputStream dis; // dis �� (������ ������ ������)
		ObjectOutputStream dos; // dos �� (������ ����)
		String name; // ������� name(���ڿ�)
		
		public TCPMulServerReceiver(Socket client) { // ������ client
			try {
				dos = new ObjectOutputStream(client.getOutputStream()); //������ ���� (���°�)
				dis = new ObjectInputStream(client.getInputStream());  // ������ ���� (�д°�)
				name = "["+client.getInetAddress()+"]";
				System.out.println(name+"����");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {			
				
				//sendToAll(name + "����");
				list.add(dos);
				//sendToAll("[���� ������ ��]"+list.size());
				//while(dis != null) {
				while(true) {
					sendToAll(dis.readUTF());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				list.remove(dos);
				sendToAll(name+"����");
				sendToAll("[���� ������ ��]"+list.size());
			}
		}
	}
	
	void sendToAll(String msg) {
		
		for (ObjectOutputStream dd : list) { 
			try {
				dd.writeUTF(msg);
				dd.flush();
				dd.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	void sendToOne(String no, String msg) {
		 
			try {
				ObjectOutputStream dd = list.get(Integer.parseInt(no));
				dd.writeUTF(msg);
				dd.flush();
				dd.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	public static void main(String[] args) {
		new TCPMulServerMain();
			
	}

}
