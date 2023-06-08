package test;

import java.io.IOException;

public class Test3 {
    public static void main(String[] args) {
        try {

            int num = System.in.read();
            System.out.println(num);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
