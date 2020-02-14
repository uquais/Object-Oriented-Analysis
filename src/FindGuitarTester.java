import enums.eBuilder;
import enums.eType;
import enums.eWood;

import java.util.ArrayList;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {


        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar WhatEricLikes = new Guitar("", eBuilder.fender, "", eType.acoustic, eWood.alder, eWood.alder, 45540);
        Guitar guitar = inventory.Search(WhatEricLikes);
        //System.out.println(guitar);

        if (guitar != null) {
            System.out.println("Erin, you might like " + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + "guitar:\n " + guitar.getBackwood() + "top " + guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, We have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("123", eBuilder.fender, "2010", eType.acoustic, eWood.alder, eWood.alder, 4550);
        inventory.addGuitar("123", eBuilder.gibson, "2010", eType.electroic, eWood.indian_rosewood, eWood.adirondack, 4550);
        inventory.addGuitar("123", eBuilder.collings, "2010", eType.electroic, eWood.alder, eWood.alder, 4550);

    }

}

