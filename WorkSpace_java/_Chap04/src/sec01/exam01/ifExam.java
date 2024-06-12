package sec01.exam01;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		
		int score=91;
		
		if(score>=90) {
			System.out.println("90점 이상입니다");
			
		if(score >= 95) {
			System.out.println("95점 이상입니다");
		}
		}

		if(score<90) {
			System.out.println("90점 미만입니다");
		}
		//참고로
		boolean up90 = score >= 90;
		if(up90) {
			System.out.println("up90");
		}
		if(!up90) {System.out.println("참");}
		
		if(up90) {System.out.println("참");}
		else {
			//위의 조건이 하나도 만족하지 않는 경우 무조건 실행
			System.out.println("거짓");
		}
		if(score >=90) {
			System.out.println("90점 이상입니다");
			System.out.println("학점은 A");
		}
		if(score < 90 && score>=80) {
			System.out.println("90점 미만 80점 이상입니다");
			System.out.println("학점은 B");
		}
		//if, else, else if 이런식으로 묶여있으면 하나만 실행된다.
	if(score >= 90) {
		System.out.println("학점은 A");
	}else if(score <90 && score >=80) {
		System.out.println("학점은 B");
	}else {System.out.println("학점은 C");
	}
	
	if(score>=90) {
		System.out.println("90점 이상입니다.");
	}
	else if(score>=80){System.out.println("학점은 B");
	//이거 위에 조건이 거짓일 때만 여기로 온다.
	}
	//3은 짝수인가?
//	int num =4;
	Scanner input = new Scanner (System.in);
//	num = input.nextInt();
//	if(num % 2 ==1) {
//		System.out.println("홀수");
//	} else {
//		System.out.println("짝수");
//	}
	String a ="abc";
	String b = "abc";
	//b = input.nextLine();
	//if(a==b)
	
//	if(a.equals(b)) {
//		System.out.println("a와 b가 같다");
//	}else {
//		System.out.println("a와 b가 다르다");
//	}
//	double rand = Math.random();
//	System.out.println("rand : "+ rand);
//	
	
	//주사위
	
	//주사위 : 1 ~6까지
	
	double rand1 = Math.random();
	int number = (int)(rand1*6);
	number = number +1;
	number = (int)(rand1*6)+1;
	System.out.println("주사위 숫자는 : " + number);
	
	if(number == 6) {System.out.println("와 6이나왔군요");
	}
	else if(number == 2) {System.out.println("주사위 2가 나왔습니다.");
	
	}
	
	switch(number) {
	case 1: System.out.println("주사위 1이 나왔습니다.");
	break;
	case 2: System.out.println("주사위 2이 나왔습니다.");
	break;
	case 3: System.out.println("주사위 3이 나왔습니다.");
	break;
	case 4: System.out.println("주사위 4이 나왔습니다.");
	break;
	case 5: System.out.println("주사위 5이 나왔습니다.");
	break;
	default: System.out.println("주사위 6이 나왔습니다.");
	break;
	}
	
	double rand = Math.random();
	int rsp = (int)(rand *3);
	if(rsp==0) {
		System.out.println("가위");
	}else if (rsp==1) {
		System.out.println("바위");
	}else {
		System.out.println("보");
	}
	
	int my = 1;
	
	if( rsp == my ) {System.out.println("비김");}
	if(rsp==0 && my==0) {System.out.println("비김");
	}else if(rsp ==0 && my ==1) {
		System.out.println("내가 이김");}
	else if( rsp == 0 && my == 2) {System.out.println("내가 짐");}
	
	int month = 5;
	
	if( month >= 3 && month <= 5) {
		System.out.println("봄");
	} else if ( month>=6 && month <=8) {
		System.out.println("여름");
	}else if ( month >=9 && month <=11) {
		System.out.println("가을");
	}else if ( month == 12 || month == 1 || month== 2) {
		System.out.println("겨울");
	}
	switch(month) {
	case 3 :
	case 4 :
	case 5 :
		System.out.println("봄2");
				break;
	case 6:
	case 7:
	case 8:
			System.out.println("여름2");
					break;
			case 9 :
			case 10 :
			case 11 :
				System.out.println("가을2");
				break;
				default :
					System.out.println("여름2");
							break;
			// char, byte, short, int(즉 int 이하), string만
			// boolean, long, float, double은 못씀
							
	}
	}

}
