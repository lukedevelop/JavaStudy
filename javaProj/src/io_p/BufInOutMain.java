package io_p;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class BufInOutMain {

	public static void main(String[] args) throws Exception {
		byte [] arr = {10,127,-128,-126,-2,-1,0,40,50,60,11,22,33};
		byte [] buf = new byte[5];
		
		byte [] res;
		
		ByteArrayInputStream bis = new ByteArrayInputStream(arr);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		
		
		while(bis.available()>0) {
			
			int cnt = bis.read(buf); //cnt 활용해 갯수 딱 맞춰서 나오게 함
			bos.write(buf,0,cnt);   // 갯수가 딱 맞춰서 나옴
			System.out.println(cnt + Arrays.toString(buf)); // 나머지 3개에서 왜 50,60 나오냐 이마뤼야
		}
		
		res = bos.toByteArray();
		
		bos.close();
		bis.close();

		System.out.println(Arrays.toString(res));
	}

}
