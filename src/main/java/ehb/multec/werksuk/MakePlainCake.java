package ehb.multec.werksuk;

public class MakePlainCake extends BakeInOven{
    @Override
    public void preheatOven() {
        super.preheatOven();
    }

    @Override
    public void mixBatter() {
        super.mixBatter();
    }
    @Override
    void putInBakeForm() {
        System.out.println("pour the batter in a big cake pan");
    }

    @Override
    public void bakeInOven() {
        super.bakeInOven();
    }


}
