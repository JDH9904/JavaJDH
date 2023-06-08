package day6;
import day6.Test2;
import day6.Person;

public class Sixday {//접근제어자 Access Modipy
    public static void main(String[] args) {
     Test t1 = new Test();
        System.out.println(t1.num);
        Test2 tt2 = new day6.Test2();
        System.out.println(tt2.a);// 캡슐화 안된것.
        tt2.printNum();//캡슐화 된것


//        Person p1 = new Person();
//        p1.id = 20;
//
//
//        System.out.println("제 번호는 " + p1.id + " 입니다.\n");

        // 출력 : 제 번호는 20 입니다.
    }
}



class Test{
    int num = 10; //default 접근제어자
}

