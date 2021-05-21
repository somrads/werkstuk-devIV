package ehb.multec.werksuk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaartMakerTest {

    @Test
    void main() {
        BakeInOven cupcake = new MakeCupCake();
        System.out.println("instructies voor cupcake");
        cupcake.preheatOven();
        cupcake.mixBatter();
        cupcake.putInBakVorm();
        cupcake.bakeInOven();

        BakeInOven plaincake = new MakePlainCake();
        System.out.println("instructies voor plain cakes");
        plaincake.preheatOven();
        plaincake.mixBatter();
        plaincake.putInBakVorm();
        plaincake.bakeInOven();


        Taart chocoTaart = new Chocola(new Slagroom(new PlainTaart()));
        System.out.println(chocoTaart.getCost());

        Taart chocoCupCake = new Chocola(new Slagroom(new CupCake()));

        Taart roomTaart = new Slagroom(new PlainTaart());

/*
        System.out.println("chocolade taart:");
        System.out.println("Ingredients:" + chocoTaart.getDescription()+ "Price:" + chocoTaart.getCost());
        System.out.println("chocolade cup cake:");
        System.out.println("Ingredients:" + chocoCupCake.getDescription() + "Price:" + chocoCupCake.getCost());
        System.out.println("slagroom taart:");
        System.out.println("Ingredients:" + roomTaart.getDescription() + "Price:" + roomTaart.getCost());
*/

    }
}