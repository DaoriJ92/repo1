package sec01.exam01;

public class RandomTest {

	public static void main(String[] args) {
	
		double rand = Math.random();
		// 0 이상 1 미만
		/*
		 * 0 <= rand && rand<1
		 * 0~0.99999999999999999
		 * 0*45<= rand * 45<1*45
		 * 0~45 * 0.99999999==44.99999999
		 * int 로 바꾸면
		 * 0~44까지 나오고 1을 더하면
		 * 1~45까지 random한 숫자가 나온다.
		 */
		
		
		int number = (int)(rand*45);//0~44까지
		number = number + 1; //0~45까지
		number = (int) (rand*45)+1; //위에거 합쳐서 한번에 쓴거
		
	number = ((int)(rand * 10000)) % 45 + 1;
	
	System.out.println(number);
	int a = 0;
	rand = Math.random();
	number = (int) (rand * 45 )+1;
	System.out.println(number);
	
	if( 30 < 50) {
		if ( a < 50) {
			System.out.println(12345);
		}
	}
	if(30 < a && a <50) {
		System.out.println(1234);
	}
	
	double rand = Math.random();
	double 답1 = rand * 100.0 ;
	// 0 <= rand < 100.0
//	(int)답1;
//	 System.out.println((int)-3.5);
	
	// 5 ~ 7 까지 랜덤으로 뽑고 싶을 때
	// 5 + (0 ~ 2)
//	int a02 = (int)(rand * 3);
//	int 결과 = a02 + 5 ;
	int 결과 = (int)(Math.random() * 3) + 5 ;
	
	
	
	
	
	}
} 
