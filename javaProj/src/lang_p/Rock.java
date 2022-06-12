package lang_p;
import java.util.Scanner;
public class Rock {

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		String [] index = {"가위","바위","보"};
//		while(true) {
//			System.out.println("가위바위보 게임");
//			System.out.println("0:가위, 1:바위, 2:보, 9:종료");
//			System.out.println("입력:");
//			int user = sc.nextInt();
//			
//			if(user == 9) {
//				break;
//			}
//			int com = (int)(Math.random()*3);
//			
//			String res = "패";
//				if(user == 2 && com == 2) {
//					res = "비김";
//				}else if(user == 2 && com == 1) {
//					res = ("승");
//				}else {
//					res = "패";
//				}
//				
//			
//			System.out.println("나:"+index[user]);
//			System.out.println("컴퓨터:"+index[com]);
//			System.out.println("결과:"+res);
//		}
//           System.out.println("게임종료");
		
           
         

     

          

           	
           		Scanner sc = new Scanner(System.in);
           		String [] index = {"가위","바위","보"};
           		
           		String res [][] = {			//user
           				{"비김","패","승"},	//가위
           				{"승","비김","패"},	//바위
           				{"패","승","비김"},	//보
           			//com 가위, 바위, 보
           		};
           		
           		while(true) {
           			
           			System.out.println("가위바위보 게임,  0:가위, 1:바위, 2:보, 9:종료");
           			System.out.print("입력:");
           			int user = sc.nextInt();
           			
           			if(user==9) {
           				break;
           			}
           			
           			int com = (int)(Math.random()*index.length);
           			
           			System.out.println("게이머:"+index[user]);
           			System.out.println("컴퓨터:"+index[com]);
           			System.out.println("결과:"+res[user][com]);
           		}
           		
           		System.out.println("게임종료");

           	

	}

}
