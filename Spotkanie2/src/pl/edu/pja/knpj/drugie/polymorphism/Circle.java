package pl.edu.pja.knpj.drugie.polymorphism;

/**
 * Created by andrew on 24.03.2016.
 */
public class Circle extends Shape{

    /**
     * PRZESŁANIAMY - OVERRIDE'ujemy metodę #draw z klasy Shape.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a circle.");
        super.draw(); //poprzez super wzywamy przesłaniamy metodę z klasy dziedziczącej! Ona nigdy nie ginie! :)
    }

    /**
        Przesłonięte metody mogą zmieniać zwracany typ, pod warunkiem że będzie on podtypem tego typu, który jest zwracany
        w nad klasie.
     */
    @Override
    public Circle build(){
        return null;
    }

}
