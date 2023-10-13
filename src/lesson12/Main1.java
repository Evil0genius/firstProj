package lesson12;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main1 {
    public static void main(String[] args) {
        TreeSet<Integer> texts = new TreeSet<>(new ReverseNumsComparator());
        texts.add(8);
        texts.add(4);
        texts.add(23);
        texts.add(100);

        for(Iterator<Integer> iterator = texts.iterator();iterator.hasNext();){
            System.out.println(iterator.next());

        }
    }
}
