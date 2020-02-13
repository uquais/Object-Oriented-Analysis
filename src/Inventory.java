import java.awt.*;
import java.util.Iterator;
import java.util.LinkedList;

public class Inventory {
    private LinkedList guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, String builder, String model, String type, String backWood, String topWood, double price) {
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

    public Guitar Search(Guitar searchGuitar) {
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar) i.next();

            String builder = searchGuitar.getBuilder();
            if ( (builder != null ) && (!builder.equals(""))&& (!builder.equals(searchGuitar.getBuilder()))){
                continue;
            }
            String model = searchGuitar.getModel();
            if((model!=null)&&(!model.equals(""))&&(!builder.equals(searchGuitar.getBuilder()))){
                continue;
            }
            String type = searchGuitar.getType();
            if ((type!=null)&&(!type.equals("")&&(!type.equals(searchGuitar.getType())))){
                continue;
            }
            String backWood = searchGuitar.getBackwood();
            if((backWood!=null)&&(!backWood.equals("")&&(!backWood.equals(searchGuitar.getBackwood())))){
                continue;
            }
            String topWood = searchGuitar.getTopwood();
            if((topWood!=null)&&(!topWood.equals("")&&(!topWood.equals(searchGuitar.getTopwood())))){
                continue;
            }
            return guitar;

        }

        return null;
    }
}
