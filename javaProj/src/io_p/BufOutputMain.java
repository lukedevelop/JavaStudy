package io_p;

import java.io.ByteArrayOutputStream;
import java.util.Arrays;


public class BufOutputMain {

	public static void main(String[] args) throws Exception {  //읽을때 조절하는게 아님
		byte [] arr1 = {11,44,22,33,77,66,55,13,24,36,69};
		byte [] arr2 = {5,8,7,2,3,5,9};
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		bos.write(arr1,2,4); //arr1 의 2번째부터 4개불러옴 22,33,77,66
		bos.write(arr2,3,3); //arr2 의 3번째부터 3개 불러옴 2,3,5 (arr1 마지막 뒤에 이어서 나옴)
		bos.write(arr1,4,5); // 77,66,55,13,24
		byte [] outArr = bos.toByteArray(); //내보내기
		
		
		bos.close();
		
		System.out.println(Arrays.toString(outArr));
	}

}
