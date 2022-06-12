package collection_P;

class GenAA<QQ, RR> {
	String name;
	QQ q;
	RR r;

	GenAA(String name, QQ q, RR r) {
		this.name = name;
		this.q = q;
		this.r = r;
	}

	public String toString() {

		return name + "," + q + "," + r;

	}

}

public class GenClassMain {

	public static void main(String[] args) { 
		
		// ����� ���ʸ� ���� ������ ȣ�� �ÿ��� ���ʸ��۵�
		GenAA a1 = new GenAA<Boolean, Integer>("����������", true, 123);
		a1.name = "������";
		a1.q = false;
		a1.r = "���ǳ����";  //����� ���ʸ� �������� �ʾ� �⺭������ Object �������� ��� �� �Է� ����
		System.out.println("a1:" + a1);

		
		// ����� ���ʸ� ����
		GenAA<Boolean, Integer> a2 = new GenAA("����������", true, 123);
		a2.name = "������";
		a2.q = false;
		// a2.r = "���ǳ����";     //��������� ������ �ڷ������� ����
		System.out.println("a2:" + a2);
        
		// ����� ���ʸ� ����
		// ������ ���ʸ� �������� ����������� Object�� �Է� ����
		GenAA<Boolean, String> a3 = new GenAA("����ظ���", true, 123);
		a3.name = "������";
		a3.q = false;
		//a3.r = "�罿����";
		//a3.r = 789;
		System.out.println("a3:" + a3);
		
		//GenAA<Boolean, String> a4 = new GenAA("����ظ���", true, 123);
		//����� ������ ��� ���ʸ� ����
		//������ �Ű�����, �ν��Ͻ��������� ��� ����/ȣ��� ��� �ڷ��� ������� ����� �ؾ� ��
		GenAA<Boolean, String> a4 = new GenAA("����ظ���", true, "���׶�뵷");
		a4.name = "������";
		a4.q = false;
		a4.r = "�罿����";
		//a4.r = 789;
		System.out.println("a4:" + a4);
		
		String nn = a4.name;
		//nn = a4.q;  (�Ұ���)
		boolean bo = a4.q;
		nn = a4.r;
	}

}
