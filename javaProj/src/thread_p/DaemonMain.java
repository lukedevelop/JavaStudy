package thread_p;

import java.util.Iterator;
public class DaemonMain {

	class Save extends Thread{
		@Override
		public void run() {
			
			for (int i = 0; i < 10; i++) {
				System.out.println("����"+i);
				try {
					sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	class DMSave extends Thread{
		@Override
		public void run() {
			
			while(true) {
				System.out.println("�ڵ�����--------------");
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
			}
		}
	}
	
	
	public DaemonMain() {
		DMSave dms = new DMSave();
		dms.setDaemon(true);   //������ �� ������ ���� ����
		dms.start();
		//dms.setDaemon(true);  Daemon �� start ���� ���� �־���
		new Save().start();
	}

	public static void main(String[] args) {
		new DaemonMain();
	}

}
