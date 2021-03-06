package exam;

import java.util.regex.Pattern;
import java.util.Scanner;

public class Email {

	public static void main(String[] args) {

		// 이메일을 검사하세요

//		ex)abcd123@aaaaa.bb.cc
//
//		     아이디   도메인

		// 1. @가 1개만 있어야 한다---> @를 기준으로 아이디, 도메인이 분리

		// 2. 아이디는 영문, 숫자로만 구성, 5글자 이상

		// 3. 도메인은 . 갯수가 1,2 이어야 하며

		// 1개 : 기관명. 기관종류 daum.net

		// 2개 : 기관명. 기관종류.국가 yahoo.co.kr

		// 단, 기관종류, 국가명은 특정 값은 없는 걸로 인지(영문 소문자이면 가능)

		// 기관명은 영문, 숫자가능, 4자 이상

//		System.out.println("이메일을 검사하시오.");
//        String [] email = {"abcd123@aaaaa.bb.cc","abcd123","aaaaa.bb.cc"
//        		           ,"daum.net","yahoo.co.kr","gingerboy.co.au"
//             	
//        };
//		
//        String [] chk = {"[a-z0-9]*@[a-z0-9.]*","[a-z0-9]*","[a-z.]*",
//        		          
//        		
//        };
//        
//        for(String cc : chk) {
//        	System.out.print(cc+":");
//        for(String ee : email ) {
//        	if(Pattern.matches(cc, ee)) {
//        		System.out.print(ee+",");
//        	}
//        }
//        System.out.println();
//        }

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

				String six = "[a-zA-Z0-9]{1,}.[a-zA-z]{3,4}";
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
	}

}
