package ehb.multec.werksuk;

public class Chocola extends Toppings{
    public Chocola(Taart newTaart) {
        super(newTaart);

        System.out.println("Frosting bijvoegen");

        System.out.println("Chocola bijvoegen");

    }

    public String getDescription(){
        return tempTaart.getDescription() + ", Chocola";
    }

    public double getCost(){
        return tempTaart.getCost() + 5.00;
    }
}
