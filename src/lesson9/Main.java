package lesson9;

public class Main {
    public static void main(String[] args) {
        Tovar tovar = new Tovar("Name", 200, 150);
        Tovar tovar1 = new Tovar("Name", 200, 150);
        System.out.println(tovar1.equals(tovar));
    }
}
