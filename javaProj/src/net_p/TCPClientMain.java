package net_p;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;


public class TCPClientMain {

	public static void main(String[] args) {
		
		
			try {
				Socket socket = new Socket("192.168.150.77",8888);  // "내IP 192.168.20.21 주소" , 8888(소켓) 
				System.out.println("클라이언트 : 서버접속 성공");
				
				InputStream is = socket.getInputStream();
				DataInputStream dis = new DataInputStream(is);
				
				System.out.println("클라이언트 : "+dis.readUTF());
				
				dis.close();
				is.close();
				socket.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		

	}

}
