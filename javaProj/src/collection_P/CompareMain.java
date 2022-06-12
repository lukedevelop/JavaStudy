package collection_P;

import java.util.Comparator;
import java.util.TreeSet;

class CPData1{
	int age;
	String name;
	double height;
	public CPData1(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "CPData1 ["+ name + ","+ age + "," + height + "]";
	}
	
}

class CPData2 implements Comparable{
	int age;
	String name;
	double height;
	public CPData2(String name, int age, double height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}
	@Override
	public String toString() {
		return "CPData2 ["+ name + ","+ age + "," + height + "]";
	}
	@Override
	public int compareTo(Object o) {
		CPData2 you = (CPData2)o;
		
		int res = age - you.age;
		if(res==0) {
			res = name.compareTo(you.name);
		}
		return 0;
	}
	
}


public class CompareMain {

	public static void main(String[] args) {
	   TreeSet ts1 = new TreeSet(new Comparator() {
		   
		   @Override
		   public int compare(Object o1, Object o2) {
			   CPData1 me = (CPData1)o1;
			   CPData1 you = (CPData1)o2;
			   
			   int res = me.age - you.age;
			   if(res==0) {
				   res = me.name.compareTo(you.name);
			   }
			   return 1;
		   }
	   });
	   
       ts1.add(new CPData1("���켺",57,185.6));
       ts1.add(new CPData1("���¼�",47,175.6));
       ts1.add(new CPData1("������",57,195.6));
       ts1.add(new CPData1("���߼�",37,145.6));
       ts1.add(new CPData1("���ϼ�",47,155.6));
		
       for(Object object : ts1) {
    	   System.out.println(object);
       }
       System.out.println("-------------------------");
       
       TreeSet ts2 = new TreeSet();
       ts2.add(new CPData2("���켺",57,185.6));
       ts2.add(new CPData2("���¼�",47,175.6));
       ts2.add(new CPData2("������",57,195.6));
       ts2.add(new CPData2("���߼�",37,145.6));
       ts2.add(new CPData2("���ϼ�",47,155.6));
       
       for(Object object : ts2) {
    	   System.out.println(object);
       }
	}

}
