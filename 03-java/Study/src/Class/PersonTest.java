package Class;

public class PersonTest {
    public static void main(String[] args){
        // 방금 만든 설계도로 객체를 생성
        // 클래스(Person)는 변수(생성될 객체)의 타입으로 사용
        // 클래스는 사용자 정의 자료형

        // 객체 생성
        // 클래스명 변수명 = new 클래스명();
        Person yang = new Person();
        // yang: instance
        // 객체의 멤버 변수에 접근할 때는 . 연산자 사용
        yang.name = "Yang";
        yang.age = 45;
        yang.hobby = "Youtube";

        yang.info(); // 객체 생성 후에, 객체의 이름으로 접근
        Person.hello(); // 객체 생성 없이, 클래스 이름으로 바로 접근 = static

        yang.study(10); // int형 형변환 없이 호출
        yang.study((byte)1); // 묵시적 형변환. 묵시적 형변환이 가능할 경우 메서드가 호출됨
        yang.study((short)2);
        yang.study((char)2);
        yang.study((int)100L); // Long형은 묵시적 형변환 불가 -> 메서드 따로 만들어주거나 명시적 형변환(int) 이용

        // 메서드 오버로딩
        // 똑같은 이름의 메서드를 여러개 선언한 수 있음
        // int형, long형 parameter를 갖는 메서드를 2개 선언할 수 있음

        yang.study(1, 1);
        yang.study("1", 1);
    }
}
