package exam;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Vector;


class TCPChatData implements Serializable{
	
	private static final long serialVersionUID = 54890L;
	
	String msg;
	String dst, src;
	Vector<String> mems;
	public TCPChatData(String src, String dst, String msg) {
		super();
		this.src = src;
		this.dst = dst;
		this.msg = msg;
	}
	
	public TCPChatData() {
		// TODO Auto-generated constructor stub
	}
	String getTXT() {
		return src+msg;
	}

	@Override
	public String toString() {
		return "TCPChatData [src=" + src + ", dst=" + dst + ", msg=" + msg + ", mems=" + mems + "]";
	}

	
	
}



public class TCPMulserverMain2 {

	//ArrayList<ObjectOutputStream> list;
	HashMap<String, ObjectOutputStream> map;
	
	public TCPMulserverMain2() {
		try {
			//list = new ArrayList<ObjectOutputStream>();
			map = new HashMap<String, ObjectOutputStream>();
			
			Collections.synchronizedMap(map);
			
			ServerSocket server = new ServerSocket(8888);
			System.out.println("��������");
			
			while(true) {
				Socket client = server.accept();

				new TCPMulSeverReceiver(client).start();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	class TCPMulSeverReceiver extends Thread{
		ObjectInputStream dis;
		ObjectOutputStream dos;
		String name;
		
		public TCPMulSeverReceiver(Socket client) {
			try {
				dos = new ObjectOutputStream(client.getOutputStream());
				dis = new ObjectInputStream(client.getInputStream());
				//name = "["+client.getInetAddress()+"]";
				//System.out.println(name+"����");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {
				
				//System.out.println("���� ���ù� ����");
				//sendToAll(name+" ����");
				//list.add(dos);
				//sendToAll("[���� ������ ��]"+list.size());
				//while(dis!=null) {
				while(true) {
					TCPChatData data = (TCPChatData)dis.readObject();
					System.out.println(data);
					if(data.dst.equals("����")) {
						name = data.src;
						map.put(data.src, dos);
						firstGo(data);
					}else if(data.dst.equals("a")) {
						
						sendToAll(data);
					}else {
						sendToOne(data, dos);
					}
//					String [] arr = msg.split("_");
//					if(arr[0].equals("a")) {
//						sendToAll(msg);
//					}else {
//						sendToOne(arr[0],msg);
//					}
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				map.remove(name);
				TCPChatData data = new TCPChatData();

				data.src = "����";
				data.dst = "a";
				data.msg = "����";
				firstGo(data);
				//list.remove(dos);
				//sendToAll(name+" ����");
				//sendToAll("[���� ������ ��]"+list.size());
			}
		}
	}
	
	void firstGo(TCPChatData data) {
		
		data.mems = new Vector(map.keySet());
		sendToAll(data);
	}
	
	void sendToAll(TCPChatData data) {
		for (ObjectOutputStream dd : map.values()) {
			try {
				dd.writeObject(data);
				dd.flush();
				dd.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	void sendToOne(TCPChatData data,ObjectOutputStream dos) {
			try {
				
				//ObjectOutputStream dd = list.get(Integer.parseInt(data.dst));
				ObjectOutputStream dd = map.get(data.dst);
				dd.writeObject(data);
				dd.flush();
				dd.reset();
				
				dos.writeObject(data);
				dos.flush();
				dos.reset();
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	
	public static void main(String[] args) {
		
		new TCPMulserverMain2();
		
	}

}
