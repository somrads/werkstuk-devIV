package ehb.multec.werksuk;

public class PlainCake implements Cake {

    @Override
    public String getDescription() {
        String beschrijving = "Sponge cake";
        return beschrijving;
    }

    @Override
    public double getCost() {
        return 44.00;
    }


}
