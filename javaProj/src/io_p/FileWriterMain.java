package io_p;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "1234567890\nqwe rtrety fgrfhgf\n!@#$%^&*()_+\n�׷��� �ִٰ� �����߾���";
		char [] arr = str.toCharArray();
		
		//System.out.println(Arrays.toString(arr));
		FileOutputStream fos = new FileOutputStream("fff/ooo1.txt",false);  // true ����� fr ������������ �״�� ���� false �ϰ�� ����(?)
		
		for (char c : arr) {
			fos.write(c);
		}
		
		fos.close();
		
		FileWriter fr = new FileWriter("fff/ooo2.txt",false);
		
		for (char c : arr) {
			fr.write(c);
		}
		
		fr.close();
	}

}
