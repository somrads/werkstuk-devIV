package ehb.multec.werksuk;

/*
public class Taart {
    private static Taart taart = null;

    private Taart(){}

    static boolean firsThread = true;

    public static Taart getInstance() throws InterruptedException {
        if(taart == null){

            if(firsThread){

                firsThread = false;
                Thread.sleep(1000);
            }

            taart = new Taart();
        }

        synchronized (Taart.class){
            if(taart == null){
                taart = new Taart();
            }
        }
        return taart;
    }
}
 */
public  interface Taart{
    public String getDescription();

    public double getCost();
}
