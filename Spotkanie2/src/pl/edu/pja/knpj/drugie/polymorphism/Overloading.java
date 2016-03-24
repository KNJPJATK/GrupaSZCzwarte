package pl.edu.pja.knpj.drugie.polymorphism;

/**
 * Created by andrew on 24.03.2016.
 */
public class Overloading {


    int a, b;

    public Overloading(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Overloading(Integer a, Integer b){
        this.a = a;
        this.b = b;
    }

    public int add(int a){
        return a;
    }

    public int add(int a, int b){
        return a + b;
    }

    public int add(int a, int b, int c){
        return a + b + c;
        /*
            Oczywiscie mozemy wzywać inne przeciazone metody
            Moglibyśmy zwrócić:
            return this.add(a, b) + this.add(c);
            nic nie stoi na przeszkodzie.
         */
    }

    public int add(int a, Integer b, Integer c){
        return a + b + c;
    }

}
