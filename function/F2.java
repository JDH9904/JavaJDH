package function;

public class F2 {

    public static void hi() {
        System.out.println("저는 하정우 입니다.");
    }

    public static void hi2() {
        System.out.println("안녕하세요");
    }

    public static void hi3() {
        System.out.println("프로그렘을 만들어보아요");
    }

    public static void hi4() {
        System.out.println("자바를 통해");
    }

    public static int print1() {
        return 4;
    }

    public static int print2() {
        return 10;
    }

    public static int print3() {
        return 100;
    }

    public static void red() {
        System.out.printf("%d 살 홍길동 입니다.", 23);
    }

    public static void fe(int G) {


        String b = "나는 자연인이다";
        for (int c = 1; c <= G; c++) {
            System.out.println(b);

        }
    }

    public static void main(String[] args) {

        hi2();
        hi();
        hi4();
        hi3();

        System.out.println(print1());
        System.out.println(print2());
        System.out.println(print3());

        red();
        red();
        red();
        red();

        fe(26);

    }
}
