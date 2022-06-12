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
		f1.setLayout(new BorderLayout());   //��ġ�� ����ִ°� BorderLayout
		//f1.setLayout(null);
		//f1.setLayout(new FlowLayout());
		f1.setBounds(0, 0, 300, 200);
		
		f1.add("North",new JButton("����"));   //���� �����̰��� 
		//f1.add(new JButton("����"),"East");    //���� �ܾ� ��ġ ��� ����
		//f1.add(new JButton("����"),"South");
		f1.add(new JButton("����"),"West");
		//f1.add(new JButton("�߾�"));      //"Center" �߾��� ���� �Ƚᵵ ������
		
		f1.setVisible(true);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/////////////////////////////////////////////////////////////////////////		
		
		JFrame f2 = new JFrame("Flow");
		f2.setLayout(new FlowLayout(FlowLayout.RIGHT));   // FlowLayout: ���������� ������  ������30,���Ʒ�����10
		f2.setBounds(300, 0, 300, 200);
		
		for(int i = 0; i < 10; i++) {
			f2.add(new JButton("��ư"+i));
		}
		
		
		f2.setVisible(true);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/////////////////////////////////////////////////////////////////////////		

		JFrame f3 = new JFrame("Grid");
		f3.setLayout(new GridLayout(3,2,10,5));   //GridLayout(3��2��) 
		f3.setBounds(0, 200, 300, 200);
		
		for(int i = 0; i < 10; i++) {
			f3.add(new JButton("��ư"+i));
		}
		
		
		f3.setVisible(true);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
/////////////////////////////////////////////////////////////////////////		
		
		JFrame f4 = new JFrame("Box");
		f4.setLayout(new BoxLayout(f4.getContentPane(), BoxLayout.X_AXIS)); //BoxLayout (axis = ���̳� ���̳�)(X)Y_AXIS :Y������ �ָ�,x��x��
		f4.setBounds(300, 200, 300, 200);
		
		for(int i = 0; i < 10; i++) {
			f4.add(new JButton("��ư"+i));
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
		
		f5.add(p1,"������");
		
		JPanel p2 = new JPanel();
		p2.setBackground(Color.blue);
		
		f5.add(p2,"�Ķ���");
		
		JPanel p3 = new JPanel();
		p3.setBackground(Color.yellow);
		
		f5.add(p3,"������");
		
		
		
		
		
		for(int i = 0; i < 10; i++) {
			f5.add(new JButton("��ư"+i));
		}
		
		
		f5.setVisible(true);
		f5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		String [] arr = {"������","�Ķ���","������"};
		
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
