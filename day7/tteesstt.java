package day7;

public class tteesstt {
    public static void main(String[] args) {
        new 사람2();
    }
}
class 동물1 {
    동물1(String 이름) {
        System.out.println("동물(String 이름) 실행됨!");
        System.out.println("이름 : " + 이름);
    }
    동물1(String 이름, int 나이) {
        System.out.println("동물(String 이름, int 나이) 실행됨!");
        System.out.println("이름 : " + 이름);
        System.out.println("나이 : " + 나이);
    }
}

class 사람2 extends 동물1 {
    사람2(){
        super("김춘홍",23);
        System.out.println("용살자 푸른별이 나타남!");
    }
}