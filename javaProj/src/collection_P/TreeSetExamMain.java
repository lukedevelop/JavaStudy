package collection_P;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

class TreeStud implements Comparable{
	//type : �Ϲ�(��,��,��), Ư���(��,��,��,��ü��)  ,  ��,   �̸�,  ����,   ����,   ���(����̾簡 -> ��������)
	String type, name, grade, gender, cutStr;
	int ban, tot, res, rank;
	int [] jum;
	public TreeStud(String name, String gender, int ban, int kor, int eng, int mat) {
		this("�� ��", ban,gender, name, kor,  eng,  mat);
	}
	
	public TreeStud(String name, String gender, int ban, int kor, int eng, int mat, int art) {
		this("Ư���", ban,gender, name, kor,  eng,  mat, art);
	}
	
	private TreeStud(String type, int ban, String gender, String name, int ...jum) {
		super();
		this.type = type;
		this.gender = gender;
		this.ban = ban;
		this.name = name;
		this.jum = jum;
		calc();
		
	}
	private void calc() {
		
		res = 0;
		tot = 0;
		
		double [] rate = {0.2,0.1,0.15,0.55};
		
		for (int i = 0; i < jum.length; i++) {
			tot += jum[i];
			if(type.equals("Ư���")) {
				res += jum[i]*rate[i];
			}
		}
		if(type.equals("�� ��")) {
			res += tot/jum.length;
		}
		
		grade = "��������������̿����".charAt(res/10)+"";
		
		cutStr = "���հ�";
		if((type.equals("�� ��") && res >= 70) || 
		   (type.equals("Ư���") && res >= 65)	
		  ) {
			cutStr = "�հ�";
		}
		
	}
	
	void rankCalc(int no, ArrayList arr) {
		rank = 1;
		for (Object object : arr) {
			
			TreeStud you = (TreeStud)object;
			boolean [] boArr = {
					type.equals(you.type) && res < you.res ,
					type.equals(you.type) && ban == you.ban && res < you.res,
					gender.equals(you.gender) && ban == you.ban && res < you.res,
					ban == you.ban && res < you.res,
					cutStr.equals(you.cutStr) && res < you.res
			};
			if(boArr[no]) {
				rank++;
			}
			
			/*
			switch(no) {
				case 0:
					if(type.equals(you.type) && res < you.res) {
						rank++;
					}
					break;
				case 1:
					if(type.equals(you.type) && ban == you.ban && res < you.res) {
						rank++;
					}
					break;
				case 2:
					if(gender.equals(you.gender) && ban == you.ban && res < you.res) {
						rank++;
					}
					break;
				case 3:
					//if(name.equals(you.name) && ban == you.ban && res < you.res) {
					if(ban == you.ban && res < you.res) {
						rank++;
					}
					break;
				case 4:
					if(cutStr.equals(you.cutStr) && res < you.res) {
						rank++;
					}
					break;
			}*/
		}
	}

	@Override
	public String toString() {
		String ttt =  type + "\t" + ban + "\t"+ gender + "\t" + name + "\t";
		
		for (int i : jum) {
			ttt+=  i +"\t";
		}
		
		if(type.equals("�� ��")) {
			ttt+=  "\t";
		}
	
		ttt+=  tot +"\t"+ res + "\t" + grade + "\t" + rank + "\t" + cutStr ;
		
		return ttt;
	}

	@Override
	public int compareTo(Object o) {
		
		TreeStud you = (TreeStud)o;
		
		int res = type.compareTo(you.type);
		
		if(res==0) {
			res = you.res - res;
		}
		if(res==0) {
			res = 1;
		}
		return res;
	}
}
/*
class TSExamCom implements Comparator{
	int no;
	
	public TSExamCom(int no) {
		super();
		this.no = no;
	}



	@Override
	public int compare(Object o1, Object o2) {
		TreeStud me = (TreeStud)o1;
		TreeStud you = (TreeStud)o2;
		
		int res = 0;
		
		switch(no) {
			case 0:
				res = me.type.compareTo(you.type);
				
				if(res==0) {
					res = you.res - me.res;
				}
				if(res==0) {
					res = 1;
				}
				break;
			case 1:
				res = me.type.compareTo(you.type);
				if(res==0) {
					res = me.ban - you.ban;
				}
				if(res==0) {
					res = you.res - me.res;
				}
				if(res==0) {
					res = 1;
				}
				break;
			case 2:
				res = me.ban - you.ban;
				
				if(res==0) {
					res = me.gender.compareTo(you.gender);
				}
				if(res==0) {
					res = you.res - me.res;
				}
				if(res==0) {
					res = 1;
				}
				break;
			case 3:
				res = me.ban - you.ban;
				
				if(res==0) {
					res = me.name.compareTo(you.name)*-1;
				}
				if(res==0) {
					res = you.res - me.res;
				}
				if(res==0) {
					res = 1;
				}
				break;
			case 4:
				res = you.cutStr.compareTo(me.cutStr);
				
				if(res==0) {
					res = you.res - me.res;
				}
				if(res==0) {
					res = 1;
				}
				break;
		}
		
		return res;
	}
	
}*/


