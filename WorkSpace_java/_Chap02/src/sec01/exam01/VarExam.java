package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 변수 명을 정하는 규칙
		 *
		 * 1. 숫자로 시작하면 안됨.
		 * 2. 예약어는 쓸 수 없음. ex)int, double.....
		 * 3. 특수문자는 _ $만 사용 가능. ex) int_a; int my_name;  int $a;
		 * 4. 소문자로 시작하는게 좋다.
		 * 
		 */
		
		
		// 변수 선언 : 자료의 종류(타입) 한칸띄고 이름표
		int score; // 선언부
		score = 90; // 할당, 값을 넣기
		
//		int value;
//		value = 30;
		int value=30; //선언과 동시에 초기화
		
		value = 31;
		
	int value2 = score + value ;
//		             90    +  31
	
		
		int val;
		// 선언을 하지 않은 변수는 사용할 수 없다.
		// 선언만 하고 값을 넣지 않는 변수는 사용할 수 없다.
		// int val2 = val +10;
		
		// 같은 이름의 변수를 선언할 수 없다.
//		int val;
		
		System.out.println(value2);
		
		int var1 = 10;
		int var2 = 20;
		
		System.out.println("var1 : " + var1);
		System.out.println("var2 : " + var2);
		System.out.println("var1 : " + var2);
		var2 = 30;
		System.out.println("var1 : " + var2);
		System.out.println("var1 : " + var2);
		
		int x = 10;
		int y = x;
		
		int j = 1;
		{ //int j = 2;
		//변수는 자손 중괄호{}에도 영향을 미친다. 같은 변수 사용 불가
		}
		{
			//변수는 선언된 중괄호{}가 끝나면 사라진다
			int i = 0;
		}
		//int i= 1;
		
		
	}
	
	

}
