package oops_p;

class StAAA{
//��������: �޼��� �������� ���
//�������: ���� �ν��Ͻ����� �������� ���
//	static: ���� Ŭ���� ������ �������� ���

//	��� ������ �߻�ȭ �����ϱ�
	
	
//  Ŭ���� ���Ǻο��� ���� ���� �� ��� ��� �Ұ�
//	if(true) {
//		
//	}
	
	int aa = 100;
	
	void meth_1() {
		
		int a =10;
		new StAAA();
		if(true) {
			
		}
//		void meth_2() {}  �޼���ȿ��� �޼���� �������.
	}
}

class ClaOuter{
	static int sa = 0;
	int a =11;
	int aa = 0;
	void meth_1() {
//		System.out.println("�ܺ�Ŭ���� meth_1() ����:"+a+","+b);
		aa++;
		System.out.println("�ܺ�Ŭ���� meth_1() ����:"+a+","+aa);
		
	}
	
	//����Ŭ���� ���� - �⺻(�ν��Ͻ�) ����Ŭ����
	class ClaInner{
		int b = 2000;
		
		void meth_i_1() {
			aa++;
			System.out.println("�⺻ ����Ŭ���� meth_i_1() ����"+a+","+b+","+aa);
		}
	}
	
	//��������� ����
	ClaInner cin = new ClaInner();
	
	static class SSSInner{
		int sb = 3000;
		static int ssb = 3000;
		void meth_s() {
//			System.out.println("static ����Ŭ���� meth_i_1() ����"+a+","+aa);
			System.out.println("static ����Ŭ���� meth_i_1() ����"+sa+","+sb);

		}
	}
	
}


public class StructMain {

	public static void main(String[] args) {
	
		new StAAA();
		ClaOuter co = new ClaOuter();
		System.out.println(co.a);
		co.meth_1();
//		System.out.println(co.b);  �ܺ�Ŭ������ ������ ��ü���� ����Ŭ������ ��� ����ȣ�� �Ұ�
//		co.meth_i_1();
		
		System.out.println(co.cin);
		System.out.println(co.cin.b);
		co.cin.meth_i_1();
		
//		  ClaInner ci; �ȴ�
//        ClaOuter.ClaInner ci = new ClaOuter.ClaInner();
//		  ClaOuter.ClaInner ci = co.new ClaInner();
		  
		ClaOuter.ClaInner ci;
		//ci = ClaOuter.new ClaInner();
		ci = co.new ClaInner();
//		ci = new ClaOuter().new ClaInner();
		
		ci.meth_i_1();
		ci.meth_i_1();
		ci.meth_i_1();
		ci.meth_i_1();
		ci.meth_i_1();
		ci.meth_i_1();
		ci.meth_i_1();
		
		System.out.println(co.aa);
//		System.out.println(co2.aa);
		
		
		////////////////////////////////////
		
		ClaOuter.SSSInner cs_1 = new ClaOuter.SSSInner();
		ClaOuter.SSSInner cs_2 = new ClaOuter.SSSInner();
		
//		System.out.println(co.sb);
		System.out.println(ClaOuter.SSSInner.ssb);
		
		
	}

}