public class TreeSetExamMain {

	public static void main(String[] args) {
		
		
		ArrayList dataArr = new ArrayList();
		dataArr.add(new TreeStud("������", "��", 2, 90, 95, 75));
		dataArr.add(new TreeStud("�躸��", "��", 2, 90, 75, 80));
		dataArr.add(new TreeStud("������", "��", 2, 65, 85, 80));
		dataArr.add(new TreeStud("�ڼ���", "��", 1, 85, 85, 60));
		dataArr.add(new TreeStud("�̽���", "��", 1, 75, 55, 74));
		dataArr.add(new TreeStud("�̽���", "��", 1, 55, 40, 75));
		dataArr.add(new TreeStud("������", "��", 1, 90, 100, 85, 95));
		dataArr.add(new TreeStud("���ֹ�", "��", 2, 75, 75, 60, 90));
		dataArr.add(new TreeStud("������", "��", 2, 70, 60, 70, 80));
		dataArr.add(new TreeStud("�ֹ���", "��", 1, 85, 80, 40, 65));
		dataArr.add(new TreeStud("Ȳ����", "��", 1, 60, 75, 40, 85));
		dataArr.add(new TreeStud("������", "��", 2, 50, 50, 45, 75));
		/*
		String [] title = {
				"1. type ��> ���(type_rank)",
				"2. type > �� > ���(type_class_rank) ",
				"3. �� > ������> ���(class_gen_rank) ",
				"4. ��>�̸�(��������)>���(�ݺ����)(class_name_rank)",
				"5. �հ� ĿƮ���� �հ����� : �Ϲ�:70, Ư��� : 65(type_PF)"
		};
		
		for (int i = 0; i < title.length; i++) {
			System.out.println(title[i]);
			TreeSet ts = new TreeSet(new TSExamCom(i));
			ts.addAll(dataArr);
			
			for (Object obj : ts) {
				((TreeStud)obj).rankCalc(i, dataArr);
				System.out.println(obj);
			}
		}*/
		
		
		System.out.println("1. type ��> ���(type_rank)");
		
		
		TreeSet ts0 = new TreeSet();
		ts0.addAll(dataArr);
		
		for (Object obj : ts0) {
			((TreeStud)obj).rankCalc(0, dataArr);
			System.out.println(obj);
		}
		/*
		System.out.println("2. type > �� > ���(type_class_rank) ");
		TreeSet ts1 = new TreeSet(new TSExamCom(1));
		ts1.addAll(dataArr);
		
		for (Object obj : ts1) {
			((TreeStud)obj).rankCalc(1, dataArr);
			System.out.println(obj);
		}
		
		System.out.println("3. �� > ������> ���(class_gen_rank) ");
		TreeSet ts2 = new TreeSet(new TSExamCom(2));
		ts2.addAll(dataArr);
		
		for (Object obj : ts2) {
			((TreeStud)obj).rankCalc(2, dataArr);
			System.out.println(obj);
		}
		
		System.out.println("4. ��>�̸�(��������)>���(�ݺ����)(class_name_rank)");
		TreeSet ts3 = new TreeSet(new TSExamCom(3));
		ts3.addAll(dataArr);
		
		for (Object obj : ts3) {
			((TreeStud)obj).rankCalc(3, dataArr);
			System.out.println(obj);
		}
		
		System.out.println("5. �հ� ĿƮ���� �հ����� : �Ϲ�:70, Ư��� : 65(type_PF)");
		TreeSet ts4 = new TreeSet(new TSExamCom(4));
		ts4.addAll(dataArr);
		
		for (Object obj : ts4) {
			((TreeStud)obj).rankCalc(4, dataArr);
			System.out.println(obj);
		}
		*/
		
	}

}
