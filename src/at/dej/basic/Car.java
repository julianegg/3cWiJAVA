package at.dej.basic;

public class Car {

   public String color;
   public String serialNumber;
   public int  fuelConsumption;
   public int fuelAmount;

   public void break(){
      System.out.println("ich bremse");
   }


   public void drive(){
      this.fuelAmount = this.fuelAmount-this.fuelConsumption;
      System.out.println("I am driving");
   }
}
