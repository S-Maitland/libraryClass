import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books;
    private int capacity;

    public Library() {
        this.books = new ArrayList<Book>();
        this.capacity = 2;
    }

    public int countBooks() {
        return this.books.size();
    }

    public void addBook(Book book) {
        if(this.books.size() < capacity) {
        this.books.add(book);
    }
    }

    public Book removeBook() {
        Book bookRemoved = this.books.remove(0);
        return bookRemoved;
    }
}
