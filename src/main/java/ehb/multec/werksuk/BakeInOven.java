package ehb.multec.werksuk;

public abstract class BakeInOven {

    final void prepareCake()
{
    preheatOven();
    mixBatter();
    putInBakeForm();
    bakeInOven();
    
}



    public void preheatOven() {
        System.out.println( "preheat oven 360°");

    }

   public void mixBatter() {
       System.out.println("mix the ingredients (milk, flour, baking soda, eggs and sugar) till its batter");
    }
    abstract void putInBakeForm();


    public void bakeInOven() {
        System.out.println("bake in oven for 30 minutes");
    }


}
/*1. Preheat oven
        2 Mix batter
         3putInVorm voor cupCakes kleine vormen, plainTaart grote vorm
         4Bake in oven*/