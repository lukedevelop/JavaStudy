package oops_p;

public class MulTryCatchMain {

	public static void main(String[] args) {
		try {
			System.out.println("try 1");
			int a = 10/2;
			System.out.println("try 2");
			
			try {
				System.out.println("try ~try 1");
				int b = 10/0;
				System.out.println("try ~try 2");
			}catch(Exception e){
				System.out.println("try ~try ���ܹ߻� 1");
			}
		
			System.out.println("try 3");
			int c = 10/0;
					
			
		} catch (Exception e) {
			System.out.println("���� �߻� 1");
			try {
				System.out.println("catch ~try 1");
				int a = 10/2;
				System.out.println("catch ~try 2");
			}catch(Exception e2) {
				System.out.println("catch ~catch ���ܹ߻�");
			}
		}
        System.out.println("���α׷� ����");
        
        //if�� 3�׿�����,switch �� �������� ������� �ʰ� 3,6,9������ �ϼ��ϼ���
        //���� �ڸ���
        
        System.out.println("3,6,9����");
//        int num=0;
//        for(int i=1; i<=20; i++) {
//        	
//          num +=2; 
//        	
//        try {
//        	System.out.println(i);
//        	
//        	System.out.println();
//        	
//        }catch(Exception e) {
//        	System.out.println("¦");
//        }
//        
//        }
       
        for(int i = 1; i <= 20; i++) {
        	
        	int one = i%10;
        	 
        	int three = one%3;
        	
        	
        	try {
        		int a = 1234/three;
        		System.out.println(i);    //System.out.println(i+","+one+","+three);
        	
        	}catch(Exception e) {
        		
        		try {
        			int a = 1234/one;
        			System.out.println("¦");
        			
        		}catch(Exception e2) {
        			System.out.println(i);
        			
        		}
        		
        		
        	}
        }
        
        
        
	}

}
