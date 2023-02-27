package at.dej.OO.lamp2;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
   private List<Elements> elements;

   public Lamp(){
      this.elements = new ArrayList<>();
   }

   public void addElements(Elements elements){
      elements.add(elements);
   }
}


