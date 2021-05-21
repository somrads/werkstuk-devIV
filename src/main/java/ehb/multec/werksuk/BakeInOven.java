package ehb.multec.werksuk;

public abstract class BakeInOven {
final void prepareTaart() 
{
    preheatOven();
    mixBatter();
    putInBakVorm();
    bakeInOven();
    
}
    public void preheatOven() {

    }

   public void mixBatter() {

    }
    abstract void putInBakVorm();


    public void bakeInOven() {

    }

}
/*1. Preheat oven
        2 Mix batter
         3putInVorm voor cupCakes kleine vormen, plainTaart grote vorm
         4Bake in oven*/