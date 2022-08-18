package material;

import java.time.LocalDate;

public class Meat extends Material implements Idiscount{

    private double weight;
    public Meat(){}
    public Meat(String id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        this.weight = weight;
    }

    public Meat(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return 0;
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }




    @Override
    public String toString() {
        return super.toString() +
                "Meat " +
                "weight=" + weight;
    }
}
