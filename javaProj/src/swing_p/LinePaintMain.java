package swing_p;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class LinePaintMain extends JFrame implements MouseMotionListener, ChangeListener{

	Image img;
	Graphics gp;
	JLabel ccLB;
	
	boolean first = true;
	
	ArrayList<JSlider> sliders;
	
	public LinePaintMain() {
		super("���� �׸���");
		
		
		setBounds(50, 50, 800, 600);
		
		setLayout(null);
		
		ccLB = new JLabel();
		ccLB.setBounds(10,10,50,50);
		ccLB.setOpaque(true);
		ccLB.setBackground(Color.black);
		add(ccLB);
		
		sliders = new ArrayList<JSlider>();
		
		for (int i = 0; i <3; i++) {
			JSlider js = new JSlider(JSlider.HORIZONTAL, 0, 255, 0);
			js.setBounds(10, 70+50*i, 100, 50);
			add(js);
			sliders.add(js);
			js.addChangeListener(this);
		}
		
		
		
		
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		img = createImage(600, 400);
		gp = img.getGraphics();
		gp.setColor(Color.white);
		gp.fillRect(0, 0, 600, 400);
		
		
		addMouseMotionListener(this);
	}
	
	String tt = "";
	@Override
	public void paint(Graphics g) {
		if(img==null) {
			return;
		}
		if(first) {
			super.paint(g);
		}
		g.drawImage(img, gap,0, this);
	}
	
	
	public static void main(String[] args) {
		
		new LinePaintMain();

	}


	int x=100, y=100, gap=200;

	@Override
	public void mouseDragged(MouseEvent e) {
	
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			tt = "��";
		}else {
			tt = "��";
		}
		
		first = false;
		gp.setColor(ccLB.getBackground());
		gp.drawLine(x,y, e.getX()-gap, e.getY());
		x = e.getX()-gap;
		y = e.getY();
		repaint();
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		x = e.getX()-gap;
		y = e.getY();
		
	}

	@Override
	public void stateChanged(ChangeEvent e) {
		System.out.println("�ٲٳ�?");
		ccLB.setBackground(new Color(
				sliders.get(0).getValue(),
				sliders.get(1).getValue(),
				sliders.get(2).getValue()
				));
		
	}
}
