package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UniCastReceiverMain {

	public static void main(String[] args) {
		

		try {
			while(true) {
				DatagramSocket socket = new DatagramSocket(8888);  // upd ���� ��Ĺ
				
				byte [] buf = new byte [1024];
				
				DatagramPacket dp = new DatagramPacket(buf, buf.length); //(buf�� �������̰� �ִ�������ִ°� buf.lengt ��)
				
				socket.receive(dp); // dp ���� ��������
				
				socket.close(); // �ݱ�
				
				//System.out.println(dp.getAddress());
				//System.out.println(Arrays.toString(buf));
				String msg = new String(buf); // new String �� byte �� ���������� �׷��� ���ڷ� ������
				//System.out.println("���ŵ� �޼���"+msg);
				System.out.println(dp.getAddress()+":"+msg);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
