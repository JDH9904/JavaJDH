package test06_07;

import java.util.Scanner;

public class Exam2 {
    public static void Top(int height) {
        for (int i = 1; i <= height; i++) {
            for (int j = 0; j <= height - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= i * 2 - 1; j2++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Top(3);
        System.out.println();

        Top(5);
        System.out.println();
        Top(7);
        System.out.println();
//        Top(sc.nextInt());
//        System.out.println();
//        Top(sc.nextInt());

        int y;
        while (true){

            y = sc.nextInt();
            if(y == 999){
                break;
            }
            Top(y);
        }
    }
}
