package lang_p;
import java.util.Scanner;
public class CharmCharmCharm {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String [] index = {"����","������"};
		while(true) {
			System.out.println("������ ����, 0:����, 1:������, 9:����");
			System.out.println("�Է�:");
			int user = sc.nextInt();
			
			if(user==9) {
				break;
			}
			
			int com = (int)(Math.random()*2);
			
			String res = "��";
			if(user == com) {
				res = "��";
			}
					
			
			System.out.println("���̸�:"+index[user]);
			System.out.println("��ǻ��:"+index[com]);
			System.out.println("���:"+res);
		}
		System.out.println("��������");

	}

}
