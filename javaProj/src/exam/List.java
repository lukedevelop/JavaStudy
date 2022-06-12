package exam;

import java.util.ArrayList;
import java.util.Collections;

public class List {

	public static void main(String[] args) {
		//56,78,92,45,78,25,77,94,77,56,83,85,56,45,72  --> 수우미양가 구간으로 나누어서 점수를 정렬하세요
        //각 구간은 내림차순(높은 점수가 앞에 위치) 하세요
        
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
		System.out.println("수: "+su);
		Collections.reverse(wo);
		System.out.println("우: "+wo);
		Collections.reverse(mi);
		System.out.println("미: "+mi);
		Collections.reverse(yang);
		System.out.println("양: "+yang);
		Collections.reverse(ga);
		System.out.println("가: "+ga);
		
//학생 리스트를 정리하여 출력하세요
// 학생 정보는 무작위로 입력되어 있음
//합격 점수 : 70
//학생정보 : 반, 이름, 국, 영, 수, lol
//                               ex) 1반,김철수,국86,영97,수88
// 정리
//반별 리스트       -> 합격/ 불합격      1반, 합격,
//성별 리스트                         남,
//반성별 리스트                        1반, 합격, 남
//
// 등수 순서대로 정리할 것               1등: 철수
		
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
		System.out.println("합격");
	}else {
		
		System.out.println("불합격");
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
