package sec01.exam01;

import java.util.Scanner;

public class TypeCastingExam {

	public static void main(String[] args) {

		int a = 2 + (2 * 2 );
		long b = ( long ) a; // int인 a 를 long 타입으로 바꿔라
							  // long이 long 타입에 들어가는건 문제가 안된다.
		long c = a ; //작은거에서 큰거로 바뀔땐 손실이 없어 형변환 생략 가능
					  // 자동 형변환
					  // 묵시적, 암시적형변환 : 암묵적 형변환
		System.out.println("c:"+c);
		a= (int)c; // 큰거에서 작은거로 바뀔때는 손실이 있을 수 있다.
					// 명시적, 강제 형변환
		long d = 3000000000L;
		int a2= (int)d;
		System.out.println("a2 : "+a2);
		
		double d2= 3.14;
		int i = (int)d2;
		System.out.println("i:"+ i );
		
//		int result = 10;
		double result = 10;
		int count = 4;
		System.out.println( result / count );
		
		int i2 = 2100000000;
		int i3 = i2 * 2;
		System.out.println("i3 : "+ i3); // 결괏값이 넘쳐서  -94967296 표시
										//int + int 의 값이기때문에 
										//문제가 없다고 판단하여 에러가 뜨지 않음
		
		System.out.println( 3 + " 문자");
		System.out.println( 3 + 4 + " 문자");
		System.out.println( "" + 1 +" px");
		System.out.println( 3 + " 문자");
		System.out.println( "------hr------");
		System.out.print("첫번째줄"); //ln은 엔터키의 역할을 하여 줄을 바꿔서표시
		System.out.print("두번째줄");
		System.out.println( "------hr------");
		System.out.printf("i3의 값은 : %d", i3);
		System.out.println();
		System.out.printf("i2의 값은 : "+ i2 + ",i3" +i3);
		System.out.println();
		System.out.printf("i2의 값은 : %d, i3 :%d", i2, i3);
		
		System.out.println();
		System.out.println( "------hr------");
		
		System.out.println("아무거나 입력하세요..");
		Scanner scan = new Scanner (System.in) ; //입력 받을 준비
		String input = scan.nextLine();
		System.out.println("input : "+input);
		
		/*
		 * 변수 명을 정하는 규칙
		 * 
		 * 1. 숫자로 시작하면 안됨
		 * 2. 예약어는 쓸 수 없다.(ex. int, double.)
		 * 3. 길이제한x 대소문자 구분
		 * 4. 특수문자는 _,$ 허용. (ex. int_a; int my_way; int $a)
		 * 5. 변수는 소문자로만 시작 하는게 좋다.
		 */
		
	}

}
