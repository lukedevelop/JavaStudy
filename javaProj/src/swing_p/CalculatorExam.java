package swing_p;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JToggleButton;

public class CalculatorExam  {



	public static void main(String[] args) {
		
		
		JFrame n = new JFrame("계산기");
		n.setBounds(300, 100, 420, 600); 
		n.setLayout(null);
		
		
		JMenuBar bar = new JMenuBar();
		n.setJMenuBar(bar);

		JMenu main1 = new JMenu("||||");
		
		
		
		JMenuItem main2 = new JMenuItem("표준");  
		bar.add(main1);
		bar.add(main2);
		
			
		ImageIcon ic1 = new ImageIcon("fff/calculator.png");
		JMenuItem m1_1 = new JMenuItem("표준",ic1);
		ImageIcon ic2 = new ImageIcon("fff/science.png");
		JMenuItem m1_2 = new JMenuItem("공학용",ic2);
		ImageIcon ic3 = new ImageIcon("fff/graph.png");
		JMenuItem m1_3 = new JMenuItem("그래프",ic3);
		ImageIcon ic4 = new ImageIcon("fff/program.png");
		JMenuItem m1_4 = new JMenuItem("프로그래머",ic4);
		ImageIcon ic5 = new ImageIcon("fff/weather.png");
		JMenuItem m1_5 = new JMenuItem("날짜계산",ic5);
	
		
		main1.add(m1_1);
		main1.addSeparator(); 
		main1.add(m1_2);
		main1.addSeparator(); 
		main1.add(m1_3);
		main1.addSeparator(); 
		main1.add(m1_4);
		main1.addSeparator(); 
		main1.add(m1_5);
		
		
	
		
		
		ImageIcon ic = new ImageIcon("fff/check.png");
		bar.add(new JButton(ic));  
		
		JTextField tf = new JTextField();
		tf.setBounds(0,0,400,200);
//		tf.setHorizontalAlignment(JTextField.RIGHT);  텍스트가 오른쪽으로 나오게 하고싶어서 찾아봤는데 설명은없고 저거만 써있어서 분합니다
		n.add(tf);
		
		ButtonGroup bg = new ButtonGroup();
		
		JToggleButton jtb = new JToggleButton("MC");
		jtb.setBounds(0, 200, 80, 30);
		n.add(jtb);
		
		JToggleButton jtb1 = new JToggleButton("MR");
		jtb1.setBounds(80, 200, 80, 30);
		n.add(jtb1);
		
		JToggleButton jtb2 = new JToggleButton("M+");
		jtb2.setBounds(160, 200, 80, 30);
		n.add(jtb2);
		
		JToggleButton jtb3 = new JToggleButton("M-");
		jtb3.setBounds(240, 200, 80, 30);
		n.add(jtb3);
		
		JToggleButton jtb4 = new JToggleButton("MS");
		jtb4.setBounds(320, 200, 80, 30);
		n.add(jtb4);
		
		bg.add(jtb);
		bg.add(jtb1);
		bg.add(jtb2);
		bg.add(jtb3);
		bg.add(jtb4);
		
		
		
		String [] arr = {
				"%","CE","C","<",
				"½","x²","㎣","÷",
				"7","8","9","X",
				"6","5","4","-",
				"3,","2","1","+",
				"±","0",".","="
		};
		
		
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(6, 4 , 5, 5));
		jp.setBounds(0, 230, 400, 300);
		for (int i = 0; i < 24; i++) {
			jp.add(new JButton(arr[i]));
		}
		n.add(jp);
		
		
		
		
		
		 
//		n.setLayout(new GridLayout(6,4,5,5));     //처음시도 했을때 망...
//		n.setBounds(300, 100, 300, 400);
//		
//		String [] arr = {
//				"%","CE","C","<",
//				"½","x²","㎣","÷",
//				"7","8","9","X",
//				"6","5","4","-",
//				"3,","2","1","+",
//				"±","0",".","="
//		};
//		
//		for (int i = 0; i < arr.length; i++) {
//			n.add(new JButton(arr[i]));
//		}
	
		
		
		n.setVisible(true);
		n.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
