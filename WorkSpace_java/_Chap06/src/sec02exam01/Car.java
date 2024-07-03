package sec02exam01;

public class Car {

	// 필드
	// class 안에서 공통으로 사용 할 변수 선언이 가능 한 곳
	// 변수 선언과 동시에 초기화는 가능
	// 따로 변수에 값을 변경 하는건 불가능
	
	
	String model = "EV9";
	// model 변수 선언과 동시에 초기화
	// 0, false, null로 자동 초기화 됨	
	int speed;
	// 변수 선언만
	
	// speed 변수의 값을 60으로 바구는 행동(바꾸는걸 실행)
	// 필드 영역에서는 실행(행동)하면 에러
//	speed = 60;
}
