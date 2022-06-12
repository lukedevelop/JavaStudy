package io_p;

import java.io.FileInputStream;
import java.util.Arrays;

class FileMember1{
	String id;
	int age;
	boolean marriage;
	
	public FileMember1(String str) {
		String [] arr = str.split(",");
		System.out.println("생성자"+ Arrays.toString(arr)); // Arrays.toString 왜사용? 그냥 arr 사용은 불가능한가
		
		id = arr[0];
		age = Integer.parseInt(arr[1]);
		marriage = Boolean.parseBoolean(arr[2]);
	}
	
	@Override
	public String toString() {
		return "FileMember1 [id=" + id + ", age=" + age + ", marriage=" + marriage + "]이커";
	}
	
	
	
}

public class FileMmberExam {

	public static void main(String[] args) {
		
		
		String aaa = ""; 
		
		try {     // 파일이 있나없나 찾기위해 try catch 사용
			FileInputStream fs = new FileInputStream("fff/qqq2.txt");  // 파일을 불러오기위해 FileInputStream생성 뉴 생성 후불러올 파일적기
			int data; // ? 연산을 읽기위해?
			while((data = fs.read()) != -1) {  //qqq2.txt 에 4줄이있어 반복문 while 사용
				aaa   += (char)data;	//? 
			}
			
			fs.close();     // 파일 읽기 닫기
		} catch (Exception e) {  // (왜?)exception 사용
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		System.out.println(aaa);
		String [] ab = aaa.split("\r\n");
//		System.out.println(ab[0]);
		
		for(int i = 0; i < ab.length; i++) {
		FileMember1 fm = new FileMember1(ab[i]);
//		System.out.println(ab[i]);
		}
	
		
		//System.out.println(aaa);   // 텍스트 파일에 있는 정보 출력

	}

}
