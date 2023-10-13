package lesson12;

import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class KettleSortButtons {

    public static void sortElectricKettlesByPriceFromTo(HashSet<Kettle> kettles){
        TreeSet<ElectricKettle> forSorting = new TreeSet<>(new Comparator<ElectricKettle>() {
            @Override
            public int compare(ElectricKettle o1, ElectricKettle o2) {
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                if(o1.getPower() != o2.getPower()){
                    return o1.getPower() - o2.getPower();
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(ElectricKettle.class)){
                forSorting.add((ElectricKettle) k);
            }
        }

        for (ElectricKettle e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortElectricKettlesByPriceToFrom(HashSet<Kettle> kettles){
        TreeSet<ElectricKettle> forSorting = new TreeSet<>(new Comparator<ElectricKettle>() {
            @Override
            public int compare(ElectricKettle o1, ElectricKettle o2) {
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
                if(o1.getPower() != o2.getPower()){
                    return o2.getPower() - o1.getPower();
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(ElectricKettle.class)){
                forSorting.add((ElectricKettle) k);
            }
        }

        for (ElectricKettle e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortElectricKettlesByCapacityFromTo(HashSet<Kettle> kettles){
        TreeSet<ElectricKettle> forSorting = new TreeSet<>(new Comparator<ElectricKettle>() {
            @Override
            public int compare(ElectricKettle o1, ElectricKettle o2) {
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                if(o1.getPower() != o2.getPower()){
                    return o1.getPower() - o2.getPower();
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(ElectricKettle.class)){
                forSorting.add((ElectricKettle) k);
            }
        }

        for (ElectricKettle e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortElectricKettlesByCapacityToFrom(HashSet<Kettle> kettles){
        TreeSet<ElectricKettle> forSorting = new TreeSet<>(new Comparator<ElectricKettle>() {
            @Override
            public int compare(ElectricKettle o1, ElectricKettle o2) {
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
                if(o1.getPower() != o2.getPower()){
                    return o2.getPower() - o1.getPower();
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(ElectricKettle.class)){
                forSorting.add((ElectricKettle) k);
            }
        }

        for (ElectricKettle e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortElectricKettlesByMaterialFromTo(HashSet<Kettle> kettles){
        TreeSet<ElectricKettle> forSorting = new TreeSet<>(new Comparator<ElectricKettle>() {
            @Override
            public int compare(ElectricKettle o1, ElectricKettle o2) {
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                if(o1.getPower() != o2.getPower()){
                    return o1.getPower() - o2.getPower();
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(ElectricKettle.class)){
                forSorting.add((ElectricKettle) k);
            }
        }

        for (ElectricKettle e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortElectricKettlesByMaterialToFrom(HashSet<Kettle> kettles){
        TreeSet<ElectricKettle> forSorting = new TreeSet<>(new Comparator<ElectricKettle>() {
            @Override
            public int compare(ElectricKettle o1, ElectricKettle o2) {
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
                if(o1.getPower() != o2.getPower()){
                    return o2.getPower() - o1.getPower();
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(ElectricKettle.class)){
                forSorting.add((ElectricKettle) k);
            }
        }

        for (ElectricKettle e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortElectricKettlesByPowerFromTo(HashSet<Kettle> kettles){
        TreeSet<ElectricKettle> forSorting = new TreeSet<>(new Comparator<ElectricKettle>() {
            @Override
            public int compare(ElectricKettle o1, ElectricKettle o2) {
                if(o1.getPower() != o2.getPower()){
                    return o1.getPower() - o2.getPower();
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(ElectricKettle.class)){
                forSorting.add((ElectricKettle) k);
            }
        }

        for (ElectricKettle e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortElectricKettlesByPowerToFrom(HashSet<Kettle> kettles){
        TreeSet<ElectricKettle> forSorting = new TreeSet<>(new Comparator<ElectricKettle>() {
            @Override
            public int compare(ElectricKettle o1, ElectricKettle o2) {
                if(o1.getPower() != o2.getPower()){
                    return o2.getPower() - o1.getPower();
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(ElectricKettle.class)){
                forSorting.add((ElectricKettle) k);
            }
        }

        for (ElectricKettle e : forSorting){
            System.out.println(e);
        }
    }


    public static void sortTeapotsByPriceFromTo(HashSet<Kettle> kettles){
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(Teapot.class)){
                forSorting.add((Teapot) k);
            }
        }

        for (Teapot e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortTeapotsByPriceToFrom(HashSet<Kettle> kettles){
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(Teapot.class)){
                forSorting.add((Teapot) k);
            }
        }

        for (Teapot e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortTeapotsByCapacityFromTo(HashSet<Kettle> kettles){
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(Teapot.class)){
                forSorting.add((Teapot) k);
            }
        }

        for (Teapot e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortTeapotsByCapacityToFrom(HashSet<Kettle> kettles){
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(Teapot.class)){
                forSorting.add((Teapot) k);
            }
        }

        for (Teapot e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortTeapotsByMaterialFromTo(HashSet<Kettle> kettles){
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(Teapot.class)){
                forSorting.add((Teapot) k);
            }
        }

        for (Teapot e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortTeapotsByMaterialToFrom(HashSet<Kettle> kettles){
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(Teapot.class)){
                forSorting.add((Teapot) k);
            }
        }

        for (Teapot e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortTeapotsByWeightFromTo(HashSet<Kettle> kettles){
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o1.getWeight(), o2.getWeight());
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o1.getPrice(), o2.getPrice());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(Teapot.class)){
                forSorting.add((Teapot) k);
            }
        }

        for (Teapot e : forSorting){
            System.out.println(e);
        }
    }

    public static void sortTeapotsByWeightToFrom(HashSet<Kettle> kettles){
        TreeSet<Teapot> forSorting = new TreeSet<>(new Comparator<Teapot>() {
            @Override
            public int compare(Teapot o1, Teapot o2) {
                if(o1.getWeight() != o2.getWeight()){
                    return Double.compare(o2.getWeight(), o1.getWeight());
                }
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                if(o1.getPrice() != o2.getPrice()){
                    return Double.compare(o2.getPrice(), o1.getPrice());
                }
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                return 0;
            }
        });
        for(Kettle k : kettles){
            if(k.getClass().equals(Teapot.class)){
                forSorting.add((Teapot) k);
            }
        }

        for (Teapot e : forSorting){
            System.out.println(e);
        }
    }
}
