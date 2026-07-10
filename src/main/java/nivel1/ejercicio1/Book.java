package nivel1.ejercicio1;

import java.util.Objects;

public class Book implements Comparable<Book>{
    private final String title;


    public Book(String title) {
        this.title = title;
    }

    public String getTitle() {
        return this.title;
    }


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }

    @Override
    public int compareTo(Book o) {
        return this.getTitle().compareTo(o.getTitle());
    }
}
