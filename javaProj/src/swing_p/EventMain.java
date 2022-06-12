package swing_p;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


//�̺�Ʈ �ڵ鷯 Ŭ���� ���� ->ActionListener : �����ʿ� �ش��ϴ� �������̽�
class MyBtnList implements ActionListener{
	
	JLabel label;
	JButton button;
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("������");
		label.setText("������ ����");   // "����������" ���� ������ ������ ������ �ٲ�
		label.setBackground(Color.blue);
		label.setForeground(Color.white);   //"������ ����" ������ �Ķ������� ����
		button.setEnabled(false);  //��ư�� ������ �״��� �ȴ���
	
	}

	
}


public class EventMain {

	public static void main(String[] args) {
		JFrame f = new JFrame("�̺�Ʈ �߻�");
		f.setBounds(50, 50, 300, 200);
		f.setLayout(new FlowLayout());
		
		JButton btn = new JButton("������");
		JLabel lb = new JLabel("������ ����");
		lb.setOpaque(true);
		
		f.add(btn);
		f.add(lb);

		MyBtnList mbl = new MyBtnList();
		mbl.label = lb;
		mbl.button = btn;   //��ư�� ������ �״��� �ȴ���
		
		
		//btn: �̺�Ʈ�ҽ�                   -->��ư
		//ActionListener: �̺�Ʈ ������      -->�� ������
		//mbl : �̺�Ʈ �ڵ鷯                -->actionPerformed : ������ ���
		btn.addActionListener(mbl);   //��ư�� ������ �����ٶ�� ���
		
		
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
