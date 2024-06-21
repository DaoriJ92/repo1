package expert;

import java.util.Scanner;

public class Random {

	public static void main(String[] args) {

		int a = 10;
		boolean b = a < 5;

		// else if 로 묶을 시 실행된 값이 참이면 멈춤
		if (b) {
			System.out.println(a + "는 5보다 작습니다.");
			System.out.println(b);
		} else if (a < 15) {
			System.out.println(a + "는 15보다 작습니다");
		} else if (a < 25) {
			System.out.println(a + "는 25보다 작습니다");
		}

		if (b) {
			System.out.println(a + "는 5보다 작습니다.");
			System.out.println(b);
		}
		if (a >= 5 && a < 15) {
			System.out.println(a + "는 15보다 작습니다");
		}
		if (a >= 15 && a < 25) {
			System.out.println(a + "는 25보다 작습니다");
		}

		boolean a1 = true;
		boolean a2 = true;
		boolean a3 = false;

		// &&만 있는 경우 false가 나오면 그 뒤는 쳐다도 안본다.
		System.out.println(a1 && a3 && a2);
//	      String b1="치킨";
		String b1 = null;
		if (b1 != null) {
			System.out.println(123);
			if (b1.length() > 4) {
				System.out.println(b1);
			}
		}

		// &&는 false를 만나면 끝남.
		if (b1 != null && b1.length() > 4) {
			System.out.println(b1);
		}
//	      System.out.println(b1.length());

		// ||는 true를 만나면 더이상 실행하지 않음
		System.out.println(a1 || a3 || a2);

		// &&연산자 먼저 실행.
		System.out.println(false || true && true);
//	      if(3<a<5)  3<a에서 true로 바뀌기 때문에 연산 불가능.
		if (3 < a && a < 5) {
			System.out.println(1234);
		}
		double rand = Math.random();
		double 답1 = rand * 100;

		System.out.println((int) -3.5);

		// 5~7까지 랜덤으로 뽑고 싶을 때
		// 5+(0~2)
		// int a02 = (int)(rand*3);
		// int 결과 = a02+5;
		int 결과 = (int) (Math.random() * 3) + 5;

		int b02 = (int) Math.random() * 6849684 % 3;

//		double rand = Math.random();
//		
//		int number = (int) (rand * 45); // 0 ~ 44
//		number = number + 1; // 0 ~ 45
//		number = (int) (rand * 45) + 1; // 축약
//
//		number = ((int) (rand * 10000)) % 45 + 1;
//
//		System.out.println(number);
//		
//		rand = Math.random();
//		number = (int) (rand * 45) + 1;
//		System.out.println(number);
//		
//		rand = Math.random();
//		number = (int) (rand * 45) + 1;
//		System.out.println(number);
//		
//		rand = Math.random();
//		number = (int) (rand * 45) + 1;
//		
//		System.out.println(number);		
//		rand = Math.random();
//		number = (int) (rand * 45) + 1;
//		
//		System.out.println(number);
//		rand = Math.random();
//		number = (int) (rand * 45) + 1;
//		System.out.println(number);

		for (int i = 0; i < 6; i++) {
			double rand1 = Math.random();
			int number = (int) (rand1 * 45) + 1;
			System.out.println(number);
		}

		Scanner scan = new Scanner(System.in);

//		int c1 = scan.nextInt();

//		if( c1 < 0 ) {
//			System.out.println("영하입니다.");
//		}else {
//			System.out.println("영상입니다.");
//		};

//		int c3 = scan.nextInt();
//
//		// 입력 받은 값이 2000과 3000의 사잇값인지 출력
//		// if문을 활용 하여 입력 값이 2000~3000인지 확인
//		// 2000 초과 3000 미만 이어야 하므로 앤드(&&) 를 활용
//		if (2000 < c3 && c3 < 3000) {
//			System.out.println(c3 + "은 2000과 3000의 사잇값이 맞습니다.");
//		} else {
//			System.out.println(c3 + "은 2000과 3000의 사잇값이 아닙니다.");
//		}
		
		//월(month)를 입력 받았을때 해당 월이 어떤 계절인지 출력
		//3~5 = 봄
		//6~8 = 여름
		//9~11 = 가을
		//12~2 = 겨울
		
		int m = scan.nextInt();
		
		if ( 3 <= m && m <= 5 ) {
			System.out.println(m + "월은 봄 입니다.");
		}else if( 6 <= m && m <=8 ){
			System.out.println(m + "월은 여름 입니다.");
		}else if( 9 <= m && m <=11 ){
			System.out.println(m + "월은 가을 입니다.");
		}else if( 12 == m || m <=2 ){
			System.out.println(m + "월은 겨울 입니다.");
		}else{
			System.out.println("1월부터 12월까지만 입력 하세요.");
		}
		
}
}
