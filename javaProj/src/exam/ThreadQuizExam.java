package exam;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class ThQuizTimer extends Thread{
	
	boolean chk = false;
	
	@Override
	public void run() {
		
		while(true) {
		//for (int i = 50; i> 0; i--) {
			if(chk) {
				break;
			}
			
			try {
				
				//System.out.println(i+","+chk);
				sleep(1000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
		}
		chk = true;
		System.out.println("타이머 종료");
		
	}
}

class ThQuiz extends Thread{
	
	ThQuizTimer timer;
	
	ArrayList<ThQuizData> arr;
	
	
	
	
	public ThQuiz(ThQuizTimer timer, ThQuizData... arr) {
		super();
		this.timer = timer;
		this.arr = new ArrayList<ThQuizData>();
		
		for (ThQuizData qData : arr) {
			this.arr.add(qData);
		}
	}



	int jum = 0;
	@Override
	public void run() {
	
		//int jum = 0;
		for (ThQuizData qd : arr) {
			String input = JOptionPane.showInputDialog(qd.qq);
			if(timer.chk) {
				
				input ="시간경과";
				break;
			}
			System.out.println(qd.qq+":"+input+"("+qd.answer+")");
			
			
			if(qd.answer.equals(input)) {
				jum+=20;
			}else if(input.equals("pass")) {  //pass
				System.out.println("패스"+ "");
						
			}
		}
		
		timer.chk = true;
		System.out.println("시험점수:"+jum);
	}
}

class ThQuizData{
	String qq, answer;

	public ThQuizData(String qq, String answer) {
		super();
		this.qq = qq;
		this.answer = answer;
	}
	
	
}


public class ThreadQuizExam {

	public static void main(String[] args) {
		ThQuizTimer timer = new ThQuizTimer();
		ThQuiz quiz =new ThQuiz(timer,
				new ThQuizData("문정환님은 제일 세다?(모르면 pass)", "o"),
				new ThQuizData("김경준님은 국밥 러버이다?(모르면 pass)", "o"),
				new ThQuizData("최한별님은 삼성 아들이다?(모르면 pass)", "o"),
				new ThQuizData("오창용님은 무한도전을 좋아한다?(모르면 pass)", "o"),
				new ThQuizData("박찬희님의 목소리를 들은적 있다?(모르면 pass)", "x")
				
				);
		
		
		timer.start();
		quiz.start();

	}

}

//		풀이한 Quiz 를 기반으로  
//		1. 패스를 구현해 주세요      for문 if문 써야함
//		2. 정답이 아닐 경우 맞출때까지 문제를 풀게 해 주세요
//		3. 패스 한 경우 오답을 패스 이전 대답으로 할게 해주세요
		
