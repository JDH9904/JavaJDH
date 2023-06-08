package day7;

public class Ob {
    public static void main(String[] args) {
    //모든 객체는 생성자를 호출해서 만든다.
        // 생성자 연쇄호출
    new Anumal();
    new dog(10);
    new cat();
//    new 사람();
//    // 출력 : 사람이 초기화 됩니다.
    System.out.println("== 사람객체 생성시작 ==");
    new 사람();
    System.out.println("== 사람객체 생성끝 ==");

    System.out.println("== 청둥오리객체 생성시작 ==");
    new 청둥오리();
    System.out.println("== 청둥오리객체 생성끝 ==");
    /* 출력
	== 청둥오리객체 생성시작 ==
	생물이 생성되었습니다.
	동물이 생성되었습니다.
	오리가 생성되었습니다.
	청둥오리 생성되었습니다.
	== 청둥오리객체 생성끝 ==
	*/
    }
}

class Anumal{
    Anumal(){
        System.out.println("Anumal 생성자 실행");
    }
}
class Mammalia extends Anumal{
    Mammalia(int a){
        System.out.printf("Mammalia 생성자 실행 %d",a);
    }
}
class cat extends  Mammalia{
    cat(){
        super(10);
        System.out.println("cat 생성자 실행");
    }
}

class dog extends Mammalia{
    dog(int b){
        // Mammalia 부모를 언급할 때는 클래스 이름으로 언급 x 부모를 언급하는 키워드 super
        //부모 생성자를 호출할때 부모 생성자 오버로딩에 유의한다.

        super(10);
        System.out.println("dog 생성자 실행");
    }
}

//class 동물 {
//    // 수정가능지역 시작
//
//    // 수정가능지역 끝
//}
//
//class 사람 extends 동물 {
//    void init() {
//        System.out.println("사람이 초기화 됩니다.");
//    }
//}
class 생물 {
    생물() {
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
        System.out.println("생물이 생성되었습니다.");
    }
}
class 동물 extends 생물 {
    동물() {
        // super(); // 부모 클래스의 생성자를 호출합니다. 생략가능합니다.
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.

        System.out.println("동물이 생성되었습니다.");
    }

}
class 사람 extends 동물 {

    사람() {
        super(); // 부모 클래스의 생성자를 호출합니다.
        // 이 함수는 부모 클래스 생성자를 자동으로 호출합니다.
        //생성자를 아무것도 안 만들었을 시에 자동으로 super가 만들어 지는것 그 외에 생성자 안에 여러 객체가 있으면 안만들어짐

        System.out.println("사람이 생성되었습니다.");
    }
}
class 오리 extends 동물{
    오리(){
        super();
        System.out.println("오리가 생성되었습니다.");
    }
}
class 청둥오리 extends 오리{
    청둥오리(){
        super();
        System.out.println("청둥오리가 생성되었습니다.");
    }
}