package basic;

class StaticDragon{
	static int mom = 100; // 한 class 에서 공용적으로 쓰는 static
	
	String name;
	int mymoney = 0;
	
	
	
	public StaticDragon(String name) {
		
		this.name = name;
	}



	void showMeTheMoney(int money) {
		mom -= money;
		mymoney += money;
	
		System.out.println(name+":"+money+"("+mymoney+")");
		System.out.println("\t잔액: "+mom);
	}
	
	
}

public class StaticDragonMoneyMain { //instance 는 지들꺼만(son,daughter) 빼고 static은 공용이라 다뺌(mom)

	public static void main(String[] args) {
		StaticDragon son = new StaticDragon("아들");
		StaticDragon daughter = new StaticDragon("딸");
		
		son.showMeTheMoney(12);
		daughter.showMeTheMoney(9);
		daughter.showMeTheMoney(15);
		son.showMeTheMoney(11);
	}

}
