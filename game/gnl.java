package game;

public class gnl {
    public static void main(String[] args) {
        저장소 a저장소1 = new 저장소();

        a저장소1.setData(30);
        int a = a저장소1.getData();

        System.out.println(a);

        저장소 a저장소2 = new 저장소();

        a저장소2.setData(5.5);
        double b = a저장소2.getData();

        System.out.println(b);


        저장소 a저장소3 = new 저장소();

        a저장소3.setData(new 사과2());
        사과2 c = a저장소3.getData();

        System.out.println(c);
    }
}

class 저장소 {
    Object data;

    <T> T getData() {
        return (T)data;
    }

    <T> void setData(T inputedData) {
        this.data = inputedData;
    }
}

class Double저장소 <T>{
    Object data;

    T getData() {
        return (T)data;
    }

    void setData(Object inputedData) {
        this.data = inputedData;
    }
}

class 사과2 {
}

//class 사과저장소 {
//    Object data;
//
//    사과 getData() {
//        return (사과)data;
//    }
//
//    void setData(Object inputedData) {
//        this.data = inputedData;
//    }
//}