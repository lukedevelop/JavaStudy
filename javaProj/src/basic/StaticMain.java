package basic;

class StaAAA{
	public StaAAA() {
		System.out.println("�� ������");
		
	}
	
	int a = getA();
	int b = getB();
	
	void meth_1() {
		System.out.println("meth_1() ����"+a+","+b+","+sa); // static�� static �� �����Ҽ��ִ�,(static�� instance �� �����ִ�)
		
	}
	
	void meth_2() {
		System.out.println("meth_2() ����");
		
	}
	
	int getA() {
		System.out.println("getA() ����");
	return 10;
	}
	
	int getB() {
		System.out.println("getB() ����");
	return 20;
	}
	
	//static int sa; //Ʋ�� ���鶧 �¾ ����~(�޼���,Ŭ���������̶� ������ static �� ������!)
	
	static int sa = getSA(); // ��ó������ �������� (new�����ʾƵ� ����)
	
	static int getSA() {
		System.out.println("static getSA() ����");
	return 1111;
	}
	
	static void meth_s1() {
//		System.out.println("static meth_s1() ����: "+sa+","+a);
		System.out.println("static meth_s1() ����: "+sa);
	
	}
	
}


public class StaticMain {

	public static void main(String[] args) {
		System.out.println(StaAAA.sa); // ��� �ϳ��� ������ ���� class �ȿ��� ��� ���� ����
		System.out.println("------------------");
		StaAAA a1 = new StaAAA();
		System.out.println("------------------");
		StaAAA a2 = new StaAAA();
		System.out.println("------------------");
		a1.a = 1000;
		a2.b = 2000;
		a1.sa = 1357;
		System.out.println("a1: "+a1.a+","+a1.b+","+a1.sa);
		System.out.println("a2: "+a2.a+","+a2.b+","+a2.sa);
			}

}
