package io_p;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class ObjectDataOutMain {

	public static void main(String[] args) throws Exception {
		FileOutputStream fos = new FileOutputStream("fff/ooData.zzz");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(new ObjData("Chatting", "aaa", "bbb", "너는 이름이 뭐니?"));
		oos.writeObject(new ObjData("Game", "aaa", "bbb", "aaa 뒤로 3칸 이동"));
		oos.writeObject(new ObjData("Logout", "aaa", "all", "aaa 로그아웃"));
		
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
//		System.out.print("이름입력: ");
//		String p1 = sc.next();
//		System.out.print("국어:");
//		kor = sc.next();
//		System.out.print("영어:");
//		eng = sc.next();
//		System.out.print("수학:");
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
