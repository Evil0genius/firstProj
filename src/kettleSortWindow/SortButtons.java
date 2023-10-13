package kettleSortWindow;


import java.util.Comparator;
import java.util.HashSet;
import java.util.TreeSet;

public class SortButtons {
    public static TreeSet<Kettle> sortKettlesByNameFromTo(HashSet<Kettle> kettle){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(o1.getName() != o2.getName()){
                    return o1.getName().compareTo(o2.getName());
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
        forSorting.addAll(kettle);

        return forSorting;
    }

    public static TreeSet<Kettle> sortKettlesByNameToFrom(HashSet<Kettle> kettle){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(o1.getName() != o2.getName()){
                    return o2.getName().compareTo(o1.getName());
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
        forSorting.addAll(kettle);

        return forSorting;
    }

    public static TreeSet<Kettle> sortKettlesByMaterialFromTo(HashSet<Kettle> kettle){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o1.getMaterial().compareTo(o2.getMaterial());
                }
                if(o1.getName() != o2.getName()){
                    return o1.getName().compareTo(o2.getName());
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
        forSorting.addAll(kettle);

        return forSorting;
    }

    public static TreeSet<Kettle> sortKettlesByMaterialToFrom(HashSet<Kettle> kettle){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(!o1.getMaterial().equals(o2.getMaterial())){
                    return o2.getMaterial().compareTo(o1.getMaterial());
                }
                if(o1.getName() != o2.getName()){
                    return o2.getName().compareTo(o1.getName());
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
        forSorting.addAll(kettle);

        return forSorting;
    }

    public static TreeSet<Kettle> sortKettlesByCapacityFromTo(HashSet<Kettle> kettle){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o1.getCapacity(), o2.getCapacity());
                }
                if(o1.getName() != o2.getName()){
                    return o1.getName().compareTo(o2.getName());
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
        forSorting.addAll(kettle);

        return forSorting;
    }

    public static TreeSet<Kettle> sortKettlesByCapacityToFrom(HashSet<Kettle> kettle){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(o1.getCapacity() != o2.getCapacity()){
                    return Double.compare(o2.getCapacity(), o1.getCapacity());
                }
                if(o1.getName() != o2.getName()){
                    return o2.getName().compareTo(o1.getName());
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
        forSorting.addAll(kettle);

        return forSorting;
    }

    public static TreeSet<Kettle> sortKettlesByPowerFromTo(HashSet<Kettle> kettle){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(o1.getPower() != o2.getPower()){
                    return o1.getPower() - o2.getPower();
                }
                if(o1.getName() != o2.getName()){
                    return o1.getName().compareTo(o2.getName());
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
        forSorting.addAll(kettle);

        return forSorting;
    }

    public static TreeSet<Kettle> sortKettlesByPowerToFrom(HashSet<Kettle> kettle){
        TreeSet<Kettle> forSorting = new TreeSet<>(new Comparator<Kettle>() {
            @Override
            public int compare(Kettle o1, Kettle o2) {
                if(o1.getPower() != o2.getPower()){
                    return o2.getPower() - o1.getPower();
                }
                if(o1.getName() != o2.getName()){
                    return o2.getName().compareTo(o1.getName());
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
        forSorting.addAll(kettle);

        return forSorting;
    }

}
