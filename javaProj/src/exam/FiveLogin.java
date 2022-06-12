package exam;

import java.util.Scanner;

class UserData{
	String id, pw, name;

	public UserData(String id, String pw, String name) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
	}
}


public class FiveLogin {

	public static void main(String[] args) {
		UserData [] users = {
			new UserData("", "", ""),	
			new UserData("aa", "1111", "이효리"),
			new UserData("bb", "2222", "삼효리"),
			new UserData("cc", "3333", "사효리"),
			new UserData("dd", "4444", "오효리"),
			new UserData("ee", "5555", "육효리")
		};
		
		Scanner sc = new Scanner(System.in);
		
		UserData log;
		while(true) {
			try {
				log = null;
				System.out.print("ID:");
				String id = sc.next();
				
				for (UserData ud : users) {
					if(id.equals(ud.id)) {
						log = ud;
						break;
					}
				}
				
				if(log==null) {
					throw new Exception("id 에러");
				}
				
				System.out.print("pw:");
				String pw = sc.next();
				
				if(!log.pw.equals(pw)) {
					throw new Exception("pw 에러");
				}

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
		System.out.println(log.name+" 로그인 성공");

	



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		String one = "aa", ppw = "1111";
//		String two = "bb", ppw2 = "2222";
//		String three = "cc", ppw3 = "3333";
//		String four = "dd", ppw4 = "4444";
//		String five = "ee", ppw5 = "5555";
//		
//		Scanner sc = new Scanner(System.in);
//
//		while(true) {
//			try{
//				System.out.print("아이디:");
//				String id = sc.next();
//				
//				if(!id.equals(one)) {
//					throw new Exception("id 에러");
//			}else if(!id.equals(two)) {
//				     throw new Exception("id 에러");
//			}else if(!id.equals(three)) {
//			     throw new Exception("id 에러");
//		    }else if(!id.equals(four)) {
//			     throw new Exception("id 에러");
//		    }else {
//		    	System.out.println("id 에러");
//		    }
//				System.out.print("비번:");
//				String pw = sc.next();
//				
//				if(!pw.equals(ppw)) {
//					throw new Exception("pw 에러");
//				}else if(!pw.equals(two)) {
//					throw new Exception("pw 에러");
//			}else if(!pw.equals(three)) {
//				throw new Exception("pw 에러");
//		    }else if(!pw.equals(four)) {
//		    	throw new Exception("pw 에러");
//		    }else {
//		    	System.out.println("pw 에러");
//		    }
//		    	
//			break;
//			}catch(Exception e) {
//		        System.out.println(e.getMessage());
//			}
//			
//			}
//		    System.out.println("이효리");
//			System.out.println("로그인 성공");
		
	}

}
