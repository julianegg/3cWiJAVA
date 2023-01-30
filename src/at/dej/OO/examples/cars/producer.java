package at.dej.OO.examples.cars;

public class producer {
    private String name;
    private String orgin;

    private double discount;

    private double carPrice;

    public producer(String name, String Orgin, double discount) {
        this.name = name;
        this.orgin = orgin;
        this.discount = discount;
    }


    public String getName() {
        return name;
    }

    public String getOrgin() {
        return orgin;
    }

    public double getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }


}
