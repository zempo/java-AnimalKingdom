package animalKingdom;

/**
 * Mammal
 */
public class Mammal extends AbstractAnimal {
    public Mammal(int id, String name, String latinName, int yearDiscovered) {
        this.id = id;
        this.name = name;
        this.latinName = latinName;
        this.yearDiscovered = yearDiscovered;
    }

    @Override
    public String move() {
        return "walking or frantically sprinting away from predators.";
    }

    @Override 
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "through live birth";
    }


    @Override
    public String sirDavidAttenborough() {
        return "\nThe " + name + " (" + latinName + "), moves around by means of " + move() + "."
         + "\nFirst discovered in " + yearDiscovered + ", they breath through their " + breath() + " and reproduce " + reproduce() + ".\n";
    }
 
    @Override
    public String quickPrint() {
        return "—" + name + " (Discovered " + yearDiscovered + "): gives birth, has lungs, and walks.";
    }
}  