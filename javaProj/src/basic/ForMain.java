package basic;


public class ForMain {

	
	public static void main(String[] args) {
		
		
		
//		for(int i = 1; i <= 20; i++) {
//			
//			if(i%3 == 0) {
//				System.out.println("짝");
//			}else
//			System.out.println(i);	
//			
//		}
		
//		for(int i =1; i <=20; i++) {            //int i = 1 초기값, i <= 20 조건식, i++ 1씩증가 증감
//			
//			if(i<=10) {							// 1~10 까지만 나오게하는 조건식 i 는 10보다 작거나 같다를 만듬
//				if(i%3 == 0) {					// if문안에 1의자리 3,6,9, 짝이나오게 하려고 다중 if문생성
//					System.out.println("짝");	// "짝짝스~~~"
//				}else {							// else 1에서10안에있는 3,6,9 가 아닌 나머지 숫자 출력 
//					System.out.println(i);		//1,2,4,5,7,8,10 출력
//				}
//				
//			}else {                       		// 18번째 if문의 나머지 else 10의자리 출력
//				if((i-10)%3 == 0) {				// 이중if문을 사용해 10의자리 13,16,19가 나올때 짝 이나오게 해줌
//					System.out.println("짝");	// "짝짝스~~"
//				}else {							// 이중if문의 else 나머지 출력하기위함
//					System.out.println(i);		// else문의 나머지 10의자리 11,12,14,15,17,18 출력
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
