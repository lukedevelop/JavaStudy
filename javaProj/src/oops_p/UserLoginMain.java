package oops_p;

import java.util.Scanner;

public class UserLoginMain {

	public static void main(String[] args) {
		
		String pid = "aaa", ppw = "1234";
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			try {
				System.out.print("���:");
				String id = sc.next();
				
				if(!id.equals(pid)) {
					throw new Exception("id ����");
				}
				
				System.out.println("�ƹ�:");
				String pw = sc.next();
				
				if(!pw.equals(ppw)) {
					throw new Exception("pw ����");

				}
				
				break;
			}catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
		}
	
		System.out.println("�α��� ����");
	}

}
