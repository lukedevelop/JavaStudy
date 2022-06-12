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
		
		String ttt = "�׸� Com 1234 !@#$%^";    //�����ӿ� ���� ��� ���� ����
		Font[] ff = {
		new Font("�޸���ü",Font.ITALIC,30),
//		new Font("�޸ո���ü",Font.ITALIC,30),
//		new Font("�޸���ü",Font.ITALIC,30),
//		new Font("�޸���ü",Font.ITALIC,30),
//		new Font("�޸���ü",Font.ITALIC,30),
//		new Font("�޸���ü",Font.ITALIC,30),
//		new Font("�޸���ü",Font.ITALIC,30),
		};
		
		Color [] cc = {                   //���� �� ����
				Color.BLUE,
				Color.YELLOW,
				Color.green,
				Color.red,
				new Color(255, 0, 0),
				new Color(255, 0, 0,100),    //(255,0,0,�����ϱ�)
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
			lb.setForeground(cc[i]);       //���ڻ� ����
			lb.setBackground(new Color(255,200,200));  // �޹���ĥ�Ҽ��ְ���
			lb.setOpaque(true);                        // �޹�� ��ä��� �ְ���
			add(lb);
			
		}
		
		JLabel lb =new JLabel(ttt);        // ���� �������
		//Font ff = new Font("�޸���ü",Font.ITALIC,30);    // Font ����
		lb.setFont(ff[0]);
		add(lb);
		
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	public static void main(String[] args) {
		new FontColorMain();
		
		//���������� ǥ���ϼ���
		
		
		
	}

}
