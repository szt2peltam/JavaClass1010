package zoo;

public class Mammal extends Animal {

    public Mammal(String name, String gender, Boolean isOmnivore, Boolean isCarnivore, Boolean isHerbivore, int age) {
        super(name, gender, isOmnivore, isCarnivore, isHerbivore, age);
    }
    
    @Override
    public String Breed(){
        return "Viviparous";
    }

}
