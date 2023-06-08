//package day6;
//
//import java.lang.reflect.Array;
//
//public class Wp {
//    public static void main(String[] args) {
//        무기 a무기 = new 칼();
//        a무기.공격();
//        // 출력 : 칼로 공격합니다.
//
//        a무기 = new 활();
//        a무기.공격();
//        // 출력 : 활로 공격합니다.
//    }
//}
//class 무기{ // 오버라이딩으로 해결하는 방법도 있음
//
//    String a;
//
//
//    void 공격(){
//        System.out.printf("%s로 공격합니다.\n",this.a);
//    } // 위 코드 대신 활로 공격합니다 생성
//}
//class 칼 extends 무기 {
//    public 칼(){
//        a = "칼"; // 공격 메서드를 하나를 추가 생성 후 칼로 공격 출력
//        // 따라서 가장 가까운 함수를 먼저 사용하기 때문에 칼로 공격을 사용
//    }
////int e = (int)10.6; //수동형변환
//
//}
//class 활 extends 무기{
//    public 활(){ // 물려받은 활 공격을 받음
//        a = "활";
//    }
//
//}

