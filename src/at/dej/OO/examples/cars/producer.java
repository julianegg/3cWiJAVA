package at.dej.OO.examples.cars;

public class producer {
    private String name;
    private String orgin;

    private int discount;

    public producer(String name, String Orgin) {
        this.name = name;
        this.orgin = orgin;
    }

    public String getName() {
        return name;
    }

    public String getOrgin() {
        return orgin;
    }

    public int getDiscount() {
        return discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
