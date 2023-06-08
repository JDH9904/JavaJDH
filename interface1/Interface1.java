package interface1;



public class Interface1 {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        a전사.상태창();
        a전사.공격();
        a전사.고침();
        사람 a사람 = new 사람();

        요리사 a요리사 = a사람;
        a요리사.조리();
        아버지 a아버지 = a사람;
        a아버지.애들케어();
    }
}
class 전사{
    무기 a무기 = new 창();
    void 공격(){a무기.사용();}
    void 고침(){a무기.수리();}
    void 상태창(){a무기.무기정보();}
}

// 구현과 형식을 분리(형식만)
interface 무기{
     void 사용();
     void 수리();
     void 무기정보();
}
class 사람 implements 요리사,아버지{
    @Override
    public void 조리() {
        System.out.println("남자가 요리를?");
    }

    @Override
    public void 애들케어() {
        System.out.println("알아서 잘 크겠지");
    }
}

interface 요리사{
    void 조리();

}

interface 아버지{
    void 애들케어();
}
class 칼 implements 무기 {
   public void 사용(){System.out.println("서걱");}
   public void 수리(){System.out.println("수리완");}
   public void 무기정보(){System.out.println("칼");}
}

class 창 implements 무기 {
   public void 사용(){System.out.println("푝");}
   public void 수리(){System.out.println("수리 함");}
   public void 무기정보(){System.out.println("창");}
}