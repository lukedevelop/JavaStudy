package collection_P;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MapNumMain {

	public static void main(String[] args) {
		
		int [] nums = {22,4,56,7,8,90,12,3,45,6,22,31,45,63,86,57};

		
		 
		HashMap map = new HashMap();
		for(int i : nums) {
		
			for(int j = 2; j < i; j++) {
				if(i%j==0) {
				int cnt = 1;
				if(map.containsKey(j)) {
					cnt += (int)map.get(j);
				}
				
				map.put(j, cnt);
			}
				}
		
		}
		
		
		
		//System.out.println(kk);
	
	    for(Object k : new TreeSet(map.keySet()) ) {
	    	
	    	System.out.println(k+":"+map.get(k));
	    }
	   System.out.println("--------------------------");
	   
	   ArrayList arr = new ArrayList(new TreeSet(map.keySet()));  // 내림차순 정렬
	   Collections.reverse(arr);
	   
	   for(Object k : arr) {
		   System.out.println(k+":"+map.get(k));   //내림차순
	   }
	   
	   
	   
	}

}
