package collection_P;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

class MapCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		int me = (int)o1;
		int you = (int)o2;
		
		return you - me;
	   //return 1;  : get()호출시 null을 유발
		
	}
	
	
}



public class TreeMapMain {

	public static void main(String[] args) {
		
		HashMap mm1 = new HashMap();     //지멋대로 
		LinkedHashMap mm2 = new LinkedHashMap();  //
		TreeMap mm3 = new TreeMap(new MapCom());          //키를 중심으로 정렬
				
        int [] arr = {11,33,44,55,22,33,44,88,66,77,22,33,55};
		
        for(int i : arr) {
        	mm1.put(i, "아기상어");
        	mm2.put(i, "아기상어");
        	mm3.put(i, "아기상어");
        }
	System.out.println(mm1);
	System.out.println(mm2);
	System.out.println(mm3);
	
	System.out.println(mm1.get(44));
	System.out.println(mm2.get(44));
	System.out.println(mm3.get(44));
	
	
	
	
	}

}
