package exam;



public class ThreeSixNine {
	
	static String zzag(int no) {
		
		int three = no%3;
		
		String res = "";
		
		try {
			int a = 1234/three;
		} catch (Exception e) {
			try {
				int b = 1234/no;
				
				res="¦";
			} catch (Exception e2) {
			
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		
		
		
		for (int i = 1; i <= 100 ; i++) {
			
			String ttt = zzag(i/10) + zzag(i%10);
			
			try {
				int a = 1234/ttt.length();
			} catch (Exception e) {
				ttt+=i;
			}

			System.out.println(ttt);
		}

	}

}

