package exam;

abstract class CarKind{
	String name;
	int speed;
	int oil;
	
abstract void go (); 

}
class SportsCar extends CarKind{
	int dsg ;
	
	public SportsCar(int speed,int oil,int dsg) {
		
		this.speed = speed;
		this.oil = oil;
		this.dsg = dsg;
		name = "������ī";
	}
	void go() {
		System.out.println(name+": "+speed+" , "+oil+" , "+dsg);
		System.out.println("����: "+(speed+oil+dsg));
	}
}

class Truck extends CarKind{
	int weight;
	public Truck(int oil,int weight) {
		
		this.oil = oil;
		this.weight = weight;
		name = "Ʈ��";
	} 
	void go() {
		System.out.println(name+": "+oil+" , "+weight);
		System.out.println("����: "+(+oil+weight));
		
	}

}
class Van extends CarKind{
	int person;
	public Van(int speed, int oil, int person) {
		
		this.speed = speed;
		this.oil = oil;
		this.person =person;
		name = "������";
	}
	void go() {
		System.out.println(name+": "+speed+" , "+oil+" , "+person);
		System.out.println("����: "+(speed+oil+person));
	}
}




public class Car {

	public static void main(String[] args) {
     CarKind [] all = {
    		 
    		 new SportsCar(50,20,30),
    		 new Truck(60,40),
    		 new Van(15,35,50)
     };
    for(CarKind cc : all) {
    	cc.go();
    }
		
		
	}

}
