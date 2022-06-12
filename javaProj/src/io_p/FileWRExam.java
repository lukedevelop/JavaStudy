package io_p;

import java.io.DataInputStream;
import java.io.FileInputStream;

class jum{
	int kor,eng,math;
	
	
	public jum(String str) {
		String [] arr = str.split(",");
		
		kor = Integer.parseInt(arr[0]);
		eng = Integer.parseInt(arr[1]);
		math = Integer.parseInt(arr[2]);
	}



	@Override
	public String toString() {
		return "jum [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	
}

public class FileWRExam {

	public static void main(String[] args) throws Exception {
		// exam.txt 파일을 만들고 파일 내용에 총점, 평균, 등수를 계산하여
		// 장동건_77,78,75
		// 장서건_67,68,65
		// 장남건_97,98,95
		// 갓동규_57,58,55
		// 갓짝퉁_87,88,85
		// examRes.txt 파일로 저장하시오

		FileInputStream fis = new FileInputStream("fff/exam.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		while (dis.available() > 0) {
			String str = dis.readUTF();
			
			int pos = str.indexOf("_");
			String tag = str.substring(0,pos);
			String data = str.substring(pos+1);
			
			switch(tag) {
			
			}
			fis.close();
		}
		
		

		
	}

}
