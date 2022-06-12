package io_p;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;


public class BufOutputMain {

	public static void main(String[] args) throws Exception {  //������ �����ϴ°� �ƴ�
		byte [] arr1 = {11,44,22,33,77,66,55,13,24,36,69};
		byte [] arr2 = {5,8,7,2,3,5,9};
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		bos.write(arr1,2,4); //arr1 �� 2��°���� 4���ҷ��� 22,33,77,66
		bos.write(arr2,3,3); //arr2 �� 3��°���� 3�� �ҷ��� 2,3,5 (arr1 ������ �ڿ� �̾ ����)
		bos.write(arr1,4,5); // 77,66,55,13,24
		byte [] outArr = bos.toByteArray(); //��������
		
		
		bos.close();
		
		System.out.println(Arrays.toString(outArr));
	}

}
