package edu.knpj;

/**
 * Created by andrew and tomek on 14.04.2016.
 */
public class Bankomat extends Thread{

    private Rachunek rachunek;

    public Bankomat(Rachunek rachunek) {
        this.rachunek = rachunek;
    }

    /**
     *  Fejkowa metoda, ktora nic tak naprawde nie robi.
     *  Zmniejsza a pozniej zwieksza stan rachunku.
     *
     *  @return Stan rachunku.
     */
    public int fakeOperation(){
        //  ctrl-d w intelli-j kopiujemy linie...
        synchronized (rachunek){ // todo: usunac to synchro, wrzucic do innej klasy
            rachunek.stan--;
            rachunek.stan++;
            return rachunek.stan;
        }
    }

    @Override
    public void run() {
        //  tyle razy wykonujemy fora ile to zostalo zdefiniowane w Rachunku
        for (int i = 0; i < rachunek.iloscOperacjiWykonanych; i++) {
            System.out.println(this.fakeOperation());
            //  zatrzymanie tego run'a mozemy spowodowac breakiem z petli for
        }
    }
}
