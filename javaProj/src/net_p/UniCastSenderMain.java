package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UniCastSenderMain {

	public static void main(String[] args) {
		
		try {
			String msg = "����";
			byte [] buf = msg.getBytes(); // byte �迭�� �����
			
			InetAddress addr = InetAddress.getByName("192.168.150.50"); // ��IP ����

			DatagramPacket data = new DatagramPacket(
					buf, 
					buf.length,
					addr, 
					8888);

			DatagramSocket socket = new DatagramSocket();
			
			socket.send(data); // data �� ��������
			
			
			socket.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("sender �۽� �Ϸ�");
		
	}

}
