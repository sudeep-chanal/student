import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Students extends StudentCourses {
    String name;
    String dob;

    public void displayName() {
        System.out.println("Student Name: " + name);
    }

    public void displayAge(String dob) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate birthDate = LocalDate.parse(dob, formatter);
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(birthDate, currentDate);
        int age = period.getYears();
        System.out.println("Age of student: " + age);
    }

    public static void main(String[] args) {
        Students s = new Students();
        s.name = "Sudeep";
        s.displayName();
        s.displayAge("23-03-2004");
        StudentCourses studentCourses = new StudentCourses();
        studentCourses.displayStudentMarks();
    }
}