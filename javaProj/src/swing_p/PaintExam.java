package swing_p;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintExam extends JFrame {

	public PaintExam() {
		
		super("paint");
		System.out.println("±×¸²ÆÇ");
		
		setBounds(50, 50, 1000, 800);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void paint(Graphics g) {
		
		super.paint(g);
		
	
		
		g.setColor(Color.black);
		g.drawOval(300, 200, 450, 500);
		
		g.setColor(Color.black);
		g.drawOval(350, 350, 100, 50);
		
		g.setColor(Color.blue);
		g.fillOval(370, 360, 25, 25);
		
		g.setColor(Color.blue);
		g.fillOval(510, 360, 25, 25);
		
		g.setColor(Color.black);
		g.drawOval(500, 350, 100, 50);
		
		g.setColor(Color.black);
		g.drawArc(450, 600, 100, 50, 45, 135);
		
		g.setColor(Color.blue); 
		g.fillArc(400, 400, 100, 100, -70, -100); 
		
	}
	
	
	public static void main(String[] args) {
		new PaintExam();

	}

}
