import java.sql.SQLOutput;

public class Controller {
    public static void main(String[] args) {

        Library lib = new Library("Central library", "New York");
        Book Potter = new Book("Harry POtter and philosopher stone", "Joan Rolling");
//        Book str = new Book("str", "str");
        lib.addBookToWarehouse(Potter);
        Students Sam = new Students("Sam");
        lib.takeBook(Potter);
        Sam.addBooks(Potter);
        Sam.read();
        Sam.removeBook(Potter);
        lib.returnBook(Potter);
        System.out.println("Thanks");
    }

}
