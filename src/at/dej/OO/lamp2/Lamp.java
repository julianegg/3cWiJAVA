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





   public void lightElement(){

   }
}


