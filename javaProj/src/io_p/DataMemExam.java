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
//		dos.writeUTF("�̸�");
//		sc.next();
//		dos.writeUTF("�г�");
//		sc.next();
//		dos.writeUTF("��ȭ��ȣ");
//		sc.next();
//		dos.writeUTF("���ʿ���");
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
		// �̸�
		// �г�
		// ��ȭ��ȣ
		// ���ʿ���
		// ������ġ : fff/eee.abc
		Scanner sc = new Scanner(System.in);
		String id, name, grade, phone, army ;
		
		
		FileOutputStream fos = new FileOutputStream("fff/eee34.abc");
		DataOutputStream dos = new DataOutputStream(fos);

		
		
		System.out.println("���̵�: ");
		id = sc.next();
		dos.writeUTF("id_"+ id);
		System.out.println("�̸�:  ");
		name = sc.next();
		dos.writeUTF("name_"+ name);
		System.out.println("�г�: ");
		grade = sc.next();
		dos.writeUTF("grade_"+ grade);
		System.out.println("��ȣ: ");
		phone = sc.next();
		dos.writeUTF("phonenum_"+ phone);
		System.out.println("����: ");
		army = sc.next();
		dos.writeUTF("roka_"+ army);

		dos.close();
		fos.close();

		FileInputStream fis = new FileInputStream("fff/eee34.abc");
		DataInputStream dis = new DataInputStream(fis);
		
		while(dis.available()>0) { // available �� "dis"�� ������ü��ִ� ����
			String str = dis.readUTF();
			
			int pos = str.indexOf("_");
			String tag = str.substring(0,pos); //tag�� substring �� 0�������"_" ����
			String data = str.substring(pos+1);//data�� substring �� "_"���� ������
			
			switch(tag) {
			case "id":
				System.out.println(data);
				break;
			case "name":
				System.out.println(data);
				break;
			case "grade":
				int it = Integer.parseInt(data); // grade �� ���ڷ� ��Ÿ�����ϱ⿡ Intetger�� ��ȯ���������
				System.out.println(it);
				break;
			case "phonenum":                    
				int it2 = Integer.parseInt(data); // phonenum �� ���ڷ� ��Ÿ�����ϱ⿡ Integer�� ��ȯ������
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
