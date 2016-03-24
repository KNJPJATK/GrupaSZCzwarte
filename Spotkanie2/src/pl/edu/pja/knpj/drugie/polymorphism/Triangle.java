package pl.edu.pja.knpj.drugie.polymorphism;

/**
 * Created by andrew on 24.03.2016.
 */
public class Triangle extends Shape{

    /**
     * PRZESŁANIAMY - OVERRIDE'ujemy metodę #draw z klasy Shape.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a triangle.");
        super.draw(); //poprzez super wzywamy przesłaniamy metodę z klasy dziedziczącej! Ona nigdy nie ginie! :)
    }
}
