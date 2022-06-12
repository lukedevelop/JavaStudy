package lang_p;

class ObjTea{
	
	String kind, name;
	int price, cnt;
	public ObjTea(String kind, String name, int price, int cnt) {
		super();
		this.kind = kind;
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	@Override
	public String toString() {
		return "ObjTea [kind=" + kind + ", name=" + name + ", price=" + price + ", cnt=" + cnt + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		
		ObjTeaRes other = (ObjTeaRes) obj;
		return kind.equals(other.title);
	}	
}

class ObjTeaRes{
	String title;
	int tot = 0;
		
	public ObjTeaRes(String title) {
		super();
		this.title = title;
	}

	void calc(ObjTea [] arr) {
		
		for (ObjTea ot : arr) {    //  ObjTea ot  = arr[?]
			//System.out.println(ot);
			if(ot.equals(this)) {
				//System.out.println("이지롱"+ ot.price*ot.cnt);
				tot += ot.price*ot.cnt;
			}
		}
	}

	@Override
	public String toString() {
		return title + " : " + tot;
	}
	
	
}
public class ObjectTeaMain {

	public static void main(String[] args) {
		ObjTea [] teas = {
			new ObjTea("커피", "아메리키노", 1500, 3),		//0	
			new ObjTea("탄산", "콜라", 1000, 2),			//1
			new ObjTea("주류", "맥주", 6000, 1),			//2
			new ObjTea("커피", "아시아노", 2000, 4),		//3
			new ObjTea("커피", "아프리카노", 2300, 3),		//4
			new ObjTea("주류", "미주", 5000, 2)			//5
		};
		
		ObjTeaRes [] otrs = { 
				new ObjTeaRes("커피"),
				new ObjTeaRes("탄산"),
				new ObjTeaRes("주류")
				};
		
		for (ObjTeaRes otr : otrs) {
			otr.calc(teas);
			//System.out.println(otr.tot);
			System.out.println(otr);
		}
	}
}

/*
 
 1.직사각형의 넓이 와 둘레를 합산하여 출력하세요.
 
 2. 도형별로 넓이 와 둘레를 합산하여 출력하세요
 
 
 도형의 종류    넓이                     둘레
 직사각형      가로*세로               (가로+세로)*2
 직각삼각형    가로*세로 / 2            가로 + 세로 + 빗변
 원          반지름* 반지름 * 원주율     반지름* 2 * 원주율
 */
