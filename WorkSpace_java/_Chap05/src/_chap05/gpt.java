package _chap05;

import java.util.Scanner;

public class gpt {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[][] coffee = {
            {"아메리카노", "2500"},
            {"카페라떼", "3500"},
            {"카푸치노", "3500"},
        };

        String[][] drink = {
            {"복숭아아이스티", "2500"},
            {"레모네이드", "3500"},
            {"생과일주스", "4500"},
        };

        String[] s = {"", "", "", "", ""};
        int sum = 0;
        boolean run = true;

        while (run) {
            System.out.println("-------------");
            System.out.println("1. 커피  2. 음료 ");
            System.out.println("-------------");
            System.out.print("선택> ");
            int balance = scan.nextInt();
            System.out.println();

            boolean run2 = true;

            if (balance == 1) {
                while (run2) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("1. 아메리카노 : 2,500원  2. 카페라떼 : 3,500원  3. 카푸치노 : 3,500원");
                    System.out.println("-----------------------------------------------");
                    System.out.print("선택> ");
                    int coffeeChoice = scan.nextInt();

                    if (coffeeChoice >= 1 && coffeeChoice <= 3) {
                        s[0] += coffee[coffeeChoice - 1][0] + " ";
                        sum += Integer.parseInt(coffee[coffeeChoice - 1][1]);

                        System.out.println("1. HOT    2. ICE");
                        System.out.print("선택> ");
                        int coffeeTemp = scan.nextInt();
                        if (coffeeTemp == 1) {
                            s[0] += "HOT ";
                        } else if (coffeeTemp == 2) {
                            s[0] += "ICE ";
                        } else {
                            System.out.println("잘못 입력 하셨습니다.");
                            continue;
                        }

                        System.out.println("1. Tall   2. Grande");
                        System.out.print("선택> ");
                        int coffeeSize = scan.nextInt();
                        if (coffeeSize == 1) {
                            s[0] += "Tall ";
                        } else if (coffeeSize == 2) {
                            s[0] += "Grande ";
                        } else {
                            System.out.println("잘못 입력 하셨습니다.");
                            continue;
                        }

                        System.out.println("추가 메뉴를 선택 하시겠습니까?");
                        System.out.println("1. 예   2. 아니오 3. 메뉴 확인");
                        System.out.print("선택> ");
                        int addChoice = scan.nextInt();

                        if (addChoice == 1) {
                            run2 = false;
                            continue;
                        } else if (addChoice == 2) {
                            System.out.println("주문이 완료되었습니다.");
                            System.out.println("총 결제 금액은 : " + sum + "원 입니다.");
                            run = false;
                            break;
                        } else if (addChoice == 3) {
                            System.out.println("현재까지의 주문: " + s[0]);
                        } else {
                            System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                        }
                    } else {
                        System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    }
                }

            } else if (balance == 2) {
                while (run2) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("1. 복숭아아이스티 : 2,500원  2. 레모네이드 : 3,500원  3. 생과일주스 : 4,500원");
                    System.out.println("-----------------------------------------------");
                    System.out.print("선택> ");
                    int drinkChoice = scan.nextInt();

                    if (drinkChoice >= 1 && drinkChoice <= 3) {
                        s[0] += drink[drinkChoice - 1][0] + " ";
                        sum += Integer.parseInt(drink[drinkChoice - 1][1]);

                        System.out.println("1. 달게    2. 덜 달게");
                        System.out.print("선택> ");
                        int drinkSugar = scan.nextInt();
                        if (drinkSugar == 1) {
                            s[0] += "달게 ";
                        } else if (drinkSugar == 2) {
                            s[0] += "덜 달게 ";
                        } else {
                            System.out.println("잘못 입력 하셨습니다.");
                            continue;
                        }

                        System.out.println("1. Tall   2. Grande");
                        System.out.print("선택> ");
                        int drinkSize = scan.nextInt();
                        if (drinkSize == 1) {
                            s[0] += "Tall ";
                        } else if (drinkSize == 2) {
                            s[0] += "Grande ";
                        } else {
                            System.out.println("잘못 입력 하셨습니다.");
                            continue;
                        }

                        System.out.println("추가 메뉴를 선택 하시겠습니까?");
                        System.out.println("1. 예   2. 아니오 3. 메뉴 확인");
                        System.out.print("선택> ");
                        int addChoice = scan.nextInt();

                        if (addChoice == 1) {
                            run2 = false;
                            continue;
                        } else if (addChoice == 2) {
                            System.out.println("주문이 완료되었습니다.");
                            System.out.println("총 결제 금액은 : " + sum + "원 입니다.");
                            run = false;
                            break;
                        } else if (addChoice == 3) {
                            System.out.println("현재까지의 주문: " + s[0]);
                        } else {
                            System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                        }
                    } else {
                        System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
                    }
                }

            } else {
                System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
            }
        }
        System.out.println(s[0]);
        scan.close();
    }
}