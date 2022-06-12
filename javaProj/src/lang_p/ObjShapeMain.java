package lang_p;

class ObjShapeMain{
	
	String kind;
	int area, border;

	public ObjShapeMain(String kind) {
		super();
		this.kind = kind;
		area = 0;
		border = 0;
	}

	public ObjShapeMain(int r) {//원
		
		kind = "원";
		double pi = 3.141592;
		area = (int)(r * r * pi);
		border = (int)(r * 2 * pi);
	}
	
	public ObjShapeMain(int w, int h) {//직사각형
		
		kind = "직사각형";
		
		area = w * h;
		border = (w + h) * 2;
	}
	
	public ObjShapeMain(int w, int h, int a) {//직각삼각형
		
		kind = "직각삼각형";
		
		area = w * h / 2;
		border = w + h + a;
	}

	@Override
	public String toString() {
		return kind + "\t" + area + ", " + border;
	}

	void calc(ObjShapeMain [] shs) {
		for (ObjShapeMain os : shs) {
			//System.out.println(os);
			if(equals(os)) {
				area += os.area;
				border += os.border;
			}
		}
		System.out.println("결과 -> "+this);
	}
	
	public boolean equals(Object oo) {
		ObjShapeMain you = (ObjShapeMain)oo;
		return kind.equals(you.kind);
	}
}

public class ObjShapeMain {

	public static void main(String[] args) {
		ObjShapeMain [] shs = {
				new ObjShapeMain(5),
				new ObjShapeMain(5,6),
				new ObjShapeMain(5,6,8),
				new ObjShapeMain(7,10),
				new ObjShapeMain(8),
				new ObjShapeMain(9),
				new ObjShapeMain(9,4,12)
		};
		
	
		ObjShapeMain [] res = {
				new ObjShapeMain("원"),
				new ObjShapeMain("직사각형"),
				new ObjShapeMain("직각삼각형")
		};
		
		for (ObjShapeMain os : res) {
			os.calc(shs);
		}

	}

}

