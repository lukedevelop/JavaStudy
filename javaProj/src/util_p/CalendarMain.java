package util_p;

import java.util.Calendar;
public class CalendarMain {

	
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		System.out.println(today);
		System.out.println(today.get(1));
		System.out.println(today.get(Calendar.YEAR));      // "�⵵"
		System.out.println(today.get(Calendar.MONTH)+1);     // "��" : ���� �� +1
		System.out.println(today.get(Calendar.DATE));        // "��"
		System.out.println(today.get(Calendar.DAY_OF_YEAR));  //���� �̾� �����ΰ�
		System.out.println(today.get(Calendar.DAY_OF_WEEK));    //���� �����ΰ�  0:�� 1:�� 2:ȭ ....
		
		System.out.println(today.get(Calendar.WEEK_OF_YEAR));   //���� ���° �� �ΰ�
		System.out.println(today.get(Calendar.WEEK_OF_MONTH));   // �̹��� ���° �� �ΰ�
		
		System.out.println(today.get(Calendar.AM_PM));  // 0:���� 1:���� 
		System.out.println(today.get(Calendar.HOUR));   // 12�ð� ���� 4��
		System.out.println(today.get(Calendar.HOUR_OF_DAY)); //24�� ���� 16��
		System.out.println(today.get(Calendar.MINUTE));    //��
		System.out.println(today.get(Calendar.SECOND));    //��
		System.out.println(today.get(Calendar.MILLISECOND));  //1000���� 1��
	
		
//		//��� ��� 1984 �� 3 �� 20 �� (������) 13:34:56.789
//		
//		String[] str = "��,��,ȭ,��,��,��,��".split(",");
//		
//		Calendar today = Calendar.getInstance();
//		
//		System.out.print(today.get(1)-38+" �� ");
//		System.out.print(today.get(Calendar.MONTH)+ 2 +" �� ");
//		System.out.print(today.get(Calendar.DATE)+ 11 +" �� (");
//		System.out.print((str[3]) + "����) ");
////		System.out.print(today.get(Calendar.DAY_OF_WEEK)+"����) ");
//		System.out.print(today.get(Calendar.HOUR_OF_DAY) - 3 + ":");
//		System.out.print(today.get(Calendar.MINUTE) + 17 + ":");
//		System.out.print(today.get(Calendar.SECOND) + ".");
//		System.out.println(today.get(Calendar.MILLISECOND));	
		
		
		
		
		

		///// ��� ��� 1984 �� 3 �� 20�� (������) 13:34:56.789
		calToStr(today);
		
		String[] str =  "��,��,ȭ,��,��,��,��".split(",") ;
		
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
		System.out.println(today.getActualMaximum(Calendar.DATE));  //�̹��� �� 30 
		
		System.out.println(today.getTimeInMillis());
		System.out.println(today.getTimeInMillis()/1000/60/60/24/365+1970);
		
		today.setTimeInMillis(0);
		calToStr(today);
		
		//ȭ���Ϻ��� �����̶� �� 2ĭ�� ������� ,��������� Ȯ���ϰ� 7 �Ͼ� �ٹٲ� �ؾ���
	}
	
	static void calToStr(Calendar day) {
		String res = day.get(Calendar.YEAR) +"�� ";
		res += day.get(Calendar.MONTH)+1 +"�� ";
		res += day.get(Calendar.DATE) +"�� (";
		res += " �Ͽ�ȭ�������".charAt(day.get(Calendar.DAY_OF_WEEK)) +"����) ";
		res += day.get(Calendar.HOUR_OF_DAY) +":";
		res += day.get(Calendar.MINUTE) +":";
		res += day.get(Calendar.SECOND) +".";
		res += day.get(Calendar.MILLISECOND);
		
		System.out.println(res);
	}

}
