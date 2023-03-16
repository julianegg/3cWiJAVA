package at.dej.OO.geometricFigures;

public class Cube extends Figure{
    private double a;
    public Cube(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    public double getArea() {
        return a*a*a;
    }
}
