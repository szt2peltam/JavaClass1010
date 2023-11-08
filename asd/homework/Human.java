package asd.homework;
public abstract class Human {
    public String name;
    public int age;
    public String gender;


    public Human(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getGoal(){
        return "";
    }
    public String introduce(){

        String a = "Hi I'm" + name+", age to" + age+" gender to "+ gender;
        System.out.println(a);

        return a;
    }
}
