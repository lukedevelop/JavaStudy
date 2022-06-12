package Text_p;

import java.text.DecimalFormat;

public class DecimalMain {

	public static void main(String[] args) throws Exception {
		DecimalFormat df = new DecimalFormat();
		double dd = (double)df.parse("123.456");
		
		System.out.println(dd);
		
		String ttt = df.format(44556677123.456789);  //.format: 3�ڸ��� ������(�Ҽ��� �� 3�ڸ����� �ݿø�)
		System.out.println("ttt: "+ttt);
		
		df = new DecimalFormat("0");                // new DecimalFormat: �Ҽ����� �����
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
			  "0","000000000","#","#####","#####00000",   //"#0#0#0#0#0","0000000#####" �ȴ� 
			  "0.000",".000000000000","###########"                     //"000000":0��ä���� ,#: "0"�̶� ����, "###": 0�̾ȳ���
			  ,"#.000","#,###","#,##","#@###","�ȳ�0000"                   //"#.###" : õ������ ������, "#,##":���ڸ��� ������
			  ,"#,##0%"                            //"#,##0%": *100 �� ����
			  ,"#,##0;00000000","���#,##0.00;����000000000000"    //;: �ڷδ� �ǹ̰� ����(����ǥ��?)  ,"���#,##0.00;����000000000000" :;�� ����000 �� �տ� ������ ��Ģ�� ����
			  ,"��#,##0.00;��#"
		};
		
		for (String pp : ppArr) {
			System.out.println(pp+">>>>>>");
			df = new DecimalFormat(pp);
			for (double d : ddArr) {
				System.out.println(d+" : "+df.format(d));    //0:�Ҽ����� �ȳ��� 0.12345 = 0, 0.987654 = 1 (������ ����)
			}
		}
		
		//int [] jum = {67,78,89,98,76,54,78,77,90,56};
		//������ 70�� �̻��̸��, �̸��̸��� ǥ���� �ּ���.
		//if,switch,3�׿����ڵ� ���ǹ� ������� ����
		
		df = new DecimalFormat("��#;��#");
		
		int [] jum = {67,78,89,98,76,54,78,77,90,56};
		
		for(int i : jum) {
			System.out.println(i+","+df.format(i-70).charAt(0));  //.charAt(0) ��??
		}
		
		
	}

}
