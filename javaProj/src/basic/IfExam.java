package basic;

public class IfExam {

	public static void main(String[] args) {
		int kor = 99, eng = 98, math = 97;
		int avg = (kor+eng+math)/3;
		String gd = "�����";
		
		if(avg >= 90) {          //����if��
			System.out.print("90�̻� : ��");
			if(kor>=90 && eng>=90 && math>=90) {
				System.out.println("(����)");
			}
		}else if(avg >= 80) {
			System.out.println("80�̻� : ��");
		}else if(avg >= 70) {
			System.out.println("70�̻� : ��");
		}else if(avg >= 60) {
			System.out.println("60�̻� : ��");
		}else {
			System.out.println("60�̸� : ��");
		}
		
		
		
		String grade;
		
		switch (avg/10) {
		case 9:
			grade = "��";
			break;
		case 8:
			grade = "��";
			break;
		case 7:
			grade = "��";
			break;
		
		default :
			grade = "Ż��";
			break;
			
		}
		System.out.println("��� : "+grade);
		
		
		
	}

}
