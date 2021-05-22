package ehb.multec.werksuk;

public class Chocolate extends Toppings{
    public Chocolate(Cake newCake) {
        super(newCake);

        System.out.println("Frosting bijgevoegd");

        System.out.println("Chocola bijgevoegd");

    }

    public String getDescription(){
        return tempCake.getDescription() + ", Chocola";
    }

    public double getCost(){
        return tempCake.getCost() + 5.00;
    }
}
