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
	   //return 1;  : get()ȣ��� null�� ����
		
	}
	
	
}



public class TreeMapMain {

	public static void main(String[] args) {
		
		HashMap mm1 = new HashMap();     //���ڴ�� 
		LinkedHashMap mm2 = new LinkedHashMap();  //
		TreeMap mm3 = new TreeMap(new MapCom());          //Ű�� �߽����� ����
				
        int [] arr = {11,33,44,55,22,33,44,88,66,77,22,33,55};
		
        for(int i : arr) {
        	mm1.put(i, "�Ʊ���");
        	mm2.put(i, "�Ʊ���");
        	mm3.put(i, "�Ʊ���");
        }
	System.out.println(mm1);
	System.out.println(mm2);
	System.out.println(mm3);
	
	System.out.println(mm1.get(44));
	System.out.println(mm2.get(44));
	System.out.println(mm3.get(44));
	
	
	
	
	}

}
