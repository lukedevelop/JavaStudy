package basic;
// �ڵ���
// ������� 5��
// �޼��� 4��
// Ŭ���� ���� ���� �ٽ� ��.

class Car{

	public String engine;
	public String wheel;
	public int light = 1;
	public int oil = 100;
	public double go;
	
	
	public Car() {
		System.out.println("�ڵ��� ��ǰ");
	}

	
	public void heart() {
		System.out.println("�߿�κ�");
		engine = "����";
		System.out.println("�ڵ����� " + engine);
	 }
	
	public void move() {
		System.out.println("�����ΰ�");
		oil --;
		System.out.println(oil);
	}
	
	public void see() {
		System.out.println("������������");
		light += 1;
		System.out.println(light + "�þ� ����");
	}
	
	public void fuel(){
		System.out.println("�ڵ��� ��");
	}

	public void way() {
		System.out.println("�̵� �Ÿ�");
		
		
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
