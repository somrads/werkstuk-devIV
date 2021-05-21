package ehb.multec.werksuk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BakeInOvenTest {

    @Test
    void prepareTaart() {
        preheatOven();
        mixBatter();
        bakeInOven();
    }



    @Test
    void putInBakVorm() {
    }

    @Test
    void testPrepareTaart() {
    }

    @Test
    void preheatOven() {
        System.out.println("preheat oven 360°");
    }

    @Test
    void mixBatter() {
        System.out.println("mix the ingredients (milk, flour, baking soda, eggs and sugar) till its batter");
    }

    @Test
    void testPutInBakVorm() {
    }

    @Test
    void bakeInOven() {
        System.out.println("bake in oven for 30 minutes");
    }
}