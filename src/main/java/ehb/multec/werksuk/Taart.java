package ehb.multec.werksuk;


public class Taart {
    private static Taart taart = new Taart();
    private Taart(){}
    public static synchronized Taart getTaart(){
        if(taart == null){
            taart = new Taart();
        }
        return taart;
    }
}


/*singleton Thread Safe Singleton
 https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples */
