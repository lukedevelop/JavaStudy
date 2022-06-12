package basic;

public class IfMain {

	public static void main(String[] args) {
		
		
		System.out.println("1. if ------");
		
		if( true ) {
			System.out.println("참이지롱");
		}
		System.out.println("1. if 종료------");
		
		System.out.println("2. if ~ else------");
		
		if( true ) {
			System.out.println("참이지롱 2");
		}else {
			System.out.println("거짓부렁 2");
		}
		System.out.println("2. if ~ else 종료------");
		/* 단독 else 불가
		else {
			System.out.println("거짓부렁 2");
		}
		*/
		int jum = 88;
		if( jum >=80 ) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		System.out.println("2. if ~ else 시험 1 종료------");
		
		if( jum >=80 ) {
			System.out.println("우수");
		}
		
		////////////////////////////////////
		
		if( jum >=60 ) {
			System.out.println("정상");
		}
		else {
			System.out.println("탈락");
		}
		System.out.println("2. if ~ else 시험 2 종료------");
		
		
		System.out.println("3. if ~ else if ~ else------");
		
		if( jum >=80 ) {
			System.out.println("우수3");
		}else if( jum >=60 ) {
			System.out.println("정상3");
		}
		else {
			System.out.println("탈락3");
		}
		System.out.println("3. if ~ else if ~ else 종료------");
		
		System.out.println("4. if ~ else if ------");
		if( jum >=80 ) {
			System.out.println("우수4");
		}else if( jum >=60 ) {
			System.out.println("정상4");
		}
		
		System.out.println("4. if ~ else if 종료------");
		/* 단독 else 불가
		else if( jum >=60 ) {
			System.out.println("정상3");
		} 
		
		순서  :  if ~ else if ~ else
		if( jum >=80 ) {
			System.out.println("우수3");
		}else {
			System.out.println("탈락3");
		}else if( jum >=60 ) {
			System.out.println("정상3");
		
		}
		*/
		
		
		
		System.out.println("5. if ~ else if ~ else------");
		jum = 75;
		if( jum >=80 ) {
			System.out.println("우수5");
		}else if( jum >=60 ) {
			System.out.println("양호5");
		
			if( jum % 2 == 0) {
				System.out.println("짝수");
			}else {
				System.out.println("홀수");
			}
	
		}else if( jum >=40 ) {
			System.out.println("미흡5");
		
		}else if( jum >=20 ) {
			System.out.println("노력요망5");	
			
		}else {
			System.out.println("탈락5");
		}
		System.out.println("5. if ~ else if ~ else 종료------");
		
	}

}
