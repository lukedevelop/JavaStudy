package io_p;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class FileCopyMain {
	public static void main(String[] args) throws Exception {
// (������ �����ҋ���) ������ 1����Ʈ ¥����
		String ff = "fff/post2.jpg";	
		// ���� 210,530 bytes  --> 210,994 bytes
		FileInputStream fis = new FileInputStream(ff);
		FileOutputStream fos = new FileOutputStream("dst/post22.txt");
		
		byte [] buf = new byte[1024];
		
		int no = 0;
		while(fis.available()>0) {
			int cnt = fis.read(buf);
			fos.write(buf,0,cnt);
		
			no++;
			System.out.println(no+":"+cnt+Arrays.toString(buf));
		}
		
		fos.close();
		fis.close();
//--------------------------------------------------------------------------
		
		FileReader fr = new FileReader(ff);
		FileWriter fw = new FileWriter("dst/uuu2.txt");
		
		int data;
		while((data = fr.read()) != -1) {
			
			fw.write(data);
			
		}
		
		fw.close();
		fr.close();
		

		
		//����5���� �����Ͽ� �� ��ġ���� �����ϼ���
		
//		for(int i = 1; i < 4; i++) {
//		FileInputStream fis = new FileInputStream("fff/Food"+i+".jpg");
//		FileOutputStream fos = new FileOutputStream("dst/Food"+i+".jpg");
//		
//		
//		byte [] buf = new byte[1024];
//		
//		int cnt = fis.read(buf);
//		fos.write(buf,0,cnt);
//		
//		
//		fos.close();
//		fis.close();
//		}
		
		
//		byte [] buf = new byte[2024];
//		
//		int no = 0;
//		while(fis.available()>0) {
//			int cnt = fis.read(buf);
//			fos.write(buf);
//			
//			no++;
//			System.out.println(no+":"+cnt+);
//		}
		
		
	}

}
