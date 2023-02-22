package at.dej.OO.lamp;

public class Elements {
    private String name;
    private double powerConsumption;
    private String color;

    public enum TYP {on,off}

    private  TYP typ;
    public Elements() {
        this.typ = typ;
    }





    public Elements(String name, double powerConsumption, String color, String  status) {
        this.name = name;
        this.powerConsumption = powerConsumption;
        this.color = color;
        this.typ = getTyp();
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


    public TYP getTyp() {
        return typ;
    }

    public void setTyp(TYP typ) {
        this.typ = typ;
    }
}
