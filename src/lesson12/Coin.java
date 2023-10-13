package lesson12;

import java.util.Objects;

public class Coin implements Comparable<Coin>{
    private double diameter;
    private String metal;
    private  int nominal;
    private int year;

    public Coin() {
    }

    public Coin(double diameter, String metal, int nominal, int year) {
        this.diameter = diameter;
        this.metal = metal;
        this.nominal = nominal;
        this.year = year;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    public String getMetal() {
        return metal;
    }

    public void setMetal(String metal) {
        this.metal = metal;
    }

    public int getNominal() {
        return nominal;
    }

    public void setNominal(int nominal) {
        this.nominal = nominal;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Coin coin = (Coin) o;

        if (Double.compare(diameter, coin.diameter) != 0) return false;
        if (nominal != coin.nominal) return false;
        if (year != coin.year) return false;
        return Objects.equals(metal, coin.metal);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(diameter);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (metal != null ? metal.hashCode() : 0);
        result = 31 * result + nominal;
        result = 31 * result + year;
        return result;
    }

    @Override
    public String toString() {
        return "Coin{" +
                "diameter=" + diameter +
                ", metal='" + metal + '\'' +
                ", nominal=" + nominal +
                ", year=" + year +
                '}';
    }


    @Override
    public int compareTo(Coin o) {
        if(this.nominal != o.nominal){
            return this.nominal - o.nominal;
        }
        if(this.year != o.year){
            return this.year - o.year;
        }
        if(this.diameter != o.diameter){
            return Double.compare(this.diameter, o.diameter);
        }

        if(!this.metal.equals(o.metal)){
            return this.metal.compareTo(o.metal);
        }
        return 0;
    }
}
