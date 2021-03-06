package util_p;

import java.util.regex.Pattern;

public class RegexMain {

	public static void main(String[] args) {
		System.out.println(Pattern.matches("장", "장동건"));    //.*"장" 으로 시작하는 모든문자열(기호포함)
		System.out.println(Pattern.matches("장.*", "장동건"));  //."장" 으로 시작하는 두자리만
		System.out.println(Pattern.matches("장.*", "장혁"));   //.*장.* 장을 포함한 모든문자열
		System.out.println(Pattern.matches("장.*", "최장군"));  // 장* 장으로만 되어있는 문자   ex)장*:장,장장장장장장장,장장,장장장,
	    	
		
		String [] mmArr= {"장동건","건","장서건","장혁","장남건","장3","장빈건",
                "장","장군","최장군","박장군","장군님","장장장장장장장","장장","고추장",
                "미란다커","키커","쌍피","계피","원두커피장군",
                "장장장","김앤장이다","현빈","원빈","미스터빈","커피빈","커피","원두커피","장희빈",
                "ㄱㄴㄷ","ㄱㄹㄴ","ㅐㅓㅣㅔㅐ","ㅐㅔㅓㅐㅑㅓ","ㄱㅓㅔㅔㅔㄹㄴ",
                "하하하","하호허","팉툍하","하학","하햐","가긱공국","짱쩡맨","쑥ㄴ밬","샹쏑쑗",
                "다","공석호","김희애",
                "나야비","나비야","농ㅂ왕창","장ㄴ비용솽",
                "너탈비털아붕니","너비아니","헤르너비아샹쵕",
                "123-456","1234-5678",
                "1234-5678-9012","123-5678-9012","12-5678-9012","12-568-9012",
                "123-678-9012","123-567833-9012","12-58-9012","1a",
                "abc","abc_def","1234","9846","ab_1234","ab1234",
                "aaa@aaa.aaa","aaaaaa.aaa@","aaa12aaa_aaa@",
                "ab56","AABB","aBCd","1","3","1234abc@aaa.aaa",
                "1234abc@aaa.a","1a2b","a12",
                "^","^^","12^34abc@aaa.aaa","1a2b^","^a12","123456.^",
                "\\^","^\\^",".^","\\^^",
                "1234abc@aaa.aa.va","1234abc@a.aa.a.a.va"};
		
	String [] ppArr = {"장","장.","장.*",".*장.*",".장.","장*",".*빈"   //.*빈 :"빈"으로 끝나는 문자들 ex)빈.*:현빈,원빈,미스터빈,커피빈,장희빈,
	                   ,".*빈건",".*(빈건)",".*(빈|건)",".*빈|건",".*[빈건]",".*[빈|건]"     //.*(빈|건) "빈","건" 
	                   ,".*(장군|커피)",".*[장군|커피]"         //".*(장군|커피)" 는 장군으로 끝나거나 커피로 끝나는 문자들
                       ,"\\d","\\d*","\\D*","\\W*"               //".*[장군|커피]" 는 장,군,장군,커,피,커피 로 끝나는 문자들이 다나옴
	                   ,"[0-9]","[0-9]*","[a-z]*","[A-Z]*","[A-Za-z0-9]*"  //"\\d" 숫자 한자리수 만 나옴,"\\d*" 숫자 ,"\\D" 숫자빼고 다나옴
	                   ,"[A-Za-z0-9]*@[A-Za-z0-9.]*"     //"[A-Za-z0-9]*@[A-Za-z0-9.]*" @도 포함 모든게나옴
	                   ,".{4}",".{3,}",".{3,5}"      //".{4}",".{3,}",".{3,5}": .{4}는 4글자만, .{3,}은 3글자부터 모두 .{3,5}는 3글자부터5글자
	                   ,"[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}"    //<-- 전화번호 만들때 사용
	                   ,"[^0-9]*","[0-9^]*","\\^*","[^^]*" //"[^0-9]*" : 0~9숫자를 제외하고 모든것,"\\^*" ^ 으로만 되어있는것들, "[0-9^]* 0~9숫자와^ 나옴
	                   ,"[ㄱ-ㅎ]*","[ㅏ-ㅣ]*","[가-힣]*","[ㄱ-ㅎㅏ-ㅣ가-힣]*"    //"[가-힣]*" : 한글 들만 나옴
	                   ,"[가-깋ㄱ]*",".*[나-닣ㄴ][바-빟ㅂ][아-잏ㅇ].*"//"[가-깋ㄱ]*" : ㄱ 포함만 찾고싶을때 , ".*[나-닣ㄴ][바-빟ㅂ][아-잏ㅇ].*" ㄴㅂㅎ 들어있는거 찾을때
	};                                                     //"\\W*" 영문 숫자 빼고 전부나옴
	for(String pp : ppArr) {                              //"[0-9]" 0부터 9 에서의 숫자만 나옴
		System.out.print(pp+":");                         //"[0-9]*","[a-z]*" 0~9,a~z 은 0~9,a~z 첫번째 자리만 같은 모든게나옴.
	}                                                  //"[A-Za-z0-9]*" A~Z,a~z,0~9 포함되어있는것들이 모두 나옴
		for(String mm : mmArr) {                          //^:제외 ex)[^0-9]* 은 0-9 숫자 를 제외하고 다나옴
			String pp;
			if(Pattern.matches(pp, mm)) {
			System.out.print(mm+",");
			}
		}
		
		System.out.println();
	}
		
		
		

	}

}
