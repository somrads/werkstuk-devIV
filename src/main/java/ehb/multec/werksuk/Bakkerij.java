package ehb.multec.werksuk;
/* singleton we maken een bakkerij*/
public class Bakkerij {


    private static Bakkerij bakkerij = null;

    private Bakkerij(){}

    static boolean firsThread = true;

    public static Bakkerij getInstance() throws InterruptedException {
        if(bakkerij == null){

            if(firsThread){

                firsThread = false;
                Thread.sleep(1000);
            }

            bakkerij = new Bakkerij();
        }

        synchronized (Bakkerij.class){
            if(bakkerij == null){
                bakkerij = new Bakkerij();
            }
        }
        return bakkerij;
    }
}


