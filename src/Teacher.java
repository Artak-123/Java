import java.util.ArrayList;
import java.util.List;

public class Teacher extends Persons{
    private final int employeeID;
    private final List<String> subject;


    public Teacher(String name, int age, String gender, int employeeID) {
        super(name, age, gender);
        this.employeeID = employeeID;
        this.subject = new ArrayList<>();
    }

    public int getStudentId() {
        return employeeID;
    }

    public List<String> getCourses() {
        return subject;
    }
    public void addSubject(String subjects){
        subject.add(subjects);
    }
    public void displayInfo(){
        super.displInfo();
        System.out.println("for example = " + employeeID);
        System.out.print("Employee - ");
        for (String course:subject){
            System.out.print(course + "");
            System.out.println();
        }


    }

}
class demoTeacher{
    public static void main(String[] args) {
        Teacher best = new Teacher("mikol",25,"male",258);
        best.addSubject("tekgkkhkc");
        best.displayInfo();
    }
}