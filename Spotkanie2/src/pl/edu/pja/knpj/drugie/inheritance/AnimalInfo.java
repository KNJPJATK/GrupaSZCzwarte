package pl.edu.pja.knpj.drugie.inheritance;

/**
 * Created by andrew on 24.03.2016.
 */
public class AnimalInfo {
    private AnimalInfo mNextAnimalInfo;
    private AnimalInfo mPreviousAnimalInfo;

    public String name;

    public AnimalInfo getNextAnimal(){

        return mNextAnimalInfo;
    }

    /*
        I tak dalej, i tak dalej podobnie jak w VehicleInfo.
     */
}
