package swing_p;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.JFrame;

public class ImagMain extends JFrame {

	
	Image img,img2,img3,img4;
	Graphics gg,gg2,gg3,gg4;
	public ImagMain() {
		super("Image");
		setBounds(50, 50, 800, 800);
		
		setResizable(false); //âũ�⸦ �����Ҽ�����
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//�̹��� ���� : GUI �����̳� �޿��� createImage �� ����
		img = createImage(600, 400);
		// �̹����� �׸� ���� ��������
		// ȭ���� �׸��� ���� �����ü� �ֵ� --> setVisible(true); �����Ŀ� ó���ؾ���
		gg = img.getGraphics();
		
		img2 = createImage(200, 100);   // ��ȭ�� ������
		gg2 = img2.getGraphics();
		
		img3 = createImage(200, 100);
		gg3 = img3.getGraphics();
		
		img4 = createImage(200, 100);
		gg4 = img4.getGraphics();
		
		
	}
	
	int [] x = {50,70,90};
	int [] y = {50,30,50};
	
	
	void meth_1() {
		gg.drawString("������ ����", 50, 50);
		gg2.fillOval( 50,50, 50, 50);
		gg3.fillRect(50, 50, 50,50);
		gg4.fillPolygon(x,y,3);    //�ﰢ�� ����� fillPolygon swing ������ y���� �Ʒ���
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		meth_1();
	
		g.drawImage(img, 50, 20, this);     // (Jframe �ڱ��ڽ��̱⿡)this �ڸ��� ������ �ڸ� �����̳� �̻���� �ֵ鸸 ���;���
		g.drawImage(img2, 50, 170, this);     
		g.drawImage(img3, 50, 320, this);     
		g.drawImage(img4, 50, 490, this);     
		
	}
	
	public static void main(String[] args) {
		
		new ImagMain();
		
	}

}