package sec01.exam01;

import java.util.Scanner;

public class 가위바위보 {

	public static void main(String[] args) {

		double rules = Math.random();
		rules = Math.random();
		int doo = (int) (rules * 3);
		if (doo == 0) {
			System.out.println("가위");
		} else if (doo == 1) {
			System.out.println("바위");
		} else if (doo == 2) {
			System.out.println("보");
		}

		double rules2 = Math.random();
		rules2 = Math.random();
		int me = (int) (rules2 * 3);
		if (me == 0) {
			System.out.println("가위");
		} else if (me == 1) {
			System.out.println("바위");
		} else if (me == 2) {
			System.out.println("보");
		}

		if (doo == me) {
			System.out.println("무승부.");
		} else if ((doo == 0 && me == 2) || (doo == 1 && me == 0) || (doo == 2 && me == 1)) {
			System.out.println("이겼다!");
		} else {
			System.out.println("졌다.");
		}

		double rand = Math.random();
		int dice = (int) (rand * 6);
		dice = (int) (rand * 6) + 1; // 축약
		System.out.println("주사위 숫자는 : " + rand);
		System.out.println(dice);
		if (dice == 1) {
			System.out.println("1이 나왔습니다.");
		} else if (dice == 2) {
			System.out.println("2가 나왔습니다.");
		}
		
//		if 중에서 == 혹은 equals 일때 switch로 바꿀 수 있다.
//		반대로 스위치는 if로 바꿀 수 있다.
		switch (dice) {
		case 1: // if (dice == 1); 
			System.out.println("1이 나왔습니다.");
			break;
		case 2:
			System.out.println("2가 나왔습니다.");
			break;
		case 3:
			System.out.println("3이 나왔습니다.");
			break;
		case 4:
			System.out.println("4가 나왔습니다.");
			break;
		case 5: // else if (dice ==5);
			System.out.println("5가 나왔습니다.");
			break;
		default : // if문의 esle 기능
			System.out.println("6이 나왔습니다.");
			break;
		}
		
		int month = 9;
		
		if( month  >= 3 && month <= 5 ) {
			System.out.println("봄");
		}else if ( month >= 6 && month <=8 ) {
			System.out.println("여름");
		}else if ( month >= 9 && month <= 11 ) {
			System.out.println("가을");
		}else {
				System.out.println("겨울");
			}
		
		switch(month) {
			case 3 : 
			case 4 : 
			case 5 : 
				System.out.println("봄2");
				break ;
//				switch 문은 동일한 출력값을 가지는 조건은 생략 가능
//				(or 연산인 경우)
			case 6 : 
			case 7 : 
			case 8 : 
				System.out.println("여름");
				break ;		
			case 9 : 
			case 10 : 
			case 11 : 
				System.out.println("가을");
				break ;
			default :
				System.out.println("겨울");
				break;
		}
	}

}
