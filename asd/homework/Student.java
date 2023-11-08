package asd.homework;


public class Student extends Human{

    private String previousOrganization;
    private int skippedDays;
    public Student(String name, int age, String gender, String previousOrganization) {
        super(name, age, gender);
        this.previousOrganization = previousOrganization;
        this.skippedDays = 0;
    }
    @Override
    public String getGoal() {
        String a = "Be a junior software developer.";
        System.out.println(a);
        return a;
    }

    @Override
    public String introduce() {
        String a = "Hi, I'm "+name+", a "+age+" year old "+gender+" from "+previousOrganization+" who skipped" +
        " "+skippedDays+" days from the course already.";

        System.out.println(a);

        return a;
    }

    public void skipDays(int numdays){
        skippedDays += numdays;
    }
}
