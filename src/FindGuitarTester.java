import enums.eBuilder;
import enums.eType;
import enums.eWood;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {


        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar WhatEricLikes = new Guitar("", eBuilder.fender, "", eType.acoustic, eWood.alder, eWood.alder, 45540);
        List<Guitar> matchingguitar = inventory.Search(WhatEricLikes);
        if (!matchingguitar.isEmpty()){
            System.out.println("you might likes these guitars");
            for (Iterator i =matchingguitar.iterator();i.hasNext();){
                Guitar guitar =(Guitar)i.next();
                System.out.println("we have a "+guitar.getBuilder()+" "+guitar.getModel()+" "+
                        guitar.getBackwood()+" "+guitar.getTopwood()+" "+guitar.getPrice()+"-------");
            }
            }
        else
            System.out.println("Sorry, we have nothing for you");
        }


    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("123", eBuilder.fender, "2010", eType.acoustic, eWood.alder, eWood.alder, 4550);
        inventory.addGuitar("123", eBuilder.gibson, "2010", eType.electroic, eWood.indian_rosewood, eWood.adirondack, 4550);
        inventory.addGuitar("123", eBuilder.collings, "2010", eType.electroic, eWood.alder, eWood.alder, 4550);

    }

}

