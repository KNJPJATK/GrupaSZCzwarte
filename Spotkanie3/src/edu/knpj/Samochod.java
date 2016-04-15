package edu.knpj;

/**
 * Created by andrew and tomek on 14.04.2016.
 */
public class Samochod extends Thread{ //  dziedziczy po Thread

    public enum StanSamochodu {WYLACZONY, JEDZIE, STOI, KONIECPALIWA}

    StanSamochodu aktualnyStan;

    private String nrRejestracyjny;

    private int paliwko;

    public Samochod(String nrRejestracyjny, int paliwko){
        this.nrRejestracyjny = nrRejestracyjny;
        this.paliwko = paliwko;
        aktualnyStan = StanSamochodu.JEDZIE;
        start();
    }

    @Override
    public void run() {
        while (true){
            if(paliwko>0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                switch (aktualnyStan){
                    case JEDZIE:
                        System.out.println("Samochod nr:" + nrRejestracyjny + " jedzie i ma paliwa " +
                                                   "= " + paliwko);
                        paliwko--;
                        break;
                    case STOI:

                        break;


                }

            }
            else {
                aktualnyStan =StanSamochodu.KONIECPALIWA;
                System.out.println("Samochd nr "+nrRejestracyjny+ " nie ma juz palikwa");
            }

            if(aktualnyStan == StanSamochodu.KONIECPALIWA){
                break;
            }
        }
    }

    public void jedz(){
        if(aktualnyStan!=StanSamochodu.JEDZIE && aktualnyStan!=StanSamochodu.WYLACZONY) {
            aktualnyStan = StanSamochodu.JEDZIE;
            System.out.println("Samochod :"+nrRejestracyjny+" ruszyl!");
        }else{
            System.out.println("Samochod :"+nrRejestracyjny+" juz jedzie!");
        }
    }
    public void zatrzymaj(){
        if(aktualnyStan==StanSamochodu.JEDZIE){
            aktualnyStan = StanSamochodu.STOI;
            System.out.println("Samochod :"+nrRejestracyjny+" zostal zatrzyman!");
        }else{
            System.out.println("Samochod :"+nrRejestracyjny+" juz stoi!");
        }
    }
    public void wylacz(){
        if(aktualnyStan!=StanSamochodu.WYLACZONY){
            aktualnyStan = StanSamochodu.WYLACZONY;
            System.out.println("Samochod :"+nrRejestracyjny+" wylaczyl silnik!");
        }
    }
    //  samochod ma jakies stany: Wylaczony, Jedzie, Stoi, KoniecPaliwa

    //  ma cos co symyluje paliwo
    //  i nr rejestracyjny

    //  co sekunde zuzywa paliwo - gdzie to bedzie?
    //  jak mu zabraknie to zmieni stan i nas o tym poinformuje

    //  mowimy do niego pewne rzeczy:
    //  1) zatrzymaj sie
    //  2) wstrzymac
    //  3) jedz
    //  przy tych akcjach informuje co robi i jakie ma nr rejestracyjne
}
