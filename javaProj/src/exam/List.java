package exam;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		//56,78,92,45,78,25,77,94,77,56,83,85,56,45,72  --> ����̾簡 �������� ����� ������ �����ϼ���
        //�� ������ ��������(���� ������ �տ� ��ġ) �ϼ���
        
		int [] arr = {56,78,92,45,78,25,77,94,77,56,83,85,56,45,72};
		
		ArrayList su = new ArrayList();
		ArrayList wo = new ArrayList();
		ArrayList mi = new ArrayList();
		ArrayList yang = new ArrayList();
		ArrayList ga = new ArrayList();
		
		for(int i : arr) {
			System.out.println(i);
		if(i>90) {
			su.add(i);
		}else if(i>80) {
        	wo.add(i);
		}else if(i>70) {
			mi.add(i);
		}else if(i>60) {
			yang.add(i);
		}else {
			ga.add(i);
		}
			
  }
		Collections.reverse(su);
		System.out.println("��: "+su);
		Collections.reverse(wo);
		System.out.println("��: "+wo);
		Collections.reverse(mi);
		System.out.println("��: "+mi);
		Collections.reverse(yang);
		System.out.println("��: "+yang);
		Collections.reverse(ga);
		System.out.println("��: "+ga);
		
//�л� ����Ʈ�� �����Ͽ� ����ϼ���
// �л� ������ �������� �ԷµǾ� ����
//�հ� ���� : 70
//�л����� : ��, �̸�, ��, ��, ��, lol
//                               ex) 1��,��ö��,��86,��97,��88
// ����
//�ݺ� ����Ʈ       -> �հ�/ ���հ�      1��, �հ�,
//���� ����Ʈ                         ��,
//�ݼ��� ����Ʈ                        1��, �հ�, ��
//
// ��� ������� ������ ��               1��: ö��
		
	int [] jumsu = {70,65,84,46,93};
	
	
	ArrayList a = new ArrayList();
	ArrayList b = new ArrayList();
	ArrayList c = new ArrayList();
	
	for(int i : jumsu ) {
		System.out.println(i);
	if(i>70) {
		a.add(i);
		b.add(i);
		c.add(i);
		System.out.println("�հ�");
	}else {
		
		System.out.println("���հ�");
	}
	
	}

	//78.33333333333
	//7833.333333333
	//7833
	//7833.0
	//78.33
	
	
	double bb = 78.33333333333;
	double dd = bb*100;
	double ddd = (int)(bb*100);
	double dddd = (int)(bb*100);
	double ddddd = (double)(int)(bb*100)/100;
	
	System.out.println(bb);
	System.out.println(bb*100);
    System.out.println((int)(bb*100));
    System.out.println((double)7833);
    System.out.println((double)(int)(bb*100)/100);
	
    System.out.println(); 
	
    System.out.println(bb);
	System.out.println(dd);
	System.out.println(ddd);
	System.out.println();
	System.out.println(ddddd);
	
	
	
	
	
	
	
	}

}
