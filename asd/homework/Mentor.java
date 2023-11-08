package asd.homework;
public class Mentor extends Human{
    private String level;
    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;
        //TODO Auto-generated constructor stub
    }
    @Override
    public String getGoal() {
        String a = "Educate brilliant junior software developers.";
        return a;
    }


    @Override
    public String introduce() {
        String a = "Hi, I'm "+name+", a "+age+" year old "+gender+" "+ level +"mentor.";
        System.out.println(a);
        return a;
    }
}
