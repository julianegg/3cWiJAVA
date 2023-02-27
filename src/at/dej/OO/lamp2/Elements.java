package at.dej.OO.lamp2;

public class Elements {
    private boolean isOn = false;
    private int consumption = 0;


    public Elements(int consumption) {
        this.consumption = consumption;
    }

    public Elements(boolean isOn) {
        this.isOn = isOn;
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

    public void add(Elements elements) {
    }
}
