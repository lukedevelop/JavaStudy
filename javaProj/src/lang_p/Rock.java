package lang_p;
import java.util.Scanner;
public class Rock {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		String [] index = {"����","����","��"};
//		while(true) {
//			System.out.println("���������� ����");
//			System.out.println("0:����, 1:����, 2:��, 9:����");
//			System.out.println("�Է�:");
//			int user = sc.nextInt();
//			
//			if(user == 9) {
//				break;
//			}
//			int com = (int)(Math.random()*3);
//			
//			String res = "��";
//				if(user == 2 && com == 2) {
//					res = "���";
//				}else if(user == 2 && com == 1) {
//					res = ("��");
//				}else {
//					res = "��";
//				}
//				
//			
//			System.out.println("��:"+index[user]);
//			System.out.println("��ǻ��:"+index[com]);
//			System.out.println("���:"+res);
//		}
//           System.out.println("��������");
		
           
         

     

          

           	
           		Scanner sc = new Scanner(System.in);
           		String [] index = {"����","����","��"};
           		
           		String res [][] = {			//user
           				{"���","��","��"},	//����
           				{"��","���","��"},	//����
           				{"��","��","���"},	//��
           			//com ����, ����, ��
           		};
           		
           		while(true) {
           			
           			System.out.println("���������� ����,  0:����, 1:����, 2:��, 9:����");
           			System.out.print("�Է�:");
           			int user = sc.nextInt();
           			
           			if(user==9) {
           				break;
           			}
           			
           			int com = (int)(Math.random()*index.length);
           			
           			System.out.println("���̸�:"+index[user]);
           			System.out.println("��ǻ��:"+index[com]);
           			System.out.println("���:"+res[user][com]);
           		}
           		
           		System.out.println("��������");

           	

	}

}
