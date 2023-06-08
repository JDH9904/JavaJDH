package constructor;
import java.util.Scanner;

public class Cinstructor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
                        /*
//        // 객체를 만들면 반드시 데이터를 넣어줘야 한다.(초기화)
//        Person per = new Person();
//        //객체에 데이터 값을 입력하는것을 객체 초기화 라고 한다.
//        per.age = 26;
//        per.no=64;
//        per.name = "마이클";
//
//        per.introduce();
//        new Person(2,19,"청하");
//        new Person(1,21,"춘홍");
//
//        Test t1 = new Test();
//        t1.print();
//        t1.a = 20;
//        t1.print();
//        Test t2 = new Test();
//        t2.a = 30;
//        t2.print();

         */ // 06.01일 오전에 한것.

        Person p1 = new Person(27,"홍길동"); // 사람이 태어납니다.
//        p1.age = 27;
//        p1.name = "홍길동";

        Person p2 = new Person(25,"홍길순"); // 사람이 태어납니다.
//        p2.age = 25;
//        p2.name = "홍길순";

        p1.introduce(); // 안녕하세요 27살 홍길동입니다.
        p2.introduce(); // 안녕하세요 25살 홍길순입니다.
//
        Car c1 = new Car("소나타","하얀색",100); // 자동차가 만들어집니다.
//        c1.model = "소나타";
//        c1.color = "하얀색";
//        c1.speed = 100;

        Car c2 = new Car("모닝","검정색",70); // 자동차가 만들어집니다.
//        c2.model = "모닝";
//        c2.color = "검정색";
//        c2.speed = 70;

        c1.drive(); // 하얀색 소나타이/가 100km로 달립니다.
        c2.drive(); // 검정색 모닝이/가 70km로 달립니다.


        Cat cat1 = new Cat("아리","러시안블루",4); // 고양이가 태어납니다.
//        cat1.name = "아리";
//        cat1.age = 4;
//        cat1.kind = "러시안블루";

        Cat cat2 = new Cat("망고","샴",6); // 고양이가 태어납니다.
//        cat2.name = "망고";
//        cat2.age = 6;
//        cat2.kind = "샴";

        cat1.meow(); // 4살 러시안블루 고양이 아리가 야옹하고 웁니다.
        cat2.meow(); // 6살 샴 고양이 망고가 야옹하고 웁니다.


        Warrior w1 = new Warrior("이순신",20,10); // 전사가 태어납니다.
//        w1.name = "이순신";
//        w1.attack = 20;
//        w1.defense = 10;

        Warrior w2 = new Warrior("강감찬",15,15); // 전사가 태어납니다.
//        w2.name = "강감찬";
//        w2.attack = 15;
//        w2.defense = 15;

        w1.status(); // 이름 : 이순신, 공격력 : 20, 방어력 : 10
        w2.status(); // 이름 : 강감찬, 공격력 : 15, 방어력 : 15

        w1.attack(); // 이순신이 20의 데미지를 입힙민다.
        w2.attack(); // 강감찬이 15의 데미지를 입힙민다.

        w1.defense(); // 이순신이 10 데미지를 방어합니다.
        w2.defense(); // 강감찬이 15 데미지를 방어합니다.


    }
}

class Person1{
    int no;
    int age;
    String name;

    //생성자 -> 메서드의 일종이기 때문에 클래스 안에 만들어 준다.
    //리턴 타입이 없다. 정해져있다.
    //함수 메서드 이름 꼭 클래스명과 동일하게 지어주어야 함.
    //이 메서드는 반드시 실행이됨.

    public Person1(int no, int age, String name){
        this.no = no;
        this.name = name;
        this.age = age;


    }
    public void introduce(){
        System.out.printf("안녕하세요 %d번 %d살 %s입니다\n",no,age,name);
    }



}

class Test {
    int a = 10;
    public void print(){
        int a = 100;
        System.out.println(a); // 동일한 이름의 변수가 2개이면 자신의 변수를 우선적으로 사용
        System.out.println(this.a); // this 는 객체 자신이 된다.
    }
}

class Person{
    int age;
    String name;
    public Person(int age, String name){
        this.name = name;
        this.age = age;

    }

    public void introduce() {
        System.out.printf("안녕하세요 %d살 %s입니다.\n",age, name);
    }
}

class Car {
    String model;
    String color;
    int speed;

    public Car(String model, String color, int speed){
       this.color = color;
       this.speed = speed;
       this.model = model;

    }

    public void drive() {
        System.out.printf("%s %s이/가 %dkm로 달립니다.\n", color, this.model, this.speed);
    }
}

class Cat {
    String name;
    String kind;
    int age;

    public Cat(String name,String kind,int age){
       this.kind = kind;
       this.age = age;
       this.name = name;
    }

    public void meow() {
        System.out.printf(" %d살 %s 고양이 %s가 야옹하고 웁니다.\n", this.age, this.kind, this.name);
    }
}


class Warrior {

    // 상태
    String name;
    int attack;
    int defense;

    public Warrior(String name, int attack, int defense){
      this.attack = attack;
      this.name = name;
      this.defense = defense;
    }

    // 동작
    public void status() {
        System.out.printf("이름 : %s, 공격력 : %d, 방어력 : %d \n", this.name, this.attack, this.defense);
    }
    public void attack() {
        System.out.printf("%s이 %d의 데미지를 입힙민다.\n", this.name, this.attack);
    }
    public void defense() {
        System.out.printf("%s이 %d 데미지를 방어합니다..\n", this.name, this.defense);
    }
}

