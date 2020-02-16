import enums.*;

import java.util.*;

public class FindGuitarTester {

    public static void main(String[] args) {
        //GuitarSpec searchSpec = new GuitarSpec();
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatEricLikes = new GuitarSpec(eBuilder.fender, eType.acoustic, eWood.alder, eWood.alder);
        List<Guitar> matchingGuitar = inventory.Search(whatEricLikes);
        if (!matchingGuitar.isEmpty()) {
            System.out.println("you might likes these guitars");
            for (Iterator i = matchingGuitar.iterator(); i.hasNext(); ) {
                Guitar guitar = (Guitar) i.next();
                System.out.println("we have a " + guitar.getSpec().getBuilder() + " " + guitar.getModel() + " " +
                        guitar.getSpec().getBackWood() + " " + guitar.getSpec().getTopWood() + " " + guitar.getPrice() + "-------");
            }
        } else
            System.out.println("Sorry, we have nothing for you");
    }


    public static void initializeInventory(Inventory inventory) {
        GuitarSpec spec1 = new GuitarSpec(eBuilder.fender, eType.acoustic, eWood.alder, eWood.alder);
        GuitarSpec spec2 = new GuitarSpec(eBuilder.fender, eType.acoustic, eWood.alder, eWood.indian_rosewood);
        GuitarSpec spec3 = new GuitarSpec(eBuilder.fender, eType.acoustic, eWood.alder, eWood.alder);
        inventory.addGuitar("1233", "2013", 2344, spec1);
        inventory.addGuitar("1233", "2013", 2344, spec2);
        inventory.addGuitar("334", "2010", 455770, spec3);

    }

}

