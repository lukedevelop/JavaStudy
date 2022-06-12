package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SignUpMain {

	public static void main(String[] args) {
		
		
		// °úÁ¦
		//// È¸¿ø °¡ÀÔ À¯È¿¼º °Ë»ç¸¦ ½Ç½ÃÇÏ¼¼¿ä
//		1. ¾ÆÀÌµð : ¿µ¹® ¼ýÀÚ Á¶ÇÕ
//		2. ºñ¹ø , ºñ¹øÈ®ÀÎ 
//		3. ÀÌ¸ÞÀÏ  -  ¾ÆÀÌµð:¿µ¹®,¼ýÀÚ   @  µµ¸ÞÀÎ : ¿µ¹® Á¡
//		4. ÀüÈ­¹øÈ£ - ¼ýÀÚ :  ###-####-####,   ##(#)-###-####
//		5. ÀÌ¸§ (ÇÑ±Û¸¸ °¡´É)
//		6. ÁÖ¹Î¹øÈ£ 
//		7. »çÁø Ã·ºÎ-->¿µ¹®,¼ýÀÚ.ÀÌ¹ÌÁö È®ÀåÀÚ
//		ÀÌ¹ÌÁö(jpg, jpeg, bmp, png, gif)  --  ´ë¼Ò¹®ÀÚ ±¸ºÐ¾øÀ½
//		8. ¿ìÆí¹øÈ£ °Ë»ö - ±¸´ÜÀ§ (ÃÊ¼º°Ë»ö)
//	    (¤¡¤¸,±¤¤¸,¤¡Áø,Áø,¤¸,¤¡,±¤) °Ë»öµÇ¾î ³ª¿Í¾ßÇÔ
//		¿¹¿ÜÃ³¸®·Î Ã³¸®ÇÒ °Í
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				System.out.print("¾ÆÀÌµð: ");
				String id = sc.nextLine();

				String one = "[a-zA-Z0-9]{3,}";
				if (!Pattern.matches(one, id)) {
					throw new Exception("¿µ¹®°ú ¼ýÀÚ¸¸ ÀÔ·ÂÇÏ½Ã¿À.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("ºñ¹Ð¹øÈ£: ");
				String pw = sc.nextLine();

				String two = "[a-zA-Z0-9]{6,}";
				if (!Pattern.matches(two, pw)) {
					throw new Exception("¿µ¹®°ú ¼ýÀÚ 6ÀÚ¸® ÀÌ»ó ÀÔ·ÂÇÏ½Ã¿À.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		while (true) {

			try {
				System.out.print("ÀüÈ­¹øÈ£: ");
				String pn = sc.nextLine();

				String three = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";
				if (!Pattern.matches(three, pn)) {
					throw new Exception("ÀüÈ­¹øÈ£¸¦ ÀÔ·ÂÇÏ½Ã¿À");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("ÀÌ¸§: ");
				String pw = sc.nextLine();

				String four = "[°¡-ÆR]{2,}";
				if (!Pattern.matches(four, pw)) {
					throw new Exception("ÇÑ±Û¸¸ ÀÔ·ÂÇÏ½Ã¿À.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("ÁÖ¹Î¹øÈ£: ");
				String pw = sc.nextLine();

				String five = "[0-9]{6}-[0-9]{7}";
				if (!Pattern.matches(five, pw)) {
					throw new Exception("¿Ã¹Ù¸£Áö¾Ê½À´Ï´Ù");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		while (true) {

			try {
				System.out.print("»çÁøÃ·ºÎ: ");
				String pw = sc.nextLine();

				String six = ".{1,}[.](jpg|jpeg|bmp|png|gif)";
				if (!Pattern.matches(six, pw)) {
					throw new Exception("¿Ã¹Ù¸£Áö¾Ê½À´Ï´Ù");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		
		
//		String[] address = {"°æ±âµµ ¼ö¿ø½Ã Àå¾È±¸ Á¤ÀÚµ¿","°æ±âµµ ¼ö¿ø½Ã Àå¾È±¸","°æ±âµµ ¼ö¿ø½Ã",
//	              "¼ö¿ø½Ã","°æ±âµµ"	};	
//		
//		String[] answer = {"[ÀÚ-£ ¤¸]","[ÀÚ-£ ¤¸]","[´Ù-‹L¤§]"};
		
	
		 
		while (true) {
			
			try {
				System.out.print("¿ìÆí¹øÈ£ °Ë»ö: ");
				String pw = sc.nextLine();

				String six = "[ÀÚ-£ ¤¸][ÀÚ-£ ¤¸][´Ù-‹L¤§]";
				if (!Pattern.matches(six, pw)) {
					throw new Exception("¿Ã¹Ù¸£Áö¾Ê½À´Ï´Ù");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		System.out.println("È¸¿ø°¡ÀÔ ¿Ï·á");


	}

}