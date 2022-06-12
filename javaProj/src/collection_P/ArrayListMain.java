package collection_P;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayListMain {

	public static void main(String[] args) {
		
		List arr1 = new ArrayList();

		//Object [] arr1 = {};  <== ����̶� �����
		
		arr1.add(10);
		arr1.add(20);
		arr1.add("�Ʊ���");
		arr1.add(123.456);
		arr1.add(true);
		arr1.add(new int[] {11,22,33});
		arr1.add(null);
		arr1.add(10);
		arr1.add(30);
		arr1.add(40);
		arr1.add(20);
		arr1.add(10);
		arr1.add(20);
		arr1.add(70);
		
		System.out.println(arr1);
		System.out.println(arr1.size());     //������ ��.(��7)
		System.out.println(arr1.get(2));     // 2������ �Ʊ�� ����.
        arr1.set(4, "�������");               // 4��° true �� �������� �ٲ�.
        System.out.println(arr1);     
        arr1.add(3,"���ǳ����");              // �а��� 3��° ������ ���Ƿ� "���ǳ����" �� 3��°�� �Ǵ�.
        System.out.println(arr1);
        arr1.remove(6);                    // 6��°�� ����
        System.out.println(arr1);
        arr1.remove("�Ʊ���");             //���� ��ü�� ������� ���� "�Ʊ���" �� �����.
        System.out.println(arr1);
        arr1.remove((Object)20);              //remove �� index �� object �� �ν� 20�� ���������� ((Object)20) ���� �����
        System.out.println(arr1);   
        
        System.out.println(arr1.contains(30));    // contains(30) : 30�� �ֳ� ã���� ������� "true" ���ٸ�"false"
        System.out.println(arr1.contains(100));
        System.out.println(arr1.indexOf(20));       // indexOf(20) : 20 �� ������� �ִ��� 8��°
        System.out.println(arr1.indexOf(100)); 	    // ���ڰ� ���ٸ� -1 �� ����
        System.out.println(arr1.lastIndexOf(20)); 	 //lastIndexOf: 20�� ������ ������ �˼����� 20 �� �������� 10��° (ù��°20��(8����))
	
        Object [] arr2 = arr1.toArray();
        
        System.out.println((arr2));                  // Array List �� (?)
        System.out.println(Arrays.toString(arr2));   // �� �迭 (?)
        
        //ArrayList �� �Ϻ� ������ ����

        List arr3 = arr1.subList(2, 7);  // shallow copy (�ּ����·� ���簡 ��)
        List arr4 = new ArrayList(arr1.subList(2, 7));   //deep copy 
        List arr5 = new ArrayList();
        arr5.addAll(arr3);  //deep copy
        List arr6 = new ArrayList();
        arr6.add(12);
        arr6.add(34);
        arr6.add(56);
        
        List arr7 = new ArrayList();
        arr7.add(10);
        arr7.add(90);
        arr7.add(100);
        
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr5);
        System.out.println(arr6);
        
        arr1.set(3,"�ƺ����");
        arr3.set(4, 1357);
        System.out.println(arr1);
        System.out.println(arr3);
        System.out.println(arr4);
        System.out.println(arr5);
        arr5.addAll(2,arr6);       //�ϳ����ϳ��� �߰���
        System.out.println(arr5);
        
        System.out.println(arr5.containsAll(arr6));   //containsAll: arr5 �� arr6 �� ���ԵǾ��ִ°� ���ԵǾ��־� true
        System.out.println(arr5.containsAll(arr7));   // arr5 �� arr7 �� ���ԵǾ��ִ°� ���ԵǾ������ʾ�(100�� ���ԵǾ���������) false
       
        
        List arr8 = new ArrayList(arr1);
        arr1.removeAll(arr7);                         //remove: arr7�� arr1 �ߺ��Ǵ� ���ڵ��� ����� (10 �� �ٻ����)
        arr1.add(34);
        arr1.add(78);
        arr1.add(12);
        
        
        System.out.println(arr1);
        arr1.retainAll(arr6);                        //retainAll: arr6�̶� arr1 ������ (��ġ�°Ÿ� ���ܵ�) 
        System.out.println(arr1);
        System.out.println(arr8);
        
        Collections.replaceAll(arr8, 10, "��");       //replaceAll: arr8�� �������� 10�� "��"�� �ٲ� ex) (arr1,5,20) arr1 �� 5�� 20���� �ٲ�
        System.out.println(arr8);
        
        Collections.reverse(arr8);                   //reverse: ������ �ڹٲ� 
        System.out.println(arr8);
        
        Collections.swap(arr8,4,7);                  //swap: 4��°�� 7��°�� �ڸ��� �ٲ�
        System.out.println(arr8);
        
        Collections.shuffle(arr8);                   //shuffle: ������ �Ҷ����� ���׹��� �ٲ�
        System.out.println(arr8);
        
//        Collections.sort(arr8);                     //sort: �����ϴ°�
//        System.out.println(arr8);
	    List arr9 = new ArrayList();
	    arr9.add(4);
	    arr9.add(10);
	    arr9.add(78);
	    arr9.add(23);
	    arr9.add(56);
	    arr9.add(13);
	    arr9.add(41);
	    System.out.println(arr9);               // sort: ������
	    Collections.sort(arr9);
	    System.out.println(arr9);              //sort: ������
	
	    
	    List arr10 = new ArrayList();
	    arr10.add("�Ķ�");
	    arr10.add("���");
	    arr10.add("����");
	    arr10.add("����");
	    arr10.add("���");
	    arr10.add("����");
	    arr10.add("�Ͼ�");
	    System.out.println(arr10);           // sort ��           
	    Collections.sort(arr10);
	    System.out.println(arr10);          //sort ��   (���ڿ��� ������ ����)
	    
	     
	}

}
