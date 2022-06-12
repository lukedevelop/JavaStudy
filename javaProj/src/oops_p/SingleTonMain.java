package oops_p;

class SingleAAA{
	int a = 10;
	String b ="Ƽ�����罺";
	
//	public SingleAAA
//	System.out.println("AAA ������ ����");
	
	@Override
	public String toString() {
		return "SingleAAA [a=" + a + ", b=" + b + "]"+hashCode();
	}
	
}

class SingleBBB{
	int a = 1000;
	String b ="�̱��Ƴ���";
	
	private SingleBBB() {
		System.out.println("BBB ������ ����");
	}
	
	static SingleBBB getInstance() {
		System.out.println("BBB getInstance() ����");
		return null;
	}
	
	@Override
	public String toString() {
		return "SingleAAA [a=" + a + ", b=" + b + "]"+hashCode();
	}
	
}

public class SingleTonMain {

	public static void main(String[] args) {
		SingleAAA a1 = new SingleAAA();
		SingleAAA a2 = new SingleAAA();
        a1.a = 20;
		System.out.println(a1);
		System.out.println(a2);
		
//		SingleBBB b1 = new SingleBBB();
		SingleBBB b1 = SingleBBB.getInstance();
		System.out.println(b1);
		
	}

}
