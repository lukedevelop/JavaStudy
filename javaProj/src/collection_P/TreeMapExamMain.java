package collection_P;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/*
��, ����,  �̸�,  ����,   ����,   ���(����̾簡 -> ��������)
�� > ���� > ���
�ε����� Ȯ��

TreeMap
  k       v
  ��		TreeMap
  		k      v
          ����    TreeSet 
                  �л��ν��Ͻ�
  
��1(��)

	key       value
	1		TreeMap
			key value
			��	TreeSet -> �л���
			��

	2
*/

class TMStud implements Comparable{
	String gender, name; 
	int ban, tot, avg, rank;
	int [] jum;
	public TMStud(int ban, String gender, String name, int kor, int eng, int mat) {
		super();
		this.ban = ban;
		this.gender = gender;
		this.name = name;
		jum = new int[] {kor, eng, mat};
		calc();
	}
	
	private void calc() {
		tot = 0;
		for (int i : jum) {
			tot += i;
		}
		avg = tot/jum.length;
	}

	@Override
	public int compareTo(Object o) {
		TMStud you = (TMStud)o;
		int res = you.avg - avg;
		if(res==0) {
			res = 1;
		}
		return res;
	}

	@Override
	public String toString() {
		return ban + "\t" + gender + "\t" + name + "\t" + Arrays.toString(jum)
				+ "\t" + tot + "\t" + avg + "\t" + rank;
	}
	
	void rankCalc(Set set) {
		rank = 1;
		for (Object object : set) {
			TMStud you = (TMStud)object;
			if(you.avg > avg) {
				rank++;
			}
		}
	}
	
}


public class TreeMapExamMain {

	public static void main(String[] args) {
		TMStud [] studs = {
				
				new TMStud(5, "��", "����", 67,78,82),
				new TMStud(1, "��", "����", 77,88,92),
				new TMStud(3, "��", "����", 57,48,32),
				new TMStud(3, "��", "����", 7,18,22),
				new TMStud(2, "������", "���", 17,28,32),
				new TMStud(1, "��", "�����", 27,58,82),
				new TMStud(1, "������", "������", 17,48,72),
				new TMStud(5, "��", "Ŀ�Ǻ�", 37,68,92),
				new TMStud(1, "��", "�ֺ�", 17,48,62),
				new TMStud(3, "��", "�ͺ�", 77,78,72),
				new TMStud(3, "��", "�̽��ͺ�", 87,88,82),
				new TMStud(2, "��", "�̽���", 97,98,92),
				new TMStud(2, "��", "���Ϻ�", 87,88,72),
				new TMStud(1, "��", "��", 57,68,62)
		};
		
		
		//TreeSet m = new TreeSet();
		//TreeSet f = new TreeSet();
		
		//TreeMap map = new TreeMap();
		//TreeMap map2 = new TreeMap();
		//TreeMap map3 = new TreeMap();
		
		TreeMap banMap = new TreeMap();
		//banMap.put(1, new TreeMap());
		//banMap.put(2, new TreeMap());
		//banMap.put(3, new TreeMap());
		//banMap.put(1, map);
		//banMap.put(2, map2);
		//banMap.put(3, map3);
		
		//map.put("��",  new TreeSet());
		//map.put("��",  new TreeSet());
		
		for (TMStud st : studs) {
			
			//System.out.println(st.gender+":"+map.containsKey(st.gender));

			//TreeSet ts = (TreeSet)map.get(st.gender);
			//ts.add(st);
			
			/*
			if(st.gender.equals("��")) {
				m.add(st);
			}else {
				f.add(st);
			}*/
			/*
			if(st.ban==1) {
			
			//	if(!map.containsKey(st.gender)) {
			//		map.put(st.gender,  new TreeSet());
			//	}
				
			//	((TreeSet)map.get(st.gender)).add(st);
				
			}else if(st.ban==2) {
			
			//	if(!map2.containsKey(st.gender)) {
			//		map2.put(st.gender,  new TreeSet());
			//	}
				
			//	((TreeSet)map2.get(st.gender)).add(st);
				
			}else if(st.ban==3) {
				
			//	if(!map3.containsKey(st.gender)) {
			//		map3.put(st.gender,  new TreeSet());
			//	}
				
			//	((TreeSet)map3.get(st.gender)).add(st);
			} */
			
			if(!banMap.containsKey(st.ban)) {
				banMap.put(st.ban,  new TreeMap());
			}
			TreeMap tm = (TreeMap)banMap.get(st.ban);
			
			if(!tm.containsKey(st.gender)) {
				tm.put(st.gender,  new TreeSet());
			}
			
			((TreeSet)tm.get(st.gender)).add(st);
			
			//((TreeSet)((TreeMap)banMap.get(st.ban)).get(st.gender)).add(st);
			
		}
		
		
		///////////////////////////////
		/*
		for (Object oo : m) {
			
			TMStud st = (TMStud)oo;
			st.rankCalc(m);
			System.out.println(st);
		}
		
		for (Object oo : f) {
			
			TMStud st = (TMStud)oo;
			st.rankCalc(f);
			System.out.println(st);
		}*/
		
		for (Object obj : banMap.entrySet()) {
			Map.Entry bbMet = (Map.Entry)obj;
		
			System.out.println("[[["+bbMet.getKey()+"��]]]");
			
			for (Object object : ((TreeMap)bbMet.getValue()).entrySet()) {
				Map.Entry met = (Map.Entry)object;
				System.out.println("\t"+met.getKey()+">>>");
				
				TreeSet ts = (TreeSet)met.getValue();
				
				for (Object oo : ts) {
					
					TMStud st = (TMStud)oo;
					st.rankCalc(ts);
					System.out.println(st);
				}
			}
		}

		/*
		System.out.println("gsdfhjfkhqfekqhkfwqhkwfhfwk");
		
		
		
		
		
		System.out.println(2);
		for (Object object : map2.entrySet()) {
			Map.Entry met = (Map.Entry)object;
			System.out.println("\t"+met.getKey()+">>>");
			
			TreeSet ts = (TreeSet)met.getValue();
			
			for (Object oo : ts) {
				
				TMStud st = (TMStud)oo;
				st.rankCalc(ts);
				System.out.println(st);
			}
		}
		
		System.out.println(3);
		for (Object object : map3.entrySet()) {
			Map.Entry met = (Map.Entry)object;
			System.out.println("\t"+met.getKey()+">>>");
			
			TreeSet ts = (TreeSet)met.getValue();
			
			for (Object oo : ts) {
				
				TMStud st = (TMStud)oo;
				st.rankCalc(ts);
				System.out.println(st);
			}
		}
		*/

	}

}
