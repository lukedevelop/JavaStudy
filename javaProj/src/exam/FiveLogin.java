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
			new UserData("aa", "1111", "��ȿ��"),
			new UserData("bb", "2222", "��ȿ��"),
			new UserData("cc", "3333", "��ȿ��"),
			new UserData("dd", "4444", "��ȿ��"),
			new UserData("ee", "5555", "��ȿ��")
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
					throw new Exception("id ����");
				}
				
				System.out.print("pw:");
				String pw = sc.next();
				
				if(!log.pw.equals(pw)) {
					throw new Exception("pw ����");
				}

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			
			
		}
		
		System.out.println(log.name+" �α��� ����");

	



		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
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
//				System.out.print("���̵�:");
//				String id = sc.next();
//				
//				if(!id.equals(one)) {
//					throw new Exception("id ����");
//			}else if(!id.equals(two)) {
//				     throw new Exception("id ����");
//			}else if(!id.equals(three)) {
//			     throw new Exception("id ����");
//		    }else if(!id.equals(four)) {
//			     throw new Exception("id ����");
//		    }else {
//		    	System.out.println("id ����");
//		    }
//				System.out.print("���:");
//				String pw = sc.next();
//				
//				if(!pw.equals(ppw)) {
//					throw new Exception("pw ����");
//				}else if(!pw.equals(two)) {
//					throw new Exception("pw ����");
//			}else if(!pw.equals(three)) {
//				throw new Exception("pw ����");
//		    }else if(!pw.equals(four)) {
//		    	throw new Exception("pw ����");
//		    }else {
//		    	System.out.println("pw ����");
//		    }
//		    	
//			break;
//			}catch(Exception e) {
//		        System.out.println(e.getMessage());
//			}
//			
//			}
//		    System.out.println("��ȿ��");
//			System.out.println("�α��� ����");
		
	}

}
