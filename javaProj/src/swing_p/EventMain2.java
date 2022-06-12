package swing_p;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


// GUI Ŭ������ ��� ��ӹ޾� ó���� �޼ҵ� �� ���ó���� ����
public class EventMain2 extends JFrame implements WindowListener{
	
	//������Ʈ�� ������� ó���� �̺�Ʈ �ڵ鷯���� ������ ����
	JButton btn = new JButton("������");
	JLabel lb = new JLabel("������ ����2");
	
	//�̺�Ʈ�ڵ鷯 Ŭ���� ���Ǹ� �̳�Ŭ������ ���ǽ� �ƿ���(GUI �����̳�)Ŭ������ �����ҿ� ���� ����
	class MyBtnList implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			System.out.println("������2");
			lb.setText("������ ����2");
			lb.setBackground(Color.blue);
			lb.setForeground(Color.white);
			btn.setEnabled(false);	
		}
	}
	
	
	
	//�����ڷ� ó���Ͽ� static ���� �ذ�
	public EventMain2() {
		super("�̺�Ʈ �߻�2");
		setBounds(50, 50, 300,200);
		setLayout(new FlowLayout());
		
		lb.setOpaque(true);
		
		add(btn);
		add(lb);
		
		
		MyBtnList mbl = new MyBtnList();
		 
		btn.addActionListener(mbl);
		
		setVisible(true);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//â���� ������
		addWindowListener(this);
	}
	
	

	public static void main(String[] args) {
		new EventMain2();
	}



	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowClosing(WindowEvent e) {

		System.out.println("â �����󱸿�");
		//e.getWindow().dispose();  //�����̳� ����
		dispose();
	}



	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

}
///////////////////////////////////////////////////////////////



//package swing_p;
//
//import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.awt.event.WindowListener;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//
//
////�̺�Ʈ �ڵ鷯 Ŭ���� ���� ->ActionListener : �����ʿ� �ش��ϴ� �������̽�
//class MyBtnList implements ActionListener{
//	
//	JLabel label;
//	JButton button;
//	
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		System.out.println("������");
//		label.setText("������ ����");   // "����������" ���� ������ ������ ������ �ٲ�
//		label.setBackground(Color.blue);
//		label.setForeground(Color.white);   //"������ ����" ������ �Ķ������� ����
//		button.setEnabled(false);  //��ư�� ������ �״��� �ȴ���
//	
//	}
//
//	
//}
//
//
//public class EventMain2 extends JFrame implements WindowListener {
//	
//	public EventMain2(){
//		JFrame f = new JFrame("�̺�Ʈ �߻�");
//		f.setBounds(50, 50, 300, 200);
//		f.setLayout(new FlowLayout());
//		
//		JButton btn = new JButton("������");
//		JLabel lb = new JLabel("������ ����");
//		lb.setOpaque(true);
//		
//		f.add(btn);
//		f.add(lb);
//
//		MyBtnList mbl = new MyBtnList();
//		mbl.label = lb;
//		mbl.button = btn;   //��ư�� ������ �״��� �ȴ���
//		
//		
//		//btn: �̺�Ʈ�ҽ�                   -->��ư
//		//ActionListener: �̺�Ʈ ������      -->�� ������
//		//mbl : �̺�Ʈ �ڵ鷯                -->actionPerformed : ������ ���
//		btn.addActionListener(mbl);   //��ư�� ������ �����ٶ�� ���
//		
//		
//		
//		f.setVisible(true);
//		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		
//		
//	}
//	
//	
//	
//
//	public static void main(String[] args) {
//		new EventMain2();
//		
//	}
//
//}
