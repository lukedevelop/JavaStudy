package exam;
//mp3 �뷡��⸦ �����ϼ���
// 1. �뷡 ���� : Ʈ����ȣ, �뷡����, ����
// 2. �뷡 ����Ʈ -->next �� �ֱ�
// 3. �������� ������, ������, Ʈ����ȣ
import java.util.Stack;

class MP3{
	String now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	Stack num = new Stack();
	
	void sing(String sg) {
		System.out.println("----------playMusic("+sg+")----------");
	   if(now != null) {
	   back.push(now);
	   }
	   
	   now = sg;
	   next.clear();
	  
	   sss();
	}
	
		
		void Back() {
			System.out.println("Back()--------------");
		if(back.empty()) {
			System.out.println("�������� �����ϴ�.");
		return;
		}
		
		next.push(now);
		now = (String)back.pop();
		sss();
	}	
		
		void Next() {
			System.out.println("Next()--------------");
		if(next.empty()) {
			System.out.println("�������� �����ϴ�.");
		return;
		}
		back.push(now);
		now = (String)next.pop();
		sss();
	}	
		

		
		
		void sss() {
			System.out.println("�����: "+now);
			System.out.println("������: "+back);
			System.out.println("������: "+next);
		}


public void peek() {
	// TODO Auto-generated method stub
	
}
		
}
	

public class Mp3Main {
	
	public static void main(String[] args) {
	
       MP3 ss = new MP3();
		
       ss.sing("01."+"2002,"+"Anne-Marie");
       ss.sing("02."+"��������,"+"��â��");
       ss.sing("03."+"I,"+"�¿�");
       ss.sing("04."+"��,"+"�ӽ����");
       ss.sing("05."+"Hello,"+"Addel");
       ss.sing("06."+"ȫ��,"+"�ܳ���");
       ss.Back();
       ss.Back();
       ss.Back();
       ss.Next();
       ss.Next();
      // ss.peek();
		
       
       
       
       
	}

	}
