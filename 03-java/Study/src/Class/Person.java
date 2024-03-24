package Class;

// public class 클래스명 {}
// 클래스명: PascalCase
// 클래스: 객체를 생성하기 위한 설계도
public class Person {
    // 묶어서 관리할 데이터 => 멤버 변수(필드)
    // 멤버 변수: 객체가 가지고 있는 변수(데이터)
    String name;
    int age;
    String hobby;

    // 메서드 => 클래스 안에 정의된 함수
    // 멤버 메서드: 객체가 가지고 있는 메서드.
    // void method: 객체 생성 후에 객체를 사용해서만 접근 가능
    void info() {
        // 멤버 변수에 바로 접근할 수 있음
        System.out.println("이름은 "+name+"이고, 나이는 "+age+"세, 제 취미는 "+hobby+"입니다.");
    }

    // static method: 객체 생성 없이 호출 가능
    static void hello(){
        System.out.println("Hello!");
    }

    void study(int time){
        System.out.println(time+"시간 만큼 공부할테야!");
    }

    // 메서드 오버 로딩
    // 메서드 명은 일치
    // 파라미터의 개수, 순서, 타입이 다르면 똑같은 이름으로 메서드를 여러개 만들 수 있음

    // int
    // String
    void study(String subject, int time){
        System.out.println(subject+"를 "+time+"시간 만큼 공부할테야!");
    }
    void study(int time1, int time2){
        System.out.println(time1*time2+"시간 만큼 공부할테야!");
    }
}
