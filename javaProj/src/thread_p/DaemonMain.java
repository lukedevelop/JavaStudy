package thread_p;

import java.util.Iterator;
public class DaemonMain {

	class Save extends Thread{
		@Override
		public void run() {
			
			for (int i = 0; i < 10; i++) {
				System.out.println("저장"+i);
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
				System.out.println("자동저장--------------");
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
		dms.setDaemon(true);   //쓰레드 가 없을때 데몬도 종료
		dms.start();
		//dms.setDaemon(true);  Daemon 은 start 위에 먼저 있어함
		new Save().start();
	}

	public static void main(String[] args) {
		new DaemonMain();
	}

}
