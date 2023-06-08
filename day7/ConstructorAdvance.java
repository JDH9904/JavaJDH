package day7;
import java.util.Scanner;

public class ConstructorAdvance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        man aman = new man(27,1,"sim_cy");
        aman.js();

        man aman2 = new man(25);

        저장소.저장(10);
        저장소.저장("안녕");
        저장소.저장(new 사람5());
        저장소.저장(new 사과());
        저장소.저장(5.5);
        저장소.저장(false);
        저장소.저장('a');

    }
}
class man{
    int age;
    int no;
    String name;
    //같은 이름으로 메소드나 생성자를 여러개 만드는 것 -> 오버로딩
    man(int age){
        this.age = age;
    }
    man(int age, int no, String name){
        this.age = age;
        this.name=name;
        this.no=no;
    }

    void js(){
        System.out.printf("%d살 %d번 %s입니다.\n",age,no,name);
    }
    void js(int a ){ //저기 안에 인트값이나 스트링 값이 무엇이 들어가든 상관은 없음.
        System.out.printf("%d살입니다.\n",age);
    }

//    저장소.저장(b);
//    저장소.저장(s);
//    저장소.저장(c);
//    저장소.저장(i);
//    저장소.저장(l);
//    저장소.저장(f);
//    저장소.저장(d);
//    저장소.저장(bl);

}

class 사람5{

    }


class 사과{

}
class 저장소{
    // 정수 계열
   static byte b; // 1바이트
   static char c; // 2바이트
   static short s; // 2바이트
   static int i; // 4바이트
   static long l; // 8바이트

    // 실수 계열
    // 4.1f => float 형 실수를 의미
   static float f; // 4바이트
    // 3.141592 => double 형 실수를 의미
   static double d; // 8 바이트

    // 논리 계열
   static boolean bl = false; // 1/8 바이트, 1비트





  public static void 저장(int a){
      저장소.i = a;
   }

    public static void 저장(String b){


    }

    public static void 저장(byte b){
      저장소.b = b;
    }

    public static void 저장(char c){
        저장소.c = c;
    }

    public static void 저장(short s){
      저장소.s = s;
    }

    public static void 저장(long l){
      저장소.l = l;
    }
    public static void 저장(float f){
        저장소.f = f;
    }
    public static void 저장(double d){
        저장소.d = d;
    }
    public static void 저장(boolean bl){
        저장소.bl = bl;
    }



    public static void 저장(사람5 y){

  }

   public static void 저장(사과 y){

   }

}


