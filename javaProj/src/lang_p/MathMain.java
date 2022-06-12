package lang_p;

public class MathMain {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.E);
		System.out.println("ceil-----------------");
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.ceil(987.654));
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(-987.654));
		
		System.out.println("floor----------------");
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.ceil(987.654));
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(-987.654));
		System.out.println("roud----------------");  //반올림
		System.out.println(Math.ceil(123.456));
		System.out.println(Math.ceil(987.654));
		System.out.println(Math.ceil(-123.456));
		System.out.println(Math.ceil(-987.654));
		
		System.out.println("abs----------------");  // 양수로 변환(?)
		System.out.println(Math.abs(123.456));
		System.out.println(Math.abs(-123.654));

		System.out.println("max_min-----------------"); //소수점 두개만 들어감
		System.out.println(Math.max(10,20));
		System.out.println(Math.min(10,20));
		
		System.out.println("삼각함수-----------------"); //
		System.out.println(Math.sin(30));
		System.out.println(Math.sin(30*Math.PI/180));
		System.out.println(Math.cos(30*Math.PI/180));
		System.out.println(Math.tan(30*Math.PI/180));
		
		System.out.println("승-----------------"); //
		System.out.println(Math.exp(3));
		System.out.println(Math.log(3));
		System.out.println(Math.pow(2,4));
		System.out.println(Math.sqrt(2));
		
		System.out.println(Math.random());
		
		int no = (int)(Math.random()*4);
		System.out.println(no);
				
	}

}
