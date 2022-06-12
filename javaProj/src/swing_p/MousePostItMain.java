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
		System.out.println("Dragg :"+e.getX()+","+e.getY());           //마우스 드래그
		
		pp.setLocation(pp.getX()-60+e.getX(),pp.getY()-20+e.getY());  // 드래그 기준점을 가운데로 두기위해 사진길이에서 -60,-20을함
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("move :"+e.getX()+","+e.getY());            //마우스 움직임
	}

	JPanel pp;
	ImageIcon icon;
	ImageIcon Picon;
	JLabel backLB;
	
	
	public MousePostItMain() {
		super("마우스포스트잇");
		setBounds(50, 50, 600, 500);
		setLayout(null);
		
		pp = new JPanel();
		pp.setLayout(null);
		pp.setBounds(50, 50, 128, 128);
		
		JTextArea area = new JTextArea("나는 너다");
		area.setBounds(50, 50, 80, 80);
		//area.setBackground(new Color(255,0,0,0));  // 투명해짐(무식한방법)
		area.setOpaque(false);      //투명해짐
		pp.add(area);
		icon =new ImageIcon("fff/postit.png");
		
		Picon =new ImageIcon("fff/Food1.jpg");
		
		
		
		backLB = new JLabel(icon);      //포스트잇 첨부 사이즈는 사진사이즈에 맞게(label 이 테두리가없어 깔끔)
		
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
