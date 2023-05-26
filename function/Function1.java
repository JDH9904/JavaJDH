package function;



public class Function1 {
    public static void baest (){
        System.out.println("코드1");
        System.out.println("코드2");
        System.out.println("코드3");
    }

    public static int add(int a, int b){
        int sum = a + b;
        return sum;

    }
    private static int test2(){
        return 10;
    }

    private static int A(int x, int y){
        int gkq = x +y;
        return gkq;
    }
    public static void main(String[] args) {
        baest();
        //변수랑 비슷함 동일한 값을 재사용
        //함수 동일한 코드를 재사용
        baest(); // 메서드 호출
        // 다른코드가 존재함
        baest();
        //또 다른 코드가 존재함 따라서 반복문이 불가능한 상황임
        baest();

        baest();

        add(5,9);
        System.out.println();

        test2();

        System.out.println(A(20,50));



    }
}
