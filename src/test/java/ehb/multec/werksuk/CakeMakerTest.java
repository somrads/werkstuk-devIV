package ehb.multec.werksuk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CakeMakerTest {
<<<<<<< HEAD
//template methode pattern unit test
=======
//template methode pattern unit test getest als feature
>>>>>>> feature/unit-testing

  @Test
  void makeCakes(){
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

  }
<<<<<<< HEAD
//decorater pattern unit test
=======
//decorater pattern unit test gestest als feature
>>>>>>> feature/unit-testing
@Test
void addTopping(){
  Cake chocoCake = new Chocolate(new WhipCream(new PlainCake()));
  System.out.println(chocoCake.getCost());
  assertEquals(52.00, chocoCake.getCost());

  Cake chocoCupCake = new Chocolate((new CupCake()));
  assertEquals(8.00, chocoCupCake.getCost());

  Cake roomCake = new WhipCream(new PlainCake());
  assertEquals(47.00, roomCake.getCost());

  System.out.println("Chocolate cake:");
  System.out.println("Ingredients:" + chocoCake.getDescription()+ " Price: " + chocoCake.getCost() + " Euro");
  System.out.println("Chocolate cupcake:");
  System.out.println("Ingredients:" + chocoCupCake.getDescription() + " Price: " + chocoCupCake.getCost() + " Euro");
  System.out.println("Whipped cream cake:");
  System.out.println("Ingredients:" + roomCake.getDescription() + " Price: " + roomCake.getCost() + " Euro");
}



    @Test
    void main() {
    makeCakes();
    addTopping();

    }
}