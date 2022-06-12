		 package lang_p;


			import java.time.LocalDate;

			public class JuminMain {

			   public static void main(String[] args) {
			      // 성별, 국적, 생년월일, 한국나이, 만나이, 올해생일, 다가올 생일, 생일파티 DDAY
			      String birthday = "960226-1234567";

			      // 1. 성별 찾기
			      int pos = birthday.charAt(7) - '0';
			      System.out.println("성별 :" + "여남".charAt(pos % 2));

			      // 2. 국적 찾기
			      char a = pos > 4 ? '외' : '내';
			      System.out.println("국적: " + a + "국인");

			      // 3. 생년월일 찾기
			      System.out.println("생년월일 : " + birthday.substring(0, 6));

			      // 4.한국 나이, 올해 생일 찾기
			      LocalDate now = LocalDate.now();
			      int year = now.getYear();
			      String num = birthday.substring(0, 2);
			      String b = 19 + num;

			      int c = Integer.parseInt(b);

			      System.out.println("한국 나이 : " + (year - c + 1));
			      System.out.println("올해 생일 : " + year + birthday.substring(2, 6));

			      // 5. 만나이, 다가올 생일, 생일파티 D-day 찾기
			      int dayOfYear = now.getDayOfYear();

			      if (dayOfYear >= 57) {
			         System.out.println("만 나이 : " + (year - c));
			         System.out.println("다가 올 생일 : " + (year + 1) + birthday.substring(2, 6));
			         System.out.println(" 생일파티 D-day : " + (365 - dayOfYear));

			      } else if (dayOfYear < 57) {
			         System.out.println("만 나이 : " + (year - c - 1));
			         System.out.println("다가 올 생일 : " + year + birthday.substring(2, 6));
			         System.out.println("생일파티 D-day : " + (57 - dayOfYear));
			      }

			   }

	}


