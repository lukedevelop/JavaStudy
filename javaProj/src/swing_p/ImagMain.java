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
		
		setResizable(false); //창크기를 수정할수없게
		
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		//이미지 생성 : GUI 컨테이너 급에서 createImage 로 생성
		img = createImage(600, 400);
		// 이미지에 그림 도구 가져오기
		// 화면을 그리고 나서 가져올수 있따 --> setVisible(true); 실행후에 처리해야함
		gg = img.getGraphics();
		
		img2 = createImage(200, 100);   // 도화지 사이즈
		gg2 = img2.getGraphics();
		
		img3 = createImage(200, 100);
		gg3 = img3.getGraphics();
		
		img4 = createImage(200, 100);
		gg4 = img4.getGraphics();
		
		
	}
	
	int [] x = {50,70,90};
	int [] y = {50,30,50};
	
	
	void meth_1() {
		gg.drawString("송지은 만세", 50, 50);
		gg2.fillOval( 50,50, 50, 50);
		gg3.fillRect(50, 50, 50,50);
		gg4.fillPolygon(x,y,3);    //삼각형 만드는 fillPolygon swing 에서는 y축이 아래로
	}
	
	
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		
		meth_1();
	
		g.drawImage(img, 50, 20, this);     // (Jframe 자기자신이기에)this 자리는 옵저버 자리 컨테이너 이상급의 애들만 들어와야함
		g.drawImage(img2, 50, 170, this);     
		g.drawImage(img3, 50, 320, this);     
		g.drawImage(img4, 50, 490, this);     
		
	}
	
	public static void main(String[] args) {
		
		new ImagMain();
		
	}

}