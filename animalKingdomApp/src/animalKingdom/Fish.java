package animalKingdom;

/**
 * Fish
 */
public class Fish extends AbstractAnimal {
    public Fish(int id, String name, String latinName, int yearDiscovered) {
        this.id = id;
        this.name = name;
        this.latinName = latinName;
        this.yearDiscovered = yearDiscovered;
    }
 
    @Override
    public String move() {
        return "swimming";
    }

    @Override 
    public String breath() {
        return "gills";
    }

    @Override
    public String reproduce() {
        return "by laying eggs";
    }

    @Override
    public String sirDavidAttenborough() {
        return "The " + name + " (" + latinName + "), moves around by means of " + move() + "."
         + "\nFirst discovered in " + yearDiscovered + ", they breath through their " + breath() + " and reproduce " + reproduce() + ".\n";
    }
 
    @Override
    public String quickPrint() {
        return "—" + name + " (Discovered " + yearDiscovered + "): lays eggs, has gills, and swims.";
    }
}  