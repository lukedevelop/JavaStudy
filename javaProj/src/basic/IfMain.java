package basic;

public class IfMain {

	public static void main(String[] args) {
		
		
		System.out.println("1. if ------");
		
		if( true ) {
			System.out.println("��������");
		}
		System.out.println("1. if ����------");
		
		System.out.println("2. if ~ else------");
		
		if( true ) {
			System.out.println("�������� 2");
		}else {
			System.out.println("�����η� 2");
		}
		System.out.println("2. if ~ else ����------");
		/* �ܵ� else �Ұ�
		else {
			System.out.println("�����η� 2");
		}
		*/
		int jum = 88;
		if( jum >=80 ) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}
		System.out.println("2. if ~ else ���� 1 ����------");
		
		if( jum >=80 ) {
			System.out.println("���");
		}
		
		////////////////////////////////////
		
		if( jum >=60 ) {
			System.out.println("����");
		}
		else {
			System.out.println("Ż��");
		}
		System.out.println("2. if ~ else ���� 2 ����------");
		
		
		System.out.println("3. if ~ else if ~ else------");
		
		if( jum >=80 ) {
			System.out.println("���3");
		}else if( jum >=60 ) {
			System.out.println("����3");
		}
		else {
			System.out.println("Ż��3");
		}
		System.out.println("3. if ~ else if ~ else ����------");
		
		System.out.println("4. if ~ else if ------");
		if( jum >=80 ) {
			System.out.println("���4");
		}else if( jum >=60 ) {
			System.out.println("����4");
		}
		
		System.out.println("4. if ~ else if ����------");
		/* �ܵ� else �Ұ�
		else if( jum >=60 ) {
			System.out.println("����3");
		} 
		
		����  :  if ~ else if ~ else
		if( jum >=80 ) {
			System.out.println("���3");
		}else {
			System.out.println("Ż��3");
		}else if( jum >=60 ) {
			System.out.println("����3");
		
		}
		*/
		
		
		
		System.out.println("5. if ~ else if ~ else------");
		jum = 75;
		if( jum >=80 ) {
			System.out.println("���5");
		}else if( jum >=60 ) {
			System.out.println("��ȣ5");
		
			if( jum % 2 == 0) {
				System.out.println("¦��");
			}else {
				System.out.println("Ȧ��");
			}
	
		}else if( jum >=40 ) {
			System.out.println("����5");
		
		}else if( jum >=20 ) {
			System.out.println("��¿��5");	
			
		}else {
			System.out.println("Ż��5");
		}
		System.out.println("5. if ~ else if ~ else ����------");
		
	}

}
