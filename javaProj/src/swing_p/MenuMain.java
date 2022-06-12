package swing_p;

import java.awt.event.KeyEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.KeyStroke;

public class MenuMain extends JFrame {

	public MenuMain(String name) {
		super(name);
		setBounds(100, 50, 600, 400);
		
		JMenuBar bar = new JMenuBar();    // JMenuBar: �޴��� ����
		setJMenuBar(bar);
		
		JMenu main1 = new JMenu("����");
		JMenu main2 = new JMenu("����");
		JMenu main3 = new JMenu("����");
		
		
	
		/* Jmenu �� ����Ű ���� �Ұ�
		 * m1_3.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_F,
				KeyEvent.CTRL_MASK));  */        //����Ű ������
		
		
		
		JMenuItem main4 = new JMenuItem("����");  // JMenuItem": �� �ȿ� �� �޴����Ⱑ ����
		bar.add(main1);
		bar.add(main2);
		bar.add(main3);
		bar.add(main4);
		bar.add(new JButton("��ư"));  // �޴��� ���ο� ��ư ����
		bar.add(new JLabel("���̾�"));
		bar.add(new JTextField("���"));
		

		
		JMenuItem m1_1 = new JMenuItem("���� �����");     // main1 ���� �޴��� �޴����������� 3���� ���⸦ �� ����
		JMenuItem m1_2 = new JMenuItem("���� �����");
		m1_2.setText("����̷� ����");
		
		ImageIcon icon = new ImageIcon("fff/pen.png");
		JMenuItem m1_3 = new JMenuItem("�ҷ� �����",icon);  //menuitem ���� �̹��� ���� ����
		
		m1_3.setAccelerator(KeyStroke.getKeyStroke(
				KeyEvent.VK_D,
				KeyEvent.CTRL_MASK));          //����Ű ������
		
//		ImageIcon icon = new ImageIcon("fff/Chalsu.jpg");  
//		ImageIcon icon = new ImageIcon("fff/pen.png");  
//		JMenuItem m1_3 = new JMenuItem("�ҷ� �����",icon);  //menuitem ���� �̹��� ���� ����
		
		
		
		main1.add(m1_1);
		main1.add(m1_2);
		main1.add(m1_3);
		JButton bb = new JButton("����");
		bb.setText("����");
		main1.add(bb);
		main1.addSeparator();          //��輱�� ����
		main1.add(new JLabel("����"));
		main1.add(new JTextField("�������"));
		
		
		JMenu m2_1 = new JMenu("�Ӽ�");      //������ �������ִ� �ﰢ�� ���� �޴��ϳ� ���߰�����(?)
		JMenu m2_2 = new JMenu("ȯ�漳��");
		
		m2_1.add(new JMenuItem("�Ӹ���"));    // Menu"�Ӽ�" �ȿ� �Ӹ���,������ menuitem ����
		m2_1.add(new JMenuItem("������"));
		
		JMenuItem m2_2_1 = new JMenuItem("�۲�");
		JMenuItem m2_2_2 = new JMenuItem("���â");
		
		m2_2_1.setEnabled(false);        // menuitem"�۲�" ���úҰ�
		m2_2_2.setSelected(true);        //���ð���
		
		m2_2.add(m2_2_1);                // Menu"ȯ�漳��" �ȿ�  �۲�,���â menuitem ����
		m2_2.add(m2_2_2);
		
		main2.add(m2_1);
		main2.add(m2_2);
		
		
	
		
		main3.add(new JLabel("ȭ��"));
		
		JCheckBoxMenuItem m3_1 = new JCheckBoxMenuItem("�ȳ���",true);         // "JCheckBoxMenuItem" üũ�ڽ� ���� ((true) �̸� üũ�Ǿ�����)
		JCheckBoxMenuItem m3_2 = new JCheckBoxMenuItem("����");
		m3_2.setSelected(true);    // ���� üũ�Ǿ�����
		main3.add(m3_1);
		main3.add(m3_2);
		main3.addSeparator();
		main3.add(new JLabel("���"));
		JRadioButtonMenuItem m3_3 = new JRadioButtonMenuItem("�ڵ���");         
		JRadioButtonMenuItem m3_4 = new JRadioButtonMenuItem("�º�",true);
		JRadioButtonMenuItem m3_5 = new JRadioButtonMenuItem("����ũž");
		m3_2.setSelected(true);    
		main3.add(m3_3);
		main3.add(m3_4);
		main3.add(m3_5);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(m3_3);
		bg.add(m3_4);
		bg.add(m3_5);
		
		
		
		
		
		setVisible(true);
		setResizable(false);  //âũ�� ��������
		//setExtendedState(MAXIMIZED_BOTH); // â �ִ�ȭ
		//setExtendedState(getExtendedState()); // â ����ũ��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new MenuMain("�޴����Դϴ�.");
		
	}

}
