package io_p;

import java.io.FileInputStream;
import java.util.Arrays;

class FileMember1{
	String id;
	int age;
	boolean marriage;
	
	public FileMember1(String str) {
		String [] arr = str.split(",");
		System.out.println("������"+ Arrays.toString(arr)); // Arrays.toString �ֻ��? �׳� arr ����� �Ұ����Ѱ�
		
		id = arr[0];
		age = Integer.parseInt(arr[1]);
		marriage = Boolean.parseBoolean(arr[2]);
	}
	
	@Override
	public String toString() {
		return "FileMember1 [id=" + id + ", age=" + age + ", marriage=" + marriage + "]��Ŀ";
	}
	
	
	
}

public class FileMmberExam {

	public static void main(String[] args) {
		
		
		String aaa = ""; 
		
		try {     // ������ �ֳ����� ã������ try catch ���
			FileInputStream fs = new FileInputStream("fff/qqq2.txt");  // ������ �ҷ��������� FileInputStream���� �� ���� �ĺҷ��� ��������
			int data; // ? ������ �б�����?
			while((data = fs.read()) != -1) {  //qqq2.txt �� 4�����־� �ݺ��� while ���
				aaa   += (char)data;	//? 
			}
			
			fs.close();     // ���� �б� �ݱ�
		} catch (Exception e) {  // (��?)exception ���
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(aaa);
		String [] ab = aaa.split("\r\n");
//		System.out.println(ab[0]);
		
		for(int i = 0; i < ab.length; i++) {
		FileMember1 fm = new FileMember1(ab[i]);
//		System.out.println(ab[i]);
		}
	
		
		//System.out.println(aaa);   // �ؽ�Ʈ ���Ͽ� �ִ� ���� ���

	}

}
