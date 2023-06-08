package test;

import java.util.Scanner;

public class input2 {
    public int[] solution(int[] numbers, int num1, int num2) {
        int[] numbers1 = {1,2,3,4,5};

        int zo = 0;

        int[] answer = new int[num2 - num1 + 1];
        for (int i = num1; i <= num2; i++) {

            numbers1[zo] = i;
            zo++;

        }
        int[] numbers11 = numbers1;
        return numbers11;

    }
//    public static double numbers() {
//        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        int[] numbers1 = {89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99};
//        int sum1 = 0;
//        for (int i = 0; i < numbers1.length; i++) {
//
//            sum1 += numbers[i];
//        }
//
//        return (double) sum1 / 10;
//
//
//    }





    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("숫자입력: ");
//        int Ys = sc.nextInt();
//        System.out.println(Ys);
//        System.out.println("문자 입력: ");
//        String Hj = sc.nextLine();
//        System.out.println(Hj);
//        if(Hj == "hello"){
//            System.out.println("bye");
//        }
//        for(int i2 = 1; i2 >= 1; i2++) {
//            int dan = sc.nextInt();
//            for (int i = 1; i <= 9; i++) {
//                System.out.printf("%d * %d = %d", dan, i, dan * i);
//                System.out.println();
//                if(dan == 999){
//                    System.out.println("구구단은 여기까지");
//                    break;
//                }
//            }
//        }

//        String[] f4 = {"hi","bye","good","new","hello"};
//
//        for(int i3 = 0; i3 <5; i3++){
//            int f5 = sc.nextInt();
//            System.out.println(f4[f5]);
//            if(f5==5){
//                break;
//            }
//        }

//        int[] Us = {1,2,3,4,5};
//
//        for(int i4 = 0; i4 <5; i4++){
//            int U5 = sc.nextInt();
//            if(U5 == 1){
//                System.out.println(Us[4]);
//            } else if (U5 == 2) {
//                System.out.println(Us[3]);
//
//            } else if (U5 == 3) {
//                System.out.println(Us[2]);
//            } else if (U5 == 4) {
//                System.out.println(Us[1]);
//            } else if (U5 == 5) {
//                System.out.println(Us[0]);
//            }
//
//        }
//        System.out.println("나이를 입력해주세요: ");
//        int age = sc.nextInt();
//
//
//        System.out.println("이름을 입력해주세요: ");
//        sc.nextLine();
//        String na = sc.nextLine();
//
//        System.out.printf("안녕하세요 %d살 %s입니다.\n",age, na);

//
//
//        int num1=1;
//        int num2=3;
//        int in = 0;
//
//        int[] numbers = {1,2,3,4,5};
//        int[] numbers1 = {1,3,5};
//
//        int[] nn = new int[num2 - num1 + 1];//3
//
////        int[] fucking = new int[3];
//
//        for (int ii = num1; ii <= num2; ii++){
//
//            nn[in] = ii;
//            in++;
//
//
//            System.out.println(numbers[ii]);
//        }
//
//
//        int[] F = {};
//        int zo = 0;
//
//        for(int ww = 1; ww <= 10; ww++){
//            F[zo] = ww;
//            zo++;
//        }

        int[] l= {1,2,3,4,5};
        int[] answer = new int[2];

        for(int i5 = 0; i5 < answer.length; i5++) {

            if (l[i5] % 2 == 0){

                answer[0]++;








            }
            if (l[i5] % 2 == 1 ){
                int[] tt = new int[l[i5]];
                answer[1]++;

            }
        }







    }
}
