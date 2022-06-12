package net_p;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerMain {

	public static void main(String[] args) {
		ServerSocket server = null;
		
		try {
			
			server = new ServerSocket(8888);  // �����浹���� ���ư������� 8888�� ����
			while(true) {
				System.out.println("������ ����");
				Socket client = server.accept();    // ������ �����ϴ»�� Ŭ���̾�Ʈ�� ��û�ϴ»�� Ȥ�� ������ �޴»���̶���
				
				System.out.println("���� : Ŭ���̾�Ʈ ���� ����");  //Ŭ���̾�Ʈ�� �������ؾ߸� ������ ��
				
				OutputStream os = client.getOutputStream();  // FileOutputStream �̶� �Ȱ���
				DataOutputStream dos = new DataOutputStream(os);
				
				dos.writeUTF("���� ŷ��¯ �������Դϴ�. �˼��մϴ�.");
				
				dos.close();
				os.close();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				server.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
