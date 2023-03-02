package at.dej.OO.lamp2;

public class Main {
    public static void main(String[] args) {


        Element e1 = new Element(20,"blue", "demo");
        Element e2 = new Element(68,"red", "juli");


        Lamp l1 = new Lamp();

        l1.addElements(e1);
        l1.addElements(e2);

        l1.turnAllOn();

        System.out.println(e1.getConsumption());
        System.out.println(e1.isOn());
    }
}