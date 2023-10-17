public class Student{
    private int id;
    private String name;
    private double cgpa;
    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }


    @Override
    public String toString(){
        return String.format("Student: id: %d, name: %s, cgpa: %.2f",this.id, this.name, this.cgpa);
    }

}