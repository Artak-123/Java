import java.util.ArrayList;
import java.util.List;

public class Students {
    private String Name;
    private List <Book> books;
    public void read() {
        System.out.println(this.Name + " is reading " + this.books);
    }
    public Students (String Name){
        this.Name = Name;
        books = new ArrayList<Book>();
    }

    public String getName() {
        return Name;
    }

    public List<Book> getBooks() {
        return books;
    }
    public void addBooks (Book book) {
        books.add(book);
    }
    public void removeBook (Book book) {
        books.remove(book);
    }
}
