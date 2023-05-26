package fgh;

public class Dan {
    public static void main(String[] args) {
//        int age = 22;
//        String name = "콩순이";
//        String message = String.format("%d살 %s입니다", age, name);
//        System.out.println(message);


//        for (int b = 1; b <= 10; b++) {
//            for (int i = 1; i <= 5; i += 1) {
//                System.out.println(i);
//                System.out.println("===");
//            }
//        }


//        System.out.println("dan * 1 = 2");
//

//
//        for (int j = 1; j <= 123; j += 1) {
//            for (int dan = 1; dan <= 123; dan += 1) {
//
//                System.out.printf("%d * %d = %d\n",j, dan, j * dan );
//            }
        for (int j = 1; j <= 9; j += 1) {
            for (int dan = 1; dan <= 9; dan += 1) {

                System.out.printf("%d * %d = %d\t",j, dan, j * dan );
                if(dan % 9 == 0){
                    System.out.println();
                }
            }

        }
    }
}
