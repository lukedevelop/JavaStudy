package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;






public class CharPaintMain extends JFrame implements MouseMotionListener {       //마우스 움직이기위해 mouseMotionListener

	public CharPaintMain() {
		
		System.out.println("생성자");
		setBounds(50, 50, 600, 400);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		JButton btn = new JButton("sdfss");
		btn.setBounds(50, 50, 100, 50);
		btn.setBackground(Color.red);
		add(btn);
		
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//paint();
		
		//repaint();                  //다시그리기 (paint 의 g 가 없어도 사용가능)
		
		addMouseMotionListener(this);
	}
	
	int x = -100, y = -100;
	
	boolean first = true;
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		//System.out.println("paint() 실행");
		
	
		
		if(first) {
			g.setColor(Color.white);               
			g.fillRect(0, 0, 600, 400);
			first = false;
		}
			
		g.setColor(Color.black);
		g.drawString("★", x, y);        // drawString : 특수문자도 가능
		
		
		
		
	}
	

	
	
	public static void main(String[] args) {
	
		new CharPaintMain();
		
		
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("dragged"+e.getX()+","+e.getY());   //좌표알아보기위함
		x= e.getX();
		y= e.getY();
		repaint();    //화면다시그리기
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}