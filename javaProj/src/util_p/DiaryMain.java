package util_p;


/*	자동차 성능 테스트 하세요

		자동차 클래스로 성능확인 가능할 것

		차종 에 따른 연산 식 다르게 할 것
		차종
		 스포츠카  : 속도 50 , 연비 20, 디자인 30
		트럭 : 연비 60, 적재량 40
		승합차 : 속도 15, 연비 35, 탑승인원 50

		으로 각 성능점수를 계산토록 할 것
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
			type = "스포츠카";
		}
		@Override
		void score () {
			System.out.println(type+":"+" 속도"+speed+ " 연비"+mile+ " 디자인"+design);
		} 
				
		
	}
class Truck extends Car{
		int load;
		public Truck(int mile, int load) {
			
			this.mile = mile;
			this.load = load;
			type = "트럭";
		}
		@Override
		void score () {
			System.out.println(type+":"+" 연비"+mile+ " 적재량"+load);
		} 
		
	}
class Van extends Car{
		int number;
		public Van(int speed,int mile, int number) {
			
			this.speed = speed;
			this.mile = mile;
			this.number = number;
			type = "승합차";
		}
		@Override
		void score () {
			System.out.println(type+":"+" 속도"+speed+ " 연비"+mile+ " 탑승인원"+number);
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