package collection_P;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain {

	public static void main(String[] args) {
      Map mm1 = new HashMap();
      
      mm1.put("����","������");
      mm1.put("������","ȣ����");
      mm1.put("�����","�Ǿ�");
      mm1.put("�缭��","������");
      mm1.put("���","���");
      
      
      System.out.println(mm1);
      mm1.put("������","��");        //���������Ͱ� ���� �ٲ� (������, ȣ���� -> ������, ��)
      mm1.put("�缭��","��");
      mm1.put("����",1234);
      mm1.put(true,new ArrayList());
      System.out.println(mm1);
      System.out.println(mm1.size());
      System.out.println(mm1.get("���"));    //�� ������
      mm1.remove("�����");
      System.out.println(mm1);
      mm1.remove("�ַ�");
      System.out.println(mm1);
      System.out.println(mm1.containsKey("������"));
      System.out.println(mm1.containsKey("����"));
      System.out.println(mm1.containsValue(1234));
      System.out.println(mm1.containsValue(5678));
      /*
      for(Object oo : mm1){
	
	}*/
	
      Set ss1 = mm1.keySet();     //? �պκ�
      System.out.println(ss1);
      Collection vv = mm1.values();        //?�޺κ�
      System.out.println(vv);
      Set ss2 = mm1.entrySet();    //
      System.out.println(ss2); 
      
      for(Object obj : ss1) {
    	  System.out.println(obj);
      }
      System.out.println("------------------");
      for(Object obj : vv) {
    	  System.out.println(obj);
      }
      System.out.println("------------------");
      for(Object obj : ss2) {
    	  Map.Entry me = (Map.Entry)obj;
//    	  System.out.println(obj);
    	  System.out.println(me.getKey()+"=>"+me.getValue());
      }
      System.out.println("------------------");
      System.out.println(mm1);
      mm1.clear();
      System.out.println(mm1);
      System.out.println(mm1.isEmpty());
	}
      
}
