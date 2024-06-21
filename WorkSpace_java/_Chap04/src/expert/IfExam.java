package expert;

public class IfExam {

	public static void main(String[] args) {

		int a = 10;
		boolean b = (a < 5);
		// if 문 안에는 boolean 만 들어간다.
		// 참 거짓으로 나뉘는 명제가 들어가야 하기때문에
		// boolean 만 들어간다.
		if (b) { // if(b == true){ 생략가능하나 강조의 의미로 적기도 함.
			System.out.println(a + "은(는) 5보다 큽니다.");
		} else if (a < 15) {
			System.out.println(a + "은(는) 15보다 작습니다.");
		} else if (a < 25) {
			System.out.println(a + "은(는) 25보다 작습니다.");
		}

		// 단독사건 , if문을 단독으로 사용 할 때
		if (b) {
			System.out.println(a + "은(는) 5보다 큽니다.");
		}

		if (a >= 5 && a < 15) {
			System.out.println(a + "은(는) 15보다 작습니다.");
		}

		if (a >= 15 && a < 25) {
			System.out.println(a + "은(는) 25보다 작습니다.");
		}

		boolean a1 = true;
		boolean a2 = true;
		boolean a3 = false;

		System.out.println(a1 && a3 && a2);
//		String b1 = "치킨";
		String b1 = null;
		
		//풀어서 쓰는 경우 에러가 났을경우를 방어 할 수 있다.
		if (b1 != null) {
			if (b1.length() > 4) {
				System.out.println( b1 );
			}
		}
		// &&(and)만 있는 경우 false가 나오는 순간 실행 중단 됨
		// 앞에 적힌 명제가 false로 중단 되어 출력값 없음
		if (b1 != null && b1.length() > 4) {
			
				System.out.println( b1 );

		}
		// ||(or)는 true 를 만나면 더 이상 실행하지 않음
		System.out.println(a1 || a3 || a2);
		// ||(or)는 연산 합, &&(and)는 연산 곱 으로 &&가 우선연산
		System.out.println(( false || true) && true );
		
		if( 30 < a && a < 50 ) {
			System.out.println(12345);
		};
		if( 30 < a ) {
			if( a < 50 ) {
				System.out.println(1234);
			}
		}
	}
}
