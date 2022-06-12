package Text_p;

import java.text.DecimalFormat;

public class DecimalMain {

	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat();
		double dd = (double)df.parse("123.456");
		
		System.out.println(dd);
		
		String ttt = df.format(44556677123.456789);  //.format: 3자리씩 끊어짐(소수점 뒤 3자리에선 반올림)
		System.out.println("ttt: "+ttt);
		
		df = new DecimalFormat("0");                // new DecimalFormat: 소수점이 사라짐
		ttt = df.format(44556677123.456789);  
		System.out.println(ttt);
		
		
		double [] ddArr = {
				1234,-1234,
				123456,11223344,-123456,11223344,
		        987654.99668877,-987654,99668877,
		        .1234567,-.1234567,
		        .987654,-.987654,0
		};
		
		String [] ppArr = {
			  "0","000000000","#","#####","#####00000",   //"#0#0#0#0#0","0000000#####" 안댐 
			  "0.000",".000000000000","###########"                     //"000000":0이채워짐 ,#: "0"이랑 같음, "###": 0이안나옴
			  ,"#.000","#,###","#,##","#@###","안녕0000"                   //"#.###" : 천단위로 끊어줌, "#,##":두자리씩 끊어짐
			  ,"#,##0%"                            //"#,##0%": *100 을 해줌
			  ,"#,##0;00000000","양수#,##0.00;음수000000000000"    //;: 뒤로는 의미가 없음(음수표시?)  ,"양수#,##0.00;음수000000000000" :;뒤 음수000 은 앞에 숫자의 규칙을 따라감
			  ,"▲#,##0.00;▼#"
		};
		
		for (String pp : ppArr) {
			System.out.println(pp+">>>>>>");
			df = new DecimalFormat(pp);
			for (double d : ddArr) {
				System.out.println(d+" : "+df.format(d));    //0:소수점이 안나옴 0.12345 = 0, 0.987654 = 1 (음수도 같음)
			}
		}
		
		//int [] jum = {67,78,89,98,76,54,78,77,90,56};
		//점수가 70점 이상이면▲, 미만이면▼로 표시해 주세요.
		//if,switch,3항연산자등 조건문 사용하지 말것
		
		df = new DecimalFormat("▲#;▼#");
		
		int [] jum = {67,78,89,98,76,54,78,77,90,56};
		
		for(int i : jum) {
			System.out.println(i+","+df.format(i-70).charAt(0));  //.charAt(0) 왜??
		}
		
		
	}

}
