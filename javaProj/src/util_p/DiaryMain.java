package util_p;


/*	�ڵ��� ���� �׽�Ʈ �ϼ���

		�ڵ��� Ŭ������ ����Ȯ�� ������ ��

		���� �� ���� ���� �� �ٸ��� �� ��
		����
		 ������ī  : �ӵ� 50 , ���� 20, ������ 30
		Ʈ�� : ���� 60, ���緮 40
		������ : �ӵ� 15, ���� 35, ž���ο� 50

		���� �� ���������� ������ �� ��
*/

abstract class Car{
		String type;
		int speed;
		int mile;
	abstract void score (); 
							
	}
class Sports extends Car{
		int design;
		public Sports(int speed,int mile, int design) {
			
			this.speed = speed;
			this.mile = mile;
			this.design = design;
			type = "������ī";
		}
		@Override
		void score () {
			System.out.println(type+":"+" �ӵ�"+speed+ " ����"+mile+ " ������"+design);
		} 
				
		
	}
class Truck extends Car{
		int load;
		public Truck(int mile, int load) {
			
			this.mile = mile;
			this.load = load;
			type = "Ʈ��";
		}
		@Override
		void score () {
			System.out.println(type+":"+" ����"+mile+ " ���緮"+load);
		} 
		
	}
class Van extends Car{
		int number;
		public Van(int speed,int mile, int number) {
			
			this.speed = speed;
			this.mile = mile;
			this.number = number;
			type = "������";
		}
		@Override
		void score () {
			System.out.println(type+":"+" �ӵ�"+speed+ " ����"+mile+ " ž���ο�"+number);
		} 
		
		
	}
	
public class CartestMain {
	public static void main(String[] args) {
		Car [] ccc = {
			new	Sports(50,20,30),
			new	Truck(60,40),
			new	Van(15,35,50)
				
		};
		
		
		
		for(Car cc : ccc) {
			cc.score();
	}
		
	}
}