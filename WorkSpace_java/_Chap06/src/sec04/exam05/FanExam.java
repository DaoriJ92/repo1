package sec04.exam05;

import java.util.Scanner;

public class FanExam {

    public static void main(String[] args) {
        Fan fan = new Fan();
        Scanner scan = new Scanner(System.in);

        fan.powerOn();
        
// 				작동이 지속되고, 풍속을 변경 하거나
//        		종료 시킬 수 있도록
//        		while문 적용
        while (true) {
            System.out.println("0~3까지의 값을 입력하세요 (0은 종료): ");
            int n = scan.nextInt();
            if (n == 0) {
//                작동 후 바로 종료가 되지 않게
//                powerOff를 이곳에 적용
            	fan.powerOff();
                break;
            }
            fan.fanSpeed(n);
        }

        
    }
}
