package exam;

import java.util.Scanner;

import exam.Figure;

interface Figure{
	
	void execute(String data,int answer);
}

class FGsquare implements Figure{
     
	@Override
	public void execute(String data, int answer) {
		System.out.println("사각형 넓이입니다.:"+data);
		
	}
}

class FGcircle implements Figure{
    
	@Override
	public void execute(String data, int answer) {
		System.out.println("원 넓이입니다.:"+data);
		
	}
}

class FGtriangle implements Figure{
    
	@Override
	public void execute(String data, int answer) {
		System.out.println("삼각형 넓이입니다.:"+data);
		
	}
}

public class InterFaceMain {

	public static void main(String[] args) {
		//입력값에 따라 도형클래스를 생성하여 도형의 넓이를 계산하세요
		//1.인터페이스를 이용한 다향성형태로 만들것
		//2.입력형태 0:사각형 1:원 2:삼각형      //0:사각형 이라 입력 하면 사각형 넓이값이 나와야함
		//3.실행메소드 void excute()
		//4.동적 바인딩 사용할 것

		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("도형 입력:");
			String tt = sc.next();
			System.out.println("숫자를 입력하시오.");
			int aa = sc.nextInt();
			
			if(tt.equals("0:사각형")) {
				System.out.println();
			}
			try {
				Figure fg = (Figure)Class.forName("exam.Fi"+tt).newInstance();
			
				fg.execute("", (aa*aa));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("잘못된 명령입니다.");
			}
			
		}
		}
		
		
		
	

}
