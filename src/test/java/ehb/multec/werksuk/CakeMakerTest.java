package ehb.multec.werksuk;

import org.junit.jupiter.api.Test;

class CakeMakerTest {

    @Test
    void main() {
      BakeInOven cupcake = new MakeCupCake();
        System.out.println("instructies voor cupcake");
        cupcake.preheatOven();
        cupcake.mixBatter();
        cupcake.putInBakeForm();
        cupcake.bakeInOven();





        BakeInOven plaincake = new MakePlainCake();
        System.out.println("instructies voor plain cakes");
        plaincake.preheatOven();
        plaincake.mixBatter();
        plaincake.putInBakeForm();
        plaincake.bakeInOven();


        Cake chocoCake = new Chocolate(new WhipCream(new PlainCake()));
        System.out.println(chocoCake.getCost());

        Cake chocoCupCake = new Chocolate(new WhipCream(new CupCake()));

        Cake roomCake = new WhipCream(new PlainCake());


        System.out.println("Chocolate cake:");
        System.out.println("Ingredients:" + chocoCake.getDescription()+ "Price:" + chocoCake.getCost());
        System.out.println("Chocolate cup cake:");
        System.out.println("Ingredients:" + chocoCupCake.getDescription() + "Price:" + chocoCupCake.getCost());
        System.out.println("Whip cream cake:");
        System.out.println("Ingredients:" + roomCake.getDescription() + "Price:" + roomCake.getCost());


    }
}