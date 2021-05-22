package ehb.multec.werksuk;

public class CupCake implements Cake {
    @Override
    public String getDescription() {
        return "Cupcake";
    }

    @Override
    public double getCost() {
        return 3.0;
    }
}
