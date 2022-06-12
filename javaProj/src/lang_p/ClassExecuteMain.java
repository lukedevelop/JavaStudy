package lang_p;

import java.util.Scanner;

interface CCBoard{
	
	void execute(String data);
}

class CCList implements CCBoard{

	@Override
	public void execute(String data) {
		System.out.println("�Խ��� ����Ʈ�Դϴ�.:"+data);
	}
}

class CCWrite implements CCBoard{

	@Override
	public void execute(String data) {
		System.out.println("�Խ��� �۾����Դϴ�.:"+data);
	}
}

class CCModify implements CCBoard{

	@Override
	public void execute(String data) {
		System.out.println("�Խ��� �����Դϴ�.:"+data);
	}
}
class CCDelete implements CCBoard{

	@Override
	public void execute(String data) {
		System.out.println("�Խ��� �����Դϴ�.:"+data);
	}
}


public class ClassExecuteMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("��ɾ� �Է�:");
			String tt = sc.next();
			
			if(tt.equals("x")) {
				break;
			}
			
			try {
				CCBoard cb = (CCBoard)Class.forName("lang_p.CC"+tt).newInstance();
			
				cb.execute("������ ����");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("�߸��� ����Դϴ�.");
			}
			
		}
		
		System.out.println("���α׷� ����");

	}

}
