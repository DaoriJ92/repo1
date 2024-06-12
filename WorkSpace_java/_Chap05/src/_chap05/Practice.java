package chap05;

public class Practice {

	public static void main(String[] args) {

		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		int sum = 0;
		double avg = 0.0;

		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				System.out.println(array[i][j]);
//			}
//		}
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				sum = array[i][j] + 1;
//			}
//		} 실패
		int count=0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				sum = sum + array[i][j];
				count++;
			}
			
		}System.out.println("총합 : " + sum);
		
		//모든 요소를 하나씩 세기
//		System.out.println("개수 : "+count);
		
		//배열의 크기만 누적
		count = 0;
		for(int j=0; j<array.length; j++) {
			count +=array[j].length;
			
		}System.out.println((double)sum/count);
		
		//주어진 배열에서 최대값 찾기
		//전략 : 배열의 첫번째 값 부터 혹은 절대 아농ㄹ 수 없는 최저치를 기준으로
		// 기준값과 비교해서
		//큰 값을 새로운 기준으로 삼는다.
		// 그렇게 살아남은 값이 최대값
		
		int[] array2 = {1, 5, 3, 8, 2,9,3};
		int max = 0;//int가 가질 수 있는 최소값.
		for(int i=0; i<array2.length; i++) {
			if(array2[i] > max ) {
				max = array2[i];
			}
		}
		System.out.println("최대값 : " + max);
	}
}
