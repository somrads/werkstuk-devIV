package ehb.multec.werksuk;

abstract class Toppings implements Taart {
    protected Taart tempTaart;

    public Toppings(Taart newTaart){

        tempTaart = newTaart;
    }

    public String getDescription(){
        return tempTaart.getDescription();
    }

    public double getCost(){
        return tempTaart.getCost();
    }
}
