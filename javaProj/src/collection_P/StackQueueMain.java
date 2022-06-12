package collection_P;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue qq = new LinkedList();   //Queue 는 인터페이스 구현체가 없음 Linkedlist 는 queue 를 구현함

//		st.add(10);
//		st.add(20);
//		st.add(30);
//	
//	    qq.add(10);
//	    qq.add(20);
//	    qq.add(30);
	    
		st.push(11);
		st.push(22);
		st.push(33);
		
		qq.offer(100);
		qq.offer(200);
		qq.offer(300);
		
	    System.out.println(st);
	    System.out.println(qq);
	    /*
	    Object oo = st.pop();          // stack 에서 하나씩 뺄때 (선입선출 33먼저 나옴 33->22->11)
	    System.out.println(st);
	    System.out.println(oo);
	    oo = st.pop();         
	    System.out.println(st);
	    System.out.println(oo);
	    oo = st.pop();          
	    System.out.println(st);
	    System.out.println(oo);
	    System.out.println(st.empty());     //empty: 다빠져나갔으면 true
	    */
	    
	    while(!st.empty()) {                //while 문을 이용해 다뺌
	    	Object oo = st.pop();           //pop 하나씩 제거
		    System.out.println(st);
		    System.out.println(oo);
	    }
	    System.out.println("------------------");
	    
	    while(!qq.isEmpty()) {
	    	Object oo = qq.poll();            //poll 앞에서부터빠짐 (후입선출 100 먼저 빠짐 100->200->300)        
		    System.out.println(qq);
		    System.out.println(oo);
	    }
	    
	}

}
