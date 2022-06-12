package io_p;

import java.io.FileOutputStream;
import java.io.FileWriter;

public class FileWriterMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		String str = "1234567890\nqwe rtrety fgrfhgf\n!@#$%^&*()_+\n그럴수 있다고 생각했었어";
		char [] arr = str.toCharArray();
		
		//System.out.println(Arrays.toString(arr));
		FileOutputStream fos = new FileOutputStream("fff/ooo1.txt",false);  // true 쓸경우 fr 파일을가져와 그대로 붙임 false 일경우 각각(?)
		
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
