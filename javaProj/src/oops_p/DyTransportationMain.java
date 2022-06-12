     /*   자동차 성능 테스트 하세요

      자동차 클래스로 성능확인 가능할 것

      차종 에 따른 연산 식 다르게 할 것
      차종
      스포츠카  : 속도 50 , 연비 20, 디자인 30
      트럭 : 연비 60, 적재량 40
      승합차 : 속도 15, 연비 35, 탑승인원 50

      으로 각 성능점수를 계산토록 할 것
*/
package oops_p;

class DyTpTT{
  String name;
   void go(String dst, int dist) 
  {
     System.out.println("난 안가");
  }
}

class KAL extends DyTpTT{
  int kmh;
  public KAL(int kmh) {
     
     this.kmh = kmh;
     name = "비행기";
     
     
  }
  @Override
  void go(String dst, int dist) {
     double hh = (double)dist/kmh;
     System.out.println(dst +"까지"+hh+"시간으로 비행기 타고 가요");
  }
  
}

class Ship extends DyTpTT{
  String meal;
  public Ship(String meal) {
     
     this.meal = meal;
     name = "배";
     
     
  }
  @Override
  void go(String dst, int dist) {
     
     System.out.println(dst +"까지"+meal+"먹으면서 함꼐해요");
  }
  
}

public class DyTransportationMain {

  public static void main(String[] args) {
     DyTpTT [] tts = {
           new DyTpTT(),
           new KAL(800),
           new Ship("두리안"),
           new KAL(1000),
           new Ship("스테이크")
     
     };
     for (DyTpTT dt : tts) {
        dt.go("샌프란시스코", 9086);
        
        
     }
     
     /*   자동차 성능 테스트 하세요

      자동차 클래스로 성능확인 가능할 것

      차종 에 따른 연산 식 다르게 할 것
      차종
      스포츠카  : 속도 50 , 연비 20, 디자인 30
      트럭 : 연비 60, 적재량 40
      승합차 : 속도 15, 연비 35, 탑승인원 50

      으로 각 성능점수를 계산토록 할 것
*/
      
      
  }

}