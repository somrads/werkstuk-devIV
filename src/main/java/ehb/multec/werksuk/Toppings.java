package ehb.multec.werksuk;

abstract class Toppings implements Cake {
    protected Cake tempCake;

    public Toppings(Cake newCake){

        tempCake = newCake;
    }

    public String getDescription(){
        return tempCake.getDescription();
    }

    public double getCost(){
        return tempCake.getCost();
    }
}
