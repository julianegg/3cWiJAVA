package at.dej.OO.geometricFigures;

public class Quadrat extends Figure{
    private double a;

    public Quadrat(String name, double a) {
        super(name);
        this.a=a;

    }

    @Override
    public double getArea() {
        return a*a;
    }
}
