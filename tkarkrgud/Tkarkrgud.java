package tkarkrgud;

public class Tkarkrgud {

    public static void top(int height){

        for (int j = 1; j <= height; j++) {
            for (int i = 0; i <= height -  j - 1; i++) {
                System.out.print(" ");
            }
            for (int k = 1; k <=j; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        top(5);

    }
}
