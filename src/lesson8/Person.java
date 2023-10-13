package lesson8;

public class Person {
    private String fullName;
    private int age;

    public static void move(Person p) {
        System.out.println("Такой-то " + p.fullName + " говорит");
    }

    public static void talk(Person p) {
        System.out.println("Такой-то " + p.fullName + " говорит");
    }

    public Person(String fullName, int age) {
        this.age = age;
        this.fullName = fullName;
    }

    public Person() {
    }
}
