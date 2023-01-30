package at.dej.OO.examples.cars;

import at.dej.OO.cars.Engine;

public class Main {
    public static void main(String[] args) {
        producer p1 = new producer("herbert", "Kroatien", 0.8);
        Engine e1 = new Engine (15, Engine.TYP.DIESEL);
        Car c1 = new Car("ferrari", "red",230000,320,25,p1,0);

        System.out.println(p1.getDiscount() + "%");
        System.out.println(c1.carPrice() + "€");
    }

}