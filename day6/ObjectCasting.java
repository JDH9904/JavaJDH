package day6;

public class ObjectCasting {
    public static void main(String[] args) {
        //객체 형변환
    Cat c1 = new Cat();
    Dog g1 = new Dog();

//    Dog d2 = new Cat(); 서로 다른 클래스 끼리는 형변환이 불가능 하다.;
    Animal a1 = new Animal();
    Animal a2 = new Cat();
    Animal a3 = new Dog();

    Dog d5 = (Dog)a1; //Animal 이 Dog 로 형변환
    //형변환은 부모자식간에만 가능하다.
    }
}

class Animal{

}

class Cat extends Animal{

}
class Dog extends Animal{

}