package io_p;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//class con {
//	
//	public void sc() throws IOException {
//		
//		FileInputStream fis = new FileInputStream("fff/eee.abc");
//		DataInputStream dis = new DataInputStream(fis);
//
//		Scanner sc = new Scanner(System.in);
//
//		sc.next();
//		dos.writeUTF("id");
//		sc.next();
//		dos.writeUTF("이름");
//		sc.next();
//		dos.writeUTF("학년");
//		sc.next();
//		dos.writeUTF("전화번호");
//		sc.next();
//		dos.writeUTF("군필여부");
//
//		dis.close();
//		fis.close();
//		
//	}
//	
//}


public class DataMemExam {

	public static void main(String[] args) throws Exception {
		// id
		// 이름
		// 학년
		// 전화번호
		// 군필여부
		// 저장위치 : fff/eee.abc
		Scanner sc = new Scanner(System.in);
		String id, name, grade, phone, army ;
		
		
		FileOutputStream fos = new FileOutputStream("fff/eee34.abc");
		DataOutputStream dos = new DataOutputStream(fos);

		
		
		System.out.println("아이디: ");
		id = sc.next();
		dos.writeUTF("id_"+ id);
		System.out.println("이름:  ");
		name = sc.next();
		dos.writeUTF("name_"+ name);
		System.out.println("학년: ");
		grade = sc.next();
		dos.writeUTF("grade_"+ grade);
		System.out.println("번호: ");
		phone = sc.next();
		dos.writeUTF("phonenum_"+ phone);
		System.out.println("군필: ");
		army = sc.next();
		dos.writeUTF("roka_"+ army);

		dos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("fff/eee34.abc");
		DataInputStream dis = new DataInputStream(fis);
		
		while(dis.available()>0) { // available 은 "dis"의 가지고올수있는 개수
			String str = dis.readUTF();
			
			int pos = str.indexOf("_");
			String tag = str.substring(0,pos); //tag의 substring 은 0번재부터"_" 까지
			String data = str.substring(pos+1);//data의 substring 은 "_"부터 끝까지
			
			switch(tag) {
			case "id":
				System.out.println(data);
				break;
			case "name":
				System.out.println(data);
				break;
			case "grade":
				int it = Integer.parseInt(data); // grade 는 숫자로 나타내야하기에 Intetger로 변환시켜줘야함
				System.out.println(it);
				break;
			case "phonenum":                    
				int it2 = Integer.parseInt(data); // phonenum 은 숫자로 나타내야하기에 Integer로 변환시켜줌
				System.out.println(data);
				break;
			case "roka":
				System.out.println(data);
				break;	
			}
			
			
			
		}
		
		dis.close();
		fis.close();

	}

}
