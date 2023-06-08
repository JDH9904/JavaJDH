package game;

public class ggameee {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.공격();
        a전사.고침();
    }
}
class 전사{
    무기 a무기 = new 창();
    void 공격(){
        a무기.사용();
    }
    void 고침(){
        a무기.수리();
    }
}

// 추상클래스 추상메서드가 있는 클래스
abstract class 무기{
    //추상메서드 내용없는 메서드 (반드시 오버라이딩 해야함)
   abstract void 사용();
    abstract void 수리();
}

class 칼 extends 무기{
    void 사용(){
        System.out.println("서걱");
    }
    void 수리(){
        System.out.println("수리완");
    }
}

class 창 extends 무기{
    void 사용(){
        System.out.println("푝");
    }
    void 수리(){
        System.out.println("수리 완");
    }
}