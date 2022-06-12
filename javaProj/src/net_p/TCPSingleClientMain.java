package net_p;

import java.io.IOException;
import java.net.Socket;

import net_p.TCPSingleFrame;

public class TCPSingleClientMain {

	public static void main(String[] args) {
		try {
			String addr = "192.168.150.50"; // ip주소 입력해라
			Socket socket = new Socket(addr,8888); // ip 주소랑 포켓넘버 입력
			System.out.println("클라이언트 : " + addr + "서버 접속성공"); // 클라이언트가 들어갈 경우 ip주소가 뜸
			
			//TCPSingleFrame frmae = 
			new TCPSingleFrame(socket,"클라이언트");  // 생성자 TCPSingleFrame 을 불러 (소켓 넘버, 창이름"클라이언트")
			
			//new TCPSingleSender(socket).start();
			//new TCPSingleReceiver(socket).start();
		} catch (IOException e) { // catch
			// TODO Auto-generated catch block
			e.printStackTrace(); // 오류를 잡아내거라
		}

	}

}
