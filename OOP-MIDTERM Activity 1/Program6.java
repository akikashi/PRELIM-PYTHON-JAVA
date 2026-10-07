// Program 6: shows how both Student constructors are used
public class Program6 {

    public void run() {
        // first constructor: default values
        Student s1 = new Student();

        // second constructor: 4 parameters
        Student s2 = new Student("S1001", "Maria Santos", "15/03/2004", 180);

        System.out.println("Student 1: " + s1);
        System.out.println("Student 2: " + s2);
        System.out.println("Number of students created: " + Student.getNoOfStudents());
    }
}
