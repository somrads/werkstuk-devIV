package ehb.multec.werksuk;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BakeryTest {

    @Test
    void getInstance() {
        Bakery ourBakery = Bakery.getInstance();
        Bakery newBakery = Bakery.getInstance();
        assertEquals(ourBakery, newBakery);
    }
}