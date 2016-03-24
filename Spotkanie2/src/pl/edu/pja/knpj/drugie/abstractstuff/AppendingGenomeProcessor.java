package pl.edu.pja.knpj.drugie.abstractstuff;

/**
 * Created by andrew on 24.03.2016.
 */
public class AppendingGenomeProcessor extends AbstractGenomeProcessor {
    @Override
    protected Genome manipulateGenome(Genome genome) {
        String appendedGeneString = genome.geneString + " JAVA";
        return new Genome(appendedGeneString);
    }
}
