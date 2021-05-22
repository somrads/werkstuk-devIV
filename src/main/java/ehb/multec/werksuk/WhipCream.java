package ehb.multec.werksuk;


public class WhipCream extends Toppings{
    public WhipCream(Cake newCake) {
        super(newCake);

        System.out.println("Suikerpoeder bijgevoegd");

    }

    public String getDescription(){
        return tempCake.getDescription() + ", Slagroom";
    }

    public double getCost(){
        return tempCake.getCost() + 3.00;
    }
}
