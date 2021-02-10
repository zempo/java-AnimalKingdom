package animalKingdom;

/**
 * Bird
 */
public class Bird extends AbstractAnimal {
    public Bird(int id, String name, String latinName, int yearDiscovered) {
        this.id = id;
        this.name = name;
        this.latinName = latinName;
        this.yearDiscovered = yearDiscovered;
    }

    @Override
    public String move() {
        return "flight";
    }

    @Override 
    public String breath() {
        return "lungs";
    }

    @Override
    public String reproduce() {
        return "by laying eggs";
    }


    @Override
    public String sirDavidAttenborough() {
        return "\nThe " + name + " (" + latinName + "), moves around by means of " + move() + "."
         + "\nFirst discovered in " + yearDiscovered + ", they breath through their " + breath() + " and reproduce " + reproduce() + ".\n";
    }
 
    @Override
    public String quickPrint() {
        return "—" + name + " (Discovered " + yearDiscovered + "): lays eggs, has lungs, and flies.";
    }
}  