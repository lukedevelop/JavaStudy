package io_p;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileInputMain {

	public static void main(String[] args) {
		
		try {
			//1. stream ����
			FileInputStream fis = new FileInputStream("fff/asdf.txt");
			
			int data;
			
			while((data = fis.read()) != -1) {
				char ch = (char)data;  //�ѱ��� 2byte �� ���� ����. 
				System.out.print(ch);
			}
			
			//3. stream �ݱ�
			fis.close();
		} catch (Exception e) {      //FileNotFoundException? , Exception?
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
