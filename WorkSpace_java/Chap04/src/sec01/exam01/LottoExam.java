package sec01.exam01;

public class LottoExam {

	public static void main(String[] args) {

		double rand = Math.random();
//		0이상 1미만
		/*
		 * 0 <= rand && rand < 1 0 ~ 0.99999999999
		 * 
		 * 0 * 45 <= rand * 45 < 1*45 0 ~ 45 * 0.99999999 == 44.999999999 int로 바꾸면 0 ~
		 * 44 까지 나오고 +1을 하면 1~45 까지 random 한 숫자가 나온다.
		 * 
		 */
		int number = (int) (rand * 45); // 0 ~ 44
		number = number + 1; // 0 ~ 45
		number = (int) (rand * 45) + 1; // 축약

		number = ((int) (rand * 10000)) % 45 + 1;

		System.out.println(number);
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		
		System.out.println(number);
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);
		
		rand = Math.random();
		number = (int) (rand * 45) + 1;
		System.out.println(number);
	}

}
