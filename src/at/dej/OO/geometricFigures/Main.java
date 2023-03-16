package at.dej.OO.geometricFigures;

public class Main {
    public static void main(String[] args) {
        Figure f = new Figure("Figure1");
        Circle c1 = new Circle("Circle1",5);
        Cube cu1 = new Cube("Cube1", 6);
        Rectangle re1 = new Rectangle("Rectangle1",4);
        Quadrat qu1 = new Quadrat("Quadrat1", 7);

        System.out.println(c1.getName());
        System.out.println(c1.getArea());
        System.out.println(cu1.getName());
        System.out.println(cu1.getArea());
        System.out.println(re1.getName());
        System.out.println(re1.getArea());
        System.out.println(qu1.getName());
        System.out.println(qu1.getArea());
    }
}
