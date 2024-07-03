package sec04.exam05;

public class Fan {

	/**
	 * 문제 1* 선풍기 fan 전원 상태를 저장 할 필요가 있다. 
	 * 전원 on / off 기능 각각 전원 상태 값을 변경 
	 * 미풍, 약풍, 강풍 기능
	 * FanExam에서 Fan의 약풍 실행 전원이 켜진 상태에서만 작동 
	 * 선풍기 풍량을 int speed; 로 주고 각각의 버튼을 btn 으로 대체 
	 * 미풍을 = 1; 약풍을 = 2; 강풍을 = 3; 으로 주고 
	 * while문을 활용하여 작성 
	 * fan speed 메서드를 새로 만들어 사용
	 * Scanner를 사용하여 실제 버튼을 대체
	 */

	int fan;
	int speed = 0;

	boolean sw = false;

	void powerOff() {
		System.out.println("전원을 끕니다.");
		sw = false;
	}

	void powerOn() {
		System.out.println("전원을 켭니다.");
		sw = true;
	}

	void fanSpeed(int btn) {
		// powerOff일때의 작동 및 출력값 추가
		// 이 안에 while문을 적용 하였었으나 실패
		if (sw == false ) {			
			System.out.println("전원이 꺼져 있습니다. 전원을 켜주세요.");
			return;
		}
		if (btn == 1) {
			System.out.println("미풍입니다.");
			speed = 1;
		} else if (btn == 2) {
			System.out.println("약풍입니다.");
			speed = 2;
		} else if (btn == 3) {
			System.out.println("강풍입니다.");
			speed = 3;
		} else if (btn == 0) {
			System.out.println("작동을 정지합니다.");
			sw = false;
			speed = 0;
		} else {
			System.out.println("0~3 까지만 입력하세요.");
		}
	}

}
