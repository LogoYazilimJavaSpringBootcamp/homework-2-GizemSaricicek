package org.example.AbstractFactoryImplementation;

public class AnimalFactory implements AbstarctFactory<Animal>{ // Animal için AbstarctFactory'den implement edilen factory

    public Animal create(String animalType){

        if("Dog".equalsIgnoreCase(animalType)){
            return new Dog();
        }
        else if("Duck".equalsIgnoreCase(animalType)){
            return new Duck();
        }
        return null;
    }
}
