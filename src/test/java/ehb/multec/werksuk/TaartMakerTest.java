package ehb.multec.werksuk;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaartMakerTest {

    @Test
    void main() {
        Taart chocoTaart = new Chocola(new Slagroom(new PlainTaart()));
        Taart roomTaart = new Slagroom(new PlainTaart());
        System.out.println("Ingredients:" + chocoTaart.getDescription());
        System.out.println("Ingredients:" + roomTaart.getDescription());

        System.out.println("Price:" + chocoTaart.getCost());
    }
}