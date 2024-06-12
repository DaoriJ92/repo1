package chap05;

public class ArrayCopyExam {

	public static void main(String[] args) {

		// 1호점에서 판매하는 메뉴
		String[] coffee = new String[3];
	 coffee[0] = "아아";
		coffee[0] = "따아";
		coffee[1] = "라떼";
		coffee[2] = "말차";

		// 2호점에서 1호점과 같은 메뉴 판매할것
		/*
		 * 얕은 복사 shallow copy, thin copy, call by reference stack 영역의 값(주소)만 복사 원본이 바뀌면
		 * 당연히도 내 값도 바뀜
		 */
		String[] coffee2 = coffee;
		for (int i = 0; i < coffee2.length; i++) {
			System.out.println(coffee2[i]);
		}

		// 얕은 복사로 연결 되어있기 때문에
		// 내껄 바꿔도 원본이 바뀐다.
		// 원본의 주소를 공유하고 있기 때문에 coffee나 coffee2는 같은 것.
		coffee2[1] = "연유라떼";
		System.out.println("coffee2[1]의 값을 바꾸고 원본인 coffee를 출력");
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}

		// 크기와 내용을 동일하게 가지는 새로운 배열을 만들겠다.

		/*
		 * 깊은 복사, deep copy, deep clone, call by value heap영역의 새로운 주소에 자리를 마련하고 변수에 주소를
		 * 넣는다. 그리고 원본의 값들을 복사해서 채워 넣는다. 그래서 원본과 동일한게 생기지만전혀 다른 주소를 가지게 된다. 즉, 내 값을 바꿔도
		 * 원본이 바뀌지 않음
		 */
		String[] coffee3 = new String[coffee.length];
//		coffee3[0] = coffee[0];
//		coffee3[3]="따아";//수동이라 원본이 바뀌면 이것도 수정해야함.
		for (int i = 0; i < coffee3.length; i++) {
			coffee3[i] = coffee[i];
		}
		System.out.println("coffee3출력");
		coffee3[2] = "아샷추";
		for (int i = 0; i < coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		System.out.println("coffee3[2]의 값을 바꾸고 원본인 coffee출력");
		for (int i = 0; i < coffee.length; i++) {
			System.out.println(coffee[i]);
		}

// coffee3에 "사라다빵"을 추가 하려면?
// coffee3 = new String[]{"따아", "연유라떼", "아샷추", "사라다빵"};
		/*
		 * 전략 : coffee의 크기보다 1개 많은 새로운 배열을 만들곡 앞에서부터 복사해 놓고 마지막에 추가할 값을 적어보자
		 * 
		 */
		coffee3 = new String[coffee.length + 1];
		for (int i = 0; i < coffee.length; i++) {
			coffee3[i] = coffee[i];
		}
//비어있는 
		coffee3[3] = "사라다빵";
		for (int i = 0; i < coffee3.length; i++) {
			System.out.println(coffee3[i]);
		}
		
		//향상된 for문
		System.out.println("향상된 for문");
	//	int cnt = 0;
		for( String menu : coffee3) {
			//cnt++;
			System.out.println(menu);
		}
		//모든 자식 배열의 크기가 같게 선언할 수 밖에 없음
		int[][] a2 = new int[10][100];
		
		//자식 배열의 크기를 다르게 선언할 수 있음.
		int[][] a3 = {{1,2}, {1,2,3}};
		
	}

}
