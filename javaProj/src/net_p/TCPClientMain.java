package net_p;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


public class TCPClientMain {

	public static void main(String[] args) {
		
		
			try {
				Socket socket = new Socket("192.168.150.77",8888);  // "��IP 192.168.20.21 �ּ�" , 8888(����) 
				System.out.println("Ŭ���̾�Ʈ : �������� ����");
				
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				System.out.println("Ŭ���̾�Ʈ : "+dis.readUTF());
				
				dis.close();
				is.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
