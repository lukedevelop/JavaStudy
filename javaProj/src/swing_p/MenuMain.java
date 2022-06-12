package swing_p;

import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MenuMain extends JFrame {

	public MenuMain(String name) {
		super(name);
		setBounds(100, 50, 600, 400);
		
		JMenuBar bar = new JMenuBar();    // JMenuBar: 메뉴바 만듦
		setJMenuBar(bar);
		
		JMenu main1 = new JMenu("파일");
		JMenu main2 = new JMenu("편집");
		JMenu main3 = new JMenu("보기");
		
		
	
		/* Jmenu 에 단축키 적용 불가
		 * m1_3.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_F,
				KeyEvent.CTRL_MASK));  */        //단축키 설정법
		
		
		
		JMenuItem main4 = new JMenuItem("도구");  // JMenuItem": 은 안에 더 메뉴보기가 나옴
		bar.add(main1);
		bar.add(main2);
		bar.add(main3);
		bar.add(main4);
		bar.add(new JButton("버튼"));  // 메뉴바 라인에 버튼 형성
		bar.add(new JLabel("라벨이야"));
		bar.add(new JTextField("써봐"));
		

		
		JMenuItem m1_1 = new JMenuItem("새로 만들기");     // main1 파일 메뉴에 메뉴아이템으로 3개의 보기를 더 만듦
		JMenuItem m1_2 = new JMenuItem("개로 만들기");
		m1_2.setText("고양이로 변신");
		
		ImageIcon icon = new ImageIcon("fff/pen.png");
		JMenuItem m1_3 = new JMenuItem("소로 만들기",icon);  //menuitem 에도 이미지 삽입 가능
		
		m1_3.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_D,
				KeyEvent.CTRL_MASK));          //단축키 설정법
		
//		ImageIcon icon = new ImageIcon("fff/Chalsu.jpg");  
//		ImageIcon icon = new ImageIcon("fff/pen.png");  
//		JMenuItem m1_3 = new JMenuItem("소로 만들기",icon);  //menuitem 에도 이미지 삽입 가능
		
		
		
		main1.add(m1_1);
		main1.add(m1_2);
		main1.add(m1_3);
		JButton bb = new JButton("저장");
		bb.setText("고장");
		main1.add(bb);
		main1.addSeparator();          //경계선을 만듦
		main1.add(new JLabel("소장"));
		main1.add(new JTextField("간장게장"));
		
		
		JMenu m2_1 = new JMenu("속성");      //옆으로 빠질수있는 삼각형 형성 메뉴하나 더추가가능(?)
		JMenu m2_2 = new JMenu("환경설정");
		
		m2_1.add(new JMenuItem("머릿글"));    // Menu"속성" 안에 머릿글,꼬릿글 menuitem 생성
		m2_1.add(new JMenuItem("꼬릿글"));
		
		JMenuItem m2_2_1 = new JMenuItem("글꼴");
		JMenuItem m2_2_2 = new JMenuItem("결과창");
		
		m2_2_1.setEnabled(false);        // menuitem"글꼴" 선택불가
		m2_2_2.setSelected(true);        //선택가능
		
		m2_2.add(m2_2_1);                // Menu"환경설정" 안에  글꼴,결과창 menuitem 생성
		m2_2.add(m2_2_2);
		
		main2.add(m2_1);
		main2.add(m2_2);
		
		
	
		
		main3.add(new JLabel("화면"));
		
		JCheckBoxMenuItem m3_1 = new JCheckBoxMenuItem("안내선",true);         // "JCheckBoxMenuItem" 체크박스 생성 ((true) 미리 체크되어있음)
		JCheckBoxMenuItem m3_2 = new JCheckBoxMenuItem("격자");
		m3_2.setSelected(true);    // 격자 체크되어있음
		main3.add(m3_1);
		main3.add(m3_2);
		main3.addSeparator();
		main3.add(new JLabel("장비"));
		JRadioButtonMenuItem m3_3 = new JRadioButtonMenuItem("핸드폰");         
		JRadioButtonMenuItem m3_4 = new JRadioButtonMenuItem("태블릿",true);
		JRadioButtonMenuItem m3_5 = new JRadioButtonMenuItem("데스크탑");
		m3_2.setSelected(true);    
		main3.add(m3_3);
		main3.add(m3_4);
		main3.add(m3_5);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(m3_3);
		bg.add(m3_4);
		bg.add(m3_5);
		
		
		
		
		
		setVisible(true);
		setResizable(false);  //창크기 변경유뮤
		//setExtendedState(MAXIMIZED_BOTH); // 창 최대화
		//setExtendedState(getExtendedState()); // 창 현재크기
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MenuMain("메뉴바입니다.");
		
	}

}
