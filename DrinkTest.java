package sit.View;

import sit.model.Juice;
import sit.model.Water;

public class DrinkTest {
        public static void main(String[] args) {
        Water d1 = new Water("Montfure",15);
        System.out.println(d1);
        
        Juice j1 = new Juice("Tipco",12,14.49);
        Juice j2 = new Juice("Fanta",20,14.49);
        System.out.println(j1.equals(d1));
            System.out.println(j1.equals(j2));
        
    }
}