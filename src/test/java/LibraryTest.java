import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;
    private Borrower borrower;

    @Before
    public void setUp(){
        library = new Library();
        book = new Book("The Color Of Magic", "Terry Pratchett", "Fantasy");
        borrower = new Borrower();
    }

    @Test
    public void libraryIsEmptyToBegin(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void libraryCanAddBook(){
        library.addBook(book);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void libraryCantPassCapacity(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(2, library.countBooks());
    }

    @Test
    public void libraryCanLendBookToBorrower(){
        library.addBook(book);
        borrower.borrowBook(library);
        assertEquals(0, library.countBooks());
        assertEquals(1, borrower.countBooks());
    }

}
