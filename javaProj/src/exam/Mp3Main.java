package exam;
//mp3 노래듣기를 구현하세요
// 1. 노래 정보 : 트랙번호, 노래제목, 가수
// 2. 노래 리스트 -->next 에 넣기
// 3. 구현내용 다음곡, 이전곡, 트랙번호
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
			System.out.println("이전곡이 없습니다.");
		return;
		}
		
		next.push(now);
		now = (String)back.pop();
		sss();
	}	
		
		void Next() {
			System.out.println("Next()--------------");
		if(next.empty()) {
			System.out.println("다음곡이 없습니다.");
		return;
		}
		back.push(now);
		now = (String)next.pop();
		sss();
	}	
		

		
		
		void sss() {
			System.out.println("현재곡: "+now);
			System.out.println("이전곡: "+back);
			System.out.println("다음곡: "+next);
		}


public void peek() {
	// TODO Auto-generated method stub
	
}
		
}
	

public class Mp3Main {
	
	public static void main(String[] args) {
	
       MP3 ss = new MP3();
		
       ss.sing("01."+"2002,"+"Anne-Marie");
       ss.sing("02."+"소주한잔,"+"임창정");
       ss.sing("03."+"I,"+"태연");
       ss.sing("04."+"고독,"+"머쉬배놈");
       ss.sing("05."+"Hello,"+"Addel");
       ss.sing("06."+"홍콩,"+"잔나비");
       ss.Back();
       ss.Back();
       ss.Back();
       ss.Next();
       ss.Next();
      // ss.peek();
		
       
       
       
       
	}

	}
