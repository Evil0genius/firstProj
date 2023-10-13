package lesson12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(23);
        nums.add(26);
        nums.add(42);
        nums.add(672);

        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2,o1);
            }
        });


        for(Integer num : nums){
            System.out.println(num);}
    }




}
