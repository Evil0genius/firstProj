package lesson8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Phone samsung = new Phone("000000000", 300, "galaxy");
        Phone apple = new Phone("11111111", 290, "iphone");
        Phone xiaomi = new Phone("222222222", 310, "redmi");

        samsung.setCallerName("Vasya");
        apple.setCallerName("Kolya");
        xiaomi.setCallerName("Petya");

        for (Phone phone : Arrays.asList(samsung, apple, xiaomi)) {
            Phone.printCharactOfPhones(phone);
        }

        for (Phone phone : Arrays.asList(samsung, apple, xiaomi)) {
            Phone.receiveCall(phone.getCallerName());
        }

        Person kolya = new Person("Nikolay", 25);       //Person
        Person vera = new Person();

        Person.talk(kolya);
        Person.move(vera);


    }
}
