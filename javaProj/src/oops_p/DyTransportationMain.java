     /*   �ڵ��� ���� �׽�Ʈ �ϼ���

      �ڵ��� Ŭ������ ����Ȯ�� ������ ��

      ���� �� ���� ���� �� �ٸ��� �� ��
      ����
      ������ī  : �ӵ� 50 , ���� 20, ������ 30
      Ʈ�� : ���� 60, ���緮 40
      ������ : �ӵ� 15, ���� 35, ž���ο� 50

      ���� �� ���������� ������ �� ��
*/
package oops_p;

class DyTpTT{
  String name;
   void go(String dst, int dist) 
  {
     System.out.println("�� �Ȱ�");
  }
}

class KAL extends DyTpTT{
  int kmh;
  public KAL(int kmh) {
     
     this.kmh = kmh;
     name = "�����";
     
     
  }
  @Override
  void go(String dst, int dist) {
     double hh = (double)dist/kmh;
     System.out.println(dst +"����"+hh+"�ð����� ����� Ÿ�� ����");
  }
  
}

class Ship extends DyTpTT{
  String meal;
  public Ship(String meal) {
     
     this.meal = meal;
     name = "��";
     
     
  }
  @Override
  void go(String dst, int dist) {
     
     System.out.println(dst +"����"+meal+"�����鼭 �Բ��ؿ�");
  }
  
}

public class DyTransportationMain {

  public static void main(String[] args) {
     DyTpTT [] tts = {
           new DyTpTT(),
           new KAL(800),
           new Ship("�θ���"),
           new KAL(1000),
           new Ship("������ũ")
     
     };
     for (DyTpTT dt : tts) {
        dt.go("�������ý���", 9086);
        
        
     }
     
     /*   �ڵ��� ���� �׽�Ʈ �ϼ���

      �ڵ��� Ŭ������ ����Ȯ�� ������ ��

      ���� �� ���� ���� �� �ٸ��� �� ��
      ����
      ������ī  : �ӵ� 50 , ���� 20, ������ 30
      Ʈ�� : ���� 60, ���緮 40
      ������ : �ӵ� 15, ���� 35, ž���ο� 50

      ���� �� ���������� ������ �� ��
*/
      
      
  }

}