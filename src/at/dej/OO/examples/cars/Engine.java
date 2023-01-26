package at.dej.OO.examples.cars;

public class Engine {

    public enum TYP {Diesel, GAS};

    private TYP type;
    private int horsePower;

    public Engine(TYP type, int horsePower) {
        this.type = type;
        this.horsePower = horsePower;
    }

    public TYP getType() {
        return type;
    }

    public int getHorsePower() {
        return horsePower;
    }
}
