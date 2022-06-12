package io_p;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.regex.Pattern;

//class Kind{
//	
//	public Kind() throws Exception{
//		File [] arr = new File("fff").listFiles();
//		
//		new File("fff/image").mkdirs();
//		new File("fff/document").mkdirs();
//		new File("fff/music").mkdirs();
//		
//		String img = ".*[.](jpg|jpeg|bmp|png|gif)";
//		String doc = ".*[.](doc|hwp|ppt|xls|pptx|xlsx|docx)";
//		String musc = ".*[.](mp3|wma|wav)";
//	for(File ff : arr) {
//	FileInputStream fis = new FileInputStream(ff);
//	
//	}
//	}
//}

public class FileKindExam {

	public static void main(String[] args) throws Exception {
		// 지정한 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오
		// 하위 폴더까지 검색하세요
		// 같은 파일명인 경우 중복 처리 하세요
		// 이미지 : bmp, jpg, gif, png , jpeg
		// 음악 : mp3, wma, wav
		// 문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
		// 기타 : 위의 분류 이외
		// 확장자의 대소문자 구분하지 않음
		File[] arr = new File("fff").listFiles();

		new File("fff/image").mkdirs();
		new File("fff/document").mkdirs();
		new File("fff/music").mkdirs();
		new File("fff/etc").mkdirs();

		String img = ".*[.](jpg|jpeg|bmp|png|gif)";
		String doc = ".*[.](doc|hwp|ppt|xls|pptx|xlsx|docx)";
		String musc = ".*[.](mp3|wma|wav)";
		String etc = "";

		for (File ff : arr) {

			if (Pattern.matches(img, ff.getName())) {

				FileInputStream fis = new FileInputStream(ff);
				byte[] buf = new byte[(int) ff.length()];

				FileOutputStream fos = new FileOutputStream("fff/image/" + ff.getName());

				fis.read(buf);
				fos.write(buf);

				fos.close();
				fis.close();
			} else if (Pattern.matches(doc, ff.getName())) {

				FileInputStream fis = new FileInputStream(ff);
				byte[] buf = new byte[(int) ff.length()];

				FileOutputStream fos = new FileOutputStream("fff/document/" + ff.getName());

				fis.read(buf);
				fos.write(buf);

				fos.close();
				fis.close();
			} else if (Pattern.matches(musc, ff.getName())) {
				FileInputStream fis = new FileInputStream(ff);
				byte[] buf = new byte[(int) ff.length()];

				FileOutputStream fos = new FileOutputStream("fff/music/" + ff.getName());

				fis.read(buf);
				fos.write(buf);

				fos.close();
				fis.close();
			
				}else if(Pattern.matches(etc, ff.getName())) {
					
					FileInputStream fis = new FileInputStream(ff);
					byte [] buf = new byte[(int)ff.length()];
					
					FileOutputStream fos = new FileOutputStream("fff/etcetera/"+ff.getName());
					fis.read(buf);
					fos.write(buf);
					
					fos.close();
					fis.close();
				}
			
		}
		
		

	
	
	}

}
