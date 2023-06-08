package test;

public class Test6 {
    public static void main(String[] args) {

        int  a; // 객체 타입
        String b; // 객체 이지만 저장 방식이 다름 ( 다른 메모리에 저장이 됨)

        // new 가 붙으면 객체가 새로 만들어 지기 때문에 두 값이 다른 객체로 인식하게 됨.
        // new 가 없으면 주소값이 서로 다르되 목적지가 같으면 서로 같은 객체로 인식됨.

        String str = new String("Hello world");
        String str2 = new String("Hello world");

        if(str == str2){
            System.out.println("딩동");
        } else {
            System.out.println("땡");
        }
    }
}
