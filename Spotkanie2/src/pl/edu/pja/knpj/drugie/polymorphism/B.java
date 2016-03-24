package pl.edu.pja.knpj.drugie.polymorphism;

/**
 * Created by andrew on 24.03.2016.
 */
public class B extends A {

    public int make(int a) {
        System.out.println("Calling make from B.");
        return a + bla + 1;
    }
}
