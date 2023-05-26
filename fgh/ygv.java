package fgh;

public class ygv {
    public static void main(String[] args) {
        int i = 1; // 조건 변수
        while (i <= 10) { // 반복 조건
            System.out.println(i); // 반복할 행위
            i += 2; // 조건변수 제어
            //for
        }

        for (int e = 1; e <= 5; e += 1) {
            System.out.println("이것도 한번 너프해 보시지!");

        }

        for (int f = 1; f <= 4; f += 1) {
            System.out.println("신선한 고기~");
        }
        int x;
        int y = 1;

        x = 468;
        while (y <= 5) {
            if (x != 468) {
                System.out.println("오답");
                y += 1;
            } else if (x == 468) {
                System.out.println("정답");
                break;

            }
        }

    }
}
