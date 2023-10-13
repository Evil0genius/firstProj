package kettleSortWindow;

import java.util.Objects;

public class Kettle {

    private String name;
    private String material;
    private double capacity;
    private int power;

    public Kettle() {
    }

    public Kettle(String name, String material, double capacity, int power) {
        this.name = name;
        this.material = material;
        this.capacity = capacity;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Kettle kettle = (Kettle) o;

        if (Double.compare(capacity, kettle.capacity) != 0) return false;
        if (power != kettle.power) return false;
        if (!Objects.equals(name, kettle.name)) return false;
        return Objects.equals(material, kettle.material);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + (material != null ? material.hashCode() : 0);
        temp = Double.doubleToLongBits(capacity);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + power;
        return result;
    }

    @Override
    public String toString() {
        return "Kettle{" +
                "бренд='" + name + '\'' +
                ", материал='" + material + '\'' +
                ", емкость=" + capacity +
                ", мощность=" + power +
                '}';
    }
}
