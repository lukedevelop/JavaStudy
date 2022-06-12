package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UniCastSenderMain {

	public static void main(String[] args) {
		
		try {
			String msg = "지각";
			byte [] buf = msg.getBytes(); // byte 배열로 만드는
			
			InetAddress addr = InetAddress.getByName("192.168.150.50"); // 내IP 적음

			DatagramPacket data = new DatagramPacket(
					buf, 
					buf.length,
					addr, 
					8888);

			DatagramSocket socket = new DatagramSocket();
			
			socket.send(data); // data 를 보낼거임
			
			
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("sender 송신 완료");
		
	}

}
