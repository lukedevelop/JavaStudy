package oops_p;

enum Cats {
	LION, TIGER, PUMA, JAGUAR
//    0     1      2       3  
}

enum Food{
	
	COFFEE, CHICKEN("ġŲ", 9000, 3), GIMBAB("���",2500,2);
//    0         1                         2	

	Food(String name, int price, int cnt){
	
		this.name = name;
		this.price = price;
		this.cnt = cnt;
	}
	Food(){
		
	}
	
	String name;
	int price;
	int cnt;
	
	void ppp() {
		System.out.println(name+","+price+","+cnt);
	}
}


public class EnumMain {

	public static void main(String[] args) {

		System.out.println(Cats.LION);

		Cats cc;
//      cc = TIGER   <--- �ȴ�
//      cc = "TIGER"   <--- �ȴ�
		cc = Cats.TIGER;
		System.out.println(cc);
		cc = Cats.valueOf("PUMA");
		System.out.println(cc);
		System.out.println(cc.ordinal());
		
		Cats[] arr = Cats.values();
		
		System.out.println(arr);
		for(Cats c : arr) {
			System.out.println(c);
		}
		
		String tt = cc.name();
		System.out.println(tt);
		
		
		
		Food ff = Food.CHICKEN;
		System.out.println(ff+","+ff.ordinal()+","+ff.name());
		ff.ppp();
		ff.name ="���";
		ff.cnt = 5;
		ff.ppp();
		
		ff = Food.COFFEE;
		System.out.println(ff+","+ff.ordinal()+","+ff.name());
		ff.ppp();
		ff = Food.valueOf("GIMBAB");
		System.out.println(ff+","+ff.ordinal()+","+ff.name());
		ff.ppp();
		
		String menu = "CHICKEN,COFFEE,GIMBAB,COFFEE,GIMBAB,COFFEE,GIMBAB";
	
	    for(String mm : menu.split(",")) {
//	    	System.out.println(mm);
	        Food.valueOf(mm).cnt++;
	    
	    }
		
	    System.out.println("----------------");
	    
	    for(Food f : Food.values()) {
	    	f.ppp();
	    }
	    
	}

}
