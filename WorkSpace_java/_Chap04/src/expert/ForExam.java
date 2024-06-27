package expert;

public class ForExam {

    public static void main(String[] args) {

        // for(1 초기화 식;2 조건 식;3 증감식  ) {4실행 시킬 코드
        // 조건식이 참이라는 전재 하에 
        // 처음 1 2 4 3 순으로 실행 된 후.
        // 2 4 3 - 2 4 3 무한루프
        // 3의 값이 2에서 거짓이 될때 중단
        // 초기화식	 :	 변수를 초기화, 처음 딱 한번 만 실행
        // 조건 식	 : 	 거짓이 아닐때 반복 시키는 조건
        //				 처음부터 조건이 맞지 않으면 실행 되지 않음
        // 증감	식 	 :   사실은 그냥 실행문 끝에 무조건 실행해야 하는
        // }			 :   코드를 넣는 곳 a.k.a : 주머니 

        int a = 1; // a를 초기화
        // 세번만 실행 하고 싶을 때
        for (int i = 1; i <= 31; i += 10) {
            System.out.println(i);
        }
        System.out.println(a);
        a = a + 10; // 첫번째 실행
        // a += 10;
        System.out.println(a);
        a = a + 10; // 첫번째와 같은 코드를 두번째 실행
        System.out.println(a);
        a = a + 10;
        System.out.println(a);
        
        int i = 0;
        for (; i < 3; i++) {
            System.out.println(i);
        }

        int sum = 0;
        for (int i2 = 1; i2 <= 100; i2++) {
            sum += i2;
        }
        System.out.println("1~100의 합 : " + sum);
        
        //1~10까지 출력하시오
        
       
        for (int j = 1 ; j <=10 ; j++) {
        	System.out.println(j);
        };
        System.out.println("--------------------");
        
        for (int k = 3 ; k <= 7 ; k++) {
        	System.out.println(k);
        };
        System.out.println("--------------------");
        
        int e = 8 ;
        for (int g = 3 ; g <= e ; g++) {
        	System.out.println(g);
        };
        System.out.println("----!----------------");
        
//        for (int q = 2  ; q % 2 == 0  && q <= 10 ;  q++) {
//        	System.out.println(q);
//        };
        // 변수가 2 4 6 8 10 으로 바뀌고 
        // 그대로 출력
        // 반복 횟수가 정해진 경우 : for문
        // 언제 반복 종료 될지 잘 모를 때 : while 문
        for (int w = 2; w >= 2 && w <= 10; w += 2 ) {
        	System.out.println(w);
        };
        
        
        // 1~10까지의 짝수의 합을 출력
        // 모든 수를 변수로 넣기
        int n = 2;
        System.out.println(n);
        	n = n+2;
        System.out.println(n);
        if (n <= 10) {
        	System.out.println(n);
        	n = n+2;
        	};
        	
        	System.out.println("====================");
        	int sum2 = 0;
        for (n = 2 ; n <= 10; n += 2 ) {
        	sum2 += n;        	
        };
        System.out.println(sum2);
        System.out.println("==========================");
        String r = "*";
        System.out.println(r);
        r = r +"*";
        System.out.println(r);
        System.out.println("=================222==============");
        r = "";
        
       int d = 0;
        for(i = 0; i <= 10; i++) {for(d = 1 ; d<= 1; d++) { r += "*";}
        System.out.println(r);
        };
        
        
        System.out.println("=======1111111111===========");
       
        //3~100 까지 짝수의 갯수를 구하시오.
        //4,6,8,10......
        //짝수 = 2로 나눴을때 딱 맞아 떨어지는 수
        //우선 if문과 System.out.println() 을 활용하여 확인
        //반복되는 부분 : 반복문으로 넣을 식
        //
        int n1 = 0;
//        n1 = n1 % 2;
        int count = 0;
        
        n1 = 4; // 조건은 3부터이나 3은 나머지가 1이 생겨 반복문이 시작되지 않으므로
        		// 조건을 만족하는 4를 집어넣어 시작
        
        if ((n1 % 2) == 0){
        	System.out.println(++count);
        };
        n1 = 4+2;
        if ((n1 % 2) == 0){
        	System.out.println(++count);
        };
        n1 = 4+2+2;
        if ((n1 % 2) == 0){
        	System.out.println(++count);
        };
        n1 = 4+2+2+2;
        if ((n1 % 2) == 0){
        	System.out.println(++count);
        };
        count = 0;
        System.out.println("=======1111111111===========");
        
        for (n1 = 3 ; n1 <= 100 ; n1++  ) {
        	if((n1 % 2) == 0) {
        		count++;
        	}
        };System.out.println(count);
        
        i = 0;
        int j = 0;
        int k = 0;
        // 구구단 2단을 for문을 활용하여 구현하시오.
        // 구구단 2단의 구조 파악
        // 2 x 1 = 2
        // 2 x 2 = 4
        // 2 x 3 = 6
        // 2 x 4 = 8
        // 2 x 5 = 10
        // 2 x 6 = 12
        // 2 x 7 = 14
        // 2 x 8 = 16
        // 2 x 9 = 18
        // i   j  각각 변수로 잡으면
        // 2에 1~9 까지 곱한 값을 구하는게 구구단 2단
        System.out.println("=======333=========");
        if (j<=9) {
        	j++; System.out.println("2x"+j+"=" + (2*j));
        };
        //
        //(j >= 1 && j<= 9);
        // j는 한번 반복 될때마다 1씩 늘어난다
        // j++
//        i = 2;
        System.out.println("=======333=========");
        for(j = 1; j >=1 ; j++) {if(j <=9) {
        	System.out.println("2x"+j+"=" + (2*j));};
        };
        System.out.println("=======444=========");
        //총 체력이 100일때
        //데미지가 17인 무기로 몇번 맞아야 죽을까?
        //L = 100, D = 17
        //
        //L - D 의 값이 0보다 작아질때 까지 반복
        int L = 100; //life
        int D = 17;	 //damage
//        boolean t = L < 0;
      
        System.out.println(L); // 출력값 = 100
        
        if(L>0) {L =L-D;}
        System.out.println(L); // 출력값 = 83 
       
        if(L>0) {L =L-D;}
        System.out.println(L); // 출력값 = 66
        
        if(L>0) {L =L-D;}
        System.out.println(L); // 출력값 = 49
        
        if(L>0) {L =L-D;}
        System.out.println(L); // 출력값 = 32
       
        	if(L>0) {L =L-D;} 
        	System.out.println(L);
        	System.out.println("=======555=========");
     int hit = 0;
        for(L=100 ; L > 0 ;L = L - D  ){
        	hit++; 
        };
        System.out.println(hit);
        
        // 일주일에 6만원 범
        // 투자금이 400만원일때
        // 원금 회복까진 총 몇주가 걸릴까.     
         
        int seed = 4000000;
        int w = 60000;
        //우선 10000으로 나누어 숫자를 간소화 한다.
        seed = 400;
        w = 6;
    }
}
