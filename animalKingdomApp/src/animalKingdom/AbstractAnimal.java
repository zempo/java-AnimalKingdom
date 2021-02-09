package animalKingdom;

abstract class AbstractAnimal {
    protected int id;
    protected String name;
    protected String fakeLatinName;
    protected int yearDiscovered;
    
    public String eat() {
        return "The" + name + "eats some food.";
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return fakeLatinName;
    }

    public int getYear() {
        return yearDiscovered;
    }

    public int getId() {
        return id;
    }

    public String describeAnimal(String name, String latinName, int yearOfDiscovery, String typeOfBirth, String movement) {
        return "\n----------------------\n"
         + "The " + name + " (" + latinName + "), moves around by " + movement + "."
         + "\n Discovered in" + yearOfDiscovery + ", they reproduce by " + typeOfBirth + "."
         + "\n----------------------\n";
    }

    public String quickPrint(String name, String latinName) {
        return "—" + name + " (" + latinName + ")";
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();
}