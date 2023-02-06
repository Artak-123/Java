public class Book {
    private String Name;
    private String Author;
    public Book(String Name, String Author){
        this.Name = Name;
        this.Author = Author;
    }

    public String getName() {
        return Name;
    }

    public String getAuthor() {
        return Author;
    }

    public void setName(String name) {
        Name = name;
    }

    public void setAuthor(String author) {
        Author = author;
    }
}