import java.util.ArrayList;
import java.util.List;

public class Student extends Persons{
private final int studentId;
private final List<String> courses;


    public Student(String name, int age, String gender, int studentId) {
        super();
        this.studentId = studentId;
        this.courses = new ArrayList<>();
    }

    public int getStudentId() {
        return studentId;
    }

    public List<String> getCourses() {
        return courses;
    }
    public void addCourses(String course){
        courses.add(course);
    }
    public void displayInfo(){
        super.displInfo();
        System.out.println("Student id = " + studentId);
        System.out.print("Courses- ");
        for (String course:courses){
            System.out.print(course + "");
            System.out.println();
        }


    }

}
class demoStudent{
    public static void main(String[] args) {
        Student sss = new Student("miko",25,"male",258);
        sss.addCourses("tec");
        sss.displayInfo();
    }
}