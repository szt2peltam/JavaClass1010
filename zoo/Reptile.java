package zoo;

public class Reptile extends Animal {

    public Reptile(String name, String gender, Boolean isOmnivore, Boolean isCarnivore, Boolean isHerbivore, int age) {
        super(name, gender, isOmnivore, isCarnivore, isHerbivore, age);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public String Breed(){
        return "not viviparous";
    }
}
