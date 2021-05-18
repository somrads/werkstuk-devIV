package ehb.multec.werksuk;


public class Slagroom extends Toppings{
    public Slagroom(Taart newTaart) {
        super(newTaart);

        System.out.println("Chocopoeder bijvoegen");

    }

    public String getDescription(){
        return tempTaart.getDescription() + ", Slagroom";
    }

    public double getCost(){
        return tempTaart.getCost() + 3.00;
    }
}
