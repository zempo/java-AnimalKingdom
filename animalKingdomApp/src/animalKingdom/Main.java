package animalKingdom;

// imports
import java.util.List;
import java.util.ArrayList;

/**
 * Main
 */
public class Main {
    private static List<AbstractAnimal> filterAnimal(List<AbstractAnimal> animals, CheckAnimal tester) {
        List<AbstractAnimal> tempList = new ArrayList<>();
        for (AbstractAnimal a : animals) {
            if (tester.test(a)){
                tempList.add(a);
            }
        }
        return tempList;
    }
    public static void main(String[] args) {
        Mammal panda = new Mammal(0, "Panda", "Almost Exitinctous", 1869);
        Mammal zebra = new Mammal(1, "Zebra", "Nature's Appetizer", 1778);
        Mammal koala = new Mammal(2, "Koala", "G'Day Mate", 1816);
        Mammal sloth = new Mammal(3, "Sloth", "Slow Boi", 1804);
        Mammal armadillo = new Mammal(4, "Armadillo", "Rolly Boi", 1758);
        Mammal raccoon = new Mammal(5, "Raccoon", "Trash Panda", 1758);
        Mammal bigfoot = new Mammal(6, "Bigfoot", "Is Real", 2021);

        
        Bird pigeon = new Bird(7, "Pigeon", "Coo Coo", 1837);
        Bird peacock = new Bird(8, "Peacock", "By Katy Perry", 1821);
        Bird toucan = new Bird(9, "Toucan", "Fruit Loops Bird", 1758);
        Bird parrot = new Bird(10, "Parrot", "Pieces of Eight", 1824);
        Bird swan = new Bird(11, "Swan", "Used to be an Ugly Duckling", 1758);
        
        Fish salmon = new Fish(12, "Salmon", "Glub Glub", 1758);
        Fish catfish = new Fish(13, "Catfish", "Glub Meow Glub", 1817);
        Fish perch = new Fish(14, "Perch", "Glub Glub", 1758);

        System.out.println("\n*** Write the Script for Planet Earth 3: Featuring Sir David Attenborough ***");
        // System.out.println(panda.sirDavidAttenborough());
        System.out.println(zebra.sirDavidAttenborough());
        // System.out.println(koala.sirDavidAttenborough());
        // System.out.println(sloth.sirDavidAttenborough());
        // System.out.println(armadillo.sirDavidAttenborough());
        // System.out.println(raccoon.sirDavidAttenborough());
        // System.out.println(bigfoot.sirDavidAttenborough());
        // System.out.println(pigeon.sirDavidAttenborough());
        System.out.println(peacock.sirDavidAttenborough());
        // System.out.println(toucan.sirDavidAttenborough());
        // System.out.println(parrot.sirDavidAttenborough());
        // System.out.println(swan.sirDavidAttenborough());
        // System.out.println(salmon.sirDavidAttenborough());
        System.out.println(catfish.sirDavidAttenborough());
        // System.out.println(perch.sirDavidAttenborough());
        
        List<AbstractAnimal> animalList = new ArrayList<>();
        
        animalList.add(panda);
        animalList.add(zebra);
        animalList.add(koala);
        animalList.add(sloth);
        animalList.add(armadillo);
        animalList.add(raccoon);
        animalList.add(bigfoot);

        animalList.add(pigeon);
        animalList.add(peacock);
        animalList.add(toucan);
        animalList.add(parrot);
        animalList.add(swan);

        animalList.add(salmon);
        animalList.add(catfish);
        animalList.add(perch);

        System.out.println("*** List all the animals in descending order by year named ***\n");
        List<AbstractAnimal> byYear = animalList;
        byYear.sort((a1, a2) -> a2.getYear() - a1.getYear());
        byYear.forEach((a) -> System.out.println(a.quickPrint()));
        
        // System.out.println(newList);
    }
}