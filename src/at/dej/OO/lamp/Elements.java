package at.dej.OO.lamp;

public class Elements {
    private String name;
    private String powerConsumption;
    private String color;
    private String status;
    public enum status{On, Off};

    public Elements(String name, String powerConsumption, String color, String status) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.color = color;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPowerConsumption() {
        return powerConsumption;
    }

    public void setPowerConsumption(String powerConsumption) {
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
