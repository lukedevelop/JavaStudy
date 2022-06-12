package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

class RegexMem {
	class Data {
		String title, data;

		public Data(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return title + " : " + data;
		}
	}

	Data[] data;

	public RegexMem() {
		String[] arr = "id,pw,tel,pname,img,addr,schGu".split(",");
		data = new Data[arr.length];

		for (int i = 0; i < arr.length; i++) {
			data[i] = new Data(arr[i]);
		}
	}

	void ppp() {

		for (Data dd : data) {
			System.out.println(dd);
		}
	}

	void input(RRQQ rq) {
		for (Data dd : data) {
			if (dd.title.equals(rq.title)) {
				dd.data = rq.answer;
			}
		}
	}
}

class RRQQ {
	String qq, title, regex, answer;

	public RRQQ(String qq, String title, String regex) {
		super();
		this.qq = qq;
		this.title = title;
		this.regex = regex;

	}

	void question(RegexMem rm) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print(qq + ":");
		answer = sc.next();

		if (!Pattern.matches(regex, answer.toLowerCase())) {
			throw new Exception(qq + " ÀÔ·Â¿¡·¯");
		}
		rm.input(this);
	}
}

class RegZipCode {

	String gu, zipcode;

	public RegZipCode(String str) {
		String[] arr = str.split("_");
		this.gu = arr[0];
		this.zipcode = arr[1];
	}

	@Override
	public String toString() {
		return gu + "=>" + zipcode;
	}

}

public class SignUpMain2 {

	public static void main(String[] args) {

		/*
		 * È¸¿ø °¡ÀÔ À¯È¿¼º °Ë»ç¸¦ ½Ç½ÃÇÏ¼¼¿ä 1. : ¿µ¹® ¼ıÀÚ Á¶ÇÕ 2. , [a-zA-Z0-9]* 3. - ¼ıÀÚ : ###-####-####,
		 * ##(#)-###-#### [0-9]{2,3}-[0-9]{3,4}-[0-9]{4} 4. (ÇÑ±Û¸¸ °¡´É) [°¡-ÆR]* 5.
		 * Ã·ºÎ-->¿µ¹®,¼ıÀÚ.ÀÌ¹ÌÁö È®ÀåÀÚ [a-zA-Z0-9_]*.[a-z] ÀÌ¹ÌÁö(jpg, jpeg, bmp, png, gif) -- ´ë¼Ò¹®ÀÚ
		 * ±¸ºĞ¾øÀ½ 6. °Ë»ö - ±¸´ÜÀ§ (ÃÊ¼º°Ë»ö) ¤¡¤¸,±¤¤¸,¤¡Áø,±¤Áø,Áø,¤¸,¤¡,±¤ ¿¹¿ÜÃ³¸®·Î Ã³¸®ÇÒ °Í
		 */

		String[] rgc = { "¤¡¤¤¤§¤©¤±¤²¤µ¤·¤¸¤º¤»¤¼¤½¤¾¤¶¤¢¤¨¤¹¤³", "°¡³ª´Ù¶ó¸¶¹Ù»ç¾ÆÀÚÂ÷Ä«Å¸ÆÄÇÏ½Î±îµûÂ¥ºü", "ƒ‰ˆ¢‹L¡“J•½šïŸç£ ¯†µi»MÀ˜ÆRÏ…ùêÂö˜ª" };

		String[] gu = "Á¾·Î±¸_00111,Áß±¸_00222,¿ë»ê±¸_00223,¼ºµ¿±¸_00224,±¤Áø±¸_00225,µ¿´ë¹®±¸_00226,Áß¶û±¸_00227,¼ººÏ±¸_00228,°­ºÏ±¸_00229,µµºÀ±¸_00230,³ë¿ø±¸_00231,ÀºÆò±¸_00232,¼­´ë¹®±¸_00233,¸¶Æ÷±¸_00234,¾çÃµ±¸_00235,°­¼­±¸_00236,±¸·Î±¸_00237,±İÃµ±¸_00238,¿µµîÆ÷±¸_00239,µ¿ÀÛ±¸_00240,°ü¾Ç±¸_00241,¼­ÃÊ±¸_00242,°­³²±¸_00243,¼ÛÆÄ±¸_00244,°­µ¿±¸_00245"
				.split(",");

		RegZipCode[] zipArr = new RegZipCode[gu.length];

		for (int i = 0; i < zipArr.length; i++) {
			zipArr[i] = new RegZipCode(gu[i]);
		}

		RRQQ[] arr = {
//			new RRQQ("¾ÆÀÌµğ","id","[a-zA-Z0-9]{3,}"),
//			new RRQQ("ºñ¹ø","pw",".{4,}"),
//			new RRQQ("ºñ¹øÈ®ÀÎ","",".{4,}"),
//			new RRQQ("ÀüÈ­¹øÈ£","tel","([0-9]{3}-[0-9]{4}|[0-9]{2,3}-[0-9]{3})-[0-9]{4}"),
//			new RRQQ("ÀÌ¸§","pname","[°¡-ÆR]{2,}"),
//			new RRQQ("»çÁø","img",".{1,}[.](jpg|jpeg|bmp|png|gif)"),
				new RRQQ("¿ìÆí¹øÈ£", "addr", "[¤¡-¤¾°¡-ÆR]*") };

		RegexMem rm = null;

		while (true) {
			rm = new RegexMem();
			try {

				for (RRQQ rq : arr) {
					rq.question(rm);

					if (rq.qq.equals("ºñ¹øÈ®ÀÎ") && !rq.answer.equals(rm.data[1].data)) {
						throw new Exception("ºñ¹Ğ¹øÈ£ ºÒÀÏÄ¡");
					}
				}

				String pp = ".*";

				for (char ch : rm.data[5].data.toCharArray()) {

					int pos = rgc[0].indexOf(ch);
					if (pos >= 0) {
						pp += "[" + rgc[1].charAt(pos) + "-" + rgc[2].charAt(pos) + "]";
					} else {
						pp += ch;
					}
				}

				pp += ".*";

				// System.out.println(pp);
				String schGu = "";

				for (RegZipCode zipcode : zipArr) {
					if (Pattern.matches(pp, zipcode.gu)) {
						schGu += zipcode + ",";
					}
				}

				// System.out.println(schGu);
				if (schGu.length() == 0) {
					throw new Exception("ÀÏÄ¡ÇÏ´Â ±¸°¡ ¾ø½À´Ï´Ù.");
				}

				rm.data[6].data = schGu;

				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}
		System.out.println("È¸¿ø°¡ÀÔ ¿Ï·á");
		rm.ppp();
	}

}
