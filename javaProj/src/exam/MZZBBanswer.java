package exam;

import java.util.Scanner;

public class MZZBBanswer {
	
	Scanner sc = new Scanner(System.in);
	String [][] inArr = {
			"����,����,��".split(","),
			"��,��,��".split(",")
	};
	
	String res1 [][] = {			//user
			{"���","����","����"},	//����
			{"����","���","����"},	//����
			{"����","����","���"},	//��
		//com ����, ����, ��
	};
	
	String res2 [][] = {			//user
			{"���","��","��"},	//����
			{"��","���","��"},	//����
			{"��","��","���"},	//��
		//com ����, ����, ��
	};
	
	int user,com;
	String rr;
	
	
	boolean input(String [] index) {
		
		String qqq = "", qqq2="";
		for (int i = 0; i < index.length; i++) {
			qqq += i+":"+index[i]+", ";
			qqq2 += index[i];
		}
		
		System.out.println(qqq2+" ����,"+qqq+"  9:����");
		System.out.print("�Է�:");
		user = sc.nextInt();
		
		com = (int)(Math.random()*index.length);
		
		if(user==9) {
			return true;
		}
		
		System.out.println("���̸�:"+index[user]);
		System.out.println("��ǻ��:"+index[com]);
		
		return false;
	}
	
	
	public MZZBBanswer() {//������
		
		BIG:while(true) {  //
			
			//����������
			GBB:while(true) {
				if(input(inArr[0])) {  //����� ����
					break BIG;
				}
				System.out.println("���:"+res1[user][com]);
				if(user!=com) {
					rr = res2[user][com];
					break GBB;
				}
			}
			
			
			//�����
			MZB:while(true) {
				if(input(inArr[1])) {  //����� ����
					break BIG;
				}
				
				
				if(user==com) {
					break MZB;
				}
				rr = res2[user][com];
				System.out.println("����:"+res1[user][com]);
			}
			
			System.out.println("�̹��ǰ��:"+rr);
		}
		
		System.out.println("��������");
	}

	public static void main(String[] args) {
		
		MZZBBanswer mz = new MZZBBanswer();
		//System.out.println(mz.res);
		
		//System.out.println(res);

	}

}
