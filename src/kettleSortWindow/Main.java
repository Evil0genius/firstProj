package kettleSortWindow;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Kettle> kettle = new HashSet<>();
        kettle.add(new Kettle("Electrolux", "сталь", 2, 2000));
        kettle.add(new Kettle("Gorenje", "пластик", 2.5, 2300));
        kettle.add(new Kettle("Electrolux", "стекло", 3, 2500));
        kettle.add(new Kettle("Maunfeld", "сталь", 1.2, 1500));
        kettle.add(new Kettle("Gorenje", "пластик", 1.8, 2000));

        HashSet<Kettle> forPrint = new HashSet<>(SortButtons.sortKettlesByNameFromTo(kettle));
        for (Kettle e : forPrint){
            System.out.println(e);
        }
    }
}
