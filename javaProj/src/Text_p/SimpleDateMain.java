package Text_p;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class SimpleDateMain {

	public static void main(String[] args) throws ParseException {
		Date today = new Date();

		System.out.println(today);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd (E) a HH:mm:ss.SSS");

		System.out.println(sdf.format(today));

		Locale loc = new Locale("en"); // Locale ("en"): 미국 스퇄

		sdf = new SimpleDateFormat("yyyy-MM-dd (E) a HH:mm:ss.SSS", loc);

		System.out.println(sdf.format(today));

		loc = new Locale("ko"); // Locale ("ko"): 한국 스퇄

		sdf = new SimpleDateFormat("yyyy-MM-dd (E) a HH:mm:ss.SSS", loc);

		System.out.println(sdf.format(today));

		String[] ppArr = { "y", "yy", "yyyy", "M", "MM", "MMM", "d", "dd", "D", "DD", "DDD", "w", "ww", "W", "WW", "F",
				"E", "EEE", "EEEE", "z", "Z", "a", "H", "HH", "h", "hh", "m", "mm", "s", "ss", "S", "SSS"

		};
		loc = new Locale("en");
		for (String pp : ppArr) {
			sdf = new SimpleDateFormat(pp, loc);
			System.out.println(pp + " : " + sdf.format(today));
		}

		sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.parse("1995-03-20 17:03:26");
		today = sdf.parse("1989-11-28 17:03:26"); // 규칙만 맞다면 에러 안뜨고 알아서 환산해줌(Fri Jan 31 17:03:26 KST 1997)
		System.out.println(today);

		// '89年 nov 28일 (화) 05:07:30 형태로 출력해 주세요.

		sdf = new SimpleDateFormat("''yy年 MMM dd일(", loc);

		String ttt = sdf.format(today);
		
		loc = new Locale("ko");
		sdf = new SimpleDateFormat("E) HH:mm:ss", loc);

		ttt += sdf.format(today);

		System.out.println(ttt);

	}

}
