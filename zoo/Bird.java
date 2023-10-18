package zoo;

public class Bird extends Animal{

    private Boolean canFly;

    public Bird(String name, String gender, Boolean isOmnivore, Boolean isCarnivore, Boolean isHerbivore, int age, boolean canFly) {
        super(name, gender, isOmnivore, isCarnivore, isHerbivore, age);
        this.canFly = canFly;
    }

    public Boolean getCanFly() {
        return canFly;
    }
    

    @Override
    public String Breed(){
        return "Not viviparous";
    }
}
