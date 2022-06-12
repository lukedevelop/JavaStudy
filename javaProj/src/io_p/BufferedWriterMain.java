package io_p;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class BufferedWriterMain {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("fff/ooo3.txt");  // txt파일 생성
		BufferedWriter bw = new BufferedWriter(fw);  // txt파일 생성해서 내용 써줌
		
		bw.write("송지은 만세\n");
		bw.write("송지은 하일히드라\n");
		bw.write("송지은 베놈\n");
		bw.write("송지은 타노스");
		
		bw.close();
		fw.close();
	}

}
