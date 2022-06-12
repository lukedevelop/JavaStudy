package exam;

import java.util.Scanner;

import exam.Figure;

interface Figure{
	
	void execute(String data,int answer);
}

class FGsquare implements Figure{
     
	@Override
	public void execute(String data, int answer) {
		System.out.println("�簢�� �����Դϴ�.:"+data);
		
	}
}

class FGcircle implements Figure{
    
	@Override
	public void execute(String data, int answer) {
		System.out.println("�� �����Դϴ�.:"+data);
		
	}
}

class FGtriangle implements Figure{
    
	@Override
	public void execute(String data, int answer) {
		System.out.println("�ﰢ�� �����Դϴ�.:"+data);
		
	}
}

public class InterFaceMain {

	public static void main(String[] args) {
		//�Է°��� ���� ����Ŭ������ �����Ͽ� ������ ���̸� ����ϼ���
		//1.�������̽��� �̿��� ���⼺���·� �����
		//2.�Է����� 0:�簢�� 1:�� 2:�ﰢ��      //0:�簢�� �̶� �Է� �ϸ� �簢�� ���̰��� ���;���
		//3.����޼ҵ� void excute()
		//4.���� ���ε� ����� ��

		Scanner sc = new Scanner(System.in);
		
		
		
		while(true) {
			System.out.print("���� �Է�:");
			String tt = sc.next();
			System.out.println("���ڸ� �Է��Ͻÿ�.");
			int aa = sc.nextInt();
			
			if(tt.equals("0:�簢��")) {
				System.out.println();
			}
			try {
				Figure fg = (Figure)Class.forName("exam.Fi"+tt).newInstance();
			
				fg.execute("", (aa*aa));
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("�߸��� ����Դϴ�.");
			}
			
		}
		}
		
		
		
	

}
