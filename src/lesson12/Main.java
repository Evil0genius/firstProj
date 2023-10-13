package lesson12;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Coin> coins = new TreeSet<>(new Comparator<Coin>() {
            @Override
            public int compare(Coin o1, Coin o2) {
                if(o1.getNominal() != o2.getNominal()){
                    return o1.getNominal() - o2.getNominal();
                }
                if(o1.getYear() != o2.getYear()){
                    return o1.getYear() - o2.getYear();
                }
                if(o1.getDiameter() != o2.getDiameter()){
                    return Double.compare(o1.getDiameter(), o2.getDiameter());
                }

                if(!o1.getMetal().equals(o2.getMetal())){
                    return o1.getMetal().compareTo(o2.getMetal());
                }
                return 0;
            }
        });
        coins.add(new Coin(2,"gold",5,1990));
        coins.add(new Coin(2,"gold",5,1990));
        coins.add(new Coin(3,"silver",3,2000));
        coins.add(new Coin(4,"steel",20,1880));
        coins.add(new Coin(5,"stone",100,100));

        for(Coin c: coins){
            System.out.println(c);
        }
    }
}
