package fgh;

public class R3 {
    public static void main(String[] args) {
//        for (int i = 1; i <= 9; i++) {
//            for (int e = 1; e <= 9; e++) {
//                if (i % 2 == 0 && e % 2 == 0) {
//                    System.out.printf("%d * %d = %d\t", i, e, i * e);
//
//                }if (e % 9 == 0){
//                    System.out.println();
//                }
//            }
//        }


        int n = 4; // 단부터
        int m = 20; // 단까지
        int limit = 10; // 1~10 곱까지 짝수만

        for (int n1 = 4; n1 <= 20; n1++) {
            for (int m1 = 1; m1 <= 10; m1++) {
                if (n1 % 2 == 0 && m1 % 3 == 0) {
                    System.out.printf("%d * %d = %d\n", n1, m1, n1 * m1);
                }
            }
        }
    }

}
