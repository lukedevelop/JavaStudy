package lang_p;

import java.util.Arrays;

public class StringMain {

	public static void main(String[] args) {
		
		String s1 = "���ǳ����";
		String s2 = "���ǳ����";
		String s3 = "�罿����";
		String s4 = new String("���ǳ����");
        char [] arr = {'��','��','ǳ','��','��'};
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
        
        System.out.println("���ǳ����".length());
        
        System.out.println("s1.equals(s2): "+s1.equals(s2));
        System.out.println("s1.equals(s3): "+s1.equals(s3));
        System.out.println("s1.equals(s4): "+s1.equals(s4));
        System.out.println("s1.equals(s5): "+s1.equals(s5));
        System.out.println("s1.equals(s6): "+s1.equals(s6));
        
        System.out.println(s1);
        System.out.println(s1.toString());
        System.out.println("���ǳ����");
        System.out.println("���ǳ����".toString());
        
        String ttt = "������ �Ϳ����� AbcD eF Java ���� 12a3a4";
       //              0123456789 0123456789 01234567890 
        System.out.println(ttt);
        System.out.println(ttt.length());   //�迭�� ����
        System.out.println(ttt.charAt(5));
        System.out.println(ttt.substring(6,11)); //6 ->10
        System.out.println(ttt.substring(6));    // 6 -> ��
        System.out.println(ttt.indexOf("a"));    // �պκ� ���� ã�Ƴ��� ��
        System.out.println(ttt.indexOf("a",19));
        System.out.println(ttt.indexOf("a",22));    
        System.out.println(ttt.lastIndexOf("a"));   //������ ã�Ƴ��� ��
        System.out.println(ttt.indexOf("qwer"));    //������� -1
        System.out.println(ttt.contains("a"));      // ��, ������ �˷���
        System.out.println(ttt.contains("qwer"));
        
        System.out.println(ttt.startsWith("������"));
        System.out.println(ttt.startsWith("�Ϳ�����"));
        System.out.println(ttt.endsWith("a3a4"));
        System.out.println(ttt.endsWith("������"));
        
        //qqq.www.erer.cvwfvw.txt.jpg.aabc.png  ---> Ȯ���ڰ� �������� Ȯ���Ͻÿ�
        
        String ff = "qqq.www.erer.cvwfvw.txt.jpg.aabc.png ";
        int pos = ff.lastIndexOf(".");
        String exp = ff.substring(pos+1);
        System.out.println(exp);
        
        //sdfqwefwe@naver.com --> ���̵�� �������� �и��Ͽ� ǥ���ϼ���.
        
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
        
        ff = "�Ƹ޸�ī��.������ī��,�ƽþƳ�+������";
        qq = ff.split("[.,+]");
        System.out.println(qq[0]);
        System.out.println(qq[1]);
        System.out.println(qq[2]);
        System.out.println(qq[3]);
        System.out.println(Arrays.toString(qq));
        
        ttt = "������ �Ϳ����� AbcD eF Java ���� 12a3a4";
        System.out.println(ttt.toLowerCase());
        System.out.println(ttt.toUpperCase());
        
        System.out.println(ttt.replaceAll("a", "����"));   // a ���ڸ� ���� ���ڷ� �ٲٰڴ�
        System.out.println("qwer".repeat(3));            // qwer ���ڸ� ��� �ݺ��ϰڳ�  
        
        char [] arr2 = ttt.toCharArray();
        for(char c : arr2) {
        	System.out.println(c);
        }
        
        String [] arr3 = {"aa","bbb","c"};
        String ttt2 = String.join("-", arr3); // �ϳ��� ��ģ��
        
        System.out.println(ttt2);
        
        String ttt3 = ttt2.concat("sdfwef");
        System.out.println(ttt3);		
        
        String ttt4 = "     �׸� IT ��ī ����       ";  
        //               5                 7
        System.out.println(ttt4+":"+ttt4.length());
        System.out.println(ttt4.trim()+":"+ttt4.trim().length());       //trim ��  ���� ��ĭ 5,7ĭ�� �������� "�׸� IT ��ī ����" �� ����
        
        
        
        
	}

}
