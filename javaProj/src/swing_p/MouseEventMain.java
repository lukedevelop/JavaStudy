package swing_p;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class MouseEventMain extends JFrame implements MouseListener, MouseMotionListener {
	
	int lastX;
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged : "+e.getX()+","+e.getY());  //마우스 클릭하는 좌표
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved : "+e.getX()+","+e.getY());
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked : "+e.getX()+","+e.getY());
	}

	@Override
	public void mousePressed(MouseEvent e) {
		lastX = e.getX();
		//System.out.println("mousePressed : "+e.getX()+","+e.getY());
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		//System.out.println(e.getX()+","+e.getY());
		//System.out.println(e.getX()+","+lastX);
		String dir = "->";
		if(e.getX()<lastX) {
			dir = "<-";
		}
		System.out.println(dir);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		//System.out.println("mouseEntered : "+e.getX()+","+e.getY());
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		//System.out.println("mouseExited : "+e.getX()+","+e.getY());
	}
	
	public MouseEventMain() {
		super("마우스이벤트");
		setBounds(50, 50, 600, 500);
		setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addMouseListener(this);  // 창안에서 마우스 클릭 후 놨을때 좌표를 갑지(this 왜씀?)
		//addMouseMotionListener(this);    // 창안에 마우스 움직이는걸 다 감지
		
	}

	public static void main(String[] args) {
		new MouseEventMain();

	}

}
