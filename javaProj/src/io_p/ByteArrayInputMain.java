package io_p;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputMain {

	public static void main(String[] args) {
	
		try {
			// 1. 매체 확인
			byte [] arr = {10,20,126,127,-128,-127,-2,-1,0,45,67};   // byte 는 127이 최대
			// 2. stream 생성및 매체 연결
			// 매체에서 읽기 stream
			ByteArrayInputStream bis = new ByteArrayInputStream(arr);
			// 3. 연산 - 읽기 
			// read() - Int
//			System.out.println(bis.read());// 10		10
//			System.out.println(bis.read());// 20  		20
//			System.out.println(bis.read());// 126		126
//			System.out.println(bis.read());// 127		127
//			System.out.println(bis.read());// 128		-128   --> 음수값을 절대값 int로 변환
//			System.out.println(bis.read());// 129		-127   --> 음수값을 절대값 int로 변환
//			System.out.println(bis.read());// 254		-2     --> 음수값을 절대값 int로 변환
//			System.out.println(bis.read());// 255		-1     --> 음수값을 절대값 int로 변환
//			System.out.println(bis.read());// 0			0
//			System.out.println(bis.read());// 45		45
//			System.out.println(bis.read());// 67		67
//			
//			
//			System.out.println(bis.read());// -1
//			System.out.println(bis.read());// -1
//			System.out.println(bis.read());// -1
//			System.out.println(bis.read());// -1
			
			int data = -100;
			
			while((data = bis.read()) != -1) {  // 대입받은 값이 -1 이 아니라면 계쏙 실행
				System.out.println(data+"=>"+(byte)data);
			}
			
			
			// 4. stream 닫기
			bis.close();
			
			System.out.println("------------------------------");
			
			short a = 127;
			byte b = (byte)a;
			System.out.println(a+","+b);
			a = 128;
			b = (byte)a;
			System.out.println(a+","+b);
			a = 129;
			b = (byte)a;
			System.out.println(a+","+b);
			a = 130;
			b = (byte)a;
			System.out.println(a+","+b);
			a = 131;
			b = (byte)a;
			System.out.println(a+","+b);
			a = 254;
			b = (byte)a;
			System.out.println(a+","+b);
			a = 255;
			b = (byte)a;
			System.out.println(a+","+b);
			a = 256;                  
			b = (byte)a;                   //byte 256은 0 으로 다시시작
			System.out.println(a+","+b);
			a = 257;                       
			b = (byte)a; 				   // 1
			System.out.println(a+","+b);
			a = 258;
			b = (byte)a;				   // 2
			System.out.println(a+","+b);	
			
			/*	short byte  	 short 						 	 byte			
		 	127,127			0 000 0000 0111 1111          	0 111 1111		
			128,-128	양수	0 000 0000 1000 0000		음수	1 000 0000
			129,-127	양수	0 000 0000 1000 0001		음수	1 000 0001
			130,-126	양수	0 000 0000 1000 0010		음수	1 000 0010
			131,-125	양수	0 000 0000 1000 0011		음수	1 000 0011
			254,-2	    양수	0 000 0000 1111 1110		음수	1 111 1110
			255,-1	    양수	0 000 0000 1111 1111		음수	1 111 1111
			256,0	    양수	0 000 0001 0000 0000		양수	0 000 0000
			257,1		양수	0 000 0001 0000 0001		양수	0 000 0001
		 * */
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
