package exam;

import java.util.Set;
import java.util.TreeSet;
import java.util.Arrays;

class Student {
	
	int kor, eng, math, art; // ���� ����
	boolean isSpecial; // Ư��� ����
	int classOfScholl; // ��
	String name, gender; // �̸�, ����
	int tot, avg; // ����, ���
	int grade; // ���
	
	
	
	
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
		return (isSpecial ? "Ư���" : "�Ϲ�") + " " + classOfScholl + "�� " + name + " " + gender
				+ " ����:" + kor + " ����:" + eng + " ����:" + math 
				+ (isSpecial ? (" ��ü��:" + art) : "") + " ����:" + tot + " ���:" + avg + " ���:" + grade;
	}

	
	
}	
	



public class StudentMain {
	

	

	public static void main(String[] args) {
        
		System.out.println("1��");
		System.out.println("�Ϲ��л�");
	
		
		
	   
       
		
		

		
		
		
		
		
	}

}
