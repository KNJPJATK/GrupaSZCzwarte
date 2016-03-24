package pl.edu.pja.knpj.drugie.abstractstuff;

/**
 * Created by andrew on 24.03.2016.
 */
public abstract class SomeAbstractImplementer implements BestInterface, NiceInterface{

    //region BestInterface Methods

    @Override
    public int beJustGood() {
        return 0;
    }

    @Override
    public double beSlightlyGood() {
        return 0;
    }

    /*

    Nie musimy implementowac metody beTheBest.
    Muszą się tym zająć klasy dziedziczące.

    @Override
    public int beTheBest() {
        return 0;
    }
    */

    //endregion BestInterface Methods

    //region NiceInterface Methods

    @Override
    public void beNice() {

    }

    //endregion

}
