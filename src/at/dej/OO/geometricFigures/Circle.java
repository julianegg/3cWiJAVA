package at.dej.OO.geometricFigures;

public class Circle extends Figure {

   private double r;


    public Circle(String name,double r) {
        super(name);
        this.r = r;
    }

    @Override
    public double getArea() {
        return r*r*Math.PI;
    }
}
