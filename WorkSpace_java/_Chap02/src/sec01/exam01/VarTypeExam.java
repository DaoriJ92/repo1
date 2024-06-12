package sec01.exam01;

public class VarTypeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		byte b = 127;
//		b = 128;
		
		char c = 97;
		System.out.println(c);
		c = 97 + 5;
		System.out.println(c);
		char c1 = 'a'; //문자 하나만 저장하는 용도, 홀 따옴표'로 감싼다.
		
		long balance = 3000000000l;//명확하게 long로 지정하려면 
								   // 숫자 뒤에 L또는 l을 붙여준다.
		
		String s ="문\t자\n열";
		System.out.println(s);
		s = "문문\t자";
		System.out.println(s);
		
		float f = 0.1234567890123456789f;
		System.out.println(f);//float은 소수점 7째 자리 까지만 정확하게 나옴
		
		double d = 0.1234567890123456789;
		System.out.println(d); //double은 소수점 16째 자리 까지.
		
		boolean b1 = true;
		boolean b2 = false;
		
		
		
		
	}

}
