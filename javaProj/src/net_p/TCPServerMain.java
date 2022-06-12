package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			
			server = new ServerSocket(8888);  // 서버충돌없이 돌아가기위해 8888로 지정
			while(true) {
				System.out.println("서버는 돈다");
				Socket client = server.accept();    // 서버는 제공하는사람 클라이언트는 요청하는사람 혹은 제공을 받는사람이라함
				
				System.out.println("서버 : 클라이언트 접속 성공");  //클라이언트가 접속을해야만 문구가 뜸
				
				OutputStream os = client.getOutputStream();  // FileOutputStream 이랑 똑같음
				DataOutputStream dos = new DataOutputStream(os);
				
				dos.writeUTF("나는 킹왕짱 김지원입니다. 죄송합니다.");
				
				dos.close();
				os.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
