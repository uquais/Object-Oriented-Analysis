import java.util.ArrayList;
import java.util.List;

public class FindGuitarTester {

    public static void main(String[] args) {
        List<Integer> mylist= new ArrayList<>();

        mylist.add(10);
        mylist.add(29);
        mylist.add(39);

        mylist.toString();
        System.out.println(mylist);

        Inventory inventory = new Inventory();
        initializeInventory(inventory);
        Guitar WhatEricLikes = new Guitar("jh1", "abc3", "erg", "ret", "eryes", "neo", 45540);
        Guitar guitar = inventory.Search(WhatEricLikes);
        System.out.println(guitar);

        if (guitar != null) {
            System.out.println("Erin, you might like " + guitar.getBuilder() + " " + guitar.getModel() + " " + guitar.getType() + "guitar:\n " + guitar.getBackwood() + "top " + guitar.getPrice() + "!");
        } else {
            System.out.println("Sorry, Erin, We have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar("123","abc1","2010","modern","yes","no",4550);
        inventory.addGuitar("456","abc2","2010","modern","yes","no",4550);
        inventory.addGuitar("789","abc3","2010","modern","yes","no",4550);
    }

}

