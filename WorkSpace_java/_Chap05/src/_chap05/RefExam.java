package chap05;

public class RefExam {

	public static void main(String[] args) {
		
		int a;
//		System.out.println(a);
//		int b = a;
		
		String c = "남현우";	// c는 stack 영역
		// 오른쪽이 먼저 실행 되므로 본인 이름이
	  	// heap 비어있는 번지에 들어감
		// stack영역의 c에 그 번지가 기록된다.
		System.out.println(" c : " + c);
		System.out.println( " c == null : "+(c == null));
		System.out.println( "c != null : " +(c != null));
		
		c = null; //주소값을 비워서 연결 끊기.	
		System.out.println(" c : " + c);
		System.out.println( " c == null : "+(c == null));
		System.out.println( "c != null : " +(c != null));
		
		String d;
		// 기본 타입과 마찬가지로
		// 값을 할당하지 않으면 사용할 수 없다.
		d = "남현우";
		c = "남현우"; // ==비교시 true가 나옴
		System.out.println( c ==d );
		//이건 String 특별대우
		
		c = new String("남현우");//새로운 주소에 할당.
//		System.out.println(d);
		System.out.println( c ==d ); // 결과 : false
		//c가 가지고 있는 주소와 d의 주소값이 달다.
		System.out.println("c.equals(d) : " + c.equals(d));
		
		c=null;
//		System.out.println("c.equals(d) : " + c.equals(d));
		String e = c + "abc";
		System.out.println(e);
	}

}
