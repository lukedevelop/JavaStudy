package collection_P;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class StackQueueMain {

	public static void main(String[] args) {
		Stack st = new Stack();
		Queue qq = new LinkedList();   //Queue �� �������̽� ����ü�� ���� Linkedlist �� queue �� ������

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
	    Object oo = st.pop();          // stack ���� �ϳ��� ���� (���Լ��� 33���� ���� 33->22->11)
	    System.out.println(st);
	    System.out.println(oo);
	    oo = st.pop();         
	    System.out.println(st);
	    System.out.println(oo);
	    oo = st.pop();          
	    System.out.println(st);
	    System.out.println(oo);
	    System.out.println(st.empty());     //empty: �ٺ����������� true
	    */
	    
	    while(!st.empty()) {                //while ���� �̿��� �ٻ�
	    	Object oo = st.pop();           //pop �ϳ��� ����
		    System.out.println(st);
		    System.out.println(oo);
	    }
	    System.out.println("------------------");
	    
	    while(!qq.isEmpty()) {
	    	Object oo = qq.poll();            //poll �տ������ͺ��� (���Լ��� 100 ���� ���� 100->200->300)        
		    System.out.println(qq);
		    System.out.println(oo);
	    }
	    
	}

}
