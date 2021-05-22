package ehb.multec.werksuk;

public class PlainCake implements Cake {

    @Override
    public String getDescription() {
        return "Sponge cake";
    }

    @Override
    public double getCost() {
        return 44.00;
    }
}
