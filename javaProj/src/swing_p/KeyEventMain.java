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
	
	class Timer extends Thread{              // enemy,timer (�Ǵ� ���������)
		
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
					System.out.println("��ħ");
					break;
					
				}
				
				int ex = enermy.getX()+dx, ey = enermy.getY()+dy;
				
				if(ey>=600-70-40 || ey<0) {  // 70�� ���̰� 70
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
		super("Ű �̺�Ʈ");
		setBounds(50, 50, 800, 600);
		setLayout(null);
		
		box = new JLabel();
		box.setBounds(x, y, 50, 50);
		box.setOpaque(true);
		box.setBackground(Color.pink);
		add(box);
		
		enermy = new JLabel();                   //���� ����
		enermy.setBounds(100, 100, 70, 70);
		enermy.setOpaque(true);
		enermy.setBackground(Color.yellow);
		add(enermy);
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addKeyListener(this); // ����Ű �����̰� �ϱ�����
		
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
		//System.out.println("keyTyped-> ����Ű�� ��������");
		
	}


	@Override
	public void keyPressed(KeyEvent e) {
		//System.out.println("keypressed->Ű�� ��������");		
		int key = e.getKeyCode();  // ����Ű �����̰��ϴ� �ڵ�
		//System.out.println(key);
		switch(key) {
		case 37:
			x-=5;
			//System.out.println("����");   //���� x��-5��ŭ
			break;
		case 39:
			x+=5;
			//System.out.println("������");
			break;
		case 38:
			y-=5;
			//System.out.println("��");
			break;
		case 40:
			y+=5;
			//System.out.println("�Ʒ�");
			break;
		}
		
		if(x<0) {           // ��ũ �������� ����������
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
		//System.out.println("keyReleased->Ű�� ������");		
	}

}
