package collection_P;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set s1 = new HashSet();                     //중복숫자는 빠짐
		ArrayList arr1 = new ArrayList();
		
		Object [] arr = {45,67,78,45,76,23,12,23,2,3,12,45,67,"45",65,'A'};
		
		for(Object oo : arr) {
			s1.add(oo);
			arr1.add(oo);
		}

		System.out.println("s1: "+s1);
		System.out.println("arr1: "+arr1);
		s1.remove(2);
		System.out.println("s1: "+s1);
		System.out.println("s1: "+s1.size());
		System.out.println("s1: "+s1.contains(67));
		System.out.println("s1: "+s1.contains(100));
		
		ArrayList arr2 = new ArrayList();
		arr2.add(111);
		arr2.add(222);
		arr2.add(111);
		arr2.add(444);
		arr2.add(222);
		System.out.println(arr2);
		
		s1.addAll(arr2);
		System.out.println(s1);
		System.out.println(s1.containsAll(arr2));
		s1.remove(111);
		System.out.println(s1.containsAll(arr2));
		arr2.add(777);
		arr2.add(888);
		s1.removeAll(arr2);
		System.out.println(arr2);
		System.out.println(s1);
		
		Set lotto1 = new HashSet();
		ArrayList lotto2 = new ArrayList();
		
		while(true) {
			int no = (int)(Math.random()*45+1);
			lotto1.add(no);
			lotto2.add(no);
			
			if(lotto1.size()==7) {
				break;
			}
	
			System.out.println("lotto1: "+lotto1);    //set 은 중복숫자가 빠짐
			System.out.println("lotto2: "+lotto2);    // 중복숫자가 나옴
		}
		
		
		
	}

}
