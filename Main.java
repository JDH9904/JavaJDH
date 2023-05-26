// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//조건문을 활용하여 자판기를 구현해보자!
        System.out.println("자판기 시스템을 구현해보자!");

        System.out.println("메뉴:콜라, 사이다, 솔의눈, 데미소다");

        int c; // c 는 콜라
        int s; // s 는 사이다
        int i; // i 는 솔의 눈
        int d; // d 는 데미소다

        // 각 음료수에 값을 정해보자.

        c = 1300;
        s = 1200;
        i = 800;
        d = 950;

        // 위 숫자는 원 단위이다.

        //값을 정했으니 동전 투입을 구현해보자!

        System.out.println("동전을 넣어주세요.");

        int w1; // 이것은 500원 동전의 투입 갯수를 정의한다.
        int w2; // 이것은 1000원 지폐의 투입 갯수를 정의한다.

        // 투입금액을 나타내자!

        w1 = 1;
        w2 = 1;

        int w3 = (w1 * 500) + (w2 * 1000);


        System.out.println((w3) + "원 입니다.");

        //조건문을 나타내기 위해서 int 값을 하나를 추가하자!
        int h; // h 는 음료수 고른 함수값이 된다. Ex) h = c 이것은 h가 콜라가 된다는 의미

        h = c;

        // 잔액이 부족한 경우를 위해 조건을 추가

        if (h == c && w3 >= c) {
            System.out.println("콜라를 구매해주셨습니다.");
            System.out.println("잔돈은" + (w3 - c) + "남았습니다.");
            w3 -= c; // 금액차감

        } else if (h == s && w3 >= s) {
            System.out.println("사이다를 구매해주셨습니다.");
            System.out.println("잔돈은" + (w3 - s) + "남았습니다.");
            w3 -= s; // 금액차감
        } else if (h == i && w3 >= i) {
            System.out.println("솔의눈을 구매해주셨습니다.");
            System.out.println("잔돈은" + (w3 - i) + "남았습니다.");
            w3 -= i; // 금액차감
        } else if (h == d && w3 >= d) {
            System.out.println("데미소다를 구매해주셨습니다.");
            System.out.println("잔돈은" + (w3 - d) + "남았습니다.");
            w3 -= d; // 금액차감
        } else if (w3 < c || w3 < s || w3 < i || w3 < d && w3 != 0) {
            System.out.println("잔액이 부족합니다.");
            // 잔액부족한 경우

        }
        if (w3 < 800) {
            System.out.println("이용해주셔서 감사합니다.");
        }
        //추가 구매를 원하는 경우
        // int h 가 1번째 구매 경우라면 2번째 연속 구매를 위한 새로운 h 값을 설정.

        h = i;

        if (w3 < c || w3 < s || w3 < i || w3 < d) {
            System.out.println("다음에 또 와주세요.");
            // 먼저 추가구매가 불가능한 경우를 우선 설정
        } else if (h == c && w3 >= c) {
            System.out.println("콜라를 구매해주셨습니다.");
            System.out.println("잔돈은" + (w3 - c) + "남았습니다.");
            w3 -= c; // 금액차감

        } else if (h == s && w3 >= s) {
            System.out.println("사이다를 구매해주셨습니다.");
            System.out.println("잔돈은" + (w3 - s) + "남았습니다.");
            w3 -= s; // 금액차감
        } else if (h == i && w3 >= i) {
            System.out.println("솔의눈을 구매해주셨습니다.");
            System.out.println("잔돈은" + (w3 - i) + "남았습니다.");
            w3 -= i; // 금액차감
        } else if (h == d && w3 >= d) {
            System.out.println("데미소다를 구매해주셨습니다.");
            System.out.println("잔돈은" + (w3 - d) + "남았습니다.");
            w3 -= d; // 금액차감


        }
        if (w3 <= c || w3 <= s || w3 <= i || w3 <= d) {
            System.out.println("거스름돈이 나왔습니다.");
            // 추가구매 이후 잔돈이 남은 경우, 0원 남은 경우 거스름돈이 안나온다.
        }

    }

}
