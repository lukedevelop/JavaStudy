package net_p;

import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MultiCastReceiverMain {

	public static void main(String[] args) {
		try {
			MulticastSocket ms = new MulticastSocket(8888);
			InetAddress addr = InetAddress.getByName("230.0.0.1");
			ms.joinGroup(addr);
			
			byte [] buf = new byte[1024];
			
			DatagramPacket data = new DatagramPacket(buf, buf.length);
			ms.receive(data);
			
			ms.leaveGroup(addr);
			ms.close();
			
			System.out.println(new String(buf).trim());
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
