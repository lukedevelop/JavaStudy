package basic;

class StaticDragon{
	static int mom = 100; // �� class ���� ���������� ���� static
	
	String name;
	int mymoney = 0;
	
	
	
	public StaticDragon(String name) {
		
		this.name = name;
	}



	void showMeTheMoney(int money) {
		mom -= money;
		mymoney += money;
	
		System.out.println(name+":"+money+"("+mymoney+")");
		System.out.println("\t�ܾ�: "+mom);
	}
	
	
}

public class StaticDragonMoneyMain { //instance �� ���鲨��(son,daughter) ���� static�� �����̶� �ٻ�(mom)

	public static void main(String[] args) {
		StaticDragon son = new StaticDragon("�Ƶ�");
		StaticDragon daughter = new StaticDragon("��");
		
		son.showMeTheMoney(12);
		daughter.showMeTheMoney(9);
		daughter.showMeTheMoney(15);
		son.showMeTheMoney(11);
	}

}
