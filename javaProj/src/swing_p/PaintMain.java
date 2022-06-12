package swing_p;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

public class PaintMain extends JFrame {
	
	public PaintMain() {
		super("paint");
		System.out.println("생성자다!!");
		
		setBounds(50, 50, 900, 600);
		getContentPane().setBackground(Color.white);   //프래임 배경색을 흰색으로 하기위함
		setLayout(null);
		//setResizable(false);
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	@Override
	public void paint(Graphics g) {

		super.paint(g);      //화면을 새로 그린다 --> 배경을 다시그림
		//화면 갱신이 될때 자동호출
		//화면 갱신 : 화면 크기변경(최대화 포함)
		//System.out.println("paint() 실행");
		g.setColor(Color.blue);                // "송지은 만세" 에 색 입힘
		g.setFont(new Font("휴먼지체", Font.ITALIC, 30));       // 글꼴, 글자크기
		g.drawString("송지은 만세",50,100);        //텍스트가 아님, 벽에 벽화 그린느낌       
		
		g.setColor(Color.red);                  // fillrect직사각형 색상 변경
		g.fillRect(50, 120, 200, 100);          // fillrect : 꽉채워진 직사각형 도형이 만들어짐   (x축,y축,끝점,시작점)
		
		g.setColor(Color.green); 
		g.drawRect(150, 150, 200, 100);          // drawrect : (속이빈) 선들만 나타남  <fillrect 바로위로 쓸경우 겹치는게아니라 새로운 그림판에 그려 겹치는거처럼 보임>
		
		g.setColor(Color.pink); 
		g.fillOval(50, 250, 200, 100);           // fillOval : 원
		
		g.setColor(Color.green); 
		g.drawRect(50, 250, 200, 100); 
		
		g.setColor(Color.blue); 
		g.drawOval(100, 300, 70, 70);            //drawOval : (속이빈) 원 

		g.setColor(Color.darkGray); 
		g.drawLine(50, 100, 350, 350);           // drawLine : 선
		
		g.setColor(Color.darkGray); 
		g.drawRoundRect(50, 370, 200, 100,50,50);        // drawRoundRect: 라운드형 사각형 
		
		g.setColor(Color.blue); 
		g.drawArc(400, 50, 100, 100, 45, 90);       //  drawArc: 45도 부터 90도 까지만 그림 (곡선만)
		
		g.setColor(Color.blue); 
		g.fillArc(600, 50, 100, 100, 45, 90);        // fillArc: 45도 부터 90도 까지만 그림 (색채워서)
		
		g.fillPolygon(                              //  fillPolygon: 각포인트 지점을잡아 선을 연결
				new int[] {600,700,800,500},        // {x,x,x,x}  배열을통해 x축 시작점 y축끝점 라인 연결
				new int[] {400,370,530,500},        // {y,y,y,y}  
				4                                   // 선4개
				);
		
		g.setColor(Color.green); 
		g.drawPolygon(
				new int[] {500,600,700,400}, 
				new int[] {400,370,530,500},
				4
				);
		
		g.drawPolyline(
				new int[] {700,800,900,600}, 
				new int[] {400,370,530,500},
				4
				);
		
		g.setColor(Color.red); 
		g.drawPolyline(
				new int[] {600,700,800,500,600}, 
				new int[] {200,170,330,300,200},
				5
				);
		
		
		
	};
		

	public static void main(String[] args) {
		new PaintMain();

	}

}
