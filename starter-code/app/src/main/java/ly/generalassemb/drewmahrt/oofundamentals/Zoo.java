package ly.generalassemb.drewmahrt.oofundamentals;

import java.util.ArrayList;

public class Zoo {
    //Define the Zoo object
    private static Zoo zoo;

    //Definition of the list to hold the animals
    private static ArrayList<Animal> animals;

    private Zoo(){
        animals = new ArrayList<>();
    }

    public static Zoo getInstance(){
        if(zoo == null)
            zoo = new Zoo();
        return zoo;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void removeAnimal(){
        animals.remove(animals.size() - 1);
    }

    public ArrayList<Animal> getAnimals(){
        return animals;
    }
}
