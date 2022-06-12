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
			// fff 폴더에 있는 파일중 이미지 파일만 picture 폴더에 저장해 주세요
			// 이미지 파일 jpg,png,gif,bmp,jpeg --> 대소문자 구분하지 않음
			// picture폴더는 자동 생성
			
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
		
		//지정한 폴더의 파일을 각각 종류별로 지정 폴더에 저장하시오
		/// 하위 폴더까지 검색하세요
		/// 같은 파일명인 경우 중복 처리 하세요
		//이미지 : bmp, jpg, gif, png , jpeg
		//음악 : mp3, wma, wav
		//문서 :doc, hwp, ppt, xls, pptx, xlsx. docx
		//기타 : 위의 분류 이외
		//확장자의 대소문자 구분하지 않음
		
		
	}

}
