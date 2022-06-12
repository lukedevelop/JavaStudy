package lang_p;

import java.util.Objects;

class ObjAAA{
	
	int a = 10;
	String b = "아기상어";
	
	public ObjAAA(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	public ObjAAA() {
		
	}
	void ppp() {
		System.out.println(a+","+b);
	}
	@Override
	public int hashCode() {
		return Objects.hash(a, b);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ObjAAA other = (ObjAAA) obj;
		return a == other.a && Objects.equals(b, other.b);
	}
	@Override
	public String toString() {
		return "ObjAAA [a=" + a + ", b=" + b + "]";
	}
	
//	public boolean equals(Object you) {
//		
//		ObjAAA oa= (ObjAAA)you;
//		
//		return a == oa.a;
//	return true;
//	}
	
//	public String toString() {
//		return "아아아아아";
//		
//		return a+","+b;
//	}
	
	
	
	
}

public class ObjectMain {

	public static void main(String[] args) {
		
		ObjAAA a1 = new ObjAAA(20,"엄마상어");
		ObjAAA a2 = new ObjAAA(30,"아빠상어");
		ObjAAA a3 = new ObjAAA(20,"엄마상어");
		ObjAAA a4 = a1;
		
		
		
		a1.ppp();
		a2.ppp();
		a3.ppp();
		a4.ppp();
		
		System.out.println("a1==a2 :"+ (a1==a2) );
		System.out.println("a1==a3 :"+ (a1==a3) );
		System.out.println("a1==a4 :"+ (a1==a4) );
		
		
		System.out.println("a1.equals(a2)"+ a1.equals(a2) );
		System.out.println("a1.equals(a3)"+ a1.equals(a3) );
		System.out.println("a1.equals(a4)"+ a1.equals(a4) );

		
		System.out.println("a1 :"+ a1+","+a1.hashCode() );
		System.out.println("a2 :"+ a2+","+a2.hashCode() );
		System.out.println("a3 :"+ a3+","+a3.hashCode() );
		System.out.println("a4 :"+ a4+","+a4.hashCode() );
		
	}
}
