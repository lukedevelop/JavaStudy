package net_p;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

class TCPChatData implements Serializable{
	
	private static final long serialVersionUID = 54890L;
	
	String msg;
	String dst, src;
	
	public TCPChatData(String src, String dst, String msg) {
		super();
		this.src = src;
		this.dst = dst;
		this.msg = msg;
	}
	

	@Override
	public String toString() {
		return "TCPChatData [src=" + src + ", dst=" + dst + ", msg=" + msg + "]";
	}
	
}


public class TCPMulServerMain { // TCPMulServerMain 생성
	
	ArrayList<ObjectOutputStream> list; // 멤버변수 list는 ObjectOutputStream 형태로만 넣는다는(데이터 값이 저장 (배열식으로))
	
	
	public TCPMulServerMain() { // TCPMulServerMain 
		try { // try catch 사용
			list = new ArrayList<ObjectOutputStream>(); // list 생성
		
			
			ServerSocket server = new ServerSocket(8888); // 서버를 포트넘버 8888로 지정
		    System.out.println("서버시작");  // 출력문 실행
		    
		    while(true) { // 코드 8888에 들어올때마다 반복문
		    	Socket client = server.accept();  //서버 소캣을 열어 클라이언트들을 받음
//		    	System.out.println(client.getInetAddress()+"접속");
		    	
		    	new TCPMulServerReceiver(client).start(); //클라이언트가 들어올때마다 쓰레드 실행
		    }
		    
		} catch (IOException e) { // catch
			// TODO Auto-generated catch block
			e.printStackTrace(); // 오류를 잡아내려함
		}
		
	}
	
	class TCPMulServerReceiver extends Thread{ // 클래스 TCPMulServerReceiver 에 thread 상속
		ObjectInputStream dis; // dis 는 (저장한 데이터 내보냄)
		ObjectOutputStream dos; // dos 는 (데이터 저장)
		String name; // 멤버변수 name(문자열)
		
		public TCPMulServerReceiver(Socket client) { // 소켓은 client
			try {
				dos = new ObjectOutputStream(client.getOutputStream()); //보내는 빨대 (쓰는거)
				dis = new ObjectInputStream(client.getInputStream());  // 들어오는 빨대 (읽는거)
				name = "["+client.getInetAddress()+"]";
				System.out.println(name+"접속");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		@Override
		public void run() {
			try {			
				
				//sendToAll(name + "접속");
				list.add(dos);
				//sendToAll("[현재 접속자 수]"+list.size());
				//while(dis != null) {
				while(true) {
					sendToAll(dis.readUTF());
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				list.remove(dos);
				sendToAll(name+"퇴장");
				sendToAll("[현재 접속자 수]"+list.size());
			}
		}
	}
	
	void sendToAll(String msg) {
		
		for (ObjectOutputStream dd : list) { 
			try {
				dd.writeUTF(msg);
				dd.flush();
				dd.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	
	void sendToOne(String no, String msg) {
		 
			try {
				ObjectOutputStream dd = list.get(Integer.parseInt(no));
				dd.writeUTF(msg);
				dd.flush();
				dd.reset();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	
	public static void main(String[] args) {
		new TCPMulServerMain();
			
	}

}
