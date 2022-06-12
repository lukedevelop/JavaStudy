package io_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Pattern;


public class DirectoryCopyMain {

	public static void main(String[] args) throws Exception {
		
//		File [] arr = new File("fff").listFiles();
//		
//		new File("neo").mkdir();
//		
//		for(File ff : arr) {
//			if(ff.isFile()) {
//			FileInputStream fis = new FileInputStream(ff);
//			byte [] buf = new byte[(int)ff.length()];
//			
//			FileOutputStream fos = new FileOutputStream("neo/"+ff.getName());
//			
//			fis.read(buf);
//			fos.write(buf);
//			
//			fos.close();
//			fis.close();
//		}
//		}
			// fff ������ �ִ� ������ �̹��� ���ϸ� picture ������ ������ �ּ���
			// �̹��� ���� jpg,png,gif,bmp,jpeg --> ��ҹ��� �������� ����
			// picture������ �ڵ� ����
			
		File [] arr = new File("fff").listFiles();
		
		new File("picture").mkdir();
		
		for(File ff : arr) {
			String six = ".*[.](jpg|jpeg|bmp|png|gif)";
			if (Pattern.matches(six, ff.getName())) {
				
				FileInputStream fis = new FileInputStream(ff);
				byte [] buf = new byte[(int)ff.length()];
				
				FileOutputStream fos = new FileOutputStream("picture/"+ff.getName());
				
				
				
				fis.read(buf);
				fos.write(buf);
				
				fos.close();
				fis.close();
			}
	
		}
		
		//������ ������ ������ ���� �������� ���� ������ �����Ͻÿ�
		/// ���� �������� �˻��ϼ���
		/// ���� ���ϸ��� ��� �ߺ� ó�� �ϼ���
		//�̹��� : bmp, jpg, gif, png , jpeg
		//���� : mp3, wma, wav
		//���� :doc, hwp, ppt, xls, pptx, xlsx. docx
		//��Ÿ : ���� �з� �̿�
		//Ȯ������ ��ҹ��� �������� ����
		
		
	}

}
