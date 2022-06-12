package collection_P;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

//mp3 �뷡��⸦ �����ϼ���
//1. �뷡 ���� :  Ʈ����ȣ, �뷡����, ����
//2. �뷡 ����Ʈ -->next �� �ֱ�
//3. �������� ������, ������, Ʈ����ȣ
//---------------------------------------------------------------------------------------------------------
//�˻������ �����ϼ���
//1. �������� �˻�
//2. ���� Ʈ�� ���ĺ��� �˻�
//3. ����, ������ �����Ͽ� �˻�
//---  ���� �˻������� ���� ��� 
//       1. ���� Ʈ�� �ٷ� ���� ������ ������ �̵�
//       2. �˻��� �뷡 ������ �����ְ� Ʈ����ȣ�� �Է��Ͽ� �����Ͽ� �̵�
class StMusic{
	int no;
	String title, singer;
	public StMusic(String title, String singer) {
		this.title = title;
		this.singer = singer;
	}
	@Override
	public String toString() {
		return "[" + no + ", " + title + "(" + singer + ") ]";
	}
	
}

class StMP3{
	StMusic now = null;
	Stack back = new Stack();
	Stack next = new Stack();
	
	public StMP3(StMusic ...arr) {
		
		for (int i = arr.length-1; i>=0 ; i--) {
			arr[i].no = i+1;
			//System.out.println(i+":"+arr[i]);
			next.push(arr[i]);
		}
		
	}
	
	void ppp() {
		System.out.println("����:"+now);
		System.out.println("����:"+back);
		System.out.println("����:"+next);
	}
	
	void goNext() {
		System.out.println("goNext()-------------------");
		if(next.empty()) {
			System.out.println("������ ���Դϴ�.");
			return;
		}
		nextModule();
		
		ppp();
	}
	
	
	
	
	void goBack() {
		System.out.println("goBack()-------------------");
		if(back.empty()) {
			System.out.println("ó�� ���Դϴ�.");
			return;
		}
		backModule();
		
		ppp();
	}
	
	void nextModule() {
		if(now!=null) {
			back.push(now);
		}
		
		now=(StMusic)next.pop();
	}
	
	void backModule() {
		if(now!=null) {
			next.push(now);
		}
		
		now=(StMusic)back.pop();
	}
	void trackModule(int no) {
		while(now.no!=no) {
			if(now.no>no) {
				backModule();
			}
			if(now.no<no) {
				nextModule();
			}
		}
	}
	
	void goTrack(int no) {
		System.out.println("goTrack("+no+")-------------------");
		/*
		if(now.no>no) {
			while(now.no!=no) {
				backModule();
			}	
		}
		if(now.no<no) {
			while(now.no!=no) {
				nextModule();
			}
		}*/
		
		trackModule(no);
		
		ppp();
	}
	
	
	void search(int kind,String ttt) {
		String kindStr = "����,����".split(",")[kind];
		System.out.println("search("+kindStr+"->"+ttt+")-------------------");
		
		int nowNo = now.no;
		String pp = ".*"+ttt+".*";
		
		boolean sch = true;
		
		while(!next.empty()) {
			nextModule();
			String val = now.title;
			if(kind==1)
				val =  now.singer;
			if(Pattern.matches(pp, val)) {
				sch = false;
				break;
			}
		}
		if(sch) {
			while(!back.empty()) {
				backModule();
			}
			
			while(nowNo >= now.no) {
				
				String val = now.title;
				if(kind==1)
					val =  now.singer;
				if(Pattern.matches(pp, val)) {
					sch = false;
					break;
				}
				nextModule();
			}
		}
		if(sch) {
			System.out.println(kindStr+":\""+ttt+"\" �˻������ �����ϴ�.");
		}
		ppp();
	}
	
	
	
	void search2(int kind,String ttt) {
		String kindStr = "����,����".split(",")[kind];
		System.out.println("search2("+kindStr+"->"+ttt+")-------------------");
		
		int nowNo = now.no;
		String pp = ".*"+ttt+".*";
		
		
		
		ArrayList res = new ArrayList();
		
		while(!next.empty()) {
			nextModule();
			String val = now.title;
			if(kind==1)
				val =  now.singer;
			if(Pattern.matches(pp, val)) {
				res.add(now);
				
			}
		}
		
		while(!back.empty()) {
				backModule();
		}
			
		while(nowNo >= now.no) {
				
			String val = now.title;
			if(kind==1)
				val =  now.singer;
			if(Pattern.matches(pp, val)) {
				res.add(now);	
			}
			nextModule();
		}
		
		if(res.size()==0) {
			System.out.println(kindStr+":\""+ttt+"\" �˻������ �����ϴ�.");
		}else if(res.size()==1) {
			trackModule( ((StMusic)res.get(0)).no   );
		}else {
			System.out.println(kindStr+":\""+ttt+"\" �˻���� =>"+res);
			System.out.print("��ȣ ����:");
			int no2 = sc.nextInt();
			trackModule( no2  );
		}
		ppp();
	}
	
	Scanner sc = new Scanner(System.in);
}


public class Mp3StackMain {

	public static void main(String[] args) {
		StMP3 mp3 = new StMP3(
				new StMusic("����� ȶ��", "�����"),
				new StMusic("�̵�� ����", "�豤��"),
				new StMusic( "Peaches", "Justin Bieber"),
				 new StMusic("Thank U, Next", "Ariana Grande"),
				 new StMusic("����", "������"),
				 new StMusic("I hate you", "SZA"),
				 new StMusic("������", "�ǹ�"),
				 new StMusic("���ǵ�", "�񱤿�")
				
			);
		
		mp3.goNext();
		mp3.goNext();
		mp3.goNext();
//		mp3.goNext();
//		mp3.goNext();
//		mp3.goNext();
//		mp3.goNext();
//		mp3.goNext();
//		mp3.goNext();
//		mp3.goBack();
//		mp3.goBack();
//		mp3.goBack();
//		mp3.goBack();
//		mp3.goBack();
//		mp3.goBack();
//		mp3.goBack();
		mp3.goBack();
		mp3.goTrack(5);
		mp3.goTrack(3);
		mp3.search(0,"��");
		mp3.search(1,"��");
		mp3.search(0,"��");
		mp3.search(0,"���������Ѱ����̾�");
		mp3.search(0,"��");
		mp3.search(1,"��");
		mp3.search(0,"��");
		mp3.search(0,"��");
		mp3.search2(0,"ȶ");
		mp3.search2(0,"��");
	}

}


