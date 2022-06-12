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
		
		
		//회원가입
		BBB: while(true) {
			Boolean comple = false ;
			System.out.println("==회원가입==");
		
			System.out.print("아이디입력:");
			id = sc.next();
			
			System.out.print("이름입력:");
			nm = sc.next();
			
			System.out.print("비밀번호입력:");
			pw = sc.next();
			
			
		
			FileReader fr = new FileReader("fff/log.txt");
			BufferedReader br = new BufferedReader(fr);
			
			

			//회원가입 중복확인
			while((st=br.readLine()) != null) {
				String [] arr = st.split(",");
				
				iid = arr[0];
				
				
				if(iid.equals(id)) {
					System.out.println("중복된 정보입니다.");
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
				System.out.println("회원가입완료");
				break;
				
			}
			fr.close();
			br.close();
		}
		

		
		String str;
		String logid,logpw;
		String gid,gnm,gpw;
		
		 
		System.out.println("로그인해주세요");
		
		//로그인
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
			System.out.println("다시로그인");
		}
		 System.out.println("로그인 성공"+"\n"+nm+"님 환영합니다.");
//		1. 회원가입
//		2. 로그인
//		2-1. 사용자 스캐너
//		2-2. 회원 정보 갖고오기
//		2-3. 로그인 대입, 패스워드 대입
//		2-4. 대입값 모두 아닐
		

		
		
		
	
		
	
	}

}
