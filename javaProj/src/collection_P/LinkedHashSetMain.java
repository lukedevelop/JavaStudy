package collection_P;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


class MyCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		//o1 : add �Ҷ� ���ԵǴ� �Ű�����
		//o2 : set�� �̹� �ִ� ����
		System.out.println("com:"+o1+","+o2);
		//0 - ����
		//���(1) - �ڿ� ��ġ
		//����(-1) - �տ� ��ġ
		return -10;
	}
	
}

class TreeMem{
	String name;
	int age, height;
	public TreeMem(String name, int age, int height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return name + ":" + age + "(" + height+")";
	}
	
	
}


class TreeMemCom implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		TreeMem me = (TreeMem)o1;
		TreeMem you = (TreeMem)o2;
		
		int res = me.age-you.age;
		
		if(res==0) {
			res = you.height-me.height;
		}
		if(res==0) {
			//res = 1;
			res = me.name.compareTo(you.name);
		}
		System.out.println(res);
		return res;
	}
	
	
}


public class LinkedHashSetMain {

	public static void main(String[] args) {
		Set s1 = new HashSet();
		Set s2 = new LinkedHashSet();
		
		
		for (Object object : new Object[] {11,45,67,22,"�Ʊ���",78,23,11,67,"�Ʊ���",45,33}) {
			s1.add(object);
			s2.add(object);
			//s3.add(object);
		}
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2);
		
		
		Set s3 = new TreeSet();
		Set s4 = new TreeSet( new MyCom() );
		for (int i : new int[] {34,21,56,34,11,9,82,34,56,13,21}) {
			
			s3.add(i);
			s4.add(i);  //compare ȣ��
			System.out.println("--------------------");
		}
		System.out.println("s3:"+s3);
		System.out.println("s4:"+s4);
		
		
		Set s5 = new TreeSet( new TreeMemCom() );
		s5.add(new TreeMem("�Ѱ���", 47, 165));
		s5.add(new TreeMem("�ΰ���", 37, 175));
		s5.add(new TreeMem("�ﰡ��", 27, 135));
		s5.add(new TreeMem("�簡��", 47, 165));
		s5.add(new TreeMem("������", 47, 155));
		s5.add(new TreeMem("�۰���", 47, 155));
		System.out.println("--------------------");
		for (Object obj : s5) {
			System.out.println(obj);
		}
		//������ �����ϰ� ������ ������� �����Ͽ� ����ϼ���
		//���� ����: �̸�,����,�ѷ�
		//���ļ���: �̸�> ����> �ѷ�
		//�̸�,����,�ѷ� ��� ���� ��� ����
		
		
		
		
		
	}

}

