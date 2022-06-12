package net_p;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import net_p.TCPSingleFrame;

class TCPSingleSender extends Thread{  // 클래스 TCPSingleSender 에 Thread 상속
	String name;  // 문자열 멤버변수 name 설정
	ObjectOutputStream dos; // Data저장 멤버변수 dos 설정 
	
	public TCPSingleSender(Socket soc) { // 어디에서나 접근이 가능함 (Socket 임의로 지정하는 포트 변수 soc로 설정)
		 try {   // try catch 사용(예외 발생이 가능할수있는 문장)
			name = "["+InetAddress.getLocalHost()+"]"; // name은 InetAddress(ip주소를알기위함), getLocalHost(사용중인 ip주소를 불러옴)
			dos = new ObjectOutputStream(soc.getOutputStream()); //dos는 ObjectOutputStream 통해 ip주소와 포트 번호를 저장
			
		 } catch (Exception e) { // try catch 사용
			// TODO Auto-generated catch block
			e.printStackTrace(); // 에러 발생지를 찾아내 단계별로 알려줌
		}
		 
	 }
	
	@Override
	public void run() {  // run 메소드를 오버라이딩 함
		Scanner sc = new Scanner(System.in); // 사용자 직접입력을 위해 Scanner 사용
	try { //try catch 사용
		while(dos != null) {  // dos 의 데이터값이 없을때 까지 돌아라!!
			String str = sc.nextLine(); // 사용자가 입력하여 글자를 받아오면
			dos.writeUTF(name+str);     // 글자를 쏴라 (ip주소+내가 입력한 문자들)
		}
	} catch (Exception e) { // catch 모든 에러를 잡아내려함
		// TODO: handle exception
    	}
	}
	
}



class TCPSingleFrame extends JFrame implements ActionListener{ // 클래스TCPSingleFrame 생성, JFrame 상속(채팅창을 띄우기 위해),
	                                                           //다중상속을 통해 ActionListener 사용
	
	String name;  // 멤버변수 name
	ObjectOutputStream dos; // 멤버변수 dos(데이터를 저장)
	ObjectInputStream dis; // 멤버변수 dis(데이터 저장한것을 내보냄)
	
	JTextArea ta; // 여러줄의 문자열을 입력받을 수 있는 창(내가입력한 문자가 화면에 보이는)
	JTextField tf; // 한줄의 문자열을 입력받는 창 (텍스트 입력 도중 <엔터> 키가 입력되면 Action 이벤트 발생) 
	
	class TCPSingleReceiver extends Thread{ // 클래스 TCPSingleReceiver생성, Thread 상속
		
		@Override
		public void run() { // 쓰레드 사용을위해 오버라이딩 
			try { // try catch 사용
				while(dis != null) { // 반복문을 통해 저장공간이 비어있지 않을때 까지 돌아감
					//System.out.println(dis.readUTF());
					ta.append("[나] "+dis.readUTF()+"\n"); // 문자 입력한 창에 데이터 저장된것 ip주소를 보여준뒤 줄바꿔줌
					ta.setCaretPosition(ta.getDocument().getLength()); //창 커서를 같이 내려가게함(스크롤이 된다.)
				} 
			} catch (Exception e) { // 예외처리 
				// TODO: handle exception
			}
		}
		
	}

	
	
	public TCPSingleFrame(Socket soc, String title) { // 포트넘버와 문자열 title 넣어줌
		super(title); // 참조변수 title
		
		 try { // try catch
				name = "["+InetAddress.getLocalHost()+"]"; // name은 ip 주소를 보여주는(getLocalHost : 내 pc 를 알려줌)
				dos = new ObjectOutputStream(soc.getOutputStream());// dos 는 데이터를 저장, 포트넘버 저장
				dis = new ObjectInputStream(soc.getInputStream());//dis 는 데이터 저장한,  포트넘버 출력
				
			 } catch (Exception e) { // catch 오류 잡는다
				// TODO Auto-generated catch block
				e.printStackTrace(); // 모든 오류를 잡아낸다 순서대로
			}
		
		
		setBounds(50,50,400,500); // frame 사이즈 설정 x축,y축,가로,세로
		ta = new JTextArea();  // ta 기본생성자를 만들어줌
		tf = new JTextField(); // tf 기본생성자를 만들어줌
		
		ta.setEditable(false); // 입력된 문자열 반환
		
		add(new JScrollPane(ta),"Center"); // jscrollpane 안에 ta 를 중앙으로 해줌
		add(tf,"South"); // 남쪽에 채팅창~
		
	
		
		
		setVisible(true); // jframe 화면에 보여지기 위해
		
		tf.requestFocus(); // 커서가 젤 밑으로 간다는디 위에 글씨 못쓸라고
		tf.addActionListener(this); // 채팅치면 엔터눌러서 화면으로 보내기위해 사용(엔터키를 읽음)
		
		setDefaultCloseOperation(EXIT_ON_CLOSE); // frame 종료시 프로그램 종료
		
		new TCPSingleReceiver().start(); // TCPSingleReceiver 생성해 jfrmae 에 계속적으로 입력하기 위해 쓰레드 시작.
	}

	@Override
	
	public void actionPerformed(ActionEvent e) { // actionPerformed 오버라이딩 (엔터치면 호출되게)
		String msg = tf.getText(); // 문자열 msg 변수 생성 (채팅입력받는 칸 텍스트)
		//System.out.println(msg);
		
		//ta.append("[나] "+msg+"\n"); // frame 화면에 내가 친 글씨들이 나온다 엔터치면 줄바뀜~
		//ta.setCaretPosition(ta.getDocument().getLength());
		try {
			dos.writeUTF(msg);
			//dos.writeUTF(name+msg);  //채팅친걸 쏴라
			dos.flush();
			dos.reset();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		tf.setText(""); // 텍스트 불러옴
		tf.requestFocus();// 보험임 실상 안해도 괜춘
		
	}	

}




public class TCPSingleServerMain { // 메인 클래스

	public static void main(String[] args) { // 메인
		
		try { //try catch 사용
			
			ServerSocket server = new ServerSocket(8888); // server 변수 생성 ( 생성자 소켓 포트 번호는 8888)
			Socket client = server.accept(); // client 변수는 포트가 8888번으로 연결할때까지 대기후 클라이언트가 연결되면 socket 객체를 반환함
			System.out.println("서버 : " + client.getInetAddress() + "접속성공");// 출력 클라이언트,ip주소 
			
			//TCPSingleFrame frmae =
			new TCPSingleFrame(client,"서버");  //생성자 TCPSingleFrame ()
			//new TCPSingleSender(client).start();   // 꼭 receiver 보다 sender가 위에 있어야함 
			
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
