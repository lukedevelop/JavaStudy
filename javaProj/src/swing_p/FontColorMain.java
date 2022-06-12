package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FontColorMain extends JFrame{

	public FontColorMain() {
		setBounds(100, 50, 600, 600);
		
		GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		
		Font [] fs = ge.getAllFonts();
		for(Font ff : fs) {
			System.out.println(ff.getFontName());
		}
		
		String ttt = "그린 Com 1234 !@#$%^";    //프레임에 문자 출력 변수 만듦
		Font[] ff = {
		new Font("휴먼지체",Font.ITALIC,30),
//		new Font("휴먼매직체",Font.ITALIC,30),
//		new Font("휴먼지체",Font.ITALIC,30),
//		new Font("휴먼지체",Font.ITALIC,30),
//		new Font("휴먼지체",Font.ITALIC,30),
//		new Font("휴먼지체",Font.ITALIC,30),
//		new Font("휴먼지체",Font.ITALIC,30),
		};
		
		Color [] cc = {                   //글자 색 설정
				Color.BLUE,
				Color.YELLOW,
				Color.green,
				Color.red,
				new Color(255, 0, 0),
				new Color(255, 0, 0,100),    //(255,0,0,색연하기)
				new Color(255, 0, 0,50),
				new Color(255, 255, 0),
				new Color(0, 255, 0),
				new Color(0, 0, 255),     
				new Color(0, 0, 0)    
				
		};
		
		
		setLayout(new GridLayout(ff.length,1));
		
		for(int i = 0; i < ff.length; i++) {
			JLabel lb = new JLabel(ttt);
			lb.setFont(ff[i]);
			lb.setForeground(cc[i]);       //글자색 설정
			lb.setBackground(new Color(255,200,200));  // 뒷배경색칠할수있게함
			lb.setOpaque(true);                        // 뒷배경 색채울수 있게함
			add(lb);
			
		}
		
		JLabel lb =new JLabel(ttt);        // 문자 출력해줌
		//Font ff = new Font("휴먼지체",Font.ITALIC,30);    // Font 적용
		lb.setFont(ff[0]);
		add(lb);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new FontColorMain();
		
		//무지개색을 표현하세요
		
		
		
	}

}
