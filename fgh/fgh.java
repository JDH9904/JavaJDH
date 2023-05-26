package fgh;

public class fgh {
    public static void main(String[] args) {

        //RGB 값을 활용하여 색상을 구분지어 보자!
        // 값은 0 ~  255 사이이다!

        int R; // R는 빨강을 의미한다.
        int G; // G는 초록을 의미한다.
        int B; // B는 파랑을 의미한다.

        // 이를 활용하여 특정 색상이 어느색에 더 가까운지 혹은 무슨색인지 한번 구분하는것에 목표를 두어보자!
        R = 100;
        B = 100;
        G = 100;

        if(R == 255 && G == 0 && B == 0){
            System.out.println("완벽한 빨강색 입니다!");
        }else if (R == 0 && G == 255 && B == 0){
            System.out.println("완벽한 초록색 입니다!");
        }else if (R == 0 && G == 0 && B == 255){
            System.out.println("완벽한 파란색 입니다!");
        }

        // 가장 순수한 색상을 나타냈다 . 반대로 흰색과 검정색을 표현해 보자!

        if (R == 0 && G == 0 && B == 0){
            System.out.println("완벽한 흰색 입니다!");
        } else if (R == 255 && G == 255 && B == 255){
            System.out.println("완벽한 검정색 입니다!");
        }

        // 이제 회색상을 표현해보자!!

        if (R == G && G == B && B == R){
            System.out.println("위 색상은 회색입니다.");

        }
        if (R == G && G == B && B == R && R > 127){
            System.out.println("그 중에서도 어두운 편이네요!");
        }
        if (R == G && G == B && B == R && R < 127){
            System.out.println("그 중에서도 밝은 편이네요!");
        }
        // 회색중에서도 밝은지 어두운지를 판별한다.

        //어느색에 더 가까운지 분류하게끔 조건문을 작성한다.

        if (R > G && R > B){
            System.out.println("붉은계열에 가까운 색상입니다.");
        } else if (G > R && G > B){
            System.out.println("초록계열에 가까운 색상입니다.");
        }else if (B > R && B > G){
            System.out.println("파란계열에 가까운 색상입니다.");
        }

        // 마지막으로 혼합색상을 간단하게 작성해보자.

        if (R == B && R > G && B > G){
            System.out.println("보라색 입니다.");
        } else if (G == B && G > R && G > B){
            System.out.println("청록색 입니다.");
        } else if (R == G && R > B && G > B){
            System.out.println("노란색 입니다.");
        }
    }
}
