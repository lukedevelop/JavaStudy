package swing_p;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

class MyPanel extends JPanel  implements MouseMotionListener, MouseListener {
	
	JLabel backLB;
	ImageIcon icon;
	ImageIcon picon;
	
	public MyPanel(int x, int y, String msg, String img) {
		setBounds(x,y, 170,170);
		setLayout(null);
		
		JTextArea area = new JTextArea(msg);
		area.setBounds(50, 50, 120,120);
		area.setOpaque(false);
		add(area);
		
		icon =new ImageIcon("fff/"+img);
		picon =new ImageIcon("fff/post2.png");
		backLB = new JLabel(icon);
		
		backLB.setBounds(0, 0, 170,170);
		add(backLB);
		
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		backLB.setIcon(picon);

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
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	
		System.out.println("Dragg:"+e.getX()+","+e.getY());
		
		setLocation(getX()-70+e.getX(), getY()-20+e.getY());
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("move:"+e.getX()+","+e.getY());
	}
}


public class MousePostitArrMain extends JFrame{

	
	public MousePostitArrMain() {
		super("����Ʈ�չ迭");
		setBounds(50, 50, 900, 600);
		setLayout(null);
	
		add(new MyPanel(50,50,"������ �鼼","post.png"));
		add(new MyPanel(350,50,"������ õ��","post3.png"));
		add(new MyPanel(50,350,"������ ����","post4.png"));
		add(new MyPanel(550,50,"������ ������","post5.png"));
		add(new MyPanel(550,350,"������ õõ��","post6.png"));
		
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		new MousePostitArrMain();

	}

	

}
