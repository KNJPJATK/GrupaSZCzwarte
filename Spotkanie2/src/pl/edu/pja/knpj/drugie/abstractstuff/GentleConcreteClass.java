package pl.edu.pja.knpj.drugie.abstractstuff;

/**
 * Created by andrew on 24.03.2016.
 */
public class GentleConcreteClass extends SomeAbstractImplementer {

    //region BestInterface Methods

    /*
        Musimy zaimplementować metodę beTheBest z interfejsu BestInterface
     */
    @Override
    public int beTheBest() {
        return 0;
    }

    /*
        Jeżeli chcemy to możemy redefiniować metody z interfejsów wg naszego własnego widzimisię.
     */
    @Override
    public int beJustGood() {
        return 2;
    }
    //endregion BestInterface Methods


}
