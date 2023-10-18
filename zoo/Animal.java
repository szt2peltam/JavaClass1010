package zoo;

public abstract class Animal {
    private String name;
    private String gender;
    private Boolean isOmnivore;
    private Boolean isCarnivore;
    private Boolean isHerbivore;
    private int age;

    public Animal(String name, String gender, Boolean isOmnivore, Boolean isCarnivore, Boolean isHerbivore, int age) {
        this.name = name;
        this.gender = gender;
        this.isOmnivore = isOmnivore;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public Boolean getIsOmnivore() {
        return isOmnivore;
    }

    public Boolean getIsCarnivore() {
        return isCarnivore;
    }

    public Boolean getIsHerbivore() {
        return isHerbivore;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String Breed(){
        return "Eggs";
    }
}
