package net_p;

import java.io.IOException;
import java.net.Socket;

import net_p.TCPSingleFrame;

public class TCPSingleClientMain {

	public static void main(String[] args) {
		try {
			String addr = "192.168.150.50"; // ip�ּ� �Է��ض�
			Socket socket = new Socket(addr,8888); // ip �ּҶ� ���ϳѹ� �Է�
			System.out.println("Ŭ���̾�Ʈ : " + addr + "���� ���Ӽ���"); // Ŭ���̾�Ʈ�� �� ��� ip�ּҰ� ��
			
			//TCPSingleFrame frmae = 
			new TCPSingleFrame(socket,"Ŭ���̾�Ʈ");  // ������ TCPSingleFrame �� �ҷ� (���� �ѹ�, â�̸�"Ŭ���̾�Ʈ")
			
			//new TCPSingleSender(socket).start();
			//new TCPSingleReceiver(socket).start();
		} catch (IOException e) { // catch
			// TODO Auto-generated catch block
			e.printStackTrace(); // ������ ��Ƴ��Ŷ�
		}

	}

}
