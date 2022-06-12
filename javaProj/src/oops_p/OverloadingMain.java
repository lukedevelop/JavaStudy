package oops_p;

class ClaOver{
	
	int meth(int a, String b) {
		System.out.println("기본메소드:"+a+","+b);
		return 1234;
	}
	
	int meth(int a, String b, int c) {
		System.out.println("매개변수 갯수가 다른경우: "+a+","+b+","+c);
		return 5678;
	}
	
	int meth(int a, int b) {
		System.out.println("자료형이 다른 경우 1: "+a+","+b);
		return 9012;
	}
	
	int meth(String b, int a) {
		System.out.println("자료형이 다른 경우 2: "+a+","+b);
		return 2468;
	}
	
	/*int meth(int a, String b) {
		System.out.println("기본메소드:"+a+","+b);
		return 1234;
	}
	
	//리턴형과 overloading 은 관계 없음
	int meth(int a, String b) {
		System.out.println("기본메소드:"+a+","+b);
		return "장동건";
		}
	
	//매개변수 명과 overloading은 관계 없음
	int meth(int c, String d) {
		System.out.println("기본메소드:"+a+","+b);
		return 1234;
	}*/
}


public class OverloadingMain {

	public static void main(String[] args) {
       ClaOver co = new ClaOver();
       
       int ret = co.meth(10,"장동건");
       System.out.println(ret);
       ret = co.meth(10,"장남건",20);
       System.out.println(ret);
       ret = co.meth(10,20);
       System.out.println(ret);
       ret = co.meth("북두신건",20);
       System.out.println(ret);
	}

}
