package pl.edu.pja.knpj.drugie.abstractstuff;

/**
 * Created by andrew on 24.03.2016.
 *
 * Wstawiając poniżej 'abstract' upewniamy się, że nasza klasa będzie abstrakcyjna.
 */
public abstract class AbstractGenomeProcessor {

    protected abstract Genome manipulateGenome(Genome genome);

    public void processGenome(Genome genome){
        if (genome == null) {
            throw new NullPointerException("Genome may never be null!");
        }

        /*
            Przetwarzamy genom w jakis sposob...
         */

        System.out.println("Processing genome...: " + genome.geneString );

        Genome manpiulatedGenome = this.manipulateGenome(genome);

        System.out.println("After manipulation: " + manpiulatedGenome.geneString);
        System.out.println();

    }

}
