package lesson13;

import java.util.*;

public class Fridge {
    private HashMap<String,Integer> products = new HashMap<>();
    private int capacity = 500;

    public void addProduct(String product, int weight){
        if(products.containsKey(product)){
            products.put(product,weight + products.get(product)) ;
        }else {
            products.put(product,weight);
        }
    }

    public void printAllProducts(){
        for(Map.Entry<String,Integer> product : products.entrySet()){
            System.out.println(product.getKey() + " - " + product.getValue());
        }
    }

    public  void getProduct(String product, int weight){
        if(!products.containsKey(product)){
            System.out.println("No product in the fridge");
            return;
        }
        if(products.get(product) < weight){
            System.out.println("not enouth"+product+" in fridge");
            products.remove(product);
            return;
        }

        if(products.get(product) == weight){
            products.remove(product);
            return;
        }
        products.put(product, products.get(product)-weight);
    }

    public void printProductsLessThan2Kg(){
        for(Map.Entry<String,Integer> product : products.entrySet()){
            if(product.getValue() < 2){
                System.out.println("Кончается "+product.getKey() + ". Осталось " + product.getValue());
            }
        }
    }

    public void printProductsMoreThanOthers(){
        int productsMaxValue = 0;
        for(Map.Entry<String,Integer> product : products.entrySet()){
            if(product.getValue() > 0) {
               productsMaxValue += product.getValue();
            }
        }
        for(Map.Entry<String,Integer> product : products.entrySet()) {
            if (product.getValue() == productsMaxValue) {
                System.out.println(product.getKey() + " - " + product.getValue());
            }
        }
    }

    public void printProductsComparedForName(){
        TreeMap<String, Integer> forSorting = new TreeMap<>(products);
        for(Map.Entry<String,Integer> sort : forSorting.entrySet()){
            System.out.println(sort.getKey() + " - " + sort.getValue());
        }
    }

    public void printProductsComparedFromTo(){
        LinkedHashMap<String, Integer> sortedMap = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            list.add(entry.getValue());
        }
        Collections.sort(list);
        for (int num : list) {
            for (Map.Entry<String, Integer> entry : products.entrySet()) {
                if (entry.getValue().equals(num)) {
                    sortedMap.put(entry.getKey(), num);
                }
            }
        }
        System.out.println(sortedMap);
    }
}
