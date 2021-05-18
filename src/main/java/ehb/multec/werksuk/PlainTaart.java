package ehb.multec.werksuk;

public class PlainTaart implements Taart {
    @Override
    public String getDescription() {
        return "Sponge cake";
    }

    @Override
    public double getCost() {
        return 44.00;
    }
}
