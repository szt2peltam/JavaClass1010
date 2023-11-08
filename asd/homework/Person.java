package asd.homework;
public class Person extends Human{

    public Person(String name, int age, String gender) {
        super(name, age, gender);
    }
    
    @Override
    public String getGoal(){
        String a = "My goal is: Live for the moment!";
        System.out.println(a);
        return a;
    }
}
