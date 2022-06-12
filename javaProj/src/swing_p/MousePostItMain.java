package swing_p;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class MousePostItMain extends JFrame implements MouseMotionListener,MouseListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("Dragg :"+e.getX()+","+e.getY());           //���콺 �巡��
		
		pp.setLocation(pp.getX()-60+e.getX(),pp.getY()-20+e.getY());  // �巡�� �������� ����� �α����� �������̿��� -60,-20����
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("move :"+e.getX()+","+e.getY());            //���콺 ������
	}

	JPanel pp;
	ImageIcon icon;
	ImageIcon Picon;
	JLabel backLB;
	
	
	public MousePostItMain() {
		super("���콺����Ʈ��");
		setBounds(50, 50, 600, 500);
		setLayout(null);
		
		pp = new JPanel();
		pp.setLayout(null);
		pp.setBounds(50, 50, 128, 128);
		
		JTextArea area = new JTextArea("���� �ʴ�");
		area.setBounds(50, 50, 80, 80);
		//area.setBackground(new Color(255,0,0,0));  // ��������(�����ѹ��)
		area.setOpaque(false);      //��������
		pp.add(area);
		icon =new ImageIcon("fff/postit.png");
		
		Picon =new ImageIcon("fff/Food1.jpg");
		
		
		
		backLB = new JLabel(icon);      //����Ʈ�� ÷�� ������� ��������� �°�(label �� �׵θ������� ���)
		
		backLB.setBounds(0, 0, 128, 128);
		pp.add(backLB);
		
		
		
		add(pp);
		
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pp.addMouseMotionListener(this);
		pp.addMouseListener(this);
	}
	
	public static void main(String[] args) {
		new MousePostItMain();

	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		
		backLB.setIcon(Picon);
		
		
		
	}
	
	@Override
	public void mouseReleased(MouseEvent e) {
		backLB.setIcon(icon);
		
	}
	
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
