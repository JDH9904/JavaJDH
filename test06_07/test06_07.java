package test06_07;

public class test06_07 {
    public static void Top(int height){
        int t = 1;


        for (int i = 1; i <= height; i++){
            for (int j= 0; j<= height-1-i;j++){
                System.out.print(" ");
            }
            for (int j2 = 1; j2 <= (height*2) -1; j2++){

                System.out.print("*");

                if (t == height + (height - 1)){
                    t += 2;
                    break;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {

    }
}

