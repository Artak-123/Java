public class Person {

    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void displayInfo (){
        System.out.println("Hello,I am " + name + ". I am " + age + " years old !!!");
    }
}
class Demo {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Armen");
        person.setAge(42);
        person.displayInfo();
    }
}