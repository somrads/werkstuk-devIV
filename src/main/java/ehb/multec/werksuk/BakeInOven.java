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
        System.out.println( "Preheat oven 170 degrees°");

    }

   public void mixBatter() {
       System.out.println("Mix the ingredients (milk, flour, baking soda, eggs and sugar) till its batter");
    }
    abstract void putInBakeForm();


    public void bakeInOven() {
        System.out.println("Bake in the oven for 30 minutes");
    }


}
