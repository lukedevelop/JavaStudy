package oops_p;

public class UserExceptionMain {

	public static void main(String[] args) {
	 
		try {
			System.out.println("try 1");
             
			//Exception ex = new Exception("������ ����!!!");
			
			throw new Exception("�ϰ� ���� ������");
			
			//System.out.println("try 2");
			
			//throw ex;
			
//			System.out.println("try 3");
		}catch(Exception e) {
			System.out.println("catch : "+e.getMessage());
		}

	}

}
