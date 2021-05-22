package ehb.multec.werksuk;

public class Chocolate extends Toppings{
    public Chocolate(Cake newCake) {
        super(newCake);

        System.out.println("Added frosting");

        System.out.println("Added Chocolate powder");

    }

    public String getDescription(){
        return tempCake.getDescription() + ", Chocolate";
    }

    public double getCost(){
        return tempCake.getCost() + 5.00 ;
    }
}
