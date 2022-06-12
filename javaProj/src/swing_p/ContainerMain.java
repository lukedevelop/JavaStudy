package swing_p;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.text.CompactNumberFormat;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class ContainerMain {

	public static void main(String[] args) {
	
		JFrame f1 = new JFrame("JPanel");
		f1.setBounds(0, 50, 300, 200);
		f1.setLayout(null);
		
		JPanel p1 = new JPanel();       //"Jpanel": 조각난 프레임(보조프레임) 프레임 위에 얹음
		p1.setBounds(10, 10, 100, 100);
		p1.setBackground(Color.yellow);
		
		JPanel p2 = new JPanel();
		p2.setBounds(120, 10, 100, 100);
		p2.setBackground(Color.pink);
		
		f1.add(p1);
		f1.add(p2);
		
		Container c1 = f1.getContentPane();              
		System.out.println(c1.getComponentCount());
		
		Component [] arr = c1.getComponents();
		System.out.println(arr[0].getBackground());
		System.out.println(arr[1].getBackground());
				
		
		for (int i = 0; i < 5 ; i++) {       // 반복문을통해 버튼i(5)개 생성
			p1.add(new JButton("버튼"+i));
			p2.add(new JButton("버튼"+i));
			
		}
		
		f1.setVisible(true);
////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JFrame f2 = new JFrame("JScrollPane");
		f2.setBounds(300, 50, 300, 200);
		f2.setLayout(null);
		
		JPanel p3 = new JPanel();       
		JScrollPane jp3 = new JScrollPane(p3);
		jp3.setBounds(10, 10, 100, 100);        //scrollpane 변수값은 bounds 에 써줘야함
		p3.setBackground(Color.yellow);         //panel 의 색상은 패널 변수값 을 써줌
		
		JPanel p4 = new JPanel();
		//p4.setBounds(120, 10, 100, 100);    // scroll 을 아래로뺄때 의미가 없음
		p4.setPreferredSize(new Dimension(80,300));  // scroll 사이즈를 직사각형 으로 만들어 세로가 길게 만들어야 위아래로 이쁘게 스크롤 가능
		p4.setBackground(Color.pink);
	
		JScrollPane jp4 = new JScrollPane(p4);
		jp4.setBounds(120, 10, 100, 100);
		
		f2.add(jp3);
		f2.add(jp4);
		
	  
		
		for (int i = 0; i < 5 ; i++) {       
			p3.add(new JButton("버튼"+i));
			p4.add(new JButton("버튼"+i));
			
		}
		
		f2.setVisible(true);
////////////////////////////////////////////////////////////////////////////////////////////////////		
		
		JFrame f3 = new JFrame("JDialog");
		f3.setBounds(0, 250, 300, 200);
//		Container                            //프레임 배경색 채우는거
		
		
		//(JDialog) true - doModal : 현재 대화창을 닫아야 owner 창 열림
		//(JDialog) false - Modaless : 현재 대화창과 같이 owner 창 열림
		JDialog dd = new JDialog(f3,"메세지창",false); //JDialog(owner,"",t/f) dialog는 다른것들과 다르게 창이 밖으로 나옴
		dd.setBounds(300, 250, 100, 100);
		dd.setLayout(new FlowLayout());            //??
		
		dd.add(new JLabel("경고창 입니다."));
		dd.add(new JButton("확인"));
		
		dd.setVisible(true);          //독립창으로 분리가 되어있음  dialog 에 포함x
		
		f3.setVisible(true);
////////////////////////////////////////////////////////////////////////////////////////////////////
		
		JFrame f4 = new JFrame("FileDialog");
		f4.setBounds(0, 450, 300, 200);
		f4.setBackground(Color.green);   //적용되지 않음
		
		
		FileDialog fd = new FileDialog(f4,"파일열기입니다",FileDialog.LOAD);    //(awt)filedialog : <FileDialog.LOAD>파일열림  load (열기로 뜸)
		//fd.setBounds(300, 450, 100, 100);
		fd.setLocation(300, 450);     // setbounds 필요없음 location 으로 가능
		fd.setDirectory("C:\\Users\\whgml\\Desktop\\Java");    //setDirectory: 파일 주소를 적으면 그파일이 열림
		
		fd.setVisible(true);          
		f4.setVisible(true);
		
		System.out.println(fd.getDirectory()); //?
		System.out.println(fd.getFile());
		
		
	}

}
