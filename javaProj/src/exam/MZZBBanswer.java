package exam;

import java.util.Scanner;

public class MZZBBanswer {
	
	Scanner sc = new Scanner(System.in);
	String [][] inArr = {
			"가위,바위,보".split(","),
			"찌,묵,빠".split(",")
	};
	
	String res1 [][] = {			//user
			{"비김","수비","공격"},	//가위
			{"공격","비김","수비"},	//바위
			{"수비","공격","비김"},	//보
		//com 가위, 바위, 보
	};
	
	String res2 [][] = {			//user
			{"비김","패","승"},	//가위
			{"승","비김","패"},	//바위
			{"패","승","비김"},	//보
		//com 가위, 바위, 보
	};
	
	int user,com;
	String rr;
	
	
	boolean input(String [] index) {
		
		String qqq = "", qqq2="";
		for (int i = 0; i < index.length; i++) {
			qqq += i+":"+index[i]+", ";
			qqq2 += index[i];
		}
		
		System.out.println(qqq2+" 게임,"+qqq+"  9:종료");
		System.out.print("입력:");
		user = sc.nextInt();
		
		com = (int)(Math.random()*index.length);
		
		if(user==9) {
			return true;
		}
		
		System.out.println("게이머:"+index[user]);
		System.out.println("컴퓨터:"+index[com]);
		
		return false;
	}
	
	
	public MZZBBanswer() {//생성자
		
		BIG:while(true) {  //
			
			//가위바위보
			GBB:while(true) {
				if(input(inArr[0])) {  //사용자 선택
					break BIG;
				}
				System.out.println("결과:"+res1[user][com]);
				if(user!=com) {
					rr = res2[user][com];
					break GBB;
				}
			}
			
			
			//묵찌빠
			MZB:while(true) {
				if(input(inArr[1])) {  //사용자 선택
					break BIG;
				}
				
				
				if(user==com) {
					break MZB;
				}
				rr = res2[user][com];
				System.out.println("공수:"+res1[user][com]);
			}
			
			System.out.println("이번판결과:"+rr);
		}
		
		System.out.println("게임종료");
	}

	public static void main(String[] args) {
		
		MZZBBanswer mz = new MZZBBanswer();
		//System.out.println(mz.res);
		
		//System.out.println(res);

	}

}
