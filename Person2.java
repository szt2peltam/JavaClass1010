public class Person2 {
    private String name;
    private int age;
    private String gender;



    
    public Person2() {
        this.name = "Jane Doe";
        this.age = 30;
        this.gender = "Female";
    }
    public Person2(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public void getGoal(){
        System.out.println("My goal is: Live for the moment!");

    }

    public void Introduce(){
        System.out.println("Hi, I'm " + getName() + " a" +getAge()+"old"+getGender());
    }
    
}
