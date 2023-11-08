package asd.homework;
import java.util.ArrayList;

public class Cohort {
    private String name;
    private ArrayList<Mentor> mentors;
    private ArrayList<Student> students;
    public Cohort(String name) {
        this.name = name;
        this.mentors = new ArrayList<Mentor>();
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student  student){
        students.add(student);
    }

    public void addMentor(Mentor mentor){
        mentors.add(mentor);
    }

    public String info(){
        String a = "The "+name+" cohort has "+students.size()+" students and "+mentors.size()+" mentors.";
    
        System.out.println(a);

        return a;
    
    }
}
