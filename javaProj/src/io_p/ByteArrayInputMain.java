package io_p;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputMain {

	public static void main(String[] args) {
	
		try {
			// 1. ��ü Ȯ��
			byte [] arr = {10,20,126,127,-128,-127,-2,-1,0,45,67};   // byte �� 127�� �ִ�
			// 2. stream ������ ��ü ����
			// ��ü���� �б� stream
			ByteArrayInputStream bis = new ByteArrayInputStream(arr);
			// 3. ���� - �б� 
			// read() - Int
//			System.out.println(bis.read());// 10		10
//			System.out.println(bis.read());// 20  		20
//			System.out.println(bis.read());// 126		126
//			System.out.println(bis.read());// 127		127
//			System.out.println(bis.read());// 128		-128   --> �������� ���밪 int�� ��ȯ
//			System.out.println(bis.read());// 129		-127   --> �������� ���밪 int�� ��ȯ
//			System.out.println(bis.read());// 254		-2     --> �������� ���밪 int�� ��ȯ
//			System.out.println(bis.read());// 255		-1     --> �������� ���밪 int�� ��ȯ
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
			
			while((data = bis.read()) != -1) {  // ���Թ��� ���� -1 �� �ƴ϶�� ��� ����
				System.out.println(data+"=>"+(byte)data);
			}
			
			
			// 4. stream �ݱ�
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
			b = (byte)a;                   //byte 256�� 0 ���� �ٽý���
			System.out.println(a+","+b);
			a = 257;                       
			b = (byte)a; 				   // 1
			System.out.println(a+","+b);
			a = 258;
			b = (byte)a;				   // 2
			System.out.println(a+","+b);	
			
			/*	short byte  	 short 						 	 byte			
		 	127,127			0 000 0000 0111 1111          	0 111 1111		
			128,-128	���	0 000 0000 1000 0000		����	1 000 0000
			129,-127	���	0 000 0000 1000 0001		����	1 000 0001
			130,-126	���	0 000 0000 1000 0010		����	1 000 0010
			131,-125	���	0 000 0000 1000 0011		����	1 000 0011
			254,-2	    ���	0 000 0000 1111 1110		����	1 111 1110
			255,-1	    ���	0 000 0000 1111 1111		����	1 111 1111
			256,0	    ���	0 000 0001 0000 0000		���	0 000 0000
			257,1		���	0 000 0001 0000 0001		���	0 000 0001
		 * */
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
