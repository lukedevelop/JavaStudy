package swing_p;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class ImagePicMain extends JFrame {

	Image img1, img2, img3, img4, img5;

	public ImagePicMain() {
		super("이미지 사진");

		Toolkit kit = Toolkit.getDefaultToolkit();  // 이미지파일을 로드하여 가져오는 기능
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
		
		//매개변수가 6개인 경우 -> 웝농을 잘라서 그려지는 위치를 지정하여 그려짐
		g.drawImage(img1, 
				750, 50,            // 그려지는 시작위치(자르는위치)
				//350,300,            // 크기가 아니다 끝나는 위치임(자르는위치)
				350,300,     //그려지는 끝위치 (자르는위치)
				
				
				//원본 위치
				350,500,   //원본의 시작위치
				1200,1500,  // 원본의 끝위치
				
				           //그려지는 끝위치가 아니다
				this);
		
		// 매개변수가 6개인 경우 -> 원본으 전체가 그려지는 위치에 저장하여 그려짐
		g.drawImage(img2, 
				0, 0,   // 그려지는 시작위치
				400,300,   // 그려지는 크기(넓이, 둘레)
				this);
		
		
		//그려지는 시작위치만 지정하고 원본의 크기대로 그려지는 위치에 그려짐
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
