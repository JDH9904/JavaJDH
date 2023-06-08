package test;

public class Test1 {
    public static void hi1() {
        System.out.println("저는 차태진입니다.");
    }

    public static void hi2() {
        System.out.println("안녕하세요.");
    }

    public static void hi3() {
        System.out.println("프로그램을 만들어보아요.");
    }

    public static void hi4() {
        System.out.println("자바를 통해");
    }

    public static void hi() {
        System.out.println("나는 홍길동 이오, 잘부탁 드리오.");
    }

    public static void bye() {
        System.out.println("잘 가시오, 다음에 또 봽겠오.");
    }

    public static int print(int a) {
        System.out.println(a);
        return a;
    }

    public static void greeting1(int language) { //Str(스트링) "함숙값" 해도 된다. if문의 조건도 같음.
        if (language == 2) {
            System.out.println("하이");
        } else if (language == 3) {
            System.out.println("안녕하세요");
        } else if (language == 1) {
            System.out.println("봉쥬");
        } else if (language == 5) {
            System.out.println("하이");
        }
    }

    public static void greeting2(int language, int cnt) {
        for (int i = 0; i < cnt; i++) {
            greeting1(language);
        }


    }

    public static double test(int r){

        return r * r * 3.14;
    }

    public static int test1(int c, int d){
        int sum2 = c + d;
        return sum2;
    }

    public static void main (String[] args){//???

        hi2();
        hi1();
        hi4();
        hi3();

        hi();
        bye();

        print(4);
        print(10);
        print(100);


        greeting1(2);
        // 하이~

        greeting1(3);
        // 봉쥬

        greeting1(1);
        // 안녕하세요


        // 첫번째는 언어, 두번째는 횟수를 의미

        greeting2(1, 3);
        // 안녕하세요
        // 안녕하세요
        // 안녕하세요

         greeting2(2, 5);
        // 하이~
        // 하이~
        // 하이~
        // 하이~
        // 하이~

        greeting2(3, 7);
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬
        // 봉쥬

        //나 잘 하고 싶다 -> 중복을 없앤다.
        System.out.println(test(10)*3);
        System.out.println(test(10)/2);

        System.out.println(test(10) * test(10));


    }
}
