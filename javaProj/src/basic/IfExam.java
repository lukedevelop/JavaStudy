package basic;

public class IfExam {

	public static void main(String[] args) {
		int kor = 99, eng = 98, math = 97;
		int avg = (kor+eng+math)/3;
		String gd = "우수생";
		
		if(avg >= 90) {          //이중if문
			System.out.print("90이상 : 수");
			if(kor>=90 && eng>=90 && math>=90) {
				System.out.println("(우등생)");
			}
		}else if(avg >= 80) {
			System.out.println("80이상 : 우");
		}else if(avg >= 70) {
			System.out.println("70이상 : 미");
		}else if(avg >= 60) {
			System.out.println("60이상 : 양");
		}else {
			System.out.println("60미만 : 가");
		}
		
		
		
		String grade;
		
		switch (avg/10) {
		case 9:
			grade = "수";
			break;
		case 8:
			grade = "우";
			break;
		case 7:
			grade = "미";
			break;
		
		default :
			grade = "탈락";
			break;
			
		}
		System.out.println("등급 : "+grade);
		
		
		
	}

}
