package animalKingdom;

abstract class AbstractAnimal {
    protected int id;
    protected String name;
    protected String latinName;
    protected int yearDiscovered;
    
    public String eat() {
        return "The" + name + "eats some food.";
    }

    public String getName() {
        return name;
    }

    public String getLatinName() {
        return latinName;
    }

    public int getYear() {
        return yearDiscovered;
    }

    public int getId() {
        return id;
    }

    abstract String move();
    abstract String breath();
    abstract String reproduce();
    abstract String sirDavidAttenborough();
    abstract String quickPrint();
}