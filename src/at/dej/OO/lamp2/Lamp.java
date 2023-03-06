package at.dej.OO.lamp2;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
   private List<Element> elements;

   public Lamp(){
      this.elements = new ArrayList<>();
   }

   public void addElements(Element elements){

      elements.add(elements);
   }


   public void turnAllOn(){
      for (Element elements:this.elements){
         elements.setOn(true);
      }
   }
   public void getOverallPowerUsage(){
    int consumption = 1;
    for(Element elements : this.elements){
       consumption += elements.getConsumption();
    }

   }

   public void printNameOfElements(){
      for(Element element : this.elements);
      System.out.println(getClass().getName());

   }




   public void lightElement(){

   }
}


