package basic;

class StaAAA{
	public StaAAA() {
		System.out.println("난 생성자");
		
	}
	
	int a = getA();
	int b = getB();
	
	void meth_1() {
		System.out.println("meth_1() 실행"+a+","+b+","+sa); // static은 static 만 접근할수있다,(static은 instance 와 쓸수있다)
		
	}
	
	void meth_2() {
		System.out.println("meth_2() 실행");
		
	}
	
	int getA() {
		System.out.println("getA() 실행");
	return 10;
	}
	
	int getB() {
		System.out.println("getB() 실행");
	return 20;
	}
	
	//static int sa; //틀을 만들때 태어남 빠밤~(메서드,클래스영역이라 할지라도 static 이 먼저다!)
	
	static int sa = getSA(); // 맨처음으로 시작을함 (new하지않아도 나옴)
	
	static int getSA() {
		System.out.println("static getSA() 실행");
	return 1111;
	}
	
	static void meth_s1() {
//		System.out.println("static meth_s1() 실행: "+sa+","+a);
		System.out.println("static meth_s1() 실행: "+sa);
	
	}
	
}


public class StaticMain {

	public static void main(String[] args) {
		System.out.println(StaAAA.sa); // 얘는 하나만 존재함 같은 class 안에선 모두 공유 가능
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
