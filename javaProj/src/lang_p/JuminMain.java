		 package lang_p;


			import java.time.LocalDate;

			public class JuminMain {

			   public static void main(String[] args) {
			      // ����, ����, �������, �ѱ�����, ������, ���ػ���, �ٰ��� ����, ������Ƽ DDAY
			      String birthday = "960226-1234567";

			      // 1. ���� ã��
			      int pos = birthday.charAt(7) - '0';
			      System.out.println("���� :" + "����".charAt(pos % 2));

			      // 2. ���� ã��
			      char a = pos > 4 ? '��' : '��';
			      System.out.println("����: " + a + "����");

			      // 3. ������� ã��
			      System.out.println("������� : " + birthday.substring(0, 6));

			      // 4.�ѱ� ����, ���� ���� ã��
			      LocalDate now = LocalDate.now();
			      int year = now.getYear();
			      String num = birthday.substring(0, 2);
			      String b = 19 + num;

			      int c = Integer.parseInt(b);

			      System.out.println("�ѱ� ���� : " + (year - c + 1));
			      System.out.println("���� ���� : " + year + birthday.substring(2, 6));

			      // 5. ������, �ٰ��� ����, ������Ƽ D-day ã��
			      int dayOfYear = now.getDayOfYear();

			      if (dayOfYear >= 57) {
			         System.out.println("�� ���� : " + (year - c));
			         System.out.println("�ٰ� �� ���� : " + (year + 1) + birthday.substring(2, 6));
			         System.out.println(" ������Ƽ D-day : " + (365 - dayOfYear));

			      } else if (dayOfYear < 57) {
			         System.out.println("�� ���� : " + (year - c - 1));
			         System.out.println("�ٰ� �� ���� : " + year + birthday.substring(2, 6));
			         System.out.println("������Ƽ D-day : " + (57 - dayOfYear));
			      }

			   }

	}


