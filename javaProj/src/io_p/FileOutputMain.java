package io_p;


import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class FileOutputMain {

	public static void main(String[] args) {
//		try {
//			FileOutputStream fos = new FileOutputStream("fff/ccc.txt");  // �ؽ�Ʈ ������ �����
//			
//			String ttt = "fwefwef ewfwef\n 1234567890\n !@#$%^^&*()_+";  // txt ���Ͽ� �������ڸ� ���������
//			
//			for(char ch : ttt.toCharArray()) {                          // for�� �̿��Ͽ�
//				fos.write(ch);
//			}
//			
//			//fos.write('a');   // txt���Ͽ� a �� ����
//			
//			fos.close();
//		
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		//23,4,56,7,88,21,32,54,65,90,12,33,46
		// ¦����� ¦������ ��, ����� ccc2.txt �� �����ϼ���

	
		try {
			FileOutputStream fo = new FileOutputStream("fff/ccc2.txt");  // "fff/ccc2.txt" ������ �ؽ�Ʈ ������ ���� �Ϸ���
			
			String ttt = ""; // �ؽ�Ʈ ���Ͽ� �־��ֱ� ���� String ���� ����
			
			
			String jum = "23,4,56,7,88,21,32,54,65,90,12,33,46"; // ���ڰ� ���ڿ� ����
			
			String [] aa = jum.split(",");  // �� ���ڸ� �迭�� ����� split�� ����� �ϳ��� ���������� �ٲ���
			
			int sum = 0, k = 0;  //sum: �� k: ¦�� ����
			
			for(int i = 0; i < aa.length; i++) {   // for���� Ȱ���� aa �迭�� ������ �˼�����
				if(Integer.parseInt(aa[i])%2 == 0) { // ���� �迭 aa �� int������ �ٲ� ¦�� ���� ã������ �������� 0 �ΰ͵鸸 ��µǰ� ������ ��
					
					sum += Integer.parseInt(aa[i]); // sum �� int������ �ٲ� �迭 aa�� ¦���鸸 ã�� ���Ѵ�. 
					k += 1;                         // k �� �� aa�迭�ȿ� ¦�� ���ڵ� ������ �˾Ƴ������� k += 1 ����
				}
				
			}
			
			ttt += "Even number = " + sum +", Average = " + sum/k; // �ؽ�Ʈ ���Ͽ� �־��ֱ� ���� String ���� �ȿ� "��" �� "���" �� �����
			
			
			for(char ch : ttt.toCharArray()) {       //                   
				fo.write(ch);
			}
			
			
			
			fo.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		
//		for(char ch : jum.toCharArray()) {
//		fo.write((int)ch);
//		
//		if((int)ch/2 == 0) {
//			fo.write(ch);
//		}
//		
//	}
	
//	for(int i = 0; i < jum.length; i++) {
//		fo.write((char)jum[i]);
//	}
		
	}

}
