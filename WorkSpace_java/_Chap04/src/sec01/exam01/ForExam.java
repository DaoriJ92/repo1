package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {
	
		
//		//1씩 증가하는걸 5번 할거임.
//		int sum = 0;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//		sum = sum + 1;
//System.out.println(sum);
//
//// 1 + 2 + 3 + 4
//// 참고로 1~n까지 더한 값
////n*(n+1) /2
//		sum=0;
//		sum= sum +1;
//		sum= sum +2;
//		sum= sum +3;
//		sum= sum +4;
//		sum= sum +5;
//		System.out.println(sum);
//		
//		// 1,2,3..에 해당하는 걸 변수에 넣어보기
//		sum = 0;
//		//초기화 식ㄴ
//		
//		int i = 1;
//		sum = sum + i;
//		
//		//증감식
//		i++;// i == 2
//		
//		//실행문
//		sum = sum + i; //+2
//		
//		i++;//i==3
//		sum=sum +i;
//		
//		
//		
//		/*
//		 * 반복문 만드는 원리
//		 * 반복 되는 것 찾기.Ctrl+c, v 해도 바뀌지 않는 것.
//		 * 반복되지 않는 것
//		 * 		패턴을 찾을 수 있다면 반복문으로 만들 수 있음
//		 * 		변수를 활용해서 반복되게 만들기
//		 * 
//		 * 반복 되지 않는 것의
//		 * 시작조건찾기
//		 * 종료 조건 찾기
//		 * 
//		 * for : 반복 횟수를 아는 경우
//		* while : 반복 횟수를 모르는 경우
//		 */
//		
//		//for(초기화식; 조건; 증감식)
//		//조건이 참이면
//		//실행블럭 실행하고
//		//증감식 실행하고
//		//다시 조건 보기 반복
//		//for(초기화식; 조건; 증감식){
//		//  실행블럭
//		// }
//		
////		int sum2=0;
////		for(	int e = 1; e <= 100	;e++	) {
////			sum2 = sum2 + e;
////			System.out.println("안쪽에서는 e :" + e + ", sum2 : "+ sum2);
////			
////			
////		}  System.out.println("for 사용 sum2 :"+sum2);
//		
////		int sum3=0;
////		for(int o =1; o<=100 ; o++) {
////			sum3=sum3+o;}
////		System.out.println("1부터 100까지 합은 : " +sum3);
//		//조급 쉽게 1~10까지 출력
//		// 첫번째 방법
////		System.out.println(1);
////		System.out.println(2);
////		System.out.println(3);
////		System.out.println(4);
//		//반복되는 걸 찾는 쉬운 방법
//		// 일단 복사한다
//		// 그리고 붙여넣는다
//		// 마지막으로 변경할 걸 찾는다.
//		// 변경하는 규칙도 찾는다.
////		System.out.println(5);
////		int i2 = 5+1;
////		System.out.println(i2); // 6
////		i2=i2+1;
////		System.out.println(i2);
//		
//		System.out.println("---------------------");
//	//for 로 만들자
//		for(int i3 = 1; i3 <=10; i3=i3+1) {
//	System.out.println(i3+",");		
//		}
//		//1~10까지 짝수만 출력하기
//		// 1. 증감식 이용하기
//		// 2. if문 이용하기
////		for(int i4=2; i4<=10; i4=i4+2 ) {
////			System.out.println(i4);
////		}
////		for(int i5=0; i5<=10; i5++) {
////			if(i5%2==0) {System.out.println(i5);}
////		}
////			System.out.println("----------------------------");
////			//1~10까지 한줄에 3개씩 출력되게.
//////		for(int i6=1; i6<=10; i6++) {
//////		}
//////			int num3 = 3;
//////			if(num3 % 3 ==0) {
//////				System.out.println();
//////			}
//////			
//////			for(int num4 = 1; num4 <=10; num4++) {
//////				System.out.println(num4+",");
////				if(num4 % 3==0) {System.out.println();}
////			}
////			int j = 0;
////			for( ; j<=10; j++) {
////				System.out.println("j : "+ j);
//			
//				int x, y;
//				//1~100까지 3의 배수가 몇개 있는가.
//				int count=0;
//				for(int num5=1; num5<=100; num5+=1 ) {
//					if(num5 % 3 ==0) {
//						count++;
//						
//					}
//				}System.out.println("3의 배수의 갯수는 :" + count);
//				
//				
//				
//			}
//}
for(int k=1; k<=5; k++) {
	for(int l=5-k; l>0; l-- ) {
		System.out.print("-");
	}
	for(int m=2*k-1; m>0; m--) {
		System.out.print("+");
	}
System.out.println();
}}}
	

