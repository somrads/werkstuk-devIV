package ehb.multec.werksuk;


public class WhipCream extends Toppings{
    public WhipCream(Cake newCake) {
        super(newCake);

        System.out.println("Added Whipped cream");

    }

    public String getDescription(){
        return tempCake.getDescription() + ", Whipped Cream";
    }

    public double getCost(){
        return tempCake.getCost() + 3.00;
    }
}
