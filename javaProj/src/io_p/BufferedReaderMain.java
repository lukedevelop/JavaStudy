package io_p;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReaderMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("fff/ooo2.txt");// �����о���
		BufferedReader br = new BufferedReader(fr); // ���پ� �о���
		
		
		//System.out.println(br.readLine());
		String str;
		
		while((str = br.readLine()) != null) {
			System.out.println(str);
		}
		
		br.close();
		
		fr.close();

		// ȸ������ �� �α����� �����ϼ���.
		/*
		 1.ȸ������ 
		 2.ID,�̸�,��ȣ
		 - ID �ߺ�Ȯ�� �˻�
		 */
		
	}

}
