package swing_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class EventSJEMain extends JFrame implements ActionListener{

	JLabel timerLB = new JLabel("시간:");
	JLabel res = new JLabel("결과:");
	JButton btn = new JButton("시험제출");
	ArrayList<JRadioButton> qq1 = new ArrayList<JRadioButton>();
	ArrayList<JCheckBox> qq2 = new ArrayList<JCheckBox>();
	boolean chk = false;   // 시험미제출 boolean
	
	class Timer extends Thread{    //타이머 설정
		@Override
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					sleep(1000);
					timerLB.setText("시간: " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			btn.setEnabled(false);   //시간이 초과되면 버튼이 안눌림
			if(!chk) {
				res.setText("시험 미제출");
			}
		
		}
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {          //ActionListener
		int jum = 0;
		if(qq1.get(1).isSelected()) {     //1번째문제 점수 개당 20점 설정
			jum+=20;
		}
		for(JCheckBox box : qq2) {        //2번째 문제들 점수 개당20점 
			if(box.isSelected());
			jum+=20;
		}
		res.setText("시험종료:"+jum);
		
	}
	
	
	
	public EventSJEMain() {
		super("송지은 퀴즈");
		setBounds(50, 50, 400, 600);
		setLayout(new GridLayout(13,1));   //(13,1) 인 이유 찾기
		timerLB.setHorizontalAlignment(JLabel.RIGHT); // "시간:" 문자 오른쪽으로 정렬 해줌
		add(timerLB);
		add(new JLabel("송지은의 특기는?"));
		
		ButtonGroup bg = new ButtonGroup();
		for (String tt : "잠자기,코딩,누워있기,전문기놀리기".split(",")) {
			JRadioButton rb1 = new JRadioButton(tt);  // for 문을 이용해 보기 여러가지 설정
			
//			JRadioButton rb1 = new JRadioButton("잠자기");  //보기 설정
			qq1.add(rb1);
			bg.add(rb1);
			add(rb1);
			
		}
		
		add(new JLabel("송지은의 취미는?"));
		
		for (String tt : "야동시청,코노야로,넷플릭스,전문기때리기".split(",")) {
			JCheckBox rb1 = new JCheckBox(tt);  // for 문을 이용해 보기 여러가지 설정
			qq2.add(rb1);
			add(rb1);
		}	
		
		add(btn);
		add(res);
		
		btn.addActionListener(this);
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Timer timer = new Timer();    //타이머
		timer.start();
	}
	
	
	public static void main(String[] args) {
		
		new EventSJEMain();

	}



}
