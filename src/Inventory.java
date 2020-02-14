import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import enums.*;


public class Inventory {
    private LinkedList guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, eBuilder builder, String model, eType type, eWood backWood, eWood topWood, double price) {
        Guitar guitar = new Guitar(serialNumber, builder, model, type, backWood, topWood, price);
        guitars.add(guitar);
    }

    public Guitar getGuitar(String serialNumber) {
        for (Iterator i = guitars.iterator(); i.hasNext(); ) {
            Guitar guitar = (Guitar) i.next();
            if (guitar.getSerialNumber().equals(serialNumber)) {
                return guitar;
            }
        }
        return null;

    }

    public List Search(Guitar searchGuitar) {
        List machingGuitars= new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar) i.next();

            if (searchGuitar.getBuilder()!=guitar.getBuilder())
                continue;

            String model = searchGuitar.getModel().toLowerCase();
            if((model!=null)&&(!model.equals(""))&&(!model.equals(searchGuitar.getBuilder()))){
                continue;
            }
            if (searchGuitar.getType()!=guitar.getType())
                continue;
            if (searchGuitar.getTopwood()!=guitar.getTopwood())
                continue;
            if (searchGuitar.getBackwood()!=guitar.getBackwood())
                continue;
            machingGuitars.add(guitar);
            }
            return machingGuitars;

        }
    }
