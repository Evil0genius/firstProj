package lesson13;

public class Main2 {
    public static void main(String[] args) {
        Person person = new Person();
        try{
            try {
                person.setAge(160);
            } catch (AgeException e) {
                System.out.println("Too much age");
            }
        }catch (ArithmeticException e){
            System.out.println("Too mush age!! more than 150");
        }

        System.out.println("h");
    }
}
