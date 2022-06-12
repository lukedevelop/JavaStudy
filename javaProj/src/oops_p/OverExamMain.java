//package oops_p;
//
//
//class OverExam{
//
//	String name, kind;
//	int tot, res;
//	
//	OverExam(String name, int kor, int eng, int mat ){
//		kind = "일반";
//		this.name = name;
//		tot = kor + eng + mat;
//		res = tot/3;
//	}
//	
//	OverExam(String name, int kor, int eng, int mat, int art ){
//		kind = "예체능";
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
//    		  new OverExam("현빈", 37,68, 92),
//    		  new OverExam("원빈", 27,48, 62,84),
//    		  new OverExam("투빈", 87,68, 32),
//    		  new OverExam("감우빈", 87,68, 42,24),
//    		  new OverExam("장희빈", 77,78, 72),
//    		  new OverExam("잴라빈", 77,78, 72,74),
//    		  new OverExam("커피빈", 57,58, 52),
//    		  new OverExam("미스터빈", 57,58, 52,54),
//    		  new OverExam("골빈", 27,38, 92),
//    		  new OverExam("텅빈", 37,28, 22,94),
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
					new OverExam("직사각형",5,5),
					new OverExam("직각삼각형",6,5),
					new OverExam("원",3,3),
			};
			for(OverExam oe : shape) {
		    	  System.out.println(oe);
		      }
			
			
	
	/*
	 도형을 구현하세요
	 
	 원           반지름*반지름*원주율          반지름*2*원주율
	 직사각형        가로*세로                 (가로+세로)*2
	 직각삼각형      가로+세로/2                가로+세로+빗변
	 
	 생성자를 오버로딩하여 구형
	 
	 출력내용 도형종류, 넓이, 둘레
	 */
      
      
      
	}

}
