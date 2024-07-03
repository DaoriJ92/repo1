package sec04.exam01;

public class Calc {

	boolean isOn = false;

	void powerOff() {
		System.out.println("전원을 끕니다.");
	}

	void num1() {
		powerOff();
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
		isOn = true;
	}
		
		/*
		 * 더하기
		 * 두 수를 받아서 다한 결과를 돌려줌
		 * 
		 * 메소드명 : plus
		 * 전달인자 : int, int
		 * 리턴타입 : int (두 수를 더한 결과)
		 * 
		 * @author : kuma4075@gmail
		 * @param : int x, int y
		 * @return : int 		 
		 * */
		int plus(int x, int y) {
			System.out.println("x : " + x);
			System.out.println("y : " + y);
			
			return x + y;
		}
		/*
		 * 나누기
		 * 두 정수를 받아서 나눈 결과를 실수로 돌려줌
		 * 메소드명 : divide
		 * 전달인자 : int, int
		 * 리턴타입 : double (두 수를 나눈 결과)
		 * 방어코딩 : 0이라면 "0으로 나눌 수 없습니다" 출력
		 * return 값은 0으로 고정
		 * @param : int a, int b
		 * @return : double 
		 */
		
		
		double divide(int a, int b) {
			System.out.println("a : " + a);
			System.out.println("b : " + b);
			if(b==0) {
				System.out.println("0으로 나눌 수 없습니다." );
				return 0;
			};
			return (double)a / b;
		
		}
		/**
		 * 더하기 2
		 * 
		 * 전달인자 : int 배열
		 * 리턴타입 : int 
		 */
		
		int plus2(int[] num) {
			int x = num[0];
			int y = num[1];
			
			return x + y;
		}
		
		/**
		 * 전달인자의 개수를 지정하지 않고
		 * 전달 받은만큼 처리하는 방법
		 * "..." 가변인자, 가변 길이 파라메터
		 * 전달 받은 모든 전달인자를 배열로 처리
		 */
		int plus3(int ...num) {
			System.out.println("num : " + num);
			
			int sum = 0;
			for(int i = 0; i<num.length; i++) {
				sum = sum +num[i];
			}
			
			return sum;
		}
		
}
