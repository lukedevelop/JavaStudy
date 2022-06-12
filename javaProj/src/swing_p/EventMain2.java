package swing_p;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


// GUI 클래스인 경우 상속받아 처리시 메소드 등 멤버처리가 용이
public class EventMain2 extends JFrame implements WindowListener{
	
	//컴포넌트를 멤버변수 처리시 이벤트 핸들러에서 접근이 쉽다
	JButton btn = new JButton("눌러바");
	JLabel lb = new JLabel("송지은 만세2");
	
	//이벤트핸들러 클래스 정의를 이너클래스로 정의시 아웃터(GUI 컨테이너)클래스의 멤버요소에 쉽게 접근
	class MyBtnList implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("눌렀다2");
			lb.setText("전문기 만세2");
			lb.setBackground(Color.blue);
			lb.setForeground(Color.white);
			btn.setEnabled(false);	
		}
	}
	
	
	
	//생성자로 처리하여 static 문제 해결
	public EventMain2() {
		super("이벤트 발생2");
		setBounds(50, 50, 300,200);
		setLayout(new FlowLayout());
		
		lb.setOpaque(true);
		
		add(btn);
		add(lb);
		
		
		MyBtnList mbl = new MyBtnList();
		 
		btn.addActionListener(mbl);
		
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//창제어 리스너
		addWindowListener(this);
	}
	
	

	public static void main(String[] args) {
		new EventMain2();
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("창 닫힐라구요");
		//e.getWindow().dispose();  //컨테이너 종료
		dispose();
	}



	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
///////////////////////////////////////////////////////////////



//package swing_p;
//
//import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//
////이벤트 핸들러 클래스 정의 ->ActionListener : 리스너에 해당하는 인터페이스
//class MyBtnList implements ActionListener{
//	
//	JLabel label;
//	JButton button;
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("눌렀다");
//		label.setText("전문기 만세");   // "송지은만세" 에서 누르면 전문기 만세로 바뀜
//		label.setBackground(Color.blue);
//		label.setForeground(Color.white);   //"전문기 만세" 배경색이 파랑색으로 변함
//		button.setEnabled(false);  //버튼을 누르면 그다음 안눌림
//	
//	}
//
//	
//}
//
//
//public class EventMain2 extends JFrame implements WindowListener {
//	
//	public EventMain2(){
//		JFrame f = new JFrame("이벤트 발생");
//		f.setBounds(50, 50, 300, 200);
//		f.setLayout(new FlowLayout());
//		
//		JButton btn = new JButton("눌러봐");
//		JLabel lb = new JLabel("송지은 만세");
//		lb.setOpaque(true);
//		
//		f.add(btn);
//		f.add(lb);
//
//		MyBtnList mbl = new MyBtnList();
//		mbl.label = lb;
//		mbl.button = btn;   //버튼을 누르면 그다음 안눌림
//		
//		
//		//btn: 이벤트소스                   -->버튼
//		//ActionListener: 이벤트 리스너      -->을 누르면
//		//mbl : 이벤트 핸들러                -->actionPerformed : 눌렀다 출력
//		btn.addActionListener(mbl);   //버튼을 누르면 눌렀다라고 출력
//		
//		
//		
//		f.setVisible(true);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		
//	}
//	
//	
//	
//
//	public static void main(String[] args) {
//		new EventMain2();
//		
//	}
//
//}
