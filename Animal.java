public class Animal {
    private int numberOfLegs;
    private int numberOfEyes;
    private String name;


public static void main(String[] args) {
    Animal animal = new Animal(3, 2, "Karcsi");

    animal.printAnimal();

    animal.setName("Janics");
    animal.setNumberOfLegs(122);
    animal.printAnimal();
}

    public Animal(int numberOfLegs, int numberOfEyes, String name) {
        this.numberOfLegs = numberOfLegs;
        this.numberOfEyes = numberOfEyes;
        this.name = name;
    }
    public int getNumberOfLegs() {
        return numberOfLegs;
    }
    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }
    public int getNumberOfEyes() {
        return numberOfEyes;
    }
    public void setNumberOfEyes(int numberOfEyes) {
        this.numberOfEyes = numberOfEyes;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void printAnimal(){
        System.out.println("Name: "+getName()+"\nLegs: "+getNumberOfLegs()+"\nEyes: "+getNumberOfEyes());
    }
}
