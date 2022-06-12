package oops_p;

class LC{
	
	public LC() {
		System.out.println("�⺻ ������ ����"+this);
		a = 1111;
	}
	
	int a = goA();
	int b = goB();
	
	int goA() {
		System.out.println("goA() ����");
		return 10;
	}
	
	int goB() {
		System.out.println("goB() ����");
		return 20;
	}

	@Override
	public String toString() {
		return "LC [a=" + a + ", b=" + b + "]";
	}
	
	static int goC() {
		System.out.println("static goC() ����");
		return 10;
	}
	
	static int c = goC();
	
			
	
}


public class LifeCycleMain {

	public static void main(String[] args) {
        System.out.println(LC.c);
		System.out.println("c1-------------");
		LC c1 = new LC();
		System.out.println("c2-------------");
		LC c2 = new LC();
		System.out.println("-------------");
		System.out.println(c1);
		System.out.println(c2);
		
	}

}
