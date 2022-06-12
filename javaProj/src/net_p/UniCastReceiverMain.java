package net_p;

import java.net.DatagramPacket;
import java.net.DatagramSocket;


public class UniCastReceiverMain {

	public static void main(String[] args) {
		

		try {
			while(true) {
				DatagramSocket socket = new DatagramSocket(8888);  // upd 전용 소캣
				
				byte [] buf = new byte [1024];
				
				DatagramPacket dp = new DatagramPacket(buf, buf.length); //(buf로 받을것이고 최대받을수있는건 buf.lengt 임)
				
				socket.receive(dp); // dp 에다 담을거임
				
				socket.close(); // 닫기
				
				//System.out.println(dp.getAddress());
				//System.out.println(Arrays.toString(buf));
				String msg = new String(buf); // new String 은 byte 를 받을수있음 그래서 문자로 보여줌
				//System.out.println("수신된 메세지"+msg);
				System.out.println(dp.getAddress()+":"+msg);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	}

}
