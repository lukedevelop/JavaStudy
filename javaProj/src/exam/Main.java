package exam;

public class Main {
	

		public static void main(String[] args) {
			//1과제: 성별, 국적, 생년월일, 한국나이, 만나이, 올해생일, 다가올 생일, 생일파티 DDay를 출력하세요.
			//2과제: "aBcd Efg HIJK lMn opQR" --> Abcd Efg Hijk Lmn Opqr 로 변경해주세요.
			//과제 다풀었으면 lMn aBcd HIJk opQR Efg --> GFe rqPO kjih DCbA Nmi 로 변경해주세요.

			String aaa = "aBcd Efg HIJK lMn opQR";    //Abcd Efg Hijk Lmn Opqr 로 변경해주세요.
			System.out.println(aaa.toUpperCase());
			System.out.println(aaa.replaceAll("C", "c"));
			
			
			
	
		}
}
	