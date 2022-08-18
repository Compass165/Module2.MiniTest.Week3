package material;

import java.time.LocalDate;


public class CrispyFlour extends Material implements Idiscount{
    public String name;

    private int quantity;
    public CrispyFlour(){}
    public CrispyFlour(int quantity) {
        this.quantity = quantity;
    }

    public CrispyFlour(String id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return this.quantity*getCost();
    }


    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
        return 0;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "CrispyFlour " +
                "quantity=" + quantity;
    }
}
