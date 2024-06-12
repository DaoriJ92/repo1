package sec01.exam01;

import java.util.Scanner;

public class ForExam2 {

	public static void main(String[] args) {

		// 구구단 2단 출력
//		System.out.println("2 * 1 = 2");
//		System.out.println("2 * 2 = 4");
//		System.out.println("2 * 3 = 6");
//		int cnt = 3;
//		cnt++;
//		System.out.println("2" + cnt + " = " + (2 * cnt));
//		cnt++;
//		System.out.println("2" + cnt + " = " + (2 * cnt));
//		cnt++;
//		System.out.println("2" + cnt + " = " + (2 * cnt));
//
//		for (int k = 1; k <= 9; k++) {
//			System.out.println("2*" + k + "=" + (2 * k));
//		}
//
//		for (int k = 1; k <= 9; k++) {
//			System.out.println("3 *" + k + "=" + (3 * k));
//
//		}
//		int dan = 3;
//		dan++;
//		for (int k = 1; k <= 9; k++) {
//			System.out.println(dan + "*" + k + "=" + (dan * k));
//
//		}
//
//		for (int dan2 = 2; dan2 <= 9; dan2++) {
//			for (int k = 1; k <= 9; k++) {
//				System.out.println(dan2 + "*" + k + "=" + (dan2 * k));
//			}
//	
//		}
//		
//		System.out.println("--------------------------------------");
//		for (int goo = 1; goo <= 9; goo++) {
//			for (int go = 1; go <= 9; go++) {
//				System.out.println(goo + " *" + go + "=" + (goo * go));

//			}
//		}
		System.out.println("--------------------------------------");
		// 주어진 수가 양수 (포함), 음수 여부 출력

		Scanner scan = new Scanner(System.in);
//		System.out.println("숫자를 입력하세요");
//		int a = scan.nextInt();
//		if(a<0) {System.out.println("음수");}
//		else{System.out.println("양수");
//		}

		// 입력을 3번 반복
//		for (int a = 1; a != 0;) {
//			System.out.println("숫자를 입력하세요(종료 : 0)");
//			a = scan.nextInt();
//			if (a < 0) {
//				System.out.println(a + "음수");
//			} else {
//				System.out.println(a + "양수");
//			}
//			
//		}
//		System.out.println("종료되었습니다.");

		/*
		 * 주사위 2개 굴림 1단계 주사위 2개로 굴려서 나올 수 있는 모든 조합
		 * 
		 * 2단계 합 별로 나올 수 있는 조합 합이 2인 경우 : [1,1] 합이 3 : [1,2] [2,1]
		 */

		// 2단계
//		for(int p = 1; p<=3; p++) {for(int p2 = 1; p2 <=5; p2++) {
//		System.out.print("+");

//		}
//		System.out.println();
//	}
// 2-1단계
//for(int i=1; i<=5; 1++) {
//	System.out.println("+");
//	System.out.println("");

//		for (int i = 1; i <= 5; i++) {
//			for (int i2 = 1; i2<=i; i2++) {
//				System.out.print("+");
//			}
//			System.out.println();
//		}

		// 4단계
//		for (int i = 1; i <= 5; i++) {
//			for (int i2 = 1; i2 <= i; i2++) {
//				System.out.print("+");
//			}
//			for( int i3 = 5-i; i3>0; i3--)
//				System.out.print(".");
//			System.out.println();
//		}

		// 5단계
//		for (int i = 1; i <= 5; i++) {
//			
//			for (int i3=5-i; i3>0; i3--) {System.out.print(".");}
//		
//			for (int i2 = 1; i2 <= i; i2++) 
//				System.out.print("+");
//		
//			System.out.println();
//	}

		// 6단계
//		for (int i = 1; i <= 5; i++) {
//			for (int j = 5 - i; j > 0; j--) {
//				System.out.print(".");
//			}
//			for (int k = 2*i-1; k>0; k--) {
//				System.out.print("+");
//			}
//			System.out.println();
//		}
		
		//7 단계
		for(int i =1; i<=5; i++) {
			for (int j = 5 -i; j > 0; j--) {
					System.out.print(".");
			}
			for (int k=2*i-1; k>0; k--) {
				System.out.print("+");
			}
		for (int j = 5 -i; j > 0; j--) {
			System.out.print(".");
		}System.out.println();
			
			}
		
		for(int i=0; i<10; i++) {
			if(i%2 !=0) {
				continue;//이후 실행문은 무시
				}System.out.println("짝수? " + i);
		}
		}//continue : 다음 쇼츠로 넘어가기
		//break : youtube 끄기 
}
//복습

	

