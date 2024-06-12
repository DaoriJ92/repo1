package chap05;

public class Practice2 {

	public static void main(String[] args) {

		// {1, 5, 2, 4}
		// 배열 뒤집기 : {4, 2, 5, 1}
		// 첫 번째 자리에 0 넣기 : { 0, 1, 5, 2, 4}
		// 마지막 숫자를 첫 번째에 넣기 : {4, 1, 5, 2}
		// (원형큐 Circular Queue)

		// 배열의 개수를 좀 늘려서
		// {3, 4, 7, 5, 1, 4, 6, 4, 5}
		// 홀수와 짝수의 각각 개수를 출력
		// 주어진 수(ex)4 보다 큰 숫자의 개수

//조금 어려운 문제
		// 두번째 최대값
		// 내림차순으로 정렬

		// 로또 6개 번호(1~45)
		// 중복되지 않게 숫자 선정

		// 자리 예약
		// 자리가 10 개가 있는 소극장 예약 시스템.
		// 번호는 1~10번까지 번호의 자리가 있음.
		// 예약할 자리는? 하고 입력 받음.
		// 예약이 가능하면 "예약했습니다"
		// 예약 불가능 하면 " 이미 예약이 되어 있습니다"
		// 남은 자리 출력.
		// 모든 자리의 예약 가능 여부 출력
		// 예약 가능한 자리만 출력.

// 임시 비밀번호 8자리
		// 모두다 숫자로
		// 모두다 소문자로(hint : char ascii)
		// 숫자 2개 이상, 대 문자 1개 이상, 소문자 1개 이상 조합.
		// array 2의 첫번째 방에다가 array의 마지막에서 첫번째 거를 넣고
		// array2의 두번째 방에다가 뒤에서 두번째 꺼를 넣는다.
		int[] array = { 1, 5, 2, 4 };// length는 index 처리가 아니기 때문에 1부터 시작.

//		int[] array2 = new int[array.length];
//		for (int j = 0; j < array2.length; j++) {
//			array2[j] = array[array.length-1-j];}
//for(int j=0; j<array2.length;j++) {System.out.println(array2[j]);}
		
//		//2번
//		int[] array2 = new int[array.length];
//		array2=new int[array.length+1];
//		array2[0] = 0;
//		for (int i = 0; i < array.length; i++) {
//			array2[i+1] = array[i];
//			
//		}
//		
//		for (int i = 0; i < array2.length; i++) {
//			System.out.println(array2[i]);
//		}
		
		//3번 못품
//		int[]array2 =new int[array.length];
//		for(int i = 0; i<array2.length; i++) {
//			array2[(i+1)%array.length]=array[i];
//		} for (int i=0; i<array2.length; i++) {
//		System.out.println(array2[i]);
//		}
		//홀수 odd  짝수 even
//4번 홀짝 구하기
		int[]arrayy= {3, 4, 7, 5, 1, 4, 6, 4, 5};
//		int h=0;
//		int j=0;
//		int i;
//		for(i = 0; i<arrayy.length; i++) {
//			int number=arrayy[i];
//			if(number%2==0) {j++;}else {
//				h++;
//			}
//		
//		}
//		System.out.println("홀수 : " +h);
//		System.out.println("짝수 : " +j);
		
		//5번 품
//		int four=4;
//		int count=0;
//		for(int i = 0; i<arrayy.length; i++) {
//			if(arrayy[i]>four) {
//				
//				count++;
//			}
//		}
//		System.out.println(count);
		
//6번
		int max2=0;
		for(int i = 0; i<arrayy.length; i++) {
			if(arrayy[i]>max2) {
				max2=arrayy[i];
				
			}
		}
		System.out.println(max2);
	}
}
