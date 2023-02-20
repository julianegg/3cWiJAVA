package at.dej.OO.lamp;

public class Elements {
    private String name;
    private double powerConsumption;
    private String color;
    private enum status{on,off}

    private  Elements.TYP.typ;



    public Elements(String name, double powerConsumption, String color, String  status) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.color = color;
        this.status = status;
    }

    public void turnOn() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(double powerConsumption) {
        this.powerConsumption = powerConsumption;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
