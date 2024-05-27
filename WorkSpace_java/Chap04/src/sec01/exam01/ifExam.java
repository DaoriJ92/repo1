package sec01.exam01;

import java.util.Scanner;

public class ifExam {

	public static void main(String[] args) {

		int score = 88;

		if (score >= 90) {
			System.out.println("90점 이상입니다.");
		}
		if (score < 95) {
			System.out.println("95점 이상입니다.");
		}

		if (score < 90) {
			System.out.println("90점 미만입니다.");
		}
//			참고로
		boolean up90 = score >= 90;
		if (up90) {
			System.out.println("up90");
		}
		if (!up90) {
			System.out.println("참");
		} else {
//			if문은 참일 경우만 표시되며 else문은 거짓일 경우 표시.
			System.out.println("거짓");
		}
//		if 끼리만 있을때는 각각 작동
		if (score >= 90) {
			System.out.println("90점 이상입니다.");
			System.out.println("A학점");
		}
		if (score < 90 && score >= 80) {
			System.out.println("90점 미만입니다.");
			System.out.println("B학점");
		}
		System.out.println();
		System.out.println("----------------------------------------------------------");
//		세가지가 모두 묶여 있을 경우 
//		셋중 참인 값 한가지만 실행
//		else if 는 위에 값이 거짓 일 경우만 실행
		if (score >= 90) {
			System.out.println("학점은 A");
		} else if (score < 90 && score >= 80) {
			System.out.println("학점은 B");
		} else {
			System.out.println("학점은 C");
		}

//		int num = 3;
//		if( num % 2 == 0) {
//			System.out.println( "짝수");
//		}else {
//			System.out.println( "홀수");
//		}
//	
//		int num = 3;
		Scanner input = new Scanner(System.in);
//		num = input.nextInt();
//		if(num % 2 == 0) {
//			System.out.println("짝수");
//		}else {
//			System.out.println("홀수");
//		}

		String a = "abc";
		String b = "abc";
//		b = input.nextInt();
		if (a == b) {
//			if (a.equals(b)) {
			System.out.println("a와 b가 같다.");
		} else {
			System.out.println("a와 b가 다르다.");
		}

//		double rand = Math.random();
//		System.out.println("ran : " + rand);

		// 주사위 1~6
		double rand = Math.random();
		rand = Math.random();
		int dice = (int) (rand * 6);
		dice = (int) (rand * 6) + 1; // 축약

		System.out.println(dice);
		if ( dice == 6 )
			System.out.println("와 6이에요!");
		
//		double rand = Math.random();
//		rand = Math.random();
//		int number = (int) (rand * 3);
//		number = (int) (rand * 3) + 1; // 축약
//
//
//		System.out.println(number);

	}

}
