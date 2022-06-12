package lang_p;

import java.util.Arrays;

public class StringMain {

	public static void main(String[] args) {
		
		String s1 = "장수풍뎅이";
		String s2 = "장수풍뎅이";
		String s3 = "사슴벌레";
		String s4 = new String("장수풍뎅이");
        char [] arr = {'장','수','풍','뎅','이'};
        String s5 = new String(arr);
        String s6 = s1;
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        
        System.out.println("s1==s2: "+(s1==s2));
        System.out.println("s1==s3: "+(s1==s3));
        System.out.println("s1==s4: "+(s1==s4));
        System.out.println("s1==s5: "+(s1==s5));
        System.out.println("s1==s6: "+(s1==s6));
        
        System.out.println("장수풍뎅이".length());
        
        System.out.println("s1.equals(s2): "+s1.equals(s2));
        System.out.println("s1.equals(s3): "+s1.equals(s3));
        System.out.println("s1.equals(s4): "+s1.equals(s4));
        System.out.println("s1.equals(s5): "+s1.equals(s5));
        System.out.println("s1.equals(s6): "+s1.equals(s6));
        
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println("장수풍뎅이");
        System.out.println("장수풍뎅이".toString());
        
        String ttt = "선생님 귀여워요 AbcD eF Java 만세 12a3a4";
       //              0123456789 0123456789 01234567890 
        System.out.println(ttt);
        System.out.println(ttt.length());   //배열의 길이
        System.out.println(ttt.charAt(5));
        System.out.println(ttt.substring(6,11)); //6 ->10
        System.out.println(ttt.substring(6));    // 6 -> 끝
        System.out.println(ttt.indexOf("a"));    // 앞부분 부터 찾아내는 것
        System.out.println(ttt.indexOf("a",19));
        System.out.println(ttt.indexOf("a",22));    
        System.out.println(ttt.lastIndexOf("a"));   //마지막 찾아내는 것
        System.out.println(ttt.indexOf("qwer"));    //없을경우 -1
        System.out.println(ttt.contains("a"));      // 참, 거짓을 알려줌
        System.out.println(ttt.contains("qwer"));
        
        System.out.println(ttt.startsWith("선생님"));
        System.out.println(ttt.startsWith("귀여워요"));
        System.out.println(ttt.endsWith("a3a4"));
        System.out.println(ttt.endsWith("선생님"));
        
        //qqq.www.erer.cvwfvw.txt.jpg.aabc.png  ---> 확장자가 무엇인지 확인하시오
        
        String ff = "qqq.www.erer.cvwfvw.txt.jpg.aabc.png ";
        int pos = ff.lastIndexOf(".");
        String exp = ff.substring(pos+1);
        System.out.println(exp);
        
        //sdfqwefwe@naver.com --> 아이디와 도메인을 분리하여 표시하세요.
        
        ff ="sdfqwefwe@naver.com";
        pos = ff.lastIndexOf("@");
        
        System.out.println(ff.substring(0,pos));
        System.out.println(ff.substring(pos+1));
        
        ff = "aaa,45,56,78";
        String[] qq = ff.split(",");
        System.out.println(qq[0]);
        System.out.println(qq[1]);
        System.out.println(qq[2]);
        System.out.println(qq[3]);
        System.out.println(Arrays.toString(qq));      
        
        ff = "아메리카노.아프리카노,아시아노+유럽노";
        qq = ff.split("[.,+]");
        System.out.println(qq[0]);
        System.out.println(qq[1]);
        System.out.println(qq[2]);
        System.out.println(qq[3]);
        System.out.println(Arrays.toString(qq));
        
        ttt = "선생님 귀여워요 AbcD eF Java 만세 12a3a4";
        System.out.println(ttt.toLowerCase());
        System.out.println(ttt.toUpperCase());
        
        System.out.println(ttt.replaceAll("a", "에이"));   // a 글자를 에이 글자로 바꾸겠다
        System.out.println("qwer".repeat(3));            // qwer 글자를 몇번 반복하겠냐  
        
        char [] arr2 = ttt.toCharArray();
        for(char c : arr2) {
        	System.out.println(c);
        }
        
        String [] arr3 = {"aa","bbb","c"};
        String ttt2 = String.join("-", arr3); // 하나로 합친다
        
        System.out.println(ttt2);
        
        String ttt3 = ttt2.concat("sdfwef");
        System.out.println(ttt3);		
        
        String ttt4 = "     그린 IT 아카 데미       ";  
        //               5                 7
        System.out.println(ttt4+":"+ttt4.length());
        System.out.println(ttt4.trim()+":"+ttt4.trim().length());       //trim 은  양쪽 빈칸 5,7칸을 제거해줌 "그린 IT 아카 데미" 만 남음
        
        
        
        
	}

}
