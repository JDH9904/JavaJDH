package day7;

public class ttttttest {
    public static void main(String[] args) {
        new 사람3();
        // 출력 : 사람이 초기화 됩니다.
    }
}
class 동물3 {
    // 수정가능지역 시작
    동물3(){
        init();
    }
    void init() {

    }
    // 수정가능지역 끝
}

class 사람3 extends 동물3 {
    void init() {
        System.out.println("사람이 초기화 됩니다.");
    }
}