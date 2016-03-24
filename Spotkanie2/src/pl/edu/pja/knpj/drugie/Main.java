package pl.edu.pja.knpj.drugie;

import pl.edu.pja.knpj.drugie.abstractstuff.AbstractGenomeProcessor;
import pl.edu.pja.knpj.drugie.abstractstuff.AppendingGenomeProcessor;
import pl.edu.pja.knpj.drugie.abstractstuff.Genome;
import pl.edu.pja.knpj.drugie.abstractstuff.PrependingGenomeProcessor;
import pl.edu.pja.knpj.drugie.polymorphism.*;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        System.out.println("Polymorphism - A & B\n");

        A a = new A();
        A b = new B();

        System.out.println("Result of A: " + a.make(2));
        System.out.println("Result of B: " + b.make(2));

        System.out.println("-----\nPolymorphism - Shapes\n");

        Shape s1 = new Shape();
        Shape s2 = new Rectangle();
        Shape s3 = new Triangle();
        Shape s4 = new Circle();

        List<Shape> shapes = new LinkedList<>(Arrays.asList(s1, s2, s3, s4));
        for(Shape shape : shapes){
            shape.draw();
            System.out.println();
        }

        System.out.println("-----\nAbstract classes\n");

        Genome  genome1 = new Genome("AABB"),
                genome2 = new Genome("AAAA"),
                genome3 = new Genome("BBBB"),
                genome4 = new Genome("BBAA");

        AbstractGenomeProcessor genomeProcessor;
        //genomeProcessor = new AbstractGenomeProcessor();
        //  Nie mozemy miec zadnych instancji klas abstrakcyjnych, dlatego kompilator wywali blad
        //  jak odkomentujemy powyzsza linie.

        genomeProcessor = new PrependingGenomeProcessor();

        genomeProcessor.processGenome(genome1);
        genomeProcessor.processGenome(genome2);

        System.out.println("-----\nZmiana GenomeProcesor na taki ktory dodaje do genomow JAVA.\n------");

        genomeProcessor = new AppendingGenomeProcessor();

        genomeProcessor.processGenome(genome1);
        genomeProcessor.processGenome(genome2);
    }
}
