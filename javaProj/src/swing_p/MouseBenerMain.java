package swing_p;

import java.awt.Color;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MouseBenerMain extends JFrame implements MouseListener, MouseMotionListener {

	@Override
	public void mouseDragged(MouseEvent e) {
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {

	}

	@Override
	public void mousePressed(MouseEvent e) {
		lastX = e.getX();

	}
	
	int curr,dst;
	
	@Override
	public void mouseReleased(MouseEvent e) {          //������ �ڷ� �ѱ涧
		if(!moving) {
		int dir = 0;
		
		if(lastX > e.getX() && imgs.getX()!=-600) {        //���Ⱘ
			
			dir=-200;
			curr=-2;
		
		}else if(lastX < e.getX() && imgs.getX()!=0){      //���Ⱘ
			dir = 200;
			curr = 2;
		}
		dst = imgs.getX()+dir;
		
		}
		
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {

	}

	@Override
	public void mouseExited(MouseEvent e) {

	}
	
	JPanel imgs;
	
	int lastX;
	
	
	public MouseBenerMain() {
		super("���콺����");
		setBounds(50, 50, 600, 500);
		setLayout(null);
		
		JPanel outer = new JPanel();                   //���� ���� ū ������ ����� ���� jpanel ����
		outer.setBounds(200, 150, 200, 130);
		outer.setLayout(null);
		
		outer.setBackground(Color.pink);
		add(outer);
		
		imgs = new JPanel();                // �̹��� ����  (outer ��ũ�� ����ȿ� ����)       
		imgs.setBounds(-200,0,800,100);
		imgs.setLayout(new GridLayout(1,4));
		//imgs.setBackground(Color.yellow);
		outer.add(imgs);
		
		
		for (int i = 1; i <= 4; i++) {
			JLabel lb = new JLabel(new ImageIcon("fff/Food"+i+".jpg"));       //���� image ��� ()
			imgs.add(lb);
		
		}
		
		
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(this);  // â�ȿ��� ���콺 Ŭ�� �� ������ ��ǥ�� ����(this �־�?)
		//addMouseMotionListener(this);    // â�ȿ� ���콺 �����̴°� �� ����
		
		new Timer().start();
	}
	
	boolean moving;
	
	class Timer extends Thread{
		@Override
		public void run() {
			while(true) {
				try {
					moving = false;
					
					sleep(10);
					
					if(moving = dst!=imgs.getX()) {
						
						imgs.setLocation(imgs.getX()+curr,0);
					}
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
			
		}
	}
	
	public static void main(String[] args) {
		new MouseBenerMain();

	}
	/*
	 1.�ǳ�, ó�� �ϰ�� ���̻� �������� �ʰ� ���ּ���.
	 2.���� �������� ��ʰ� �����̰� ���� ����� �ּ���.
	 3.�������� ���� ���ּ���
	 */

}
