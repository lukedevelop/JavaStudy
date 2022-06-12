package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.plaf.FontUIResource;

public class CharPaintMain2 extends JFrame implements MouseMotionListener, ActionListener{

	public CharPaintMain2() {

		System.out.println("������"+ MouseEvent.BUTTON1_DOWN_MASK);
//		System.out.println("������"+ MouseEvent.BUTTON2_DOWN_MASK);
//		System.out.println("������"+ MouseEvent.BUTTON3_DOWN_MASK);
		setBounds(50, 50, 600, 500);
		getContentPane().setBackground(Color.white);
		setLayout(null);
		
		Color [] ccs = {Color.red, Color.orange, Color.yellow,
				Color.green, Color.blue, Color.pink,
				Color.black,Color.white
		};
		
		for (int i = 0; i < ccs.length; i++) {
			JButton btn = new JButton();
			btn.setBounds(0, 50*i, 50,50);
			btn.setBackground(ccs[i]);
			btn.addActionListener(this);

			add(btn);
		}
		
		JSlider jb = new JSlider(JSlider.HORIZONTAL, 5,80, 20);
		jb.setBounds(50, 350, 200,100);
		add(jb);
		
		jb.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				
				JSlider jjj = (JSlider)e.getSource();
				System.out.println(jjj.getValue());
				
				size = jjj.getValue();
			}
		});
		
		setResizable(false);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//paint(getGraphics());
		
		//repaint();  //�ٽñ׸���
		
		addMouseMotionListener(this);
	}
	
	int x = -100, y = -100, size = 20;
	
	boolean first = true;
	
	Color cc = Color.black;
	
	String ttt = "";
	
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		//super.paint(g);
		//System.out.println("paint() ����");
		if(first) {
			g.setColor(Color.white);
			g.fillRect(100, 0, 550, 350);
			
			
		}
			g.setFont(new Font("�޸�����ü", Font.PLAIN, size));
			g.setColor(cc);
			g.drawString(ttt,x, y );
		
		
	}
	public static void main(String[] args) {
		
		new CharPaintMain2();

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		
		//System.out.println(e.getModifiersEx());      //���콺 ���� ��� ������ Ŭ����
		
		if(e.getModifiersEx() == MouseEvent.BUTTON1_DOWN_MASK) {
			ttt = "��";
		}else {
			ttt = "��";
		}
		first = false;
		// TODO Auto-generated method stub
		//System.out.println("dragged"+e.getX()+","+e.getY());
		if(e.getX()>=100 && e.getY()<=350) {
			x = e.getX();
			y = e.getY();
			repaint();  //ȭ�� �ٽ� �׸���
		}
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton nowBtn = (JButton)e.getSource();
		//getSource() --> Object ���·� ���� : �̺�Ʈ�ҽ���ü�� �޾ƿ�
		//System.out.println("������"+nowBtn.getBackground());
		cc = nowBtn.getBackground();
		
	}

}
