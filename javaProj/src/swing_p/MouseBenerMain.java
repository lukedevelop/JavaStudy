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
	public void mouseReleased(MouseEvent e) {          //방향을 뒤로 넘길때
		if(!moving) {
		int dir = 0;
		
		if(lastX > e.getX() && imgs.getX()!=-600) {        //방향감
			
			dir=-200;
			curr=-2;
		
		}else if(lastX < e.getX() && imgs.getX()!=0){      //방향감
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
		super("마우스베너");
		setBounds(50, 50, 600, 500);
		setLayout(null);
		
		JPanel outer = new JPanel();                   //사진 담을 큰 공간을 만들기 위한 jpanel 생성
		outer.setBounds(200, 150, 200, 130);
		outer.setLayout(null);
		
		outer.setBackground(Color.pink);
		add(outer);
		
		imgs = new JPanel();                // 이미지 설정  (outer 핑크가 노랑안에 있음)       
		imgs.setBounds(-200,0,800,100);
		imgs.setLayout(new GridLayout(1,4));
		//imgs.setBackground(Color.yellow);
		outer.add(imgs);
		
		
		for (int i = 1; i <= 4; i++) {
			JLabel lb = new JLabel(new ImageIcon("fff/Food"+i+".jpg"));       //사진 image 등록 ()
			imgs.add(lb);
		
		}
		
		
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(this);  // 창안에서 마우스 클릭 후 놨을때 좌표를 갑지(this 왜씀?)
		//addMouseMotionListener(this);    // 창안에 마우스 움직이는걸 다 감지
		
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
	 1.맨끝, 처음 일경우 더이상 움직이지 않게 해주세요.
	 2.세로 방향으로 배너가 움직이게 새로 만들어 주세요.
	 3.무한으로 돌게 해주세요
	 */

}
