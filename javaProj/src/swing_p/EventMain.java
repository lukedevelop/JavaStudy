package swing_p;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


//이벤트 핸들러 클래스 정의 ->ActionListener : 리스너에 해당하는 인터페이스
class MyBtnList implements ActionListener{
	
	JLabel label;
	JButton button;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("눌렀다");
		label.setText("전문기 만세");   // "송지은만세" 에서 누르면 전문기 만세로 바뀜
		label.setBackground(Color.blue);
		label.setForeground(Color.white);   //"전문기 만세" 배경색이 파랑색으로 변함
		button.setEnabled(false);  //버튼을 누르면 그다음 안눌림
	
	}

	
}


public class EventMain {

	public static void main(String[] args) {
		JFrame f = new JFrame("이벤트 발생");
		f.setBounds(50, 50, 300, 200);
		f.setLayout(new FlowLayout());
		
		JButton btn = new JButton("눌러봐");
		JLabel lb = new JLabel("송지은 만세");
		lb.setOpaque(true);
		
		f.add(btn);
		f.add(lb);

		MyBtnList mbl = new MyBtnList();
		mbl.label = lb;
		mbl.button = btn;   //버튼을 누르면 그다음 안눌림
		
		
		//btn: 이벤트소스                   -->버튼
		//ActionListener: 이벤트 리스너      -->을 누르면
		//mbl : 이벤트 핸들러                -->actionPerformed : 눌렀다 출력
		btn.addActionListener(mbl);   //버튼을 누르면 눌렀다라고 출력
		
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
