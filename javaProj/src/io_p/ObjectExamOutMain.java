package io_p;


import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

///�̸�, ��, ��, �� ���� ����� ���Ͽ� �����Ͻÿ�
	/// �̸�, ��, ��, ���� scanner �� �Է� �޾� ó��
	/// ó�� ���� ����, ���, ���
	/// ��� ���Ͽ��� ������ ������ ����Ͻÿ�

class ObjExam implements Serializable{
	private static final long serialVersionUID = 1267L;
	
	String name, grade;
	int [] jum = new int[3];
	int tot, avg;
	
	void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
		grade = "��������������̿����".charAt(avg/10)+"";
	}

	@Override
	public String toString() {
		//calc();
		return "ObjExam [name=" + name + ", jum=" + Arrays.toString(jum) + ", tot=" + tot + ", avg=" + avg + ", grade="
				+ grade + "]";
	}
	
	
}
public class ObjectExamOutMain {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		ObjExam oe = new ObjExam();
		
		System.out.print("�̸�:");
		oe.name = sc.next();
		System.out.print("����:");
		oe.jum[0] = sc.nextInt();
		System.out.print("����:");
		oe.jum[1] = sc.nextInt();
		System.out.print("����:");
		oe.jum[2] = sc.nextInt();
		oe.calc();
		//System.out.println(oe);
		FileOutputStream fos = new FileOutputStream("fff/objExam.qwe");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(oe);
		oos.close();
		fos.close();
	}

}
