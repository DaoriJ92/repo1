package chap05;

import java.util.ArrayList;

public class ArrayExam {

	public static void main(String[] args) {
		
		// 기본 타입에는 null을 넣을 수 없음.
		//int a = null ; 
		//null은 int, double이 아니다.
		
		// 배열
		// 한번에 여러 변수를 만드는 방법
		// 같은 타입만 선언할 수 있음
		// 생선된 여러 변수들은 index로 관리할 수 있다.
		
		//선언 방법
		//*int로 구성된 배열이다.
		int[] score;// java스타일
		int score2[];//c스타일
		
		score = null;
		
		int[] score3 = null;
		
		int score_0 = 90;
		int score_1 = 60;
		int score_2 = 70;
		// 배열을 생성할 때 크기를 알려줘야 한다.
		// 첫번째 [] : int[]는 배열인데 int로 이루어진 배열이다.
		// 두번째 new int[3] : 배열의 크기; 한번에 만들 변수의 개수
		//		연달아서 타입의 크기 만큼 메모리 할당.
		// 		첫번째 변수부터 index 0으로 시작.
		// 세번째 intArray[0] : 만들어진 변수들 중 첫번 째 변수를 뜻함.
		int[]intArray= new int[3];
		intArray[0] = 90;
		intArray[1] = 60;
	//	intArray[2] = 70;
		
		System.out.println("intArray[1] : " + intArray[1]);
		
		//기본값은 0 또는 false, null로 초기화 된다.
		System.out.println("intArray[2] : " + intArray[2]);
		
//		System.out.println("intArray[3] : " + intArray[3]);
		
//		intArray[0] = 1;
//		intArray[1] = 1;
//		int a =1;
//		a++;
//		intArray[a] = 1;
//		
////		for(int i = 0; i<=2; i++) {
//		for(int i = 0; i<3; i++) { intArray[i] = 1;}
//		
//		for(int i = 0; i<3; i++) {
//			System.out.println(intArray[i]);}
////		System.out.println(intArray);
//		System.out.println(intArray.length);
		//한 번 선언된 배열의 크기는 바꿀 수 없다.
		// intArray.length = 4;
		
		// 배열을 선언하는 두 번째 방법.
		int[] intArray2 = new int[] {10, 20, 30, 40};
		for(int i1 =0; i1<intArray2.length; i1++) {
		System.out.println(intArray2[i1]);}
		
		//선언과 동시에 초기화 할 때만 가능.
		int[]intArray3 = {100, 200, 300, 400};
		for(int i=0; i<intArray3.length; i++) {
			System.out.println(intArray3[i]);}
		
		String[]strArray=new String[5];
		for(int i=0; i<strArray.length;i++) {
		strArray[i] = "남현우"+(i+1);
		}
		for(int i=0; i<strArray.length;i++) {
			System.out.println(strArray[i]);
		}
	//1~10까지 배열에 넣고	
	// 배열의 총 합 출력
	// 배열의 평균 값 출력.
		int[]score5 = new int[10];
		for(int i = 0; i<score5.length; i++) {
			score5[i]= i+1;
			}
		int sum = 0;
		for(int i = 0; i<score5.length; i++) {
			sum+=score5[i];
		}
		System.out.println("총합 : "+ sum);
		
		double avg = (double)sum/score5.length;
		System.out.println("평균 : " + avg);
		
		int[] class1 =new int[22];
		int[] class2 =new int[22];
		int[] class3 =new int[22];
		int[] class4 = new int[22];
		
		
		// 맨 뒤의 []는 배열을 뜻하고 그 앞에 있는 모든 것 배열의 내용물
		//  int[]을 변수들로 관리하는 배열이 된다.
		//[4]는 천안의 크기 즉 "천안"으로 관리되는 변수의 개수 
		int[][]천안=new int[4][22];
		
		System.out.println(천안);
		System.out.println(천안[0]);
		System.out.println(천안[0][0]);
		
		int[]클래스1=천안[0];
	//	int 학생1 = 클래스1[0];
		int 학생1 = 천안[0][0];
		
		int[][] test = new int [3][2];
		int[][] test2 = { {5,6}, {12,15}, {93,87}};
		
		int [][]수원 = new int[4][22];
		int [][]서울 = new int[4][22];
		
		int[][][]휴먼 = new int[3][4][22];
		System.out.println(22 * 4 * 3);
		System.out.println(휴먼);
		System.out.println("휴먼.length : " + 휴먼.length);
		System.out.println("휴먼.length : " + 휴먼[0].length);
		System.out.println("휴먼.length : " + 휴먼[0][0].length);
		
		int[][]달력 = new int[12][31];
		for(int i=0; i<달력.length;i++) {
			for(int j=0;j<달력[i].length;j++) {
				System.out.println("i : "+i+",j : "+j+", 달력[i][j] : " + 달력[i][j]);
			}
			
		}
		ArrayList list = new ArrayList();
		list.add(1);
		list.add("문자");
		list.add(true);
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		//배열의 length
		System.out.println(list.size());
		
		
		String[] study= {"1", "2", "3", "4", "5"};
		System.out.println("총"+study.length+"명");
		
//		//배열에서 random으로 뽑기
//		double rand= Math.random()*study.length;
//	//0~9.9999999	
//		int index = (int)rand; //0~10
//		System.out.println("실험 :" + study[index]);
//		
		/*
		 * 랜덤으로 뽑는 것을 100번해서 가장 많이 나온 사람을 선택
		 * 
		 */
	
		
		int[]vote = new int[study.length];
		for(int i=0; i<100; i++) {
		double rand = Math.random()*study.length;
		int index = (int)rand;
		
		vote[index]+=1;
		}
		for(int i=0; i<vote.length; i++) {
			System.out.println("index : "+ i + ", 득표수 : " + vote[i]);
		}
		for(int j=0; j<study.length; j++) {
			System.out.println("index : "+ j + ", 이름 : " + study[j]);
		}
		
		//6개의 lotto번호를 저장하고 싶다.
//		int[]lotto=new int[6];
//		for(int i=0; i<lotto.length; i++) {
//			lotto[i] = (int)(Math.random()*45)+1;
//			
//		}
//		for(int i=0; i<lotto.length;i++) {
//			System.out.println(i+"번호 :" + lotto[i]);
//		}
	}}
		
		
		
	

