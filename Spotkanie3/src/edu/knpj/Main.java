package edu.knpj;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //  Thread to kontener na to co bedzie wykonywanie
        //  mozemy sterowac jak coś bedzie wykonywane.
        Thread watek = new Thread();
        // watek. <- rozne ciekawe metody!

        //  Pyt: Kiedy tworzymy anonimowe implementacje?
        //  Odp: Jezeli tylko raz bedzie ten kawalek kodu uzyty. Wtedy warto :)
        Runnable runnable = new Runnable() { // tworzymy anonimową implementację Runnable

            //  jedyna metoda interfejsu Runnable
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
//                    System.out.println("Pokazujemy cos fajnego z Runnable: " + i);
                }

            }
        };
        Thread watekDoRunnable = new Thread(runnable);
        //  nic sie nie stanie dopoki nie odpalimy watku przez #start();

        watekDoRunnable.start();
        //  odpal kod i zobacz jak działa wywłaszczanie
        //  komunikaty z Maina i z Runnable mogą sie przeplatać!
        for (int i = 0; i < 50; i++) {
//            System.out.println("Pokazujemy coś mniej fajnego ale innego z Maina " + i);
        }

        System.out.println("------KONIEC WSTĘPU-------");
        System.out.println("------ZABAWY Z SYNCHRONIZACJĄ-------");
        Rachunek rachunek = new Rachunek(0, 100);

        LinkedList<Bankomat> bankomaty = new LinkedList<>();
        int iloscBankomatow = 5000;
        for (int i = 0; i < iloscBankomatow; i++) {
            bankomaty.add(new Bankomat(rachunek));
        }
        //  fajny for! tzw. foreach
        for (Bankomat bankomat :
                bankomaty) {
           // bankomat.start();
        }
        /*
          mimo ze z logicznego pktu widzenia stan rachunku powinien byc zawsze 0
          moze sie jednak zdarzyc, ze bedzie to różne od 0!
          (odpalajacie tak długo, az bedzie to rozne!)
          wszystkie watki pracują na jednym incie w obiekcie rachunek...
          steruj wartością iloscBankomatow i zobacz sam! moze 500? moze 5000? moze 50?
        */

        /*
          watek moze sie zakonczyc... swoją smiercią naturalną...
        */

        /*
            mamy taki problem ze watki na siebie nachodza...
            nie sa zsynchroznizowane...

            rozwiazaniem jest blok:
            synchronized { ... }

            znaczy on, ze na danym obiekcie, ze tylko jeden JEDEN! watek
            bedzie mial dostep do zasobow obiektu, wykonywania metod.
        */
        System.out.println("------KONIEC ZABAWY Z SYNCHRONIZACJĄ-------");

        Samochod a = new Samochod("WT03065", 6);
        Samochod b = new Samochod("HP33333", 10);
        a.jedz();
        b.jedz();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.zatrzymaj();
        try {
            Thread.sleep(4000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a.jedz();
    }
}
