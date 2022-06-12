package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SignUpMain {

	public static void main(String[] args) {
		
		
		// ����
		//// ȸ�� ���� ��ȿ�� �˻縦 �ǽ��ϼ���
//		1. ���̵� : ���� ���� ����
//		2. ��� , ���Ȯ�� 
//		3. �̸���  -  ���̵�:����,����   @  ������ : ���� ��
//		4. ��ȭ��ȣ - ���� :  ###-####-####,   ##(#)-###-####
//		5. �̸� (�ѱ۸� ����)
//		6. �ֹι�ȣ 
//		7. ���� ÷��-->����,����.�̹��� Ȯ����
//		�̹���(jpg, jpeg, bmp, png, gif)  --  ��ҹ��� ���о���
//		8. �����ȣ �˻� - ������ (�ʼ��˻�)
//	    (����,����,����,��,��,��,��) �˻��Ǿ� ���;���
//		����ó���� ó���� ��
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				System.out.print("���̵�: ");
				String id = sc.nextLine();

				String one = "[a-zA-Z0-9]{3,}";
				if (!Pattern.matches(one, id)) {
					throw new Exception("������ ���ڸ� �Է��Ͻÿ�.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("��й�ȣ: ");
				String pw = sc.nextLine();

				String two = "[a-zA-Z0-9]{6,}";
				if (!Pattern.matches(two, pw)) {
					throw new Exception("������ ���� 6�ڸ� �̻� �Է��Ͻÿ�.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		while (true) {

			try {
				System.out.print("��ȭ��ȣ: ");
				String pn = sc.nextLine();

				String three = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";
				if (!Pattern.matches(three, pn)) {
					throw new Exception("��ȭ��ȣ�� �Է��Ͻÿ�");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("�̸�: ");
				String pw = sc.nextLine();

				String four = "[��-�R]{2,}";
				if (!Pattern.matches(four, pw)) {
					throw new Exception("�ѱ۸� �Է��Ͻÿ�.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("�ֹι�ȣ: ");
				String pw = sc.nextLine();

				String five = "[0-9]{6}-[0-9]{7}";
				if (!Pattern.matches(five, pw)) {
					throw new Exception("�ùٸ����ʽ��ϴ�");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		while (true) {

			try {
				System.out.print("����÷��: ");
				String pw = sc.nextLine();

				String six = ".{1,}[.](jpg|jpeg|bmp|png|gif)";
				if (!Pattern.matches(six, pw)) {
					throw new Exception("�ùٸ����ʽ��ϴ�");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		
		
//		String[] address = {"��⵵ ������ ��ȱ� ���ڵ�","��⵵ ������ ��ȱ�","��⵵ ������",
//	              "������","��⵵"	};	
//		
//		String[] answer = {"[��-����]","[��-����]","[��-�L��]"};
		
	
		 
		while (true) {
			
			try {
				System.out.print("�����ȣ �˻�: ");
				String pw = sc.nextLine();

				String six = "[��-����][��-����][��-�L��]";
				if (!Pattern.matches(six, pw)) {
					throw new Exception("�ùٸ����ʽ��ϴ�");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		System.out.println("ȸ������ �Ϸ�");


	}

}