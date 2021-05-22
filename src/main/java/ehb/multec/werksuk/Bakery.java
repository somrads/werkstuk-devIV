package ehb.multec.werksuk;


public class Bakery
{

    private Bakery() {}

    private static class BakeryHolder
    {
        private static final Bakery INSTANCE = new Bakery();
    }
    public static Bakery getInstance()
    {
        return BakeryHolder.INSTANCE;
    }
}





