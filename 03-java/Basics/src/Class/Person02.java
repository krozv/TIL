package Class;
public class Person02 {
    String name;
    int age;
    String hobby;

    Person(String n, int a, String h){
        name = n;
        age = a;
        hobby = h;
    }

    void info() {
        System.out.printIn(name, age, hobby);
    }
}