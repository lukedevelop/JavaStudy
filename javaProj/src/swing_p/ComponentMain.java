package swing_p;

import java.awt.Color;
import java.util.Vector;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

import exam.Email;

public class ComponentMain {

	public static void main(String[] args) {
		
		JFrame f = new JFrame("제목이지롱요");
		//f.setSize(800,700);          // "setSize" 창크기 조절가능
		//f.setLocation(300,100);      // "setLocation" 위치 조정 (x,y)
	
		f.setBounds(300, 100, 800, 700);  // "setBounds" (x,y width,heigh) 창크기,위치 한번에 설정 
	
		//JButton b1 = new JButton("버튼");  // "JButton" 버튼 생성
		f.setLayout(null);        //
		
		
		JButton b1 = new JButton("버튼1");  // "JButton" 버튼 생성 
		b1.setBounds(50,30,100,50);
		b1.setBackground(Color.pink);      // "setBackground" 버튼 뒷배경 색상 설정
		f.add(b1);   //버튼 누를수있게함 (출력)
		
		JButton b2 = new JButton("버튼2");  // "JButton" 버튼 생성 
		b2.setBounds(50,30,100,50);
		b2.setBackground(Color.yellow);      //버튼 뒷배경 색상 설정
		f.add(b2);   //버튼 누를수있게함
		
		JButton b3 = new JButton("버튼3");  
		b3.setBounds(160,30,100,50);
		b3.setBackground(Color.green); 
		b3.setEnabled(false);    // "Enabled" 버튼을 사용할것인가 안할것인가 (false) 사용못함
		f.add(b3);  
		
		ImageIcon icon = new ImageIcon("fff/Food.jpg");   // ImageIcon: 버튼 뒷배경에 이미지 삽입(폴더명/사진정보)
		
		JButton b4 = new JButton("버튼4",icon);  
		b4.setBounds(270,30,100,50);
		b4.setBackground(Color.yellow); 
		b4.setVerticalTextPosition(0);      // "VerticalTextPosition"  "버튼4" 문자가 사진위에 나옴
		b4.setHorizontalTextPosition(0);    // "HorizontalTextPosition"
		f.add(b4);   
		
		JToggleButton tb1 = new JToggleButton("김치찌개");        // "JToggleButton" 버튼 누를때 버튼눌린 상태 유지
		tb1.setBounds(50,90,100,50);
		tb1.setBackground(Color.green); 
		f.add(tb1);  
		
		
		
		ButtonGroup bg = new ButtonGroup();    // "ButtonGroup" 버튼을 한그룹으로 모아 누름상태 한가지만 유지
		JToggleButton tb2 = new JToggleButton("떡라면");       
		tb2.setBounds(50,150,100,50);
		tb2.setBackground(Color.green); 
		f.add(tb2);  
		
		JToggleButton tb3 = new JToggleButton("만두라면");       
		tb3.setBounds(150,150,100,50);
		tb3.setBackground(Color.green); 
		f.add(tb3); 
		
		JToggleButton tb4 = new JToggleButton("치즈라면");       
		tb4.setBounds(250,150,100,50);
		tb4.setBackground(Color.green); 
		f.add(tb4); 
		
		bg.add(tb2);
		bg.add(tb3);
		bg.add(tb4);
		
		Vector<String> email1 = new Vector<String>();   //  "Vector" 
		email1.add("구르레");
		email1.add("니브레");
		email1.add("다음");
		email1.add("나테");
		
		JComboBox<String> box = new JComboBox<String>(email1);  // "JComboBox" vactor 안에있는 그룹중 문자 선택하여 먼저뜨게하는
		box.setBounds(200,90,100,50);
		box.setSelectedItem("다음");   // "setSelectedItem" 미리선택되어 먼저 뜨는거
		f.add(box); 
		
		JLabel genLB = new JLabel("성별");    // 텍스트 뜨게함
		genLB.setBounds(50,220,100,50);
		f.add(genLB);
		
		JRadioButton rb1 = new JRadioButton("남");            // "JRadioButton" 
		JRadioButton rb2 = new JRadioButton("여");
		JRadioButton rb3 = new JRadioButton("it인",true);   // "true" 는 JRbutton중 먼저선택되어 나타남
		JRadioButton rb4 = new JRadioButton("scv");
		
		rb1.setBounds(100,220,60,50);
		rb2.setBounds(160,220,60,50);
		rb3.setBounds(220,220,100,50);
		rb4.setBounds(320,220,100,50);
		
		f.add(rb1);
		f.add(rb2);
		f.add(rb3);
		f.add(rb4);
		
		ButtonGroup bg1 = new ButtonGroup(); 
		bg1.add(rb1);
		bg1.add(rb2);
		bg1.add(rb3);
		bg1.add(rb4);
		
		JLabel hobLB = new JLabel("취미");           // "JLabel" 
		hobLB.setBounds(50,280,100,50);
		f.add(hobLB);
		
		JCheckBox cb1 = new JCheckBox("코딩");
		JCheckBox cb2 = new JCheckBox("디버깅",true);
		JCheckBox cb3 = new JCheckBox("개발",true);
		JCheckBox cb4 = new JCheckBox("프로젝트");

		cb1.setBounds(100,280,60,50);
		cb2.setBounds(160,280,100,50);
		cb3.setBounds(260,280,100,50);
		cb4.setBounds(360,280,100,50);
		
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		
		String [] mm = "소주,양주,닭주,개주,상주".split(",");                         //split(?)
		JList<String> menu = new JList<String>(mm);         //"JList" 리스트처럼 창이떠 배열을 사용하여 메뉴처럼 보고 고를수있음
		menu.setBounds(50,330,100,200);
		menu.setSelectedValue("개주", true);
		f.add(menu);
		
		JTextArea area = new JTextArea("아이고 1분 남았어!!!");    // "JTextArea" 텍스트창을 만들어줌
		JScrollPane aJP = new JScrollPane(area);   // "JScrollPane" 스크롤생성 출력할때 text 가 아니라 scroll 을 넣어줘야 출력가능
		aJP.setBounds(170,330,200,200);
		f.add(aJP);

		JTextField id = new JTextField();     // "JTextField" 문자쓸수있는 칸을 만듬 하지만 ENTR 안눌림
		id.setBounds(400,50,200,50);
		f.add(id);
		
		JPasswordField pw = new JPasswordField();   // "JPasswordField" 비밀번호 입력이랑 같아 문자가 안보이고 "*" 으로 나옴
		pw.setBounds(400,110,200,50);
		f.add(pw);
		
		
		Object [][] data = {
				{"현빈",77,78,72},
				{"원빈",67,68,62},
				{"투빈",97,98,92},
				{"골빈",87,88,82},
		};
		
		Object [] title = {"이름","국어","영어","수학"};   //재료
		
		JTable tt = new JTable(data,title);      // "JTable" 배열 2개 설정후 다른하나는 (제목)
		JScrollPane ttJP = new JScrollPane(tt);
		ttJP.setBounds(500, 200, 250, 200);
		f.add(ttJP);
		
		
		f.setVisible(true);    // Jframe 창 띄움
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // "EXIT_ON_CLOSE" Jframe 창을 닫았지만 출력프로그램은 실행이라 창 닫는순간 출력프로그램 종료 할때
	
	
	}

}
