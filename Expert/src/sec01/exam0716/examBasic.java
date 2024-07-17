package sec01.exam0716;

import java.util.Scanner;

public class examBasic {

	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		/*
		 * Q4 10개의 값을 담는 int 배열을 선언하고, 1부터 10의 값을 할당하는 프로그램을 작성하세요.
		 */

//		int[] t = new int[10];
////		t1 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//		int t1;
//		for (t1 = 0; t1 <= 9; t1 = t1 + 1 ) {
//			t[t1] = (t1 + 1);
//		};
//		
//		for (int i = 0; i <= 9 ; i++) {
//			System.out.println(t[i]);
//		}

		/*
		 * Q5. 5개의 양의 정수를 입력받고, 입력받은 수들을 차례대로 출력하는 프로그램을 작성하세요. 
		 * 이때, 중복된 수는 "한 번만"출력합니다.
		 * (한 번 출력된 수는 다시 출력하지 않습니다) 
		 * ex1) 입력 : 1 2 3 4 5 -> 출력 : 1 2 3 4 5 
		 * ex2) 입력 : 1 2 2 3 2 -> 출력 : 1 2 3 
		 * ex3) 입력 : 1 1 1 1 1 -> 출력 : 1 
		 * ex4) 입력 : 1 2 1 1 1 -> 출력 : 1 2 
		 */
		int[] a1 =  new int[10];
		int b;
		b = s1.nextInt();
		for(int i = 0 ; i <= 4 ; i++) {
			a1[i] = b;
		}
	}

}
