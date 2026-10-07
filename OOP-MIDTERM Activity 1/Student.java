import java.text.SimpleDateFormat;
import java.util.Date;

// Student class for Program 6
public class Student {

    private String studentNo;
    private String studentName;
    private Date dateOfBirth;
    private int tariffPoints;

    // class variable: shared by all Student objects
    private static int noOfStudents = 0;

    // constructor 1: default values
    public Student() {
        studentNo = "not known";
        studentName = "not known";
        dateOfBirth = makeDate("01/01/1995");
        tariffPoints = 20;
        noOfStudents++;
    }

    // constructor 2: all four values given
    public Student(String no, String name, String dob, int points) {
        setStudentNo(no);
        setStudentName(name);
        setDateOfBirth(dob);
        setTariffPoints(points);
        noOfStudents++;
    }

    // turns "dd/MM/yyyy" text into a Date
    private static Date makeDate(String text) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(text);
        } catch (Exception e) {
            return null;
        }
    }

    // getters
    public String getStudentNo() { return studentNo; }
    public String getStudentName() { return studentName; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public int getTariffPoints() { return tariffPoints; }
    public static int getNoOfStudents() { return noOfStudents; }

    // setters with simple checks
    public void setStudentNo(String no) {
        if (no == null || no.trim().isEmpty()) studentNo = "not known";
        else studentNo = no;
    }

    public void setStudentName(String name) {
        if (name == null || name.trim().isEmpty()) studentName = "not known";
        else studentName = name;
    }

    public void setDateOfBirth(String dob) {
        Date d = makeDate(dob);
        if (d == null) d = makeDate("01/01/1995"); // bad date -> default
        dateOfBirth = d;
    }

    public void setTariffPoints(int points) {
        if (points >= 20 && points <= 280) {
            tariffPoints = points;
        } else {
            System.out.println("Tariff points must be 20-280, using 20.");
            tariffPoints = 20;
        }
    }

    public String toString() {
        String dob = new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth);
        return studentNo + " | " + studentName + " | " + dob + " | " + tariffPoints;
    }
}
