package pl.edu.pja.knpj.drugie.polymorphism;

public class Shape {

    public int x, y, width, height;

    public void draw(){
        System.out.println("Drawing a shape...");
    }

    /**
     Przesłonięte metody mogą zmieniać zwracany typ, pod warunkiem że będzie on podtypem tego typu, który jest zwracany
     w nad klasie.

     Patrz klasa Circle.
     */
    public Shape build(){
        return null;
    }

}
