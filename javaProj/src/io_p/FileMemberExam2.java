package io_p;

import java.io.FileInputStream;
import java.util.Arrays;

class FileMember3{
	String id;
	int kor,eng,math,art;
	
	
	public FileMember3(String str) {
		String [] arr = str.split(",");
		//System.out.println("������"+ Arrays.toString(arr)); 
		
		id = arr[0];
		kor = Integer.parseInt(arr[1]);
		eng = Integer.parseInt(arr[2]);
		math = Integer.parseInt(arr[3]);
		art = Integer.parseInt(arr[4]);

	}
	
	@Override
	public String toString() {
		
		return "FileMember1 [id=" + id + ", kor=" + kor + ", eng=" + eng  + ", math=" + math +"]";
//		if() {
//			return "FileMember1 [id=" + id + ", kor=" + kor + ", eng=" + eng  + ", math=" + math +", art=" + art+"]";
//		}
		
	}
	
	
	
}

public class FileMemberExam2 {

	public static void main(String[] args) {
		
		
		String aaa = ""; 
		
		try {     // ������ �ֳ����� ã������ try catch ���
			FileInputStream fs = new FileInputStream("fff/qqq3.txt");  // ������ �ҷ��������� FileInputStream���� �� ���� �ĺҷ��� ��������
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
		//FileMember1 fm = new FileMember1(ab[i]);
		
		//System.out.println(fm);
		}
		
		
		System.out.println(aaa);   // �ؽ�Ʈ ���Ͽ� �ִ� ���� ���

	}

}

