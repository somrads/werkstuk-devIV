package ehb.multec.werksuk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlainCakeTest {

    @Test
    void getDescription() {
        Cake cake = new PlainCake();
        assertEquals("Sponge cake", cake.getDescription());

    }

    @Test
    void getCost() {
        Cake cake = new PlainCake();
        assertEquals(44.00, cake.getCost());
       // assertEquals(45.00, cake.getCost()); //returns error
    }

}