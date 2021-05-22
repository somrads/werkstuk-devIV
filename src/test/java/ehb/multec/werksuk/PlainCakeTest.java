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
    }

}