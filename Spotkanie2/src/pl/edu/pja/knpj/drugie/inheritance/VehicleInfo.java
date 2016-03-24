package pl.edu.pja.knpj.drugie.inheritance;

/**
 * Created by andrew on 24.03.2016.
 */
public class VehicleInfo {

    private VehicleInfo mPreviousVehicleInfo;
    private VehicleInfo mNextVehicleInfo;

    public int mId;
    public String mMake;

    public void insertVehicle(String make){
        /*
            Kod aby umieścić nowe info o pojeździe o takiej marce w liście...
         */
    }

    public void deleteVehicle(){
        /*
            Kod aby usunąć TEN pojazd z listy.
         */
    }

    public VehicleInfo getNextVehicle(){
        /*
            Kod aby pobrać następny pojazd z listy.
         */
        return mNextVehicleInfo;
    }

    public VehicleInfo getmPreviousVehicle(){
        /*
            Kod aby pobrać poprzedni pojazd z listy.
         */
        return mPreviousVehicleInfo;
    }

}
