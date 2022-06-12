package util_p;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.regex.Pattern;

public class FileImgMain {

	public static void main(String[] args) {
		// fff ������ �ִ� ������ �̹��� ���ϸ� picture ������ ������ �ּ���
		// �̹��� ���� jpg,png,gif,bmp,jpeg --> ��ҹ��� �������� ����
		// picture������ �ڵ� ����
		
		new File("picture").mkdir();
		for (File ff : new File("fff").listFiles()) {
			
			if(ff.isFile() && 
					Pattern.matches(".*[.](jpg|png|gif|bmp|jpeg)", 
							ff.getName().toLowerCase())) {
				
				FileInputStream fis = new FileInputStream(ff);
				byte [] arr = new byte[(int)ff.length()];
				FileOutputStream fos = new FileOutputStream("picture/"+ff.getName());
				
				fis.read(arr);
				fos.write(arr);
				
				fos.close();
				fis.close();
			}
		}

	}

}
