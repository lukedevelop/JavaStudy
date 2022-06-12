package thread_p;

public class SRSMain {

	class SRS extends Thread{
		public SRS(String name) {
			super(name);
		}
	@Override
	public void run() {
		while(true) {
		
			try {
				
				System.out.println(getName());
				sleep(1000);
		
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
		}
		
	}
	
	}
	public SRSMain() throws Exception {
		SRS s1 = new SRS("*");
		SRS s2 = new SRS("&&");
		SRS s3 = new SRS("$$$");
		
		s1.start();
		s2.start();
		s3.start();
		
		Thread.sleep(2000);  //�ð�2�ʼ���
		s1.suspend();    //2�ʵ� suspend 
		Thread.sleep(2000);  
		s2.suspend();
		Thread.sleep(2000);  
		s3.suspend(); 
		Thread.sleep(2000);  
		s1.stop();         //���� ����
		Thread.sleep(2000);  
		s2.stop(); 
		Thread.sleep(2000);  
		s3.stop(); 
		Thread.sleep(2000); 
		//s1.start();          //���츲,
		s1 = new SRS("���ο�*");  //���� �츱���� ���� ������
		s1.start();          
	}
	public static void main(String[] args) throws Exception {
		new SRSMain();

	}

}
