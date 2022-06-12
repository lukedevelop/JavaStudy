package lang_p;

public class WrapperMain {

	public static void main(String[] args) {
        int i = new Integer(1234);    //가운데 선이 생김 (곧 사라진다는 뜻)
        
        System.out.println(i);
		
        Integer i2 = 5678;
        
        System.out.println(i2);
        
      // i = null; 기본자료형은 null 을 받을수없다
        i2 = null; //null 을 받음
//        i = "12357";
//        i2 = "13570";
        i2 = new Integer("1357");  // "Integer" 문자로된 숫자를 정수로 바꿈
        System.out.println(i2);
        
//        i2 = new Integer("천삼백오십칠"); 치환할수 없는 문자열 에러발생 
        i = Integer.parseInt("2468");   //문자를 
        System.out.println(i);
        		
//        i = Integer.parseInt("이천사백육십팔") 사용할수없음
        byte b = Byte.parseByte("127");
        System.out.println(b);
        
        short sh = Short.parseShort("127");
        System.out.println(sh);
        
        Long lo = Long.parseLong("45678");
        System.out.println(lo);
        
        double d = Double.parseDouble("123.456");
        System.out.println(d);
        
        float f = Float.parseFloat("321.123");
        System.out.println(f);
        
        boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);
        
        System.out.println("2진수:"+Integer.toBinaryString(10));
        System.out.println("8진수:"+Integer.toOctalString(10));
        System.out.println("16진수:"+Integer.toHexString(10));
        
        //사진 파일을 확인하세요 ex)영업_홍갈동_20220208.jpg
        
        //부서명, 이름 출력, 입사일
        
        String nm = "영업_홍길동_20220208.jpg";
        
        
//        System.out.println("부서명: "+ nm.substring(0,2));
//        System.out.println("이름출력: "+ nm.substring(3,6));
//        System.out.println("입사일: "+ nm.substring(7,15));

        String [] arr = nm.split("_");
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        int [] reg = {
        		Integer.parseInt(arr[2].substring(0,4)),
        		Integer.parseInt(arr[2].substring(4,6)),
	            Integer.parseInt(arr[2].substring(6,8)),
};
        
        
	}

}
