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
		// exam.txt ������ ����� ���� ���뿡 ����, ���, ����� ����Ͽ�
		// �嵿��_77,78,75
		// �弭��_67,68,65
		// �峲��_97,98,95
		// ������_57,58,55
		// ��¦��_87,88,85
		// examRes.txt ���Ϸ� �����Ͻÿ�

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
