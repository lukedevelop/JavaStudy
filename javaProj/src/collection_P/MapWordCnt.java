package collection_P;

import java.util.HashMap;

public class MapWordCnt {

	public static void main(String[] args) {
		String ttt= "���� 20�� ���� 2022 ����¡ �ø����� '����'���� Ȱ���� ��������.";
			
		
		String [] arr = ttt.split(" ");
		
		HashMap map = new HashMap();
		for (String string : arr) {
			//System.out.println(string);
			
			int cnt = 1;

			if(map.containsKey(string)) {
				cnt+= (int)map.get(string);
				//System.out.println("�־�:" + i);
			}
			
			map.put(string, cnt);
			//System.out.println(map);
		}
		
		for(Object oo :map.entrySet()) {
			System.out.println(oo);
			
		}
		
	}

}
