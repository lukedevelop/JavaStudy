package collection_P;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListMain {

      static void add_1(String name, List arr) {
    	  long start = System.currentTimeMillis();       //����ð�
    	  
    	  for (int i = 0; i < 2000000; i++) {          //���ڰ� ���̰� �ʹ� ũ�� ���ڸ� ����
			arr.add("�Ʊ���");
		}
           System.out.println(name+" �����߰�: "+(System.currentTimeMillis()-start));      //�����߰� : �ڿ� �ϳ��ϳ��ٴ°� 
    	  
      }
	
      static void add_2(String name, List arr) {
    	  long start = System.currentTimeMillis();       
    	  
    	  for (int i = 0; i < 3000; i++) {          
			arr.add(100,"�Ʊ���");
		}
           System.out.println(name+" ������߰�: "+(System.currentTimeMillis()-start));      //������߰�: �߰��� �ϳ��� ������°�
    	  
      }
      
      static void remove_2(String name, List arr) {
    	  long start = System.currentTimeMillis();       
    	  
    	  for (int i = 0; i < 1000; i++) {          
			arr.remove(100);
		}
           System.out.println(name+" ���������: "+(System.currentTimeMillis()-start));     //���������: �߰��� �ִ°� �ϳ��ϳ� ���°�
    	  
      }
	
      static void remove_1(String name, List arr) {
    	  long start = System.currentTimeMillis();       
    	  
    	for (int i = arr.size()-1; i >= 0; i--) {
			arr.remove(i);
		}
    	  
           System.out.println(name+" ��������: "+(System.currentTimeMillis()-start));        //��������: 	�ڿ������� �ϳ��ϳ��� �����ؾ���
    	  
      }
      
	public static void main(String[] args) {
		List arr1 = new ArrayList();            //�ɸ��� �ð��� ��Ÿ��    linked ���� array �� ����
		List arr2 = new LinkedList();          //ó������ ������ �����ϱ⶧���� �ð��� �����ɸ�
		
		add_1("array",arr1);                  //�����߰�:array�� linked ���� ����(�ڿ� �ٷ� �����ϸ� �Ǵ°Ŷ� �ӵ��� ������)
		add_1("linked",arr2);                 //�����߰�:linked�� array ���� ���� (ó������ ������ �����ϱ⶧���� �ð��̰ɷ� �ӵ��� ������)
		
		add_2("array",arr1);                 //������߰�: array�� linked ���� ����
		add_2("linked",arr2);                //������߰�: linked�� array ���� ����

		remove_2("array",arr1);              //���������:array�� linked ���� ����
		remove_2("linked",arr2);             //���������:linked�� array ���� ����
		
		remove_1("array",arr1);              //��������:array�� linked ���� ����
		remove_1("linked",arr2);             //��������:linked�� array ���� ����
		
		System.out.println(arr1.isEmpty());  
		System.out.println(arr2.isEmpty());  
		
		
	}

}
