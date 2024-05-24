package sec01.exam01;

public class VarTypeExam {

	public static void main(String[] args) {

		byte b = 127;
//		b= 128;

		char c = 97;
		System.out.println(c);
		c = 97 + 5;
		System.out.println(c);
		char c1 = 'a'; // 문자 하나만 저장 하는 용도, 홑따옴표 ('')

		long balance = 30000000000L; // 명확하게 long으로 지정 하려면
										// 숫자 뒤에L,l을 붙여준다.
//	byte b 21 = 1L;

		String s = "문\t자\n열";
		System.out.println(s);
		s = "문문\t자";
		System.out.println(s);

		float f = 0.123456789123456789F;
//		소수점 이하 7번째 까지 정확
		System.out.println(f);
		double d = 0.123456789123456789F;
//		소수점 이하 16번째 까지 정확
		System.out.println(d);
		
		boolean b1 = true;
		boolean b2 = false;
	
		
		boolean car = false;
		
		String name =  "정다올";
		
		double py = 33e-1 ;
			
		System.out.println(py * 5);
	}

}
