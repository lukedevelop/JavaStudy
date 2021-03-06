package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class SignUpMain {

	public static void main(String[] args) {
		
		
		// 과제
		//// 회원 가입 유효성 검사를 실시하세요
//		1. 아이디 : 영문 숫자 조합
//		2. 비번 , 비번확인 
//		3. 이메일  -  아이디:영문,숫자   @  도메인 : 영문 점
//		4. 전화번호 - 숫자 :  ###-####-####,   ##(#)-###-####
//		5. 이름 (한글만 가능)
//		6. 주민번호 
//		7. 사진 첨부-->영문,숫자.이미지 확장자
//		이미지(jpg, jpeg, bmp, png, gif)  --  대소문자 구분없음
//		8. 우편번호 검색 - 구단위 (초성검색)
//	    (ㄱㅈ,광ㅈ,ㄱ진,진,ㅈ,ㄱ,광) 검색되어 나와야함
//		예외처리로 처리할 것
		Scanner sc = new Scanner(System.in);

		while (true) {

			try {
				System.out.print("아이디: ");
				String id = sc.nextLine();

				String one = "[a-zA-Z0-9]{3,}";
				if (!Pattern.matches(one, id)) {
					throw new Exception("영문과 숫자만 입력하시오.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("비밀번호: ");
				String pw = sc.nextLine();

				String two = "[a-zA-Z0-9]{6,}";
				if (!Pattern.matches(two, pw)) {
					throw new Exception("영문과 숫자 6자리 이상 입력하시오.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		while (true) {

			try {
				System.out.print("전화번호: ");
				String pn = sc.nextLine();

				String three = "[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}";
				if (!Pattern.matches(three, pn)) {
					throw new Exception("전화번호를 입력하시오");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("이름: ");
				String pw = sc.nextLine();

				String four = "[가-힣]{2,}";
				if (!Pattern.matches(four, pw)) {
					throw new Exception("한글만 입력하시오.");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		while (true) {

			try {
				System.out.print("주민번호: ");
				String pw = sc.nextLine();

				String five = "[0-9]{6}-[0-9]{7}";
				if (!Pattern.matches(five, pw)) {
					throw new Exception("올바르지않습니다");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}

		while (true) {

			try {
				System.out.print("사진첨부: ");
				String pw = sc.nextLine();

				String six = ".{1,}[.](jpg|jpeg|bmp|png|gif)";
				if (!Pattern.matches(six, pw)) {
					throw new Exception("올바르지않습니다");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		
		
//		String[] address = {"경기도 수원시 장안구 정자동","경기도 수원시 장안구","경기도 수원시",
//	              "수원시","경기도"	};	
//		
//		String[] answer = {"[자-짛ㅈ]","[자-짛ㅈ]","[다-딯ㄷ]"};
		
	
		 
		while (true) {
			
			try {
				System.out.print("우편번호 검색: ");
				String pw = sc.nextLine();

				String six = "[자-짛ㅈ][자-짛ㅈ][다-딯ㄷ]";
				if (!Pattern.matches(six, pw)) {
					throw new Exception("올바르지않습니다");
				}
				break;

			} catch (Exception e) {
				System.out.println(e.getMessage());

			}
		}
		System.out.println("회원가입 완료");


	}

}