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
		
		cnt = bis.read(buf,        1,          3);  // buf ������ 5�̱⿡ 5���̿� ������ġ�� ������ ���� ����
		//		      ������ �迭����,  buf�ǽ�����ġ, ������ ����
		
		System.out.println("available: "+bis.available());  //13
		System.out.println(Arrays.toString(buf)); //[0, 10, 127, -128, 0]
		System.out.println(cnt); //3
		
		
		/*
		System.out.println("available: "+bis.available()); //13 ���  [available() ?]
		//bis.read();
		//bis.read();
		//System.out.println("available: "+bis.available()); //11 ���
		
		int cnt = bis.read(buf); 
		//cnt : ���� ����
		//buf : �����͸� �޾� ������ �ӽ� ���� ����
		
		//available : ��Ʈ���� �����ִ� ������ ����
		System.out.println("available: "+bis.available());  //available:  ��Ʈ���� �����ִ� ������ ���� (8��)
		System.out.println(Arrays.toString(buf)); // buf : �����͸� �޾� ������ �ӽ� ���� ����
		System.out.println(cnt); //5
		
		////////////////////////// 
		cnt = bis.read(buf); 
		
		System.out.println("available: "+bis.available());  //���� 8������ 5���� ���� (3������)
		System.out.println(Arrays.toString(buf)); 
		System.out.println(cnt); //5
		
		cnt = bis.read(buf); 

		System.out.println("available: "+bis.available());    //0��
		System.out.println(Arrays.toString(buf)); 
		System.out.println(cnt); //3
		*/
		bis.close(); 
		
	}

}
