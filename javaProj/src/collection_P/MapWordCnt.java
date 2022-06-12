package collection_P;

import java.util.HashMap;

public class MapWordCnt {

	public static void main(String[] args) {
		String ttt= "지난 20일 폐막한 2022 베이징 올림픽은 '형님'들의 활약이 돋보였다.";
			
		
		String [] arr = ttt.split(" ");
		
		HashMap map = new HashMap();
		for (String string : arr) {
			//System.out.println(string);
			
			int cnt = 1;

			if(map.containsKey(string)) {
				cnt+= (int)map.get(string);
				//System.out.println("있어:" + i);
			}
			
			map.put(string, cnt);
			//System.out.println(map);
		}
		
		for(Object oo :map.entrySet()) {
			System.out.println(oo);
			
		}
		
	}

}
