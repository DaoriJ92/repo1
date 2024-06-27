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
        
        
        
       
      
        
        
        
     
    }
}
