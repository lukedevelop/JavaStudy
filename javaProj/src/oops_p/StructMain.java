package oops_p;

class StAAA{
//지역변수: 메서드 내에서만 사용
//멤버변수: 같은 인스턴스에서 공용으로 사용
//	static: 같은 클래스 내에서 공용으로 사용

//	상속 다형성 추상화 공부하기
	
	
//  클래스 정의부에서 직접 연산 및 제어문 사용 불가
//	if(true) {
//		
//	}
	
	int aa = 100;
	
	void meth_1() {
		
		int a =10;
		new StAAA();
		if(true) {
			
		}
//		void meth_2() {}  메서드안에서 메서드는 못만든다.
	}
}

class ClaOuter{
	static int sa = 0;
	int a =11;
	int aa = 0;
	void meth_1() {
//		System.out.println("외부클래스 meth_1() 실행:"+a+","+b);
		aa++;
		System.out.println("외부클래스 meth_1() 실행:"+a+","+aa);
		
	}
	
	//내부클래스 정의 - 기본(인스턴스) 내부클래스
	class ClaInner{
		int b = 2000;
		
		void meth_i_1() {
			aa++;
			System.out.println("기본 내부클래스 meth_i_1() 실행"+a+","+b+","+aa);
		}
	}
	
	//멤버변수로 선언
	ClaInner cin = new ClaInner();
	
	static class SSSInner{
		int sb = 3000;
		static int ssb = 3000;
		void meth_s() {
//			System.out.println("static 내부클래스 meth_i_1() 실행"+a+","+aa);
			System.out.println("static 내부클래스 meth_i_1() 실행"+sa+","+sb);

		}
	}
	
}


public class StructMain {

	public static void main(String[] args) {
	
		new StAAA();
		ClaOuter co = new ClaOuter();
		System.out.println(co.a);
		co.meth_1();
//		System.out.println(co.b);  외부클래스로 생성된 객체에서 내부클래스의 멤버 직접호출 불가
//		co.meth_i_1();
		
		System.out.println(co.cin);
		System.out.println(co.cin.b);
		co.cin.meth_i_1();
		
//		  ClaInner ci; 안댐
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
