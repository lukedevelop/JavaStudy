package swing_p;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventMain extends JFrame implements KeyListener {

	JLabel box, enermy;
	int x = 400, y = 300;
	boolean chk = false;
	
	class Timer extends Thread{              // enemy,timer (악당 만들기위함)
		
		KeyEventMain main;
		@Override
		public void run() {
			
			int dx=3,dy=3;
			
			while(true) {
			super.run();
			try {
				sleep(30);
				
				//System.out.println(enermy.getX()+","+enermy.getY());
				
				if(x<enermy.getX()+70 && 
					x+50> enermy.getX()&&
					y<enermy.getY()+70  &&
					y+50>enermy.getY()) {
					System.out.println("겹침");
					break;
					
				}
				
				int ex = enermy.getX()+dx, ey = enermy.getY()+dy;
				
				if(ey>=600-70-40 || ey<0) {  // 70은 높이가 70
					dy*=-1;
				}
				if(ex>=800-70-10 || ey<0) {  
					dx*=-1;
				}
				
				enermy.setLocation(ex, ey);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
			chk = true;
			//addKeyListener(null);
			removeKeyListener(main);
	}
	}
	
	public KeyEventMain() {
		super("키 이벤트");
		setBounds(50, 50, 800, 600);
		setLayout(null);
		
		box = new JLabel();
		box.setBounds(x, y, 50, 50);
		box.setOpaque(true);
		box.setBackground(Color.pink);
		add(box);
		
		enermy = new JLabel();                   //적군 설정
		enermy.setBounds(100, 100, 70, 70);
		enermy.setOpaque(true);
		enermy.setBackground(Color.yellow);
		add(enermy);
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(this); // 방향키 움직이게 하기위함
		
		//removeKeyListener(this);
		
		Timer tm = new Timer();
		tm.main = this;
		tm.start();
		
	}
	
	
	public static void main(String[] args) {
		new KeyEventMain();
			
	}


	@Override
	public void keyTyped(KeyEvent e) {
		//System.out.println("keyTyped-> 글자키만 눌렀을때");
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("keypressed->키를 눌렀을때");		
		int key = e.getKeyCode();  // 방향키 움직이게하는 코드
		//System.out.println(key);
		switch(key) {
		case 37:
			x-=5;
			//System.out.println("왼쪽");   //왼쪽 x축-5만큼
			break;
		case 39:
			x+=5;
			//System.out.println("오른쪽");
			break;
		case 38:
			y-=5;
			//System.out.println("위");
			break;
		case 40:
			y+=5;
			//System.out.println("아래");
			break;
		}
		
		if(x<0) {           // 핑크 벽밖으로 못나가게함
			x=0;
		}
		if(y<0) {
			y=0;
		}
		if(x>800-50-20) {
			x=800-50-20;
		}
		if(y<0) {
			y=0;
		}
		if(y>600-50-40) {
			y=600-50-40;
		}
		box.setLocation(x, y);
		//box.setLocation(200, 100);  
	}


	@Override
	public void keyReleased(KeyEvent e) {
		//System.out.println("keyReleased->키를 땠을때");		
	}

}
