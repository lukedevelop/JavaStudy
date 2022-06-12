package swing_p;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class EventSJEMain extends JFrame implements ActionListener{

	JLabel timerLB = new JLabel("�ð�:");
	JLabel res = new JLabel("���:");
	JButton btn = new JButton("��������");
	ArrayList<JRadioButton> qq1 = new ArrayList<JRadioButton>();
	ArrayList<JCheckBox> qq2 = new ArrayList<JCheckBox>();
	boolean chk = false;   // ��������� boolean
	
	class Timer extends Thread{    //Ÿ�̸� ����
		@Override
		public void run() {
			for (int i = 10; i >= 0; i--) {
				try {
					sleep(1000);
					timerLB.setText("�ð�: " + i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			btn.setEnabled(false);   //�ð��� �ʰ��Ǹ� ��ư�� �ȴ���
			if(!chk) {
				res.setText("���� ������");
			}
		
		}
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {          //ActionListener
		int jum = 0;
		if(qq1.get(1).isSelected()) {     //1��°���� ���� ���� 20�� ����
			jum+=20;
		}
		for(JCheckBox box : qq2) {        //2��° ������ ���� ����20�� 
			if(box.isSelected());
			jum+=20;
		}
		res.setText("��������:"+jum);
		
	}
	
	
	
	public EventSJEMain() {
		super("������ ����");
		setBounds(50, 50, 400, 600);
		setLayout(new GridLayout(13,1));   //(13,1) �� ���� ã��
		timerLB.setHorizontalAlignment(JLabel.RIGHT); // "�ð�:" ���� ���������� ���� ����
		add(timerLB);
		add(new JLabel("�������� Ư���?"));
		
		ButtonGroup bg = new ButtonGroup();
		for (String tt : "���ڱ�,�ڵ�,�����ֱ�,��������".split(",")) {
			JRadioButton rb1 = new JRadioButton(tt);  // for ���� �̿��� ���� �������� ����
			
//			JRadioButton rb1 = new JRadioButton("���ڱ�");  //���� ����
			qq1.add(rb1);
			bg.add(rb1);
			add(rb1);
			
		}
		
		add(new JLabel("�������� ��̴�?"));
		
		for (String tt : "�ߵ���û,�ڳ�߷�,���ø���,�����⶧����".split(",")) {
			JCheckBox rb1 = new JCheckBox(tt);  // for ���� �̿��� ���� �������� ����
			qq2.add(rb1);
			add(rb1);
		}	
		
		add(btn);
		add(res);
		
		btn.addActionListener(this);
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		Timer timer = new Timer();    //Ÿ�̸�
		timer.start();
	}
	
	
	public static void main(String[] args) {
		
		new EventSJEMain();

	}



}
