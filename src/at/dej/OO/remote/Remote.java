package at.dej.OO.remote;

public class Remote {
    private Battery battery1;
    private Battery battery2;

    public Remote(Battery battery1, Battery battery2) {
        this.battery1 = battery1;
        this.battery2 = battery2;
    }

    public float getStatus(){
       float a =  (this.battery1.getCharigingState() + this.battery2.getCharigingState()) /2;
       return a;
    }

    public void TurnOn(){
        this.battery1.setCharigingState(battery1.getCharigingState()-5);
        this.battery2.setCharigingState(battery2.getCharigingState()-5);
        System.out.println("Verbraucher angeschlossen");

    }

    public Battery getBattery1() {
        return battery1;
    }

    public void setBattery1(Battery battery1) {
        this.battery1 = battery1;
    }

    public Battery getBattery2() {
        return battery2;
    }

    public void setBattery2(Battery battery2) {
        this.battery2 = battery2;
    }
    public void TurnOff(){
        System.out.println("kein verbraucher angeschlossen");
    }
}

