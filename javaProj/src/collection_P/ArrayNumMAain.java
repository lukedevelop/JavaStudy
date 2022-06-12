package collection_P;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayNumMAain {

	public static void main(String[] args) {
		int [] arr = {45,3,17,56,9,87,453,265,27,91,21,34,66,98,87};
		
		ArrayList two = new ArrayList();
		ArrayList three = new ArrayList();

		for(int i : arr) {
			System.out.println(i);
		if(i%2==0) {                               //2의배수만 
			two.add(i);                            //add 사용
		}
		if(i%3==0) {                              //3의배수만
			three.add(i);
		}
		}
		Collections.sort(two);                   //sort : 정렬
		Collections.sort(three);
		System.out.println(two);
		System.out.println(three);
		
		
	}

}
