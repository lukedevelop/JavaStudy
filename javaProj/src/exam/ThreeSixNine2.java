package exam;

import java.util.Scanner;

public class ThreeSixNine2 {
	
	static String zzag(int no) {
		
		int three = no%3;
		
		String res = "";
		
		try {
			int a = 1234/three;
		} catch (Exception e) {
			try {
				int b = 1234/no;
				
				res="Â¦";
			} catch (Exception e2) {
			
			}
		}
		return res;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ÀÔ·Â:");
		
		int su = sc.nextInt();
		
		
		for (int i = 1; i <= su; i++) {
			
			char [] arr = (i+"").toCharArray();
			
			//System.out.println(Arrays.toString(arr));
			
			String ttt = "";
			
			for (char ch: arr) {
				//System.out.println(ch);
				ttt+= zzag(ch-'0');
			}

			try {
				int a = 1234/ttt.length();
			} catch (Exception e) {
				ttt+=i;
			}

			System.out.println(ttt);
		}

	}

}
