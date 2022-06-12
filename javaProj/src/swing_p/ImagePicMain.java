package swing_p;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImagePicMain extends JFrame {

	Image img1, img2, img3, img4, img5;

	public ImagePicMain() {
		super("�̹��� ����");

		Toolkit kit = Toolkit.getDefaultToolkit();  // �̹��������� �ε��Ͽ� �������� ���
		img1 = kit.getImage("fff/Food1.jpg");
		img2 = kit.getImage("fff/Food2.jpg");
		img3 = kit.getImage("fff/Food3.jpg");
		img4 = kit.getImage("fff/Food4.jpg");
		img5 = kit.getImage("fff/Chalsu.jpg");
		setBounds(50, 50, 800, 600);

		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		if (img1 == null) {                            //
			return;
		}
		super.paint(g);
		
		//�Ű������� 6���� ��� -> ������ �߶� �׷����� ��ġ�� �����Ͽ� �׷���
		g.drawImage(img1, 
				750, 50,            // �׷����� ������ġ(�ڸ�����ġ)
				//350,300,            // ũ�Ⱑ �ƴϴ� ������ ��ġ��(�ڸ�����ġ)
				350,300,     //�׷����� ����ġ (�ڸ�����ġ)
				
				
				//���� ��ġ
				350,500,   //������ ������ġ
				1200,1500,  // ������ ����ġ
				
				           //�׷����� ����ġ�� �ƴϴ�
				this);
		
		// �Ű������� 6���� ��� -> ������ ��ü�� �׷����� ��ġ�� �����Ͽ� �׷���
		g.drawImage(img2, 
				0, 0,   // �׷����� ������ġ
				400,300,   // �׷����� ũ��(����, �ѷ�)
				this);
		
		
		//�׷����� ������ġ�� �����ϰ� ������ ũ���� �׷����� ��ġ�� �׷���
		//g.drawImage(img2, 50, 200, this);
		
		g.drawImage(img3,
				0,300,
				400,300,
				this);
		
		g.drawImage(img4,
				400,300,
				400,300,
				this);
		
		g.drawImage(img5,
				200,150 ,
				400,300,
				this);
		
	}

	public static void main(String[] args) {

		new ImagePicMain();
	}

}
