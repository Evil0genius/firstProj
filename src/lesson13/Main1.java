package lesson13;

public class Main1 {
    public static void main(String[] args) {
        Fridge fridge = new Fridge();
        fridge.addProduct("Bananas",3);
        fridge.addProduct("Bananas",2);
        fridge.getProduct("sliva",10);
        fridge.printAllProducts();


    }
}
