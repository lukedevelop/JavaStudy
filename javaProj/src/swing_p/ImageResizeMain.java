package swing_p;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImageResizeMain extends JFrame {

	Image img1, img2, img3;

	public ImageResizeMain() {
		super("�̹��� ũ�⺯��");

		Toolkit kit = Toolkit.getDefaultToolkit();
		img1 = kit.getImage("fff/Food1.jpg");
		
		img2 = img1.getScaledInstance(475, 475, Image.SCALE_SMOOTH);
		img3 = img1.getScaledInstance(200, 200, Image.SCALE_SMOOTH);   //�����̾ȸ´�

		setBounds(50, 50, 800, 600);
		setResizable(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		if (img1 == null) {
			return;
		}
		super.paint(g);

		g.drawImage(img1, 400, 50, this);
		g.drawImage(img2, 0, 0, this);
		g.drawImage(img3, 270, 200, this); //�����̾ȸ´�
	}

	public static void main(String[] args) {
		new ImageResizeMain();

	}

}
