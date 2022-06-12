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
				//System.out.println("������"+ ot.price*ot.cnt);
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
			new ObjTea("Ŀ��", "�Ƹ޸�Ű��", 1500, 3),		//0	
			new ObjTea("ź��", "�ݶ�", 1000, 2),			//1
			new ObjTea("�ַ�", "����", 6000, 1),			//2
			new ObjTea("Ŀ��", "�ƽþƳ�", 2000, 4),		//3
			new ObjTea("Ŀ��", "������ī��", 2300, 3),		//4
			new ObjTea("�ַ�", "����", 5000, 2)			//5
		};
		
		ObjTeaRes [] otrs = { 
				new ObjTeaRes("Ŀ��"),
				new ObjTeaRes("ź��"),
				new ObjTeaRes("�ַ�")
				};
		
		for (ObjTeaRes otr : otrs) {
			otr.calc(teas);
			//System.out.println(otr.tot);
			System.out.println(otr);
		}
	}
}

/*
 
 1.���簢���� ���� �� �ѷ��� �ջ��Ͽ� ����ϼ���.
 
 2. �������� ���� �� �ѷ��� �ջ��Ͽ� ����ϼ���
 
 
 ������ ����    ����                     �ѷ�
 ���簢��      ����*����               (����+����)*2
 �����ﰢ��    ����*���� / 2            ���� + ���� + ����
 ��          ������* ������ * ������     ������* 2 * ������
 */
