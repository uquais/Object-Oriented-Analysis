import enums.eBuilder;
import enums.eType;
import enums.eWood;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        //GuitarSpec searchSpec = new GuitarSpec();

        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        GuitarSpec WhatEricLikes = new GuitarSpec(eBuilder.fender,eType.acoustic,eWood.alder,eWood.alder);
        List<Guitar> matchingguitar = inventory.Search(WhatEricLikes);
        if (!matchingguitar.isEmpty()){
            System.out.println("you might likes these guitars");
            for (Iterator i =matchingguitar.iterator();i.hasNext();){
                Guitar guitar =(Guitar)i.next();
                System.out.println("we have a "+guitar.getSpec().getBuilder()+" "+guitar.getModel()+" "+
                        guitar.getSpec().getBackWood()+" "+guitar.getSpec().getTopWood()+" "+guitar.getPrice()+"-------");
            }
            }
        else
            System.out.println("Sorry, we have nothing for you");
        }


    public static void initializeInventory(Inventory inventory) {
        GuitarSpec spec1 = new GuitarSpec(eBuilder.fender,eType.acoustic,eWood.alder,eWood.indian_rosewood);
        GuitarSpec spec2 = new GuitarSpec(eBuilder.fender,eType.acoustic,eWood.alder,eWood.indian_rosewood);
        GuitarSpec spec3 = new GuitarSpec(eBuilder.fender,eType.acoustic,eWood.alder,eWood.indian_rosewood);
        inventory.addGuitar("1233","2013",2344,spec1);
        inventory.addGuitar("1233","2013",2344,spec2);
        inventory.addGuitar("334", "2010", 455770,spec3);

    }

}

