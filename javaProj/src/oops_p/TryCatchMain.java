package oops_p;

public class TryCatchMain {

	public static void main(String[] args) {
		
		try {
		int a = 10/0;
		
		System.out.println("a:"+a);
		
		int [] arr = {11,22,33,44};
		System.out.println("arr:"+arr[2]);
		
		}catch(ArithmeticException e) {
			
			System.err.println("수학적 예외 발생"+e.getMessage());
			//e.printStackTrace();
		
		
//		catch(ArrayIndexOutOfBoundsException e) {
//			
//			System.err.println("수학적"+ " 예외 발생"+e.getMessage());
//			
		}catch(Exception e) {
			
			System.err.println("일반 에러 발생"+e.getMessage());
		  return;
		}finally {
			System.out.println("프로그램 종료");
		}

			}
	

}
