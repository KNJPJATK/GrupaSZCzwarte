package pl.edu.pja.knpj.drugie.abstractstuff;

/**
 * Created by andrew on 24.03.2016.
 */
public class PrependingGenomeProcessor extends AbstractGenomeProcessor {


    @Override
    protected Genome manipulateGenome(Genome genome) {
        String prependedGeneString = "JAVA " + genome.geneString;
        return new Genome(prependedGeneString);
    }
}
