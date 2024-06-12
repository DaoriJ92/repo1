package sec01.exam01;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {

		// 은행 계좌의 잔고 관리 시스템
		// 1. 입금 2. 출금 3. 조회 4. 종료
		// 입금 : 잔액에 더하기
		// *0, 음수는 실행되지 않게 - 금액을 확인하세요
		// 출금 : 잔액에서 빼기
		// * 잔액보다 큰 금액은 실행되지 않게 - 잔고가 부족합니다.
		// 조회 : 잔액 출력
		// 종료 : 반복 종료

		int balance = -1;
		int x = 0;// 잔고변수
		int y = 0;
		boolean run = true;
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.예금  2.출금  3.잔고  4.종료");
			System.out.println("-------------------------------------");
			System.out.println("선택>");
			balance = scan.nextInt();
			System.out.println();
			if (balance == 1) {
				System.out.println("예금>");
				y = scan.nextInt();
				if (y < 0) {
					System.out.println("0원이상 입금해 주세요");continue;
				
				}
				x = x + y;
				{
					System.out.println(y + "원이 입금되었습니다.");
				}
			} else if (balance == 2) {
				System.out.println("출금>");
				y = scan.nextInt();
				if(y>x) {System.out.println("잔액이 부족합니다"); continue;}
				x = x - y;
				System.out.println(y+"원을 출금하였습니다.");
			} else if (balance == 3) {
				System.out.println("잔고>   ");
				System.out.println(x);
			
			} else if (balance == 4) {
				System.out.println("종료");
				run=false;
				break;
			}

//				switch (balance) {
//				case 1 : 
//					System.out.println("예금액>");
//					y= scan.nextInt();
//					
//					if(y<0) {
//						System.out.println("0원 이상 입금해주세요");
//						break;
//					}
//					x=x+y;
//					System.out.println(y+"원이 입금되었습니다.");
//					break;
//				case 2 :
//					System.out.println("출금액>");
//					y= scan.nextInt();
//					
//					if(y>x) {
//						System.out.println("잔액이 부족합니다.");
//					break;	
//					}
//					x=x-y;
//					System.out.println(y+"원을 출금하였습니다.");
//					break;
//				case 3: 
//					System.out.println("잔고>");
//					System.out.println(x);
//					
//					break;
//				case 4 :
//					System.out.println("종료");
//					run=false;
//					break;
//				}
//
//			}
//		}
		}
	}
}
