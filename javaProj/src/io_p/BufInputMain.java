package io_p;

import java.io.ByteArrayInputStream;
import java.util.Arrays;

public class BufInputMain {

	public static void main(String[] args) throws Exception {
		byte [] arr = {10,127,-128,-126,-2,-1,0,40,50,60,11,22,33};
		byte [] buf = new byte[5];
		int cnt;
		System.out.println(Arrays.toString(buf));
		
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		
		cnt = bis.read(buf,        1,          3);  // buf 공간이 5이기에 5사이에 시작위치와 가져올 갯수 설정
		//		      대입할 배열변수,  buf의시작위치, 가져올 갯수
		
		System.out.println("available: "+bis.available());  //13
		System.out.println(Arrays.toString(buf)); //[0, 10, 127, -128, 0]
		System.out.println(cnt); //3
		
		
		/*
		System.out.println("available: "+bis.available()); //13 출력  [available() ?]
		//bis.read();
		//bis.read();
		//System.out.println("available: "+bis.available()); //11 출력
		
		int cnt = bis.read(buf); 
		//cnt : 읽은 갯수
		//buf : 데이터를 받아 대입한 임시 저장 공간
		
		//available : 스트림에 남아있는 데이터 갯수
		System.out.println("available: "+bis.available());  //available:  스트림에 남아있는 데이터 갯수 (8개)
		System.out.println(Arrays.toString(buf)); // buf : 데이터를 받아 대입한 임시 저장 공간
		System.out.println(cnt); //5
		
		////////////////////////// 
		cnt = bis.read(buf); 
		
		System.out.println("available: "+bis.available());  //위에 8개에서 5개를 빼서 (3개남음)
		System.out.println(Arrays.toString(buf)); 
		System.out.println(cnt); //5
		
		cnt = bis.read(buf); 

		System.out.println("available: "+bis.available());    //0개
		System.out.println(Arrays.toString(buf)); 
		System.out.println(cnt); //3
		*/
		bis.close(); 
		
	}

}
