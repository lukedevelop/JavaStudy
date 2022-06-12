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



	int jum = 0;
	@Override
	public void run() {
	
		//int jum = 0;
		for (ThQuizData qd : arr) {
			String input = JOptionPane.showInputDialog(qd.qq);
			if(timer.chk) {
				
				input ="�ð����";
				break;
			}
			System.out.println(qd.qq+":"+input+"("+qd.answer+")");
			
			
			if(qd.answer.equals(input)) {
				jum+=20;
			}else if(input.equals("pass")) {  //pass
				System.out.println("�н�"+ "");
						
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


public class ThreadQuizExam {

	public static void main(String[] args) {
		ThQuizTimer timer = new ThQuizTimer();
		ThQuiz quiz =new ThQuiz(timer,
				new ThQuizData("����ȯ���� ���� ����?(�𸣸� pass)", "o"),
				new ThQuizData("����ش��� ���� �����̴�?(�𸣸� pass)", "o"),
				new ThQuizData("���Ѻ����� �Ｚ �Ƶ��̴�?(�𸣸� pass)", "o"),
				new ThQuizData("��â����� ���ѵ����� �����Ѵ�?(�𸣸� pass)", "o"),
				new ThQuizData("��������� ��Ҹ��� ������ �ִ�?(�𸣸� pass)", "x")
				
				);
		
		
		timer.start();
		quiz.start();

	}

}

//		Ǯ���� Quiz �� �������  
//		1. �н��� ������ �ּ���      for�� if�� �����
//		2. ������ �ƴ� ��� ���⶧���� ������ Ǯ�� �� �ּ���
//		3. �н� �� ��� ������ �н� ���� ������� �Ұ� ���ּ���
		
