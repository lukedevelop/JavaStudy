package basic;


public class ForMain {

	
	public static void main(String[] args) {
		
		
		
//		for(int i = 1; i <= 20; i++) {
//			
//			if(i%3 == 0) {
//				System.out.println("¦");
//			}else
//			System.out.println(i);	
//			
//		}
		
//		for(int i =1; i <=20; i++) {            //int i = 1 �ʱⰪ, i <= 20 ���ǽ�, i++ 1������ ����
//			
//			if(i<=10) {							// 1~10 ������ �������ϴ� ���ǽ� i �� 10���� �۰ų� ���ٸ� ����
//				if(i%3 == 0) {					// if���ȿ� 1���ڸ� 3,6,9, ¦�̳����� �Ϸ��� ���� if������
//					System.out.println("¦");	// "¦¦��~~~"
//				}else {							// else 1����10�ȿ��ִ� 3,6,9 �� �ƴ� ������ ���� ��� 
//					System.out.println(i);		//1,2,4,5,7,8,10 ���
//				}
//				
//			}else {                       		// 18��° if���� ������ else 10���ڸ� ���
//				if((i-10)%3 == 0) {				// ����if���� ����� 10���ڸ� 13,16,19�� ���ö� ¦ �̳����� ����
//					System.out.println("¦");	// "¦¦��~~"
//				}else {							// ����if���� else ������ ����ϱ�����
//					System.out.println(i);		// else���� ������ 10���ڸ� 11,12,14,15,17,18 ���
//				}
//			}
//			
//		}
		
	
		
		for(int i = 1 ; i <= 5 ; i++) {
			for(int j = 1; j <= 5-i; j++) {
				System.out.print(" ");
				
			}
			for(int a = 1; a <= i; a++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
	} 

}
