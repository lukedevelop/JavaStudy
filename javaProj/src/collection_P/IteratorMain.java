package collection_P;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Set;

public class IteratorMain {

	public static void main(String[] args) {
		Set ss = new HashSet();
		ss.add(11);
		ss.add(7);
		ss.add(90);
		ss.add(8);
		ss.add(23);
		ss.add(65);
		
		for (Object object : ss) {
			int i = (int)object;
			System.out.println(i);
			if(i==23) {
				//ss.remove(i);
			}
		}
		
		System.out.println(ss);
		ArrayList ar = new ArrayList(ss);
		
		Iterator it = ar.iterator();
		System.out.println(it);
		//System.out.println(it.hasNext());
		//System.out.println(it.next());
		while(it.hasNext()) {
			//System.out.println(it.next());
			int i = (int)it.next();
			System.out.println(i);
			if(i==23) {
				//ss.remove(i);
				it.remove();
			}
		}
		/*
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}*/
		
		
		System.out.println(ar);
		
		ListIterator lit = ar.listIterator();
		
		System.out.println("------------------------");
		while(lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
		
		System.out.println("------------------------");
		while(lit.hasNext()) {
			System.out.println(lit.next());
		}

		
		int [] nums = {34,56,12,43,90,89,654,43,21234,675,45};
		//2의 배수 , 3의배수를 제거한 목록을 출력하세요
		
		ArrayList ar2 = new ArrayList();
		 
		 for(int i : nums) {
			 ar2.add(i);
		 }
	   System.out.println(ar2);
	   it = ar2.iterator();
	   
	   while(it.hasNext()) {
		   int i = (int)it.next();
		   if(i%2==0 || i%3==0) {
			   it.remove();
		   }
	   }
	   System.out.println(ar2);
	}
	
}

