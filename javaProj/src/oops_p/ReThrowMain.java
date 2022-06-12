package oops_p;

class ReThrow {

	void meth_1() throws Exception {

		System.out.println("meth_1() ����");
        meth_2();
		System.out.println("meth_1() ��");

	}

	void meth_2() throws Exception {

		System.out.println("\tmeth_2() ����");
		try {
			meth_3();
		}catch(Exception e) {
			System.out.println("m3 catch: "+e.getMessage());
	        throw e;
		}
		System.out.println("\tmeth_2() ��");

	}

	void meth_3() throws Exception {

		System.out.println("\t\tmeth_3() ����");

		try {
			throw new Exception("m3 ����");
		}catch(Exception e) {
			System.out.println("m3 catch: "+e.getMessage());
	
			throw e;
		}
		
		
//		System.out.println("\t\tmeth_3() ��");

	}

}

public class ReThrowMain {

	public static void main(String[] args) throws Exception {
		ReThrow rt = new ReThrow();
		try {
			rt.meth_1();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("main catch: "+e.getMessage());
			throw e;
		}
		

	}

}
