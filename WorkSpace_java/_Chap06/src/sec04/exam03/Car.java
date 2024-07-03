package sec04.exam03;

public class Car {
			
	int gas = 5;
	
	
	// 필드
	// 클래스 생성(new 하는 순간)과 함께 생성 되고
	// 클래스 소멸 시 까지 생존
	// 메모리를 차지함
	// 계속 저장된다.
	// 메소드에서 변경하는 경우
	// 다음번 실행까지 저장해둠.
	// 그렇기 때문에 계속 초기화 해야하는 상황이 올 수 있다.
	// 클래스 안의 모든 곳에서 사용 가능하다.
	
	
	// gas의 값이 0 이면 false
	// 그렇지 않으면 true
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		} else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	// 주행
	// gas가 없을때 까지 주행
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("주행중...잔량 : "+ gas);
				gas--;
			} else {
				System.out.println("주행 종료...잔량 : "+ gas);
				// 리턴 타입이 void 이므로 아무 값도 돌려주면 안된다.
				// return을 마나면 그 즉시 메소드 종료.
				// break 대신 사용 됨.
				return;
			}
		}
	}
	
	String name;
	
	// name의 값을 변경
	// name의 길이가 0인경우 변경하지 않음
	// 전달인자 : String
	// 리턴타입 : 없음
	void setName(String nick) {
		System.out.println(nick.length());
		if(nick.length() !=0) {
			name = nick;
		} else { 
			System.out.println("이름은 필수입니다.");
		}
		
	}
}
