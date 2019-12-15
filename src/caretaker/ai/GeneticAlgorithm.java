package caretaker.ai;

import caretaker.model.Formasi;
import caretaker.helper.Database;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class GeneticAlgorithm {
    
    Population population = new Population();
    Individual fittest;
    Individual secondFittest;
    
    ArrayList<Formasi> formations = new ArrayList<>();
    
    void start(){
        Random rn = new Random();
        
        population.initializePopulation(10, formations.get(0));
        population.calculateFitness();
        
        for(int i=0; i<30; i++){
            selection();
            crossover();
            if (rn.nextInt()%7 < 11) {
                mutation();
            }
            addFittestOffspring();//Add fittest offspring to population
            population.calculateFitness();//Calculate new fitness value

            System.out.println("Generation: " + (i+1) +" Fittest: " + population.fittest);
        }
    }
    
    //Selection
    void selection() {
        fittest = population.getFittest();
        secondFittest = population.getSecondFittest();
    }

    //Crossover
    void crossover() {
        Random rn = new Random();

        int crossOverPoint = rn.nextInt(population.individuals[0].geneLength);

        for (int i = 0; i < crossOverPoint; i++) {
            int temp = fittest.genes[i];
            fittest.genes[i] = secondFittest.genes[i];
            secondFittest.genes[i] = temp;
        }

    }

    //Mutation
    void mutation() {
        Random rn = new Random();

        int mutationPoint = rn.nextInt(population.individuals[0].geneLength);

        if (fittest.genes[mutationPoint] == 0) {
            fittest.genes[mutationPoint] = 1;
        } else {
            fittest.genes[mutationPoint] = 0;
        }

        mutationPoint = rn.nextInt(population.individuals[0].geneLength);

        if (secondFittest.genes[mutationPoint] == 0) {
            secondFittest.genes[mutationPoint] = 1;
        } else {
            secondFittest.genes[mutationPoint] = 0;
        }
    }

    //Get fittest offspring
    Individual getFittestOffspring() {
        if (fittest.fitness > secondFittest.fitness) {
            return fittest;
        }
        return secondFittest;
    }


    //Replace least fittest individual from most fittest offspring
    void addFittestOffspring() {

        //Update fitness values of offspring
        fittest.calcFitness();
        secondFittest.calcFitness();

        //Get index of least fit individual
        int leastFittestIndex = population.getLeastFittestIndex();

        //Replace least fittest individual from most fittest offspring
        population.individuals[leastFittestIndex] = getFittestOffspring();
    }

}

//Individual class
class Individual {

    int fitness = 0;
    int[] genes = new int[11];
    int geneLength = 11;
    
    Formasi formasi;

    public Individual(Formasi f) {
        this.formasi = f;
        ArrayList<Integer> playerId = new ArrayList<>();
        
        Database.currentTim.getPemainList().forEach((p) -> {
            playerId.add(p.getId());
        });
        Collections.shuffle(playerId);
        
        //Set genes randomly for each individual
        for (int i = 0; i < genes.length; i++) {
            genes[i] = playerId.get(i);
        }

        fitness = 0;
    }

    //Calculate fitness
    public void calcFitness() {
        fitness = 0;
        for (int i = 0; i < 11; i++) {
            fitness += Database.getOvr(genes[i], formasi.getPosisi(i));
        }
    }

}

//Population class
class Population {
    Formasi formasi;
    Individual[] individuals;
    int fittest = 0;

    //Initialize population
    public void initializePopulation(int size, Formasi f) {
        individuals = new Individual[size];
        this.formasi = f;
        
        for (int i = 0; i < size; i++) {
            individuals[i] = new Individual(formasi);
        }

    }

    //Get the fittest individual
    public Individual getFittest() {
        int maxFit = Integer.MIN_VALUE;
        int maxFitIndex = 0;
        for (int i = 0; i < individuals.length; i++) {
            if (maxFit <= individuals[i].fitness) {
                maxFit = individuals[i].fitness;
                maxFitIndex = i;
            }
        }
        fittest = individuals[maxFitIndex].fitness;
        return individuals[maxFitIndex];
    }

    //Get the second most fittest individual
    public Individual getSecondFittest() {
        int maxFit1 = 0;
        int maxFit2 = 0;
        for (int i = 0; i < individuals.length; i++) {
            if (individuals[i].fitness > individuals[maxFit1].fitness) {
                maxFit2 = maxFit1;
                maxFit1 = i;
            } else if (individuals[i].fitness > individuals[maxFit2].fitness) {
                maxFit2 = i;
            }
        }
        return individuals[maxFit2];
    }

    //Get index of least fittest individual
    public int getLeastFittestIndex() {
        int minFitVal = Integer.MAX_VALUE;
        int minFitIndex = 0;
        for (int i = 0; i < individuals.length; i++) {
            if (minFitVal >= individuals[i].fitness) {
                minFitVal = individuals[i].fitness;
                minFitIndex = i;
            }
        }
        return minFitIndex;
    }

    //Calculate fitness of each individual
    public void calculateFitness() {

        for (Individual individual : individuals) {
            individual.calcFitness();
        }
        getFittest();
    }
}
