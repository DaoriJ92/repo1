package sec01.exam01;

public class 연산자Exam {

	public static void main(String[] args) {

		int a = 10;
//	a = 11;
//	a = 10+1;
		int b = a + 1;

//	a = 10 + 1
		a = a + 1; // a = 1 + a
		a += 1; // a = a + 1 과 같다
		a++; // ++a; 세가지 모두 같은 의미 단축식 +1 일때만 가능

		System.out.println();
		System.out.println("-----------------");

		a = 10;
		a++;
		System.out.println("a : " + a);

		a = a - 2; // +경우와 마찬가지
		a -= 2; //
		a -= 1; //
		a--; // --a; a = a - 1 ; -1 일떄만 가능

		System.out.println();
		System.out.println("-----------------");

		a = 10;
		a--;
		System.out.println("a : " + a);
//		a가 9인 상태
		System.out.println("++a : " + ++a); // 출력 : 10
//		a가 10
		System.out.println("a++ : " + a++); // 출력 : 10
		System.out.println(" a : " + a); // 출력 : 11
//		a가 11

		System.out.println(a++ + ++a);
//		11 + (a 가 12가 된 상태 + 1 해서 예측): 11 + 13 = 24
//		풀어쓰기
		a = 11;
		int result = a; // a
		a = a + 1; // a 다음에 오는 ++
		a = a + 1; // 두번째 a 앞에오는++
		result = result + a;
		System.out.println(result);

		boolean c = true;
		System.out.println(" c: " + c);
		c = !c; // ! : 논리 부정연산자 (반대의미)
		System.out.println(" c : " + c);

		double d = 7.0;
		System.out.println(d / 3);
//		System.out.println(d / 0); // double 일때는 infinity, 
		// int 일때는 / by zero 표시
		int f = 14;
		int p = 5;
		System.out.println("몫 : " + (f / p));
		System.out.println("나머지 : " + (f % p));

		int money = 10000;
		int coffee = 4500;
		int count = money / coffee;
		System.out.println(count + "잔");
		int change = money % coffee;
		System.out.println("잔돈 :" + change);

//		올리브영 에서 전품목 15% 행사를 합니다.
//		1. 홍차 : 5000을 샀을때 얼마를 내야 하나?
//		2. 홍차5000 + 립스틱14000 을 샀을때 금액

		double percent = 0.15;
		int tea = 5000;
		int lip = 14000;
		double discount = (tea * percent) + (lip * percent);
		System.out.println("할인받을 금액 : " + discount);
		double pay = (tea + lip) - discount;
		System.out.println("지불 금액 : " + pay);

//		7234원을 각각의 금액권으로 몇개씩 필요한지 표현하시오
//		5000원, 1000원, 500원, 100원, 50원, 10원

		int sum = 7234;
		int w = 5000;
		int e = 1000;
		int r = 500;
		int q = 100;
		int t = 50;
		int y = 10;

		int countg = sum / w; // 5000원권 개수
		sum %= w; // 5000원권을 제외한 나머지 금액
//		sum = sum % w;
		int counte = sum / e; // 1000원권 개수
		sum %= e; // 1000원권을 제외한 나머지 금액
//		sum = sum % e;
		int countr = sum / r; // 500원 주화 개수
		sum = sum % r; // 500원 주화를 제외한 나머지 금액

		int countq = sum / q; // 100원 주화 개수
		sum = sum % q; // 50원 주화를 제외한 나머지 금액

		int countt = sum / t; // 50원 주화 개수
		sum = sum % t; // 10원 주화를 제외한 나머지 금액

		int county = sum / y; // 10원 주화 개수
		System.out.println("필요 금액권 : " + w + "원권 " + countg + "장, " + e + "원권 " + counte + "장, " + r + "원 주화 " + countr
				+ "개, " + q + "원 주화 " + countq + "개, " + t + "원 주화 " + countt + "개, " + y + "원 주화 " + county + "개 ");
		System.out.println("---------------------------------------------");
		String left = "수박";
		String right = "멜론";
		// 단 left = "멜론", right = "수박" 금지
		System.out.println(left);
		System.out.println(right);
		System.out.println("------------------");
		String bubu = left; // bubu = left
//		System.out.println(bubu); 출력값 : "멜론"

		left = right;

//		System.out.println(left); 출력값 : "멜론"
//		System.out.println(right); 출력값 : "멜론"
		right = bubu; // 위 상태로는 right가 그대로 멜론으로 출력 되므로 적용
//      System.out.println(right); 출력값 : "수박"
		System.out.println(left); // 결과 : 멜론
		System.out.println(right); // 결과 : 수박

		System.out.println();
		System.out.println("----------------------------------------------------------");

		System.out.println(3 > 5);
		boolean bool = 3 > 5;
		System.out.println(bool);

		System.out.println(0.1 == 0.1f); // 결과 false
		// 같은타입으로 변경해서 비교하자
		System.out.println((float) 0.1 == 0.1f);
		System.out.println();
		System.out.println("----------------------------------------------------------");

		String str1 = "정다올";
		String str2 = "정다올";
//      System.out.println(str1 == str2);
//		글씨 비교는 == 금지
//		STring 변수나 ""에  .equals() 붙여서 사용. () 안에 글씨와 앞에 써진부분을 비교
		System.out.println(str1.equals(str2)); // 출력값 : true

//		1010(2) == 10
//&
//		0011(2) == 3
//		
		System.out.println();
		System.out.println("----------------------------------------------------------");

		System.out.println(10 & 3);
		System.out.println(10 | 3);

		int i1 = 3;
		int i2 = 5;
		int i3 = 7;

		System.out.println("i3이 가장 큰 값인가? " + 
						( ( i3 >= i1 ) && (i3 >= i2 )));
		boolean i4 = i3 > i2 ;
		System.out.println( i4 ?"i3이 크다" : "i3이 작거나 같다"  );
		
		int x = 10;
		int u = 20;
		
		int z= ( ++x ) + ( u-- );		
//		         x+1  
		System.out.println( z );
		
		
	}

}
