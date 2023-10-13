package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class SortButtons {
    public void sortByDiameterFromTo(TreeSet<Coin> coins){
        TreeSet<Coin> forSorting = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if(o1.getDiameter() != o2.getDiameter()){
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }
                if(o1.getNominal() != o2.getNominal()){
                    return o1.getNominal() - o2.getNominal();
                }
                if(o1.getYear() != o2.getYear()){
                    return o1.getYear() - o2.getYear();
                }
                if(!o1.getMetal().equals(o2.getMetal())){
                    return o1.getMetal().compareTo(o2.getMetal());
                }
                return 0;
            }
        });
        forSorting.addAll(coins);

        for (Coin c : forSorting){
            System.out.println(c);
        }
    }
    public void sortByDiameterToFrom(TreeSet<Coin> coins){
        TreeSet<Coin> forSorting = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if(o1.getDiameter() != o2.getDiameter()){
                    return Double.compare(o2.getDiameter(), o1.getDiameter());
                }
                if(o1.getNominal() != o2.getNominal()){
                    return o2.getNominal() - o1.getNominal();
                }
                if(o1.getYear() != o2.getYear()){
                    return o2.getYear() - o1.getYear();
                }
                if(!o1.getMetal().equals(o2.getMetal())){
                    return o2.getMetal().compareTo(o1.getMetal());
                }
                return 0;
            }
        });
        forSorting.addAll(coins);

        for (Coin c : forSorting){
            System.out.println(c);
        }

    }
    public void sortByMetalFromTo(TreeSet<Coin> coins){

    }
    public void sortByMetalToFrom(TreeSet<Coin> coins){

    }
}
