package oops_p;

public class DebugMain {

	public static void main(String[] args) {
		
		
		int a = 10, b = 30, tot = 0;
		
		for(int i = a; i < b; i+=2) {
			tot += i;
			System.out.println(i+"-=>"+tot);
		}
		 System.out.println(tot);

	}

}
