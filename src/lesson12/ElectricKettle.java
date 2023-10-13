package lesson12;

public class ElectricKettle extends Kettle {
    private int power;

    public ElectricKettle(int power) {
        this.power = power;
    }

    public ElectricKettle(String material, double capacity, double price, int power) {
        super(material, capacity, price);
        this.power = power;
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
        if (!super.equals(o)) return false;

        ElectricKettle that = (ElectricKettle) o;

        return power == that.power;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + power;
        return result;
    }

    @Override
    public String toString() {
        return "ElectricKettle{" +
                "power=" + power +
                ", material='" + getMaterial() + '\'' +
                ", capacity=" + getCapacity() +
                ", price=" + getPrice() +
                '}';
    }
    public int compareTo(ElectricKettle e){
        if(this.getCapacity() != e.getCapacity()){
            return Double.compare(this.getCapacity(), e.getCapacity());
        }
        if(this.getPrice() != e.getPrice()){
            return Double.compare(this.getPrice(), e.getPrice());
        }
        if(!this.getMaterial().equals(e.getMaterial())){
            return this.getMaterial().compareTo(e.getMaterial());
        }
        if(this.power != e.power){
            return this.power - e.power;
        }
        return 0;
    }
}
