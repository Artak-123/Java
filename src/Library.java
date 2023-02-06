import java.util.ArrayList;

public class Library {
    private String name;
    private String location;
    private ArrayList<Book> Warehouse;

    public Library(String name, String location) {

        Warehouse = new ArrayList<Book>();
    }

    //    public ArrayList<String> getBooks() {
//        return books;
//    }
//
//    public void setBooks(ArrayList<String> books) {
//        this.books = books;
//    }
    public void addBookToWarehouse(Book book) {
        Warehouse.add(book);
    }
    public boolean takeBook(Book book) {
        if (Warehouse.contains(book)) {
            Warehouse.remove(book);
            return true;
        } else {
            System.out.println("This book is not in the Library");
            return false;
        }
    }

    public void returnBook(Book book) {
        Warehouse.add(book);
    }

    public ArrayList<Book> getBooks() {
        return Warehouse;
    }

}
