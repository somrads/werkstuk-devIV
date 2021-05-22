package ehb.multec.werksuk;

public abstract class MakeCupCake extends BakeInOven{

    public MakeCupCake(Slagroom slagroom) {
        super();
    }

    @Override
    public void preheatOven() {
        super.preheatOven();
    }

    @Override
    public void mixBatter() {
        super.mixBatter();
    }

    @Override
    void putInBakVorm() {
        System.out.println("pour the batter in small cake pans");

    }
    @Override
    public void bakeInOven() {
        super.bakeInOven();
    }
}
