public class Persons {
    private String name;
    private int age;
   private String gender;



    public Persons(String name, int age, String gender) {
        this.name = name;
        this.age =age;
        this.gender =gender;
    }

    public Persons() {

    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String isGender() {
        return gender;
    }


    public void displInfo(){
        System.out.println(" Hello I am " +  name  + " I am a " + age + " I am a " +  gender);
    }
}
class Demmo {
    public static void main(String[] args) {
        Persons persony = new Persons("hgdskg", 5, "hgfj");
        persony.displInfo();
    }
}

