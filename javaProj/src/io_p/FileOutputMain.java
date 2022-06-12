package io_p;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputMain {

	public static void main(String[] args) {
//		try {
//			FileOutputStream fos = new FileOutputStream("fff/ccc.txt");  // 텍스트 파일을 만든다
//			
//			String ttt = "fwefwef ewfwef\n 1234567890\n !@#$%^^&*()_+";  // txt 파일에 여러문자를 쓰고싶으면
//			
//			for(char ch : ttt.toCharArray()) {                          // for문 이용하여
//				fos.write(ch);
//			}
//			
//			//fos.write('a');   // txt파일에 a 가 써짐
//			
//			fos.close();
//		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//23,4,56,7,88,21,32,54,65,90,12,33,46
		// 짝수들과 짝수들의 합, 평균을 ccc2.txt 에 저장하세요

	
		try {
			FileOutputStream fo = new FileOutputStream("fff/ccc2.txt");  // "fff/ccc2.txt" 공간에 텍스트 파일을 저장 하려함
			
			String ttt = ""; // 텍스트 파일에 넣어주기 위해 String 공간 설정
			
			
			String jum = "23,4,56,7,88,21,32,54,65,90,12,33,46"; // 숫자가 문자열 형태
			
			String [] aa = jum.split(",");  // 위 문자를 배열로 만들어 split을 사용해 하나씩 숫자형으로 바꿔줌
			
			int sum = 0, k = 0;  //sum: 합 k: 짝수 갯수
			
			for(int i = 0; i < aa.length; i++) {   // for문을 활용해 aa 배열의 갯수를 알수있음
				if(Integer.parseInt(aa[i])%2 == 0) { // 문자 배열 aa 를 int형으로 바꿔 짝수 들을 찾기위해 나머지가 0 인것들만 출력되게 조건을 검
					
					sum += Integer.parseInt(aa[i]); // sum 은 int형으로 바뀐 배열 aa를 짝수들만 찾아 합한다. 
					k += 1;                         // k 는 위 aa배열안에 짝수 숫자들 갯수를 알아내기위해 k += 1 설정
				}
				
			}
			
			ttt += "Even number = " + sum +", Average = " + sum/k; // 텍스트 파일에 넣어주기 위해 String 공간 안에 "합" 과 "평균" 을 출력함
			
			
			for(char ch : ttt.toCharArray()) {       //                   
				fo.write(ch);
			}
			
			
			
			fo.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
//		for(char ch : jum.toCharArray()) {
//		fo.write((int)ch);
//		
//		if((int)ch/2 == 0) {
//			fo.write(ch);
//		}
//		
//	}
	
//	for(int i = 0; i < jum.length; i++) {
//		fo.write((char)jum[i]);
//	}
		
	}

}
