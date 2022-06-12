package collection_P;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

      static void add_1(String name, List arr) {
    	  long start = System.currentTimeMillis();       //현재시간
    	  
    	  for (int i = 0; i < 2000000; i++) {          //숫자가 차이가 너무 크면 숫자를 줄임
			arr.add("아기상어");
		}
           System.out.println(name+" 순차추가: "+(System.currentTimeMillis()-start));      //순차추가 : 뒤에 하나하나붙는거 
    	  
      }
	
      static void add_2(String name, List arr) {
    	  long start = System.currentTimeMillis();       
    	  
    	  for (int i = 0; i < 3000; i++) {          
			arr.add(100,"아기상어");
		}
           System.out.println(name+" 비순차추가: "+(System.currentTimeMillis()-start));      //비순차추가: 중간에 하나씩 끼어들어가는거
    	  
      }
      
      static void remove_2(String name, List arr) {
    	  long start = System.currentTimeMillis();       
    	  
    	  for (int i = 0; i < 1000; i++) {          
			arr.remove(100);
		}
           System.out.println(name+" 비순차삭제: "+(System.currentTimeMillis()-start));     //비순차삭제: 중간에 있는걸 하나하나 빼는거
    	  
      }
	
      static void remove_1(String name, List arr) {
    	  long start = System.currentTimeMillis();       
    	  
    	for (int i = arr.size()-1; i >= 0; i--) {
			arr.remove(i);
		}
    	  
           System.out.println(name+" 순차삭제: "+(System.currentTimeMillis()-start));        //순차삭제: 	뒤에서부터 하나하나씩 제거해야함
    	  
      }
      
	public static void main(String[] args) {
		List arr1 = new ArrayList();            //걸리는 시간을 나타냄    linked 보다 array 가 빠름
		List arr2 = new LinkedList();          //처음부터 끝까지 가야하기때문에 시간이 오래걸림
		
		add_1("array",arr1);                  //순차추가:array가 linked 보다 빠름(뒤에 바로 연결하면 되는거라 속도가 빠르다)
		add_1("linked",arr2);                 //순차추가:linked가 array 보다 느림 (처음부터 끝까지 가야하기때문에 시간이걸려 속도가 느리다)
		
		add_2("array",arr1);                 //비순차추가: array가 linked 보다 느림
		add_2("linked",arr2);                //비순차추가: linked가 array 보다 빠름

		remove_2("array",arr1);              //비순차삭제:array가 linked 보다 느림
		remove_2("linked",arr2);             //비순차삭제:linked가 array 보다 빠름
		
		remove_1("array",arr1);              //순차삭제:array가 linked 보다 느림
		remove_1("linked",arr2);             //순차삭제:linked가 array 보다 빠름
		
		System.out.println(arr1.isEmpty());  
		System.out.println(arr2.isEmpty());  
		
		
	}

}
