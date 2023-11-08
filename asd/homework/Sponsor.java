package asd.homework;
public class Sponsor extends Human {

    private String company;
    private int hiredStudents;
    public Sponsor(String name, int age, String gender, String company, int hiredStudents) {
        super(name, age, gender);
        this.company = company;
        this.hiredStudents = hiredStudents;
    }

    public void hire()
    {
        hiredStudents++;
    }
    
    @Override
    public String getGoal() {
        String a = "Hire brilliant junior software developers.";
        System.out.println(a);
        return a;
    }

    @Override
    public String introduce() {
        String a = "Hi, I'm "+name+", a "+age+" year old "+gender+" who represents "+company+" and hired "+hiredStudents+" students so far.";

        System.out.println(a);
        return a;
    }
}
