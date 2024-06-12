package sec01.exam01;

public class BreakExam {

	public static void main(String[] args) {
		
		System.out.println("시작");
		int count = 0;
		while(true) {
			//count++;	//무조건 세는 거
			int num =(int)(Math.random()*6) + 1;
			System.out.println(num);
			
			if (num ==6) {
				break; //가장 가까운 반복문을 종료.
			}
			count++; //break를 안 만났을 때만 세는거 
		}
System.out.println("게임 종료 : 총"+count);

for(int i=1; i<=10; i++) {
	System.out.println(i);
	if (i==7) {
		break;
	}System.out.println("한 턴 종료");
}System.out.println("for 문 종료");

for(int i=0; i<5; i++) {
	System.out.println(" i : "+i);
	
	for(int j=0; j<3; j++) {
		System.out.println(" j : "+j);
		
		if(i>2) {
			break; 
		}
	}
	System.out.println();
	}
}
	}


