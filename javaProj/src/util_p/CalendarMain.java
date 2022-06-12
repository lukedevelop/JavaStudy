package util_p;

import java.util.Calendar;
public class CalendarMain {

	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.get(1));
		System.out.println(today.get(Calendar.YEAR));      // "년도"
		System.out.println(today.get(Calendar.MONTH)+1);     // "월" : 실제 월 +1
		System.out.println(today.get(Calendar.DATE));        // "일"
		System.out.println(today.get(Calendar.DAY_OF_YEAR));  //올해 이어 몇일인가
		System.out.println(today.get(Calendar.DAY_OF_WEEK));    //무슨 요일인가  0:일 1:월 2:화 ....
		
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));   //올해 몇번째 주 인가
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));   // 이번달 몇번째 주 인가
		
		System.out.println(today.get(Calendar.AM_PM));  // 0:오전 1:오후 
		System.out.println(today.get(Calendar.HOUR));   // 12시간 기준 4시
		System.out.println(today.get(Calendar.HOUR_OF_DAY)); //24시 기준 16시
		System.out.println(today.get(Calendar.MINUTE));    //분
		System.out.println(today.get(Calendar.SECOND));    //초
		System.out.println(today.get(Calendar.MILLISECOND));  //1000분의 1초
	
		
//		//출력 방식 1984 년 3 월 20 일 (수요일) 13:34:56.789
//		
//		String[] str = "일,월,화,수,목,금,토".split(",");
//		
//		Calendar today = Calendar.getInstance();
//		
//		System.out.print(today.get(1)-38+" 년 ");
//		System.out.print(today.get(Calendar.MONTH)+ 2 +" 월 ");
//		System.out.print(today.get(Calendar.DATE)+ 11 +" 일 (");
//		System.out.print((str[3]) + "요일) ");
////		System.out.print(today.get(Calendar.DAY_OF_WEEK)+"요일) ");
//		System.out.print(today.get(Calendar.HOUR_OF_DAY) - 3 + ":");
//		System.out.print(today.get(Calendar.MINUTE) + 17 + ":");
//		System.out.print(today.get(Calendar.SECOND) + ".");
//		System.out.println(today.get(Calendar.MILLISECOND));	
		
		
		
		
		

		///// 출력 방식 1984 년 3 월 20일 (수요일) 13:34:56.789
		calToStr(today);
		
		String[] str =  "일,월,화,수,목,금,토".split(",") ;
		
		today.set(Calendar.YEAR, 2002);
		calToStr(today);
		today.set(2002,6-1,3);
		calToStr(today);
		today.set(2002,6-1,3,9,35);
		calToStr(today);
		today.set(1985,3-1,20,14,23,45);
		calToStr(today);
		
		today.set(Calendar.MONTH, -5-1);
		calToStr(today);
		today.set(2002,6-1,3);
		calToStr(today);
		today.set(2002,-7-1,500,50,-200);
		calToStr(today);
		today.add(Calendar.MONTH, 2);
		calToStr(today);
		
		System.out.println(today.getActualMaximum(Calendar.YEAR));
		System.out.println(today.getActualMaximum(Calendar.MONTH));
		System.out.println(today.getActualMaximum(Calendar.DATE));
		today.set(Calendar.MONTH, 2-1);
		calToStr(today);
		System.out.println(today.getActualMaximum(Calendar.DATE));  //이번달 끝 30 
		
		System.out.println(today.getTimeInMillis());
		System.out.println(today.getTimeInMillis()/1000/60/60/24/365+1970);
		
		today.setTimeInMillis(0);
		calToStr(today);
		
		//화요일부터 시작이라 앞 2칸을 비워야함 ,토욜인이지 확인하고 7 일씩 줄바꿈 해야함
	}
	
	static void calToStr(Calendar day) {
		String res = day.get(Calendar.YEAR) +"년 ";
		res += day.get(Calendar.MONTH)+1 +"월 ";
		res += day.get(Calendar.DATE) +"일 (";
		res += " 일월화수목금토".charAt(day.get(Calendar.DAY_OF_WEEK)) +"요일) ";
		res += day.get(Calendar.HOUR_OF_DAY) +":";
		res += day.get(Calendar.MINUTE) +":";
		res += day.get(Calendar.SECOND) +".";
		res += day.get(Calendar.MILLISECOND);
		
		System.out.println(res);
	}

}
