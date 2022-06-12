package io_p;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("fff/ooo2.txt");// 파일읽어줌
		BufferedReader br = new BufferedReader(fr); // 한줄씩 읽어줌
		
		
		//System.out.println(br.readLine());
		String str;
		
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		
		fr.close();

		// 회원가입 과 로그인을 구현하세요.
		/*
		 1.회원정보 
		 2.ID,이름,암호
		 - ID 중복확인 검사
		 */
		
	}

}
