package at.dej.OO.lamp2;

public class Element {
    private boolean isOn = false;
    private int consumption = 0;

    private String color;
    private String name;


    public Element(int consumption, String color, String name) {
        this.consumption = consumption;
        this.color = color;
        this.name = name;
    }

    public void turnOn(){
        if(!isOn){
            isOn = true;
            System.out.println("Element eingeschaltet");
            consumption = consumption+5;
            System.out.println("Das element hat jetzt eine leistung von" +5);
        }else {
            System.out.println("Element ist bereits eingeschaltet");
        }
    }
    public void turnOff(){
        if(!isOn){
            isOn = false;
            System.out.println("Element ausgeschaltet");
        }else{
            System.out.println("ist bereits ausgeschaltet");
        }
    }






    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getConsumption() {
        return consumption;
    }

    public void setConsumption(int consumption) {
        this.consumption = consumption;
    }

    public void add(Element elements) {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
