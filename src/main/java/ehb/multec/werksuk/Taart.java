package ehb.multec.werksuk;

public class Taart {
    private static Taart taart = null;

    private Taart(){}

    public static Taart getInstance(){
        if(taart == null){
            taart = new Taart();
        }
        return taart;
    }
}
