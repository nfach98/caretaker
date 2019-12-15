package caretaker.ai;

import caretaker.helper.RandomPlayerId;
import caretaker.model.Formasi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class GeneticAlgorithm {
    
    Population population = new Population();
    
    ArrayList<Formasi> formations = new ArrayList<>();
    
    void start(){
        population.initializePopulation(10, formations.get(0));
        population.calculateFitness();
        
//        for(int i=0; i<30; i++){
//            selection();
//            crossover();
//            if (rn.nextInt()%7 < 11) {
//                mutation();
//            }
//            addFittestOffspring();//Add fittest offspring to population
//            population.calculateFitness();//Calculate new fitness value
//
//            System.out.println("Generation: " + (i+1) +" Fittest: " + population.fittest);
//        }
    }
    
    //Selection
    ArrayList<Individual> selection() {
        ArrayList<Individual> parents = new ArrayList<>();
        for(int i=0;i<8;i++){
            parents.add(population.individuals.get(i));
        }
        return parents;
    }
    
    //Crossover
    void crossover(Individual i1, Individual i2, Formasi f) {
        Individual o1 = new Individual(f);
        Individual o2 = new Individual(f);
        
        ArrayList<Integer> points = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        Collections.shuffle(points);
        
        int pointStart = Math.min(points.get(0), points.get(1));
        int pointEnd = Math.max(points.get(0), points.get(1));
        
        ArrayList<Integer> iCross1 = new ArrayList<>();
        ArrayList<Integer> iCross2 = new ArrayList<>();
        
        //Determine offsprings crossover genes
        for(int i=0; i<11; i++){
            if(pointStart < i && i < pointEnd){
                iCross1.add(i1.genes[i]);
                iCross2.add(i2.genes[i]);
                
                o1.genes[i] = i1.genes[i];
                o2.genes[i] = i2.genes[i];
            }
        }
        
        //Fill remaining offsprings genes
        for(int i=0; i<11; i++){
            if(i < pointStart || pointEnd < i){
                for(int o: i2.genes){
                    if(!iCross2.contains(o)){
                        o1.genes[i] = o;
                        break;
                    }
                }
                
                for(int o: i1.genes){
                    if(!iCross1.contains(o)){
                        o2.genes[i] = o;
                        break;
                    }
                }
            }
        }
        
        //Add offsprings to population
        population.individuals.add(o1);
        population.individuals.add(o2);
    }

    //Mutation
    Individual mutation(Individual ind){
        Random rn = new Random();
        RandomPlayerId rnPlayer = new RandomPlayerId();
        
        int mutationValue = 0;
        int mutationPoint = rn.nextInt(population.individuals.get(0).geneLength);
        
        boolean isOnIndividual = false;
        
        //Check if value is on chromosome or not
        while (isOnIndividual) {
            isOnIndividual = false;
            rnPlayer.shuffleList();
            
            mutationValue = (int) rnPlayer.nextId();
            for(int p: ind.genes){
                if(mutationValue == p){
                    isOnIndividual = true;
                    break;
                }
            }
        }
        
        //Assign value to mutation point
        ind.genes[mutationPoint] = mutationValue;
        return ind;
    }
}