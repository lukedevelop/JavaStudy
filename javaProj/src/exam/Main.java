package exam;

public class Main {
	

		public static void main(String[] args) {
			//1����: ����, ����, �������, �ѱ�����, ������, ���ػ���, �ٰ��� ����, ������Ƽ DDay�� ����ϼ���.
			//2����: "aBcd Efg HIJK lMn opQR" --> Abcd Efg Hijk Lmn Opqr �� �������ּ���.
			//���� ��Ǯ������ lMn aBcd HIJk opQR Efg --> GFe rqPO kjih DCbA Nmi �� �������ּ���.

			String aaa = "aBcd Efg HIJK lMn opQR";    //Abcd Efg Hijk Lmn Opqr �� �������ּ���.
			System.out.println(aaa.toUpperCase());
			System.out.println(aaa.replaceAll("C", "c"));
			
			
			
	
		}
}
	