package lesson12;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class KettleMain {
    public static void main(String[] args) {
        HashSet<Kettle> kettles = new HashSet<>();

        kettles.add(new ElectricKettle("glass",1.8,1000,2000));
        kettles.add(new ElectricKettle("steel",1,1500,2100));
        kettles.add(new ElectricKettle("aluminum",3,900,1900));
        kettles.add(new Teapot("aluminum",0.5,900,300));
        kettles.add(new Teapot("glass",0.2,1800,200));
        kettles.add(new Teapot("plastic",1,2100,500));

        KettleSortButtons.sortElectricKettlesByPriceFromTo(kettles);
        KettleSortButtons.sortElectricKettlesByPriceToFrom(kettles);

        MainWin app = new MainWin(kettles);
        app.setVisible(true);
    }

}
