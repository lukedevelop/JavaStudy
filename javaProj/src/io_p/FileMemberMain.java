package io_p;

import java.io.FileInputStream;
import java.util.Arrays;

class FileMember{
	String id;
	int age;
	boolean marriage;
	
	public FileMember(String str) {
		String [] arr = str.split("\r\n");  //  \r : (return)�Ǿ����� ���ư���  \n : (new line)�ٹٲ�
		System.out.println("������: " + Arrays.toString(arr));
		id = arr[0];
		age = Integer.parseInt(arr[1]);
		marriage = Boolean.parseBoolean(arr[2]);
	}
	
	@Override
	public String toString() {
		return "FileMember [id=" + id + ", age=" + age + ", marriage=" + marriage + "]";
	}
	
	
}

public class FileMemberMain {

	public static void main(String[] args) {
		
		 String ttt = "";
		 try {
			FileInputStream fis = new FileInputStream("fff/qqq.txt");
			
			
			int data;
			while((data = fis.read()) != -1){
				//System.out.print((char)data);
				ttt += (char)data;
			}
			
			fis.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 //System.out.println(ttt);
		 FileMember fm = new FileMember(ttt);
	}

}
