package at.dej.OO.cars;

public class Main {
    public static void main(String[] args) {


        Engine e1 = new Engine(100, Engine.TYP.DIESEL);

       Car c1 = new Car(e1,50,"Ferrari","123");
        c1.setColor("blue");


        c1.turboBoost();
        c1.honk();
        c1.getRemainingRange();
  //     System.out.println(c1.getBrand());


        //     Car c2 = new Car();
        //     c2.color = "red";
        //     c2.fuelConsumption = 9;
        //     c2.serialNumber = "B1234";
        //     c2.fuelAmount = 25;
        //     c2.fuelVolume = 60;
        //    c2.brand = "mercedes";





    }
}
