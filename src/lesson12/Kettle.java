package lesson12;

import java.util.Objects;

public class Kettle {
    private String material;
    private double capacity;
    private double price;

    public Kettle() {
    }

    public Kettle(String material, double capacity, double price) {
        this.material = material;
        this.capacity = capacity;
        this.price = price;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kettle kettle = (Kettle) o;

        if (Double.compare(capacity, kettle.capacity) != 0) return false;
        if (Double.compare(price, kettle.price) != 0) return false;
        return Objects.equals(material, kettle.material);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = material != null ? material.hashCode() : 0;
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(price);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "material='" + material + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
    public int compareTo(Kettle k){
        if(this.capacity != k.capacity){
            return Double.compare(this.capacity, k.capacity);
        }
        if(this.price != k.price){
            return Double.compare(this.price, k.price);
        }
        if(!this.material.equals(k.material)){
            return this.material.compareTo(k.material);
        }
        return 0;
    }
}

