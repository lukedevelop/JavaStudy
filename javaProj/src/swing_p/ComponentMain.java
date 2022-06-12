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
		
		JFrame f = new JFrame("���������տ�");
		//f.setSize(800,700);          // "setSize" âũ�� ��������
		//f.setLocation(300,100);      // "setLocation" ��ġ ���� (x,y)
	
		f.setBounds(300, 100, 800, 700);  // "setBounds" (x,y width,heigh) âũ��,��ġ �ѹ��� ���� 
	
		//JButton b1 = new JButton("��ư");  // "JButton" ��ư ����
		f.setLayout(null);        //
		
		
		JButton b1 = new JButton("��ư1");  // "JButton" ��ư ���� 
		b1.setBounds(50,30,100,50);
		b1.setBackground(Color.pink);      // "setBackground" ��ư �޹�� ���� ����
		f.add(b1);   //��ư �������ְ��� (���)
		
		JButton b2 = new JButton("��ư2");  // "JButton" ��ư ���� 
		b2.setBounds(50,30,100,50);
		b2.setBackground(Color.yellow);      //��ư �޹�� ���� ����
		f.add(b2);   //��ư �������ְ���
		
		JButton b3 = new JButton("��ư3");  
		b3.setBounds(160,30,100,50);
		b3.setBackground(Color.green); 
		b3.setEnabled(false);    // "Enabled" ��ư�� ����Ұ��ΰ� ���Ұ��ΰ� (false) ������
		f.add(b3);  
		
		ImageIcon icon = new ImageIcon("fff/Food.jpg");   // ImageIcon: ��ư �޹�濡 �̹��� ����(������/��������)
		
		JButton b4 = new JButton("��ư4",icon);  
		b4.setBounds(270,30,100,50);
		b4.setBackground(Color.yellow); 
		b4.setVerticalTextPosition(0);      // "VerticalTextPosition"  "��ư4" ���ڰ� �������� ����
		b4.setHorizontalTextPosition(0);    // "HorizontalTextPosition"
		f.add(b4);   
		
		JToggleButton tb1 = new JToggleButton("��ġ�");        // "JToggleButton" ��ư ������ ��ư���� ���� ����
		tb1.setBounds(50,90,100,50);
		tb1.setBackground(Color.green); 
		f.add(tb1);  
		
		
		
		ButtonGroup bg = new ButtonGroup();    // "ButtonGroup" ��ư�� �ѱ׷����� ��� �������� �Ѱ����� ����
		JToggleButton tb2 = new JToggleButton("�����");       
		tb2.setBounds(50,150,100,50);
		tb2.setBackground(Color.green); 
		f.add(tb2);  
		
		JToggleButton tb3 = new JToggleButton("���ζ��");       
		tb3.setBounds(150,150,100,50);
		tb3.setBackground(Color.green); 
		f.add(tb3); 
		
		JToggleButton tb4 = new JToggleButton("ġ����");       
		tb4.setBounds(250,150,100,50);
		tb4.setBackground(Color.green); 
		f.add(tb4); 
		
		bg.add(tb2);
		bg.add(tb3);
		bg.add(tb4);
		
		Vector<String> email1 = new Vector<String>();   //  "Vector" 
		email1.add("������");
		email1.add("�Ϻ극");
		email1.add("����");
		email1.add("����");
		
		JComboBox<String> box = new JComboBox<String>(email1);  // "JComboBox" vactor �ȿ��ִ� �׷��� ���� �����Ͽ� �����߰��ϴ�
		box.setBounds(200,90,100,50);
		box.setSelectedItem("����");   // "setSelectedItem" �̸����õǾ� ���� �ߴ°�
		f.add(box); 
		
		JLabel genLB = new JLabel("����");    // �ؽ�Ʈ �߰���
		genLB.setBounds(50,220,100,50);
		f.add(genLB);
		
		JRadioButton rb1 = new JRadioButton("��");            // "JRadioButton" 
		JRadioButton rb2 = new JRadioButton("��");
		JRadioButton rb3 = new JRadioButton("it��",true);   // "true" �� JRbutton�� �������õǾ� ��Ÿ��
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
		
		JLabel hobLB = new JLabel("���");           // "JLabel" 
		hobLB.setBounds(50,280,100,50);
		f.add(hobLB);
		
		JCheckBox cb1 = new JCheckBox("�ڵ�");
		JCheckBox cb2 = new JCheckBox("�����",true);
		JCheckBox cb3 = new JCheckBox("����",true);
		JCheckBox cb4 = new JCheckBox("������Ʈ");

		cb1.setBounds(100,280,60,50);
		cb2.setBounds(160,280,100,50);
		cb3.setBounds(260,280,100,50);
		cb4.setBounds(360,280,100,50);
		
		f.add(cb1);
		f.add(cb2);
		f.add(cb3);
		f.add(cb4);
		
		String [] mm = "����,����,����,����,����".split(",");                         //split(?)
		JList<String> menu = new JList<String>(mm);         //"JList" ����Ʈó�� â�̶� �迭�� ����Ͽ� �޴�ó�� ���� ��������
		menu.setBounds(50,330,100,200);
		menu.setSelectedValue("����", true);
		f.add(menu);
		
		JTextArea area = new JTextArea("���̰� 1�� ���Ҿ�!!!");    // "JTextArea" �ؽ�Ʈâ�� �������
		JScrollPane aJP = new JScrollPane(area);   // "JScrollPane" ��ũ�ѻ��� ����Ҷ� text �� �ƴ϶� scroll �� �־���� ��°���
		aJP.setBounds(170,330,200,200);
		f.add(aJP);

		JTextField id = new JTextField();     // "JTextField" ���ھ����ִ� ĭ�� ���� ������ ENTR �ȴ���
		id.setBounds(400,50,200,50);
		f.add(id);
		
		JPasswordField pw = new JPasswordField();   // "JPasswordField" ��й�ȣ �Է��̶� ���� ���ڰ� �Ⱥ��̰� "*" ���� ����
		pw.setBounds(400,110,200,50);
		f.add(pw);
		
		
		Object [][] data = {
				{"����",77,78,72},
				{"����",67,68,62},
				{"����",97,98,92},
				{"���",87,88,82},
		};
		
		Object [] title = {"�̸�","����","����","����"};   //���
		
		JTable tt = new JTable(data,title);      // "JTable" �迭 2�� ������ �ٸ��ϳ��� (����)
		JScrollPane ttJP = new JScrollPane(tt);
		ttJP.setBounds(500, 200, 250, 200);
		f.add(ttJP);
		
		
		f.setVisible(true);    // Jframe â ���
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // "EXIT_ON_CLOSE" Jframe â�� �ݾ����� ������α׷��� �����̶� â �ݴ¼��� ������α׷� ���� �Ҷ�
	
	
	}

}
