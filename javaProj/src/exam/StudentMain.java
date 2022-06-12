package exam;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

class Student {
	
	int kor, eng, math, art; // 과목 점수
	boolean isSpecial; // 특기생 여부
	int classOfScholl; // 반
	String name, gender; // 이름, 성별
	int tot, avg; // 총점, 평균
	int grade; // 등수
	
	
	
	
	public Student(int kor, int eng, int math, int classOfSchool, String name, String gender) {
		isSpecial = false;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.classOfScholl = classOfSchool;
		this.name = name;
		this.gender = gender;
		this.grade = grade;
		cal();
	}
	
	public Student(int kor, int eng, int math, int art, int classOfSchool, String name, String gender) {
		isSpecial = true;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.art = art;
		this.classOfScholl = classOfSchool;
		this.name = name;
		this.gender = gender;
		cal();
		this.grade = grade;
	}
	
	void cal() {
		tot = kor + eng + math + art;
		
		if(art == 0) { 
			avg = tot / 3;
		} else {
			avg = tot / 4;
		}
	}

	@Override
	public String toString() {
		return (isSpecial ? "특기생" : "일반") + " " + classOfScholl + "반 " + name + " " + gender
				+ " 국어:" + kor + " 영어:" + eng + " 수학:" + math 
				+ (isSpecial ? (" 예체능:" + art) : "") + " 총점:" + tot + " 평균:" + avg + " 등수:" + grade;
	}

	
	
}	
	



public class StudentMain {
	

	

	public static void main(String[] args) {
        
		System.out.println("1반");
		System.out.println("일반학생");
	
		
		
	   
       
		
		

		
		
		
		
		
	}

}
