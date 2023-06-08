package test;

public class Test4 {



    public static void test(){
        int a = 10;
    }


    // 메인 메서드
    public static void main(String[] args) {
//        {
//            int a = 10; //지역변수
//            System.out.println(a);
//        }
//        System.out.println(a);
        // 지역변수 -> 자원관리를 위해서 존재함 메모리 사용량 때문.
        // 또한 문제의 범위를 지역으로 국한한다.
//        test();
//        System.out.println();
         String str = new String("Hello world");
         String str2 = new String("Hello world");

         if(str == str2){
             System.out.println("딩동");
         } else {
             System.out.println("땡");
         }
    }
}
