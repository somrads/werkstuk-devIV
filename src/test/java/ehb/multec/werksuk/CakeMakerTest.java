package ehb.multec.werksuk;

import org.junit.jupiter.api.Test;

class CakeMakerTest {

    @Test
    void main() {
      BakeInOven cupcake = new MakeCupCake();
        System.out.println("Cupcake recipe");
        cupcake.preheatOven();
        cupcake.mixBatter();
        cupcake.putInBakeForm();
        cupcake.bakeInOven();





        BakeInOven plaincake = new MakePlainCake();
        System.out.println("Sponge cake recipe");
        plaincake.preheatOven();
        plaincake.mixBatter();
        plaincake.putInBakeForm();
        plaincake.bakeInOven();


        Cake chocoCake = new Chocolate(new WhipCream(new PlainCake()));
        System.out.println(chocoCake.getCost());

        Cake chocoCupCake = new Chocolate((new CupCake()));

        Cake roomCake = new WhipCream(new PlainCake());


        System.out.println("Chocolate cake:");
        System.out.println("Ingredients:" + chocoCake.getDescription()+ " Price:" + chocoCake.getCost() + " Euro");
        System.out.println("Chocolate cupcake:");
        System.out.println("Ingredients:" + chocoCupCake.getDescription() + " Price:" + chocoCupCake.getCost() + " Euro");
        System.out.println("Whipped cream cake:");
        System.out.println("Ingredients:" + roomCake.getDescription() + " Price:" + roomCake.getCost() + " Euro");


    }
}