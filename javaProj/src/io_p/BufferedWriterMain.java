package io_p;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("fff/ooo3.txt");  // txt���� ����
		BufferedWriter bw = new BufferedWriter(fw);  // txt���� �����ؼ� ���� ����
		
		bw.write("������ ����\n");
		bw.write("������ ���������\n");
		bw.write("������ ����\n");
		bw.write("������ Ÿ�뽺");
		
		bw.close();
		fw.close();
	}

}
