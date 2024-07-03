package sec04.exam01;

import java.util.Scanner;

public class CalcExam {

	public static void main(String[] args) {
//		powerOn(); // 
//		powerOn(); // 
		Scanner scan = new Scanner(System.in);

		Calc calc = new Calc();
		calc.powerOff();
		System.out.println(calc);

		Calc calc2 = new Calc();
		System.out.println(calc2);

		Calc calc3 = new Calc();
		calc3.powerOn();
//		calc3.isOn = true;

		calc3.powerOn();

		int result = calc3.plus(3, calc3.plus(3, 8));
		System.out.println("plus 결과 : " + result);

		System.out.print("첫 번째 숫자를 입력하세요: ");
		int scan1 = scan.nextInt();
		System.out.print("두 번째 숫자를 입력하세요: ");
		int scan2 = scan.nextInt();
		double result1 = calc3.divide(scan1, scan2);
		System.out.printf("divide 결과 : %.3f", result1);

		System.out.println();
		System.out.println("========================");
		int[] c = { 2, 7 };
		System.out.println("plus2 결과 : " + calc3.plus2(c));

		int num = calc.plus3(1, 2, 3, 4);
		System.out.println("plus3 결과 : " + num);

		num = calc.plus3(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		System.out.println("plus3 결과 : " + num);
	}

	static void powerOn() {
		System.out.println("전원을 켭니다.");
	}

}
