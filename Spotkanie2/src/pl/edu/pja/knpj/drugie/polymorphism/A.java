package pl.edu.pja.knpj.drugie.polymorphism;

/**
 * Created by andrew on 24.03.2016.
 */
public class A {

    public int bla = 0;

    public int make(int a){
        System.out.println("Calling make from A.");
        return a + bla;
    }
}
