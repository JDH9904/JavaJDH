package test;

public class Test5 {


    // 클래스 이름 지을때는 파스칼 표기법(앞글자만 대문자)
    // 메서드,변수 지을때는 카멜 표기법(단어가 바뀔때 마다 대문자)
    // 이름 짓는 법 -> 카멜표기법, 파스칼 표기법,
    public static void printPersonInfo(int age, int height, int weight) {
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);

    }


    public static void printPersonInfo2(int age, int no, String name) {
        System.out.println(age);
        System.out.println(name);
        System.out.println(no);

    }

    public static void main(String[] args) {
             /*
        // 정보 -> 번호, 키, 몸무게, 나이 등등

        // 1
        System.out.println(20);
        System.out.println(170);
        System.out.println(60);

        //2
        int age = 20;
        int height = 170;
        int weight = 60;

        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);

        //3
//        printPersonInfo(age, height, weight);

        //문제는 사람의 정보가 둘 일때
        int age2 = 30;
        int height2 = 160;
        int weight2 = 58;

        System.out.println(age2);
        System.out.println(height);
        System.out.println(weight2);

        String num_str = "123456789";
        char[] c = a.toCharArray();

        int answer = 0;

        for(int i = 0; i < a.length(); i++){

            answer += (int)c[i]-48;

            65 ~ 90
                98 34




        //4
        int[] person1 = {20, 170, 60};
        int[] person2 = {30, 160, 58};


//        printPersonInfo2(person1);

        //5. 클래스 사용. - 내가 표현하고자 하는 대상을 정의해서 자바한테 알려주기

        //개발자 1이 생각한 사람.
        String name = "홍길동";
        String addres = "서울";
        double height3 = 176.9;

        int[] arr = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        // 클래스를 이용해서 객채를 만들다.
        Person hong1 = new Person();

        hong1.name = "채영";
        hong1.address = "부산";
        hong1.height = 151.3;
        System.out.println(hong1.name);
        System.out.println(hong1.address);
        System.out.println(hong1.height);

        //개발자 2가 생각한 사람
//        String n2 = "채영";
//        int age4 = 26;
//        double height4 = 151.3;
        System.out.println();

        Person2 sim = new Person2();
        sim.name = "채영";
        sim.address = "대전";
        sim.height = 151.4;
        System.out.println(sim.name);
        System.out.println(sim.address);
        System.out.println(sim.height);

        System.out.println();
        System.out.println();

        car rc = new car();
        rc.carname1 = "람보르기니";

        car rc2 = new car();
        rc2.carname1 = "포르쉐";

        car rc3 = new car();
        rc3.carname1 = "페라리";


        rc.rcrc();
        System.out.println();
        rc2.rcrc();
        System.out.println();
        rc3.rcrc();
        System.out.println();

        skm km = new skm();
        km.skm1 = 220;
        skm km2 = new skm();
        km2.skm1 = 250;
        System.out.println();

        System.out.printf("%s가 최대속력 %d로 달립니다.", rc.carname1, km.skm1);
        System.out.println();
        System.out.printf("%s가 최대속력 %d로 달립니다.", rc.carname1, km2.skm1);
        System.out.println();

        //오전동안 한것.


        Cat cat1 = new Cat();
        cat1.name1 = "아리";
        cat1.age1 = 4;
        cat1.kind1 = "러시안블루";

        // =====================================================
        // 여기에 cat2 세팅
        Cat cat2 = new Cat();
        cat2.name1 = "망고";
        cat2.kind1 = "샴";
        cat2.age1 = 6;

        // =====================================================

        cat1.meow(); // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        cat2.meow();// 6살 샴 고양이 망고가 야옹하고 웁니다.

        Warrior w1 = new Warrior();
        w1.name = "이순신";
        w1.attack = 20;
        w1.defense = 10;

        // =====================================================
        // 여기에 w2 세팅
        Warrior w2 = new Warrior();
        w2.attack = 15;
        w2.defense = 15;
        w2.name = "강감찬";

        // =====================================================

        w1.status(); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status(); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15

        w1.attack(); // 이순신이 20의 데미지를 입힙민다.
        w2.attack(); // 강감찬이 15의 데미지를 입힙민다.

        w1.defense(); // 이순신이 10 데미지를 방어합니다.
        w2.defense(); // 강감찬이 15 데미지를 방어합니다.

         */  //5.31 일 자바 공부한것.

//        Person98 pr = new Person98();
//        pr.age = 25;
//        pr.no = 41;
//        pr.name = "고길동";
//
//        pr.prpr();

/*
        Person98.prpr();
        System.out.println();
        자동차.달리다();
        System.out.println();
        pr11.printValue();
        System.out.println();
        pr11.ab();
        System.out.println();
        사람 a사람1 = new 사람();
        a사람1.이름 = "홍길동";
        a사람1.나이 = 22;

        a사람1.자기소개();
        System.out.println();
        // 출력 : 저는 22살 홍길동 입니다.

        사람 a사람2 = new 사람();
        a사람2.이름 = "홍길순";
        a사람2.나이 = 25;

        a사람2.자기소개();
        System.out.println();
        // 출력 : 저는 25살 홍길순 입니다.

        a사람1.자기소개();
        System.out.println();
        // 출력 : 저는 22살 홍길동 입니다.

 */ // 06.01 오전 수업내용








    }
}

class Person {
    String name;//사람 이름
    String address;//주소
    double height;//키
    int age;
}

class Person2 {
    String name;
    String address;
    double height;
}

class car {
    String carname1;

    public void rcrc() {
        for (int i = 1; i <= 3; i++) {
            System.out.printf("%s 차량이 %d 번째 주행중입니다.\n",carname1 , i);
        }
    }
}







class skm {
    int skm1;

}

class Cat {
    String name1;
    int age1;
    String kind1;

    public void meow() {
        System.out.printf("%d살 %s 고양이 %s(이)가 야옹하고 웁니다.",age1 ,name1 ,kind1 );
        System.out.println();
    }

}

class Warrior {
    String name;
    int attack;
    int defense;

    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d ", name,attack,defense);
        System.out.println();
    }

    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙민다.",name,attack);
        System.out.println();
    }

    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다.",name,defense);
        System.out.println();

    }
}

class Person98 {
    static int no = 41;
    static int age = 31;
    static String name = "고길동";
    public static void prpr(){
        System.out.println(no);
        System.out.println(age);
        System.out.println(name);
    }
}
class 자동차 {
    public static void 달리다(){
        System.out.println("부릉부릉");
    }
}
class pr11 {

    static int num = 10;

    static String a = "안녕";

    public static void printValue() {

        System.out.println(num); // 출력 : 10


    }
    public static void ab(){
        System.out.println(a);

    }


}
class 사람 {

    int 나이;
    String 이름;

    public void 자기소개() {
        System.out.println("저는 " + 나이 + "살 " + 이름 + " 입니다.");
    }
}