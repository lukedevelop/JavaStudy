package collection_P;


import java.util.ArrayList;
import java.util.Collections;

public class ListMain {

	public static void main(String[] args) {
int [] arr2 = {56,78,92,45,73,25,77,94,75,57,83,85,51,45,72};
		
		ArrayList res = new ArrayList();
		
		String title = "수우미양가";
		for (int i = 0; i <title.length(); i++) {
			//0-가, 1-양, 2-미,3-우,4-수
			res.add(new ArrayList());
		}
		
		for (int i : arr2) {
			if(i<60) {
				((ArrayList)res.get(0)).add(i);
			}else {
				int pos = i/10-5;
				System.out.println(i+","+pos);
				((ArrayList)res.get(pos)).add(i);
			}
		}
		Collections.reverse(res);
		//Collections.sort(res);
		for (int i = 0; i <title.length(); i++) {
			
			ArrayList ar = (ArrayList)res.get(i);
			Collections.sort(ar);
			Collections.reverse(ar);
			System.out.println(title.charAt(i)+":"+   ar);
		}

	} 

	
	
	
}
