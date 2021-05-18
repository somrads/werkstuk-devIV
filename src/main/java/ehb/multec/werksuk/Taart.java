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
