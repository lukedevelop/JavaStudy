package thread_p;

class FirstTh extends Thread{
	public FirstTh(double d) {
		super();//������ �̸� ����
	}
	
	@Override
	public void run() {
		// �������� ���� ���� �޼ҵ�
		//System.out.println(getName());//������ �̸� ȣ��
		
		for (int i = 0; i <100; i++) {
			System.out.print(getName());
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
	}
}

public class ThreadMain {

	public static void main(String[] args)  {

		
		FirstTh th1 = new FirstTh(Math.random()*4);
//		FirstTh th2 = new FirstTh();
//		FirstTh th3 = new FirstTh();
//		th1.run();	//���Ͼ������ �۵�
//		th2.run();
//		th3.run();
		th1.start();	//��Ƽ������
//		th2.start();
//		th3.start();
		
		System.out.println("Thread.activeCount():"+Thread.activeCount());
		System.out.println("Thread.currentThread():"+Thread.currentThread());
		try {
			Thread.sleep(2500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("\nThread.activeCount():"+Thread.activeCount());
		th1.start();	//��Ƽ������
//		th2.start(); 
//		th3.start();
	}

}
