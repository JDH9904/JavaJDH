package function;

import java.util.Scanner;

public class Tesesesest {
    private static int ms1(int c, int my) {
        int a = 1200;
        if (c == 1 && my >= 1200) {
            System.out.println("콜라가 나옵니다");
            my = my - a;
        } else if (c == 1 && my < 1200) {
            System.out.println("잔액이 부족합니다.");


        }
        return my;

    }

    private static int ms2(int c2, int my) {
        int a = 1000;
        if (c2 == 2 && my >= 1000) {
            System.out.println("사이다가 나옵니다");
            my = my - a;
        } else if (c2 == 2 && my < 1000) {
            System.out.println("잔액이 부족합니다.");

        }
        return my;

    }

    private static int ms3(int c3, int my) {
        int a = 800;
        if (c3 == 3 && my >= 800) {
            System.out.println("환타가 나옵니다");
            my = my - a;
        } else if (c3 == 3 && my < 800) {
            System.out.println("잔액이 부족합니다.");

        }
        return my;

    }

    private static int ms4(int c4, int my) {
        int a = 500;
        if (c4 == 4 && my >= 500) {
            System.out.println("솔의눈이 나옵니다");
            my = my - a;
        } else if (c4 == 4 && my < 500) {
            System.out.println("잔액이 부족합니다.");

        }
        return my;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("자판기 프로토타입 Vr.2 에 오신걸 환영합니다.");
        // 메서드랑 스케너를 활용해서 자판기 프로토타입을 업그레이드 해보자
        System.out.println("메뉴판 단가. \n 콜라 1200원 사이다 1000원 환타 800원 솔의눈 500원");
        //단가 설명 완료.
        System.out.println("500원 투입 갯수: ");
        int m = scanner.nextInt();
        System.out.println("1000원 투입 갯수: ");
        int m2 = scanner.nextInt();
        System.out.println("5000원 투입 갯수: ");
        int m3 = scanner.nextInt();
        System.out.println("10000원 투입 갯수: ");
        int m4 = scanner.nextInt();
        int my = (m * 500) + (m2 * 1000) + (m3 * 5000) + (m4 * 10000); //my는 현제 가지고 있는 금액

        int i = 1;
        while (i >= 1) {
            System.out.println("콜라는 1번을 \n 사이다는 2번을\n 환타는 3번을\n 솔의눈은 4번을 입력해주세요.");
            int c = scanner.nextInt();


            if (c == 1) {
                my = ms1(c, my);
                System.out.println(my + "거스름");
            }

            if (c == 2) {

                my = ms2(c, my);
                System.out.println(my + "거스름");
            }

            if (c == 3) {

                my = ms3(c, my);
                System.out.println(my + "거스름");
            }
            if (c == 4) {

                my = ms4(c, my);
                System.out.println(my + "거스름");
            }else if(my < 500){
                System.out.println(my + "거스름");
                System.out.println("이용해주셔서 감사합니다.");
                break;
            }
            i += 1;

        }


    }
}
