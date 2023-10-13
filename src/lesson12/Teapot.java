package lesson12;

public class Teapot extends Kettle{
    private double weight;

    public Teapot(double weight) {
        this.weight = weight;
    }

    public Teapot(String material, double capacity, double price, double weight) {
        super(material, capacity, price);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Teapot teapot = (Teapot) o;

        return Double.compare(weight, teapot.weight) == 0;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        long temp;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Teapot{" +
                "weight=" + weight +
                ", material='" + getMaterial() + '\'' +
                ", capacity=" + getCapacity() +
                ", price=" + getPrice() +
                '}';
    }
    public int compareTo(Teapot e){
        if(this.getCapacity() != e.getCapacity()){
            return Double.compare(this.getCapacity(), e.getCapacity());
        }
        if(this.getPrice() != e.getPrice()){
            return Double.compare(this.getPrice(), e.getPrice());
        }
        if(!this.getMaterial().equals(e.getMaterial())){
            return this.getMaterial().compareTo(e.getMaterial());
        }
        if(this.weight != e.weight){
            return Double.compare(this.weight, e.weight);
        }
        return 0;
    }
}
