package oops_p;

import java.util.Scanner;

public class UserLoginMain {

	public static void main(String[] args) {
		
		String pid = "aaa", ppw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print("어른디:");
				String id = sc.next();
				
				if(!id.equals(pid)) {
					throw new Exception("id 에러");
				}
				
				System.out.println("아뭐:");
				String pw = sc.next();
				
				if(!pw.equals(ppw)) {
					throw new Exception("pw 에러");

				}
				
				break;
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	
		System.out.println("로그인 성공");
	}

}
