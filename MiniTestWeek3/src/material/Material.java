package material;

import java.time.LocalDate;


public abstract class Material{

    private String id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;

    public Material() {}

    public Material(String id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public abstract double getAmount();


    public abstract LocalDate getExpiryDate();

    public void addList(Object[] arrayBefore, int index, Object object) {
        Object[] arrayAfter = new Object[arrayBefore.length + 1];
        for (int i = 0; i < arrayBefore.length; i++) {
            if (i < index) {
                arrayAfter[i] = arrayBefore[i];
            } else if (i == index) {
                arrayAfter[i] = object;
            } else {
                arrayAfter[i] = arrayBefore[i-1];
            }
        }
    }




    @Override
    public String toString() {
        return "Material " +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", manufacturingDate=" + manufacturingDate +
                ", cost=" + cost;
    }
}
