package basic;
// 자동차
// 멤버변수 5개
// 메서드 4개
// 클래스 정의 내일 다시 함.

class Car{

	public String engine;
	public String wheel;
	public int light = 1;
	public int oil = 100;
	public double go;
	
	
	public Car() {
		System.out.println("자동차 부품");
	}

	
	public void heart() {
		System.out.println("중요부분");
		engine = "심장";
		System.out.println("자동차의 " + engine);
	 }
	
	public void move() {
		System.out.println("앞으로감");
		oil --;
		System.out.println(oil);
	}
	
	public void see() {
		System.out.println("앞을보게해줌");
		light += 1;
		System.out.println(light + "시야 증가");
	}
	
	public void fuel(){
		System.out.println("자동차 밥");
	}

	public void way() {
		System.out.println("이동 거리");
		
		
		for(go = 0; go < 10; go++ ) {
		System.out.println(go + "Km");
		}

	}

}

class Truck extends Car {
	String name;
	
	
}





public class ClassCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car cr = new Car();
		
		
		cr.light = 2;
		
		cr.move();
		cr.move();
		cr.heart();
		cr.see();
		cr.way();
		
		
	}

}
