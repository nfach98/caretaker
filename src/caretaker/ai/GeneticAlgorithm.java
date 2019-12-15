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
        Random rn = new Random();
        
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
    void crossover(Individual i1, Individual i2) {
        ArrayList<Integer> points = new ArrayList<>(Arrays.asList(0,1,2,3,4,5,6,7,8,9,10));
        Collections.shuffle(points);
        
        int pointStart = Math.min(points.get(0), points.get(1));
        int pointEnd = Math.max(points.get(0), points.get(1));
        
        ArrayList<Integer> iCross1 = new ArrayList<>();
        ArrayList<Integer> iCross2 = new ArrayList<>();
        
        for(int i=0; i<11; i++){
            if(pointStart < i && i < pointEnd){
                iCross1.add(i1.genes[i]);
                iCross2.add(i2.genes[i]);
            }
        }
        
        for(int i=0; i<11; i++){
            if(i < pointStart || pointEnd < i){
                iCross1.add(i1.genes[i]);
                iCross2.add(i2.genes[i]);
            }
        }
    }

    //Mutation
    public Individual mutation(Individual ind){
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
//    void mutation() {
//        Random rn = new Random();
//
//        int mutationPoint = rn.nextInt(population.individuals.get(0).geneLength);
//
//        if (fittest.genes[mutationPoint] == 0) {
//            fittest.genes[mutationPoint] = 1;
//        } else {
//            fittest.genes[mutationPoint] = 0;
//        }
//
//        mutationPoint = rn.nextInt(population.individuals[0].geneLength);
//
//        if (secondFittest.genes[mutationPoint] == 0) {
//            secondFittest.genes[mutationPoint] = 1;
//        } else {
//            secondFittest.genes[mutationPoint] = 0;
//        }
//    }
//
//    //Get fittest offspring
//    Individual getFittestOffspring() {
//        if (fittest.fitness > secondFittest.fitness) {
//            return fittest;
//        }
//        return secondFittest;
//    }
//
//
//    //Replace least fittest individual from most fittest offspring
//    void addFittestOffspring() {
//
//        //Update fitness values of offspring
//        fittest.calcFitness();
//        secondFittest.calcFitness();
//
//        //Get index of least fit individual
//        int leastFittestIndex = population.getLeastFittestIndex();
//
//        //Replace least fittest individual from most fittest offspring
//        population.individuals[leastFittestIndex] = getFittestOffspring();
//    }
}