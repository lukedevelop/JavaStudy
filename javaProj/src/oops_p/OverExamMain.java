//package oops_p;
//
//
//class OverExam{
//
//	String name, kind;
//	int tot, res;
//	
//	OverExam(String name, int kor, int eng, int mat ){
//		kind = "�Ϲ�";
//		this.name = name;
//		tot = kor + eng + mat;
//		res = tot/3;
//	}
//	
//	OverExam(String name, int kor, int eng, int mat, int art ){
//		kind = "��ü��";
//		this.name = name;
//		tot = kor + eng + mat + art;
//		res = (int)(kor*0.2 + eng*0.1 + mat*0.15 + art*0.55);
//	}
//
//	@Override
//	public String toString() {
//		return kind + "\t" + name +"\t" + tot + "\t" + res;
//	}
//	
//	
//}
//
//public class OverExamMain {
//
//	public static void main(String[] args) {
//      OverExam [] studs = {
//    		  
//    		  new OverExam("����", 37,68, 92),
//    		  new OverExam("����", 27,48, 62,84),
//    		  new OverExam("����", 87,68, 32),
//    		  new OverExam("�����", 87,68, 42,24),
//    		  new OverExam("�����", 77,78, 72),
//    		  new OverExam("����", 77,78, 72,74),
//    		  new OverExam("Ŀ�Ǻ�", 57,58, 52),
//    		  new OverExam("�̽��ͺ�", 57,58, 52,54),
//    		  new OverExam("���", 27,38, 92),
//    		  new OverExam("�ֺ�", 37,28, 22,94),
//      };
//      
//      for(OverExam oe : studs) {
//    	  System.out.println(oe);
//      }
	
package oops_p;


class OverExam{

	String name;
	int res1,res2;
	
	OverExam(String name, int a, int b){
	
	this.name = name;
	res1 = a * b;
	res2 =(a+b)*2;
	
	
	}
	
	OverExam(String name, int a, int b, int c){
	
		this.name = name;
		res1 = a + b / 2;
		res2 = a + b + c;
		
		
		}
	
	OverExam(int a, int b, String name ){
		
		this.name = name;
		res1 = (int)(a * b * Math.PI);
		res2 = (int)(a * 2 * Math.PI);
		
		}
	
	@Override
	public String toString() {
		return   name +"\t" + res1 + "\t" + res2;
	}
}
	public class OverExamMain {
	
		public static void main(String[] args) {
	
			OverExam shape[] = {
					new OverExam("���簢��",5,5),
					new OverExam("�����ﰢ��",6,5),
					new OverExam("��",3,3),
			};
			for(OverExam oe : shape) {
		    	  System.out.println(oe);
		      }
			
			
	
	/*
	 ������ �����ϼ���
	 
	 ��           ������*������*������          ������*2*������
	 ���簢��        ����*����                 (����+����)*2
	 �����ﰢ��      ����+����/2                ����+����+����
	 
	 �����ڸ� �����ε��Ͽ� ����
	 
	 ��³��� ��������, ����, �ѷ�
	 */
      
      
      
	}

}
