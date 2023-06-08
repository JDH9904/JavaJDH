package ddaayy;

public class wrwrwrwr {
    public static void main(String[] args) {
        전사 a전사 = new 전사();

        String 이름 = "칸";
        a전사.이름 = 이름;
        a전사.나이 = 20;
        a전사.자기소개();

        a전사.나이++;
        a전사.자기소개();

        a전사.나이 = 30;
        a전사.이름 = "카니";
        a전사.자기소개();

        a전사.a무기 = new 활();
        a전사.공격();
        // 출력 : 카니가 활로 공격합니다.
        a전사.스킬사용();

        a전사.a무기 = new 칼();
        a전사.공격();
        a전사.스킬사용();
        // 출력 : 카니가 칼로 공격합니다.
    }
}
class 전사 {
    // 인스턴스 변수
    String 이름;
    // 인스턴스 변수
    int 나이;
    // 인스턴스 변수
    무기 a무기;
    void 스킬사용(){
        System.out.println(a무기.skname+"을 사용합니다");
        System.out.println(a무기.sk+"데미지 발생");
    }
    void 공격(){
        System.out.println(this.이름 + "가 공격을합니다!");
        System.out.println(a무기.ch+"로 공격합니다.");
        System.out.println(a무기.dmg + "데미지 발생.");
    }
    void 자기소개() {
        System.out.println("안녕하세요. 저는 " + this.나이 + "살 " + this.이름 + " 입니다.");
    }
}
class 무기 extends 전사{

    int dmg;
    double sk;
    String ch;
    String skname;
}
class 칼 extends 무기 {
   public 칼(){
       ch = "칼";
       dmg =15;
       sk = dmg * 2;
       skname = "연속베기";
    }
}
class 활 extends 무기 {
  public 활(){
      ch = "활";
      dmg =10;
      sk = dmg * 1.5;
      skname = "불화살";
   }
}