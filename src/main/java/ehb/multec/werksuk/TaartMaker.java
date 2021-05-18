package ehb.multec.werksuk;

public class TaartMaker {

    public static void main(String[] args){
        Taart chocoTaart = new Chocola(new Slagroom(new PlainTaart()));

        System.out.println("Ingredients:" + chocoTaart.getDescription());

        System.out.println("Price:" + chocoTaart.getCost());
    }
}
