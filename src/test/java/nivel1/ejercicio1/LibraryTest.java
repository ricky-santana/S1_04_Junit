package nivel1.ejercicio1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class LibraryTest {
   private Library library;

    @BeforeEach
    void init(){
        List<Book> books = new ArrayList<>();
        assertNotNull(books);
        library = new Library();
        library.addBook(new Book("AAa"));
        library.addBook(new Book("BBb"));
        library.addBook(new Book("AZz"));
    }
    @Test
    void notNullInstaces (){
        List<Book> emptyList = new ArrayList<>();
        Library emptyLibrary = new Library();
        assertNotNull(emptyList);
        assertNotNull(emptyLibrary);
    }

    @Test
    void addBookTest (){
        Book libroTest = new Book ("Testbook");

        library.addBook(libroTest);

        assertEquals(4, library.getList().size(), "El tamaño debería ser 4");
        assertEquals("Testbook", library.getList().getLast().getTitle(), "El título debería coincidir");
    }
    @Test
    void shouldNotAddDuplicateBook(){
        Book repeated = new Book ("AAa");

        assertThrows(RepeatedBook.class, () -> {
            library.addBook(repeated);
        }, "Debería lanzar RepeatedBook al intentar añadir un duplicado");
    }
    @Test
    void getThisList() {
        Library expectedList = new Library();
        expectedList.addBook(new Book("AAa"));
        expectedList.addBook(new Book("BBb"));
        expectedList.addBook(new Book("AZz"));

        assertEquals(expectedList.getList().size(), library.getList().size(), "El tamaño debería ser 3");
        for (int i = 0; i < library.getList().size(); i++) {
            assertEquals(expectedList.getList().get(i), library.getList().get(i), "El primer libro debería tener este título");
        }
    }
    @Test
    void getTitleFromIndexTest(){
        Library expectedList = new Library();
        expectedList.addBook(new Book("AAa"));
        expectedList.addBook(new Book("BBb"));
        expectedList.addBook(new Book("AZz"));

        for (int i = 0; i < library.getList().size(); i++) {
            assertEquals(expectedList.getList().get(i), library.getList().get(i), "El primer libro debería tener este título");
        }
    }
    @Test
    void adBookOnIndexTest(){
        Book testBook = new Book("Test inserción");
        Library expectedList = new Library();
        expectedList.addBook(new Book("AAa"));
        expectedList.addBook(new Book("BBb"));
        expectedList.addBook(new Book("AZz"));

        expectedList.getList().add(1, testBook);
        library.addBookOnIndex(testBook,1);

        assertEquals(expectedList.getList().size(), library.getList().size());
        assertEquals(expectedList.getList().get(1).getTitle(), library.getTitleFromIndex(1));
        assertEquals(expectedList.getList(),library.getList());

    }
    @Test
    void deleteBookTest(){
        library.deleteBook("AAa");

        assertEquals(2, library.getList().size());
        assertNotNull(library.getList().getFirst());

        for (Book b : library.getList()){
            assertNotEquals("AAa", b.getTitle());
        }
    }
    @Test
    void orderedListTest(){
        Library expectedList = new Library();
        expectedList.getList().add(new Book("AAa"));
        expectedList.getList().add(new Book("AZz"));
        expectedList.getList().add(new Book("BBb"));
        List<Book> orderedList = library.orderedList();

        assertEquals(expectedList.getList().size(), orderedList.size());
        for (int i = 0; i < orderedList.size(); i++){
            Book expectedTitle = expectedList.getList().get(i);
            Book libraryTitle = orderedList.get(i);
            assertEquals(expectedTitle.getTitle(), libraryTitle.getTitle());
        }
    }


}
