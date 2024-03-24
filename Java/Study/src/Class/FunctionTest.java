package Class;

import java.util.Random;

public class FunctionTest {
    // 함수
    // 특정한 작업(기능)을 수행하는 문장들을 한 단위로 묶은 것
    // 자바에서는 메서드라는 용어를 사용(클래스 안에 정의된 함수)

    // 함수의 정의
    // 반환형 함수명(매개변수1, 매개변수2, ..){
    // 문장1; 문장2;..
    // return 반환값;

    // - 결과값이 없다면 반환형은 void;

    // 제한자
        // public
        // 다른 클래스에서 접근 가능하다

        // static
        // 객체 생성 없이 사용 가능

    public static void main(String[] args){
        System.out.println("test");
        boolean homework = 숙제();
        if (homework){
            System.out.println("공부해라");
        }
        else{
            System.out.println("놀아라");
        }
        교육();
        이동("역삼", "버스");
    }

    // static 메서드는 static 메서드만 호출 가능
    static void 교육() {
        System.out.println("method 만들었지롱");
    }

    static void 이동(String 장소, String 이동수단){
        System.out.println(이동수단+"(을)를 타고 "+장소+"(으)로 이동한다.");
    }

    static boolean 숙제(){
        Random random = new Random();
        return random.nextBoolean(); // 랜덤하게 true/false 반환.
    }
}
