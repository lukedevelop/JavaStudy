package exam;

import java.util.HashMap;
import java.util.Map;

public class Number {

	public static void main(String[] args) {
		// 다음 숫자들의 각 약수들의 갯수를 구하세요 단 0,1 제외
		
		int [] nums = {22,4,56,7,8,90,12,3,45,6,22,31,45,63,86,57};
		
		HashMap mm1 = new HashMap();
		
		for(int i : nums) {
			for(int j = 2; j <= i; j++) {
				
				int cnt = 1;
				
				if(i%j == 0) {
					if(mm1.containsKey(i)) {
						cnt += (int)mm1.get(i);
					}
					
					
					mm1.put(i, cnt);
				}
			}
			
		}
		for(Object obj : mm1.entrySet()) {
			System.out.println(obj);
		}			

	}

}
