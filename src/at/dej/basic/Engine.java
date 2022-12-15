package at.dej.basic;

public class Engine {
    private enum TYP {DIESEL, GAS};
    private int horsePower;
    private TYP type; //Diesel oder Benzin

    public Engine(int horsePower, TYP type) {
        this.horsePower = horsePower;
        this.type = type;
    }

    public void drive(int amount){
        System.out.println("the motor is running with" + amount );
    }

    public int getHorsePower() {
        return horsePower;
    }

    public TYP getType() {
        return type;
    }
}
