package oops_p;
//overriding+���
class Grand{
	int g = 9999;
	void meth_g() {
		System.out.println("�Ҿƹ��� meth_g()");
	}

}


class par1 extends Grand{ //Ŭ������ ����  - �θ� (����Ŭ����)
	
	int a = 10;
    String b = "�ƺ����";
    int g = 8888;
    
    void meth_1() {
    	System.out.println("�θ�1 meth_1()");
    }
    
    void meth_2() {
    	System.out.println("�θ�1 meth_2()");
    }
    
    void meth_g() {
		System.out.println("�θ�1 meth_g()");
	}
    
}

class par2{ //Ŭ������ ����  - �θ� (����Ŭ����)
	
	int a = 111;
    String bb = "�������";
	
    void meth_11() {
    	System.out.println("�θ�2 meth_1()");
    }
    
    void meth_22() {
    	System.out.println("�θ�2 meth_2()");
    }
    
}

class Child1 extends par1{  //, par2  //{�ڽ�  ----���߻�� �Ұ�
	int c = 3000;
    
	String b = "�Ʊ���";    //hiding
	String sb = super.b;    //�θ�ü ������:super
	int sg = super.g;

	void meth_2() {   //overriding
    	System.out.println("�ڽ�1 meth_3()");
    }
	void meth_s2() {
    	super.meth_2();
	}
	void meth_3() {
    	System.out.println("�ڽ�1 meth_3()");
    }
	void meth_sg2() {
    	super.meth_g();
	}
}




class Child2 extends par1{ 
	int d = 4657;
    
	
	void meth_4() {   
    	System.out.println("�ڽ�2 meth_4()");
    }
	
}







public class ExtendsMain {

	public static void main(String[] args) {

		par1 pp1; //�ν��Ͻ� ���� ����
		pp1 = new par1(); //�ν��Ͻ� ���� �� �ν��Ͻ� �ּ� �ν��Ͻ� ������ ����
		System.out.println(pp1.a+","+pp1.b);
//		System.out.println(pp1.c);
		pp1.meth_1(); //�ν��Ͻ� ������ ȣ��
		pp1.meth_2();
		//pp1.meth_3(); �ڽ��� ��� ���� �Ұ�
		System.out.println("------------------------------");
		Child1 cc1 = new Child1();
		System.out.println(cc1.a+","+cc1.b+","+cc1.sb+","+cc1.g);
		System.out.println(cc1.c);
		cc1.meth_1(); //�θ�  ��� ���� ����
		cc1.meth_2();
		cc1.meth_3();
		cc1.meth_g();
		cc1.meth_sg2();
		System.out.println("------------------------------");
		
		Child2 cc2 = new Child2();
		System.out.println(cc2.a+","+cc2.b);
		System.out.println(cc2.d);
		cc2.meth_1();
		cc2.meth_2();
		cc2.meth_4();
		
		
		
		
	}

}
