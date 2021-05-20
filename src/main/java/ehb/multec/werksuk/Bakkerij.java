package ehb.multec.werksuk;
/* singleton we maken een bakkerij*/

public class Bakkerij
{

    private Bakkerij() {}

    private static class BakkerijHolder
    {
        private static final Bakkerij INSTANCE = new Bakkerij();
    }
    public static Bakkerij getInstance()
    {
        return BakkerijHolder.INSTANCE;
    }
}





