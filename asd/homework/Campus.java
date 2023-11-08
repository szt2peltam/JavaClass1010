

package asd.homework;
public class Campus {


    
    public static void main(String[] args) {
        Person mark = new Person("Mark", 46, "Male");
        mark.introduce();
        mark.getGoal();

        Person jane = new Person("Jane Doe", 30, "Female");
        jane.introduce();
        jane.getGoal();

        Student John = new Student("John Doe", 20, "Male", "BME");
        John.introduce();
        John.getGoal();

        Student Jane = new Student("Jane Doe", 30, "female", "The School of life");
        Jane.skipDays(3);
        Jane.introduce();
        Jane.getGoal();

        Mentor Gandhi = new Mentor("Gandhi", 148, "male", "senior");
        Gandhi.introduce();
        Gandhi.getGoal();

        Mentor Jane2 = new Mentor("Jane Doe", 30, "female", "intermediate");
        Jane2.introduce();
        Jane2.getGoal();

        Sponsor Jane3 = new Sponsor("Jane Doe", 30, "female", "Google", 3);
        
        Jane3.introduce();
        Jane3.getGoal();


        Sponsor Elon = new Sponsor("Elon Musk", 46, "Male", "SpaceX", 5);

        Elon.introduce();
        Elon.getGoal();


        Cohort aws = new Cohort("AWESOME");
        aws.addMentor(Jane2);
        aws.addMentor(Gandhi);
        aws.addStudent(Jane);
        aws.addStudent(John);
        aws.info();

    }
}
