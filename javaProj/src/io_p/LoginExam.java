package io_p;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;


public class LoginExam {

	public static void main(String[] args) throws Exception {
	
		Scanner sc = new Scanner(System.in);
		String id, nm, pw, iid;
		String st;
		
	
		FileWriter fw = new FileWriter("fff/log.txt",true);
		BufferedWriter bw = new BufferedWriter(fw);
		
		
		//ȸ������
		BBB: while(true) {
			Boolean comple = false ;
			System.out.println("==ȸ������==");
		
			System.out.print("���̵��Է�:");
			id = sc.next();
			
			System.out.print("�̸��Է�:");
			nm = sc.next();
			
			System.out.print("��й�ȣ�Է�:");
			pw = sc.next();
			
			
		
			FileReader fr = new FileReader("fff/log.txt");
			BufferedReader br = new BufferedReader(fr);
			
			

			//ȸ������ �ߺ�Ȯ��
			while((st=br.readLine()) != null) {
				String [] arr = st.split(",");
				
				iid = arr[0];
				
				
				if(iid.equals(id)) {
					System.out.println("�ߺ��� �����Դϴ�.");
					comple = false;
					break;
				}else {
					
					
					comple = true;
				}
			}
	
			if (comple) {
				bw.write(""+id);
				bw.write(","+nm);
				bw.write(","+pw+"\n");
				
				bw.close();
				fw.close();	
				System.out.println("ȸ�����ԿϷ�");
				break;
				
			}
			fr.close();
			br.close();
		}
		

		
		String str;
		String logid,logpw;
		String gid,gnm,gpw;
		
		 
		System.out.println("�α������ּ���");
		
		//�α���
		 AAA : while(true) {
			 
			 

			logid = sc.next();
			logpw = sc.next();
			FileReader fr = new FileReader("fff/log.txt");
			BufferedReader br = new BufferedReader(fr);
			
			while((str = br.readLine()) != null) {
				String [] arr = str.split(",");
				
				gid = arr[0];
				gnm = arr[1];
				gpw = arr[2];
				
				
				 if(gid.equals(logid) && gpw.equals(logpw)) {
					 
					 break AAA;
				 }else {
	
				 }
			}
			 br.close();
				fr.close();
			System.out.println("�ٽ÷α���");
		}
		 System.out.println("�α��� ����"+"\n"+nm+"�� ȯ���մϴ�.");
//		1. ȸ������
//		2. �α���
//		2-1. ����� ��ĳ��
//		2-2. ȸ�� ���� �������
//		2-3. �α��� ����, �н����� ����
//		2-4. ���԰� ��� �ƴ�
		

		
		
		
	
		
	
	}

}
