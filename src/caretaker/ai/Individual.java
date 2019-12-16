package caretaker.ai;

import caretaker.helper.Database;
import caretaker.helper.RandomPlayerId;
import caretaker.model.Formasi;
import java.util.ArrayList;

public class Individual implements Comparable<Individual>{

    Float fitness;
    int[] genes = new int[11];
    int geneLength = 11;
    
    Formasi formasi;

    public Individual(Formasi f) {
        this.fitness = 0f;
        this.formasi = f;
        RandomPlayerId rnPlayer = new RandomPlayerId();
        ArrayList<Integer> playerId = rnPlayer.allId();
        
        //Set genes randomly for each individual
        for (int i = 0; i < genes.length; i++) {
            genes[i] = playerId.get(i);
        }
        
        calcFitness();
    }

    //Calculate fitness
    void calcFitness() {
        fitness = 0f;
        
        for (int i = 0; i < 11; i++) {
            fitness += Database.getOvr(genes[i], formasi.getPosisi(i));
        }
    }

    @Override
    public int compareTo(Individual o) {
        return this.fitness.compareTo(o.fitness);
    }

}
