package Tetris;

public class VariableOverriding {
    public static void main(String[] args) {
        동물 동물1 =new 개("돌돌이");
        동물 동물2 = new 고양이("나비");
        동물1.이동();
        동물2.이동();
    }
}

class 동물{

    String 이름;
    이동방식 a이동방식;
    void 이동(){
        a이동방식.이동(이름);
    }
}

class  고양이 extends 동물{

    고양이 (String 이름){
        this.이름 = 이름;
        this.a이동방식 = new 고양이이동방식();
    }

}
class 개 extends 동물{

    개 (String 이름){
        this.이름 = 이름;
        this.a이동방식 = new 개이동방식();
    }

}
class 이동방식{
    void 이동(String 이름){
        System.out.printf("%s 가 사뿐사뿐이동함\n",이름);
    }
}
class 고양이이동방식 extends 이동방식{
    void 이동(String 이름){
        System.out.printf("%s 가 사뿐사뿐이동함\n",이름);
    }
}

class 개이동방식 extends 이동방식{
    void 이동(String 이름){
        System.out.printf("%s가 팍팍이동함\n",이름);
    }
}