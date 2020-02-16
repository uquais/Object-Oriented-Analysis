import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;


public class Inventory {
    private LinkedList guitars;

    public Inventory() {
        guitars = new LinkedList();
    }

    public void addGuitar(String serialNumber, String model,double price,GuitarSpec spec) {
        Guitar guitar = new Guitar(serialNumber,model,price,spec);
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

    public List Search(GuitarSpec searchspec) {

        List machingGuitars= new LinkedList();
        for (Iterator i = guitars.iterator(); i.hasNext();){
            Guitar guitar = (Guitar) i.next();
            GuitarSpec guitarspec = guitar.getSpec();
            if (guitarspec.getBuilder()!=searchspec.getBuilder())
                continue;

            if (guitarspec.getType()!=searchspec.getType())
                continue;
            if (guitarspec.getTopWood()!=searchspec.getTopWood())
                continue;
            if (guitarspec.getBackWood()!=searchspec.getBackWood())
                continue;
            machingGuitars.add(guitar);
            }
            return machingGuitars;
        }
    }