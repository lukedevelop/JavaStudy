package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectDataOutMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fff/ooData.zzz");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new ObjData("Chatting", "aaa", "bbb", "�ʴ� �̸��� ����?"));
		oos.writeObject(new ObjData("Game", "aaa", "bbb", "aaa �ڷ� 3ĭ �̵�"));
		oos.writeObject(new ObjData("Logout", "aaa", "all", "aaa �α׾ƿ�"));
		
		oos.close();
		fos.close();

//////////////////////////////////////////////////////////////////////////////////////////////////////////		
		
//		FileOutputStream fos = new FileOutputStream("fff/ootest.zzz");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		
//		
//		
//		String kor,eng,math,tot;
//		double avg;
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�̸��Է�: ");
//		String p1 = sc.next();
//		System.out.print("����:");
//		kor = sc.next();
//		System.out.print("����:");
//		eng = sc.next();
//		System.out.print("����:");
//		math = sc.next();
//		
//		oos.writeObject(new ObjData(p1, "", "", ""));
//		oos.writeObject(p1);
//		oos.writeObject(kor);
//		oos.writeObject(eng);
//		oos.writeObject(math);
//		
//		
//		oos.close();
//		fos.close();
		
		
	}

}
