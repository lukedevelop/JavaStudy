package oops_p;

class DyPar{
	
	String a = "�θ�a", b = "�θ�b";   //hiding
	
	void meth_1() {
		System.out.println("�θ� meth_1(): "+a+","+b);
	}
	
	void meth_2() {
		System.out.println("�θ� meth_2(): "+a+","+b);
	}
	
	
}

class DyChild extends DyPar{
	
	String c = "�ڽ�c", b = "�ڽ�b";
	
	void meth_1() {  //overriding
		System.out.println("�ڽ� meth_1(): "+a+","+b+","+c);
	}
	
	void meth_3() {
		System.out.println("�ڽ� meth_3(): "+a+","+b+","+c);
	}
	
	
}


public class DynamicMain {

	public static void main(String[] args) {
		// ���⼺

		DyPar pp = new DyPar();
		DyPar pc = new DyChild();
		//DyChild cp = new DyPar();
		DyChild cc = new DyChild();
		
		System.out.println("pp: "+pp.a+","+pp.b);
		pp.meth_1();
		pp.meth_2();
		
		System.out.println("pc: "+pc.a+","+pc.b);
		//System.out.println("pp: "+pc.a+","+pc.b+","+pc.c);
		pc.meth_1();
		pc.meth_2();
		//pc.mteh_3();
		cc.c="�Ƶ�c";
		System.out.println("cc: "+cc.a+","+cc.b);
		cc.meth_1();
		cc.meth_2();
		cc.meth_3();
		
		DyPar pcc = cc;
//		System.out.println("pcc: "+pcc.a+","+pcc.b+","+pcc.c);
		System.out.println("pcc: "+pcc.a+","+pcc.b);
		cc.meth_1();
		cc.meth_2();
//		cc.meth_3();
		
		DyChild cpcc = (DyChild)pcc;
		System.out.println("cpcc: "+cpcc.a+","+cpcc.b+","+cpcc.c);
		cpcc.meth_1();
		cpcc.meth_2();
		cpcc.meth_3();
		
//		DyChild cpp = (DyChild)pp;
		
//		DyuNCLE UU = (Dyuncle)cc;
		
		System.out.println(pp instanceof DyPar);
		System.out.println(pp instanceof DyChild);
		System.out.println(cc instanceof DyPar);
		System.out.println(cc instanceof DyChild);
//		System.out.println(cc instanceof Dyuncle);
	}

}
