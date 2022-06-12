package swing_p;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutMain {

	
	public static void main(String[] args) {
		JFrame 	f1 = new JFrame("border");
		f1.setLayout(new BorderLayout());   //위치를 잡아주는건 BorderLayout
		//f1.setLayout(null);
		//f1.setLayout(new FlowLayout());
		f1.setBounds(0, 0, 300, 200);
		
		f1.add("North",new JButton("북쪽"));   //방향 설정이가능 
		//f1.add(new JButton("동쪽"),"East");    //방향 단어 위치 상관 없음
		//f1.add(new JButton("남쪽"),"South");
		f1.add(new JButton("서쪽"),"West");
		//f1.add(new JButton("중앙"));      //"Center" 중앙은 굳이 안써도 괜찮음
		
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/////////////////////////////////////////////////////////////////////////		
		
		JFrame f2 = new JFrame("Flow");
		f2.setLayout(new FlowLayout(FlowLayout.RIGHT));   // FlowLayout: 오른쪽으로 기준함  옆간격30,위아래간격10
		f2.setBounds(300, 0, 300, 200);
		
		for(int i = 0; i < 10; i++) {
			f2.add(new JButton("버튼"+i));
		}
		
		
		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/////////////////////////////////////////////////////////////////////////		

		JFrame f3 = new JFrame("Grid");
		f3.setLayout(new GridLayout(3,2,10,5));   //GridLayout(3행2열) 
		f3.setBounds(0, 200, 300, 200);
		
		for(int i = 0; i < 10; i++) {
			f3.add(new JButton("버튼"+i));
		}
		
		
		f3.setVisible(true);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/////////////////////////////////////////////////////////////////////////		
		
		JFrame f4 = new JFrame("Box");
		f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.X_AXIS)); //BoxLayout (axis = 행이냐 열이냐)(X)Y_AXIS :Y축으로 주륵,x는x축
		f4.setBounds(300, 200, 300, 200);
		
		for(int i = 0; i < 10; i++) {
			f4.add(new JButton("버튼"+i));
		}
		
		
		f4.setVisible(true);
		f4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/////////////////////////////////////////////////////////////////////////		
		
		JFrame f5 = new JFrame("Grid");
		CardLayout card = new CardLayout();
		f5.setLayout(card);   // 
		f5.setBounds(600, 200, 300, 200);
		
		JPanel p1 = new JPanel();
		p1.setBackground(Color.red);
		
		f5.add(p1,"빨강이");
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.blue);
		
		f5.add(p2,"파랑이");
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.yellow);
		
		f5.add(p3,"누렁이");
		
		
		
		
		
		for(int i = 0; i < 10; i++) {
			f5.add(new JButton("버튼"+i));
		}
		
		
		f5.setVisible(true);
		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String [] arr = {"빨강이","파랑이","누렁이"};
		
		int i = 0;
		while(true) {
			i++;
			i%=3;
			card.show(f5.getContentPane(), arr[i]);
		
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		
		}
		
	}

}
