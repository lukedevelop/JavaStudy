package oops_p;

class ClaOver{
	
	int meth(int a, String b) {
		System.out.println("�⺻�޼ҵ�:"+a+","+b);
		return 1234;
	}
	
	int meth(int a, String b, int c) {
		System.out.println("�Ű����� ������ �ٸ����: "+a+","+b+","+c);
		return 5678;
	}
	
	int meth(int a, int b) {
		System.out.println("�ڷ����� �ٸ� ��� 1: "+a+","+b);
		return 9012;
	}
	
	int meth(String b, int a) {
		System.out.println("�ڷ����� �ٸ� ��� 2: "+a+","+b);
		return 2468;
	}
	
	/*int meth(int a, String b) {
		System.out.println("�⺻�޼ҵ�:"+a+","+b);
		return 1234;
	}
	
	//�������� overloading �� ���� ����
	int meth(int a, String b) {
		System.out.println("�⺻�޼ҵ�:"+a+","+b);
		return "�嵿��";
		}
	
	//�Ű����� ��� overloading�� ���� ����
	int meth(int c, String d) {
		System.out.println("�⺻�޼ҵ�:"+a+","+b);
		return 1234;
	}*/
}


public class OverloadingMain {

	public static void main(String[] args) {
       ClaOver co = new ClaOver();
       
       int ret = co.meth(10,"�嵿��");
       System.out.println(ret);
       ret = co.meth(10,"�峲��",20);
       System.out.println(ret);
       ret = co.meth(10,20);
       System.out.println(ret);
       ret = co.meth("�ϵνŰ�",20);
       System.out.println(ret);
	}

}
