package test;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Test2 {
    public static boolean  isNegative(int no){
        if(no < 0){
          return true;
         }
        return false;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


      // 배열 선열
        int[] arr = new int[6]; // 길이 지정 해야함.

        arr[0] = 1; // ii
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        arr[5] = 6;

        int[] brr = {1,2,3,4,5}; //길이 지정 X
        int[] brr2=new int [brr.length] ;
        for(int i = 1; i<=brr.length;i++){
            brr2[i-1]=brr[brr.length-i];

        }



//        System.out.println(arr[0]); //배열의 시작은 무조건 0이다.
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);
//
//        for(int i = 0; i <5; i++){
//            System.out.println(brr[i]);
//
//        }
//
//        String[] v = {"hi","bye","good"};
//
//       int[] g = {10,20,30,40,50,60,70,80,90,100};
//
//       for(int i1 = 0; i1 < 10; i1 ++){
//           System.out.println(g[i1]);
//       }
//
//       int[] g1 = {1,2,3,4,5};
//
//       for(int i3 = 0; i3 <2; i3++) {
//           for (int i2 = 0; i2 < 5; i2++) {
//               System.out.println(g1[i2]);
//           }
//       }




        for(int i4 = 0; i4 < 5; i4++) {
            System.out.println(brr2[i4]);
        }

        int[] k = {1,2,3};

        for(int i6 = 1; i6 >= 1; i6++) {

            System.out.println("입력 수: ");
            int b = sc.nextInt();

            if (b == 1) {
                System.out.println(k[0]);

            } else if (b == 2) {
                System.out.println(k[1]);

            } else if (b == 3) {
                System.out.println(k[2]);

            } else if (b == 4) {
                System.out.println("엄준식은 살아있다.");
                break;

            }
        }


    }
}
