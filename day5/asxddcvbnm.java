package day5;

public class asxddcvbnm {
    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.meow();
        cat.move();
        cat.eat();
        cat.zzz();

        Dog dog = new Dog();
        dog.bark();
        dog.move();
        dog.eat();
        dog.zzz();

          //오후 수업 내용
//        오리 a오리 = new 오리();
//        a오리.날다();

        // 출력 : 오리가 날개로 날아갑니다.
        오리 a오리 = new 오리();
        a오리.날다();
        a오리.헤엄();
        System.out.println();
        // 출력 : 오리가 날개로 날아갑니다.

        청둥오리 a청둥오리 = new 청둥오리();
        a청둥오리.날다();
        a청둥오리.헤엄();
        System.out.println();
        // 출력 : 오리가 날개로 날아갑니다.

        흰오리 a흰오리 = new 흰오리();
        a흰오리.날다();
        a흰오리.헤엄();
        System.out.println();
        // 출력 : 오리가 날개로 날아갑니다.
        고무오리 a고무오리 = new 고무오리();
        a고무오리.날다();
        a고무오리.헤엄();
        System.out.println();
        고무2오리 a고무2오리 = new 고무2오리();
        a고무2오리.날다();
        a고무오리.헤엄();
        System.out.println();
        아수라오리 a아수라오리 = new 아수라오리();
        a아수라오리.날다();
        a아수라오리.헤엄();

        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바();
        a홍길동.C();

        //클래스 안에서 중복된 코드가 발생하는 경우가 있다.
        //클래스 간의 중복을 줄이는 방법 중 하나가 바로 상속
        //상속을 하기 위해선 더 상위 개념을 만들어라 extends (calssname)

          //오리 수업

//        사람 a사람 = new 사람();
//        a사람.나이 = 20;
//        a사람.a왼팔 = new 팔();
//
//        System.out.println(a사람.a왼팔.길이 + "cm");


        봉인된_엑조디아의_머리 saa = new 봉인된_엑조디아의_오른다리();
        saa.조건();



    }
}

class Animal {
    public void move() {
        System.out.println("터벅터벅");
    }

    public void eat() {
        System.out.println("냠냠");
    }

    public void zzz() {
        System.out.println("Zzz");
    }
}

class Cat extends Animal {


    public void meow() {
        System.out.println("애옹s");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("멍멍");
    }
}

class 조류 {
    public void 날다() {
        System.out.println("오리가 날개를 퍼덕이며 날아갑니다~!");

    }

    public void 헤엄() {
        System.out.println("오리가 물위를 헤엄칩니다~~");
    }
}

class 오리 extends 조류 {

}

class 청둥오리 extends 조류 {

}

class 흰오리 extends 조류 {

}

class 고무오리 extends 조류 {

    // 부모가 물려준 메서드를 똑같은 이름으로 하나 더 만드는 것 -> 재정의(오버라이딩)
    public void 날다() {
        System.out.println("고무로 된 날개로는 날 수 없어요 ㅠㅜ");
    }

    public void 헤엄() {
        System.out.println("두웅두웅 떠다닙니다.");
    }


}

class 고무2오리 extends 고무오리 {

}

class 아수라오리 extends 조류 {
    public void 헤엄() {
        System.out.println("두웅두웅 떠다닙니다.");
    }
}

class 홍길동 {
    public void 자바() {
        System.out.println("자바 프로그레밍");
    }

    public void C() {
        System.out.println("C 프로그레밍");
    }

    public void 자바17() {
        System.out.println("자바17 프로그레밍");
    }
}

class 홍길순 {
    public void 파이썬() {
        System.out.println("파이썬 프로그레밍");
    }

    public void 자바() {
        System.out.println("자바 프로그레밍");
    }
}

class 사람 {
    int 나이;
    팔 a왼팔;
}

class 팔 {
    int 길이 = 100;

}

class 특수승리 {
    int a = 0;

    public void 조건() {
        if (a == 10) {
            System.out.println("엑조드_파이어~!");
        }

    }
}

class 봉인된_엑조디아의_머리 extends 특수승리 {
    봉인된_엑조디아의_머리(){

        a+=6;
    }
}

class 봉인된_엑조디아의_왼팔 extends 봉인된_엑조디아의_머리 {
    봉인된_엑조디아의_왼팔(){
        a+=1;
    }

}

class 봉인된_엑조디아의_오른팔 extends 봉인된_엑조디아의_왼팔 {
    봉인된_엑조디아의_오른팔(){
        a+=1;
    }

}

class 봉인된_엑조디아의_왼다리 extends 봉인된_엑조디아의_오른팔 {
    봉인된_엑조디아의_왼다리(){
        a+=1;
    }

}

class 봉인된_엑조디아의_오른다리 extends 봉인된_엑조디아의_왼다리 {

    봉인된_엑조디아의_오른다리(){
        a+=1;
    }

}
