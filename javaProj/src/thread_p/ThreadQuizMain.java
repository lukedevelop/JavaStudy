package thread_p;

import java.util.ArrayList;

import javax.swing.JOptionPane;

class ThQuizTimer extends Thread{
	
	boolean chk = false;
	
	@Override
	public void run() {
		
		for (int i = 30; i> 0; i--) {
			if(chk) {
				break;
			}
			
			try {
				
				System.out.println(i+","+chk);
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		chk = true;
		System.out.println("Ÿ�̸� ����");
		
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




	@Override
	public void run() {
	
		int jum = 0;
		for (ThQuizData qd : arr) {
			String input = JOptionPane.showInputDialog(qd.qq);
			if(timer.chk) {
				
				input ="�ð����";
				break;
			}
			System.out.println(qd.qq+":"+input+"("+qd.answer+")");
			if(qd.answer.equals(input)) {
				jum+=20;
			}
		}
		
		timer.chk = true;
		System.out.println("��������:"+jum);
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


public class ThreadQuizMain {

	public static void main(String[] args) {
		ThQuizTimer timer = new ThQuizTimer();
		ThQuiz quiz =new ThQuiz(timer,
				new ThQuizData("�������� �̻���?", "y"),
				new ThQuizData("�������� �۰��� ����?", "n"),
				new ThQuizData("�������� ���簡��?", "y"),
				new ThQuizData("�������� ����ų���?", "y"),
				new ThQuizData("������ �������̵��!", "n")
				);
		//quiz.timer = timer;
		
		timer.start();
		quiz.start();

	}

}
