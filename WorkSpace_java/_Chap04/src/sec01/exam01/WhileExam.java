package sec01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {

//		int i = 1;
//		while (i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		Scanner scan = new Scanner(System.in);
//		System.out.println("메뉴를 고르세요");
//		System.out.println("1 : 커피 , 2: : 차 , 3 : 음료 , 0 : 종료");
//		int menu = scan.nextInt();
//		if (menu == 1) {
//			System.out.println("커피");
//		} else if (menu == 2) {
//			System.out.println("홍차");
//		} else if (menu == 3) {
//			System.out.println("음료");
//		} else if (menu == 0) {
//			System.out.println("다음에 또 오세요");
//		}
		int menu1 = -1;//0이 아닌 값을 적어놓고 while 실행되게 만듦
		// 몇 번 반복할지 모를 때 적당하다.
		
		while (menu1 != 0) {
			System.out.println("메뉴를 고르세요");
			System.out.println("1 : 커피 , 2: : 차 , 3 : 음료 , 0 : 종료");
			menu1 = scan.nextInt();
			if(menu1 >=0 && menu1<=3) {
			if (menu1 == 1) {
				System.out.println("커피");
			} else if (menu1 == 2) {
				System.out.println("홍차");
			} else if (menu1 == 3) {
				System.out.println("음료");
			} else if (menu1 == 0) {
				System.out.println("다음에 또 오세요");
			}

		} else {System.out.println("메뉴를 다시 선택해 주세요");

	}
//do {System.out.println("메뉴를 고르세요");
//	System.out.println("1 : 커피 , 2: : 차 , 3 : 음료 , 0 : 종료");}

}
}}
