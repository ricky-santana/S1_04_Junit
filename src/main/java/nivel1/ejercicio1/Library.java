package nivel1.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public  void addBook (Book book){
            for (Book b : this.books){
              if (b.getTitle().equals(book.getTitle())){
                  throw new RepeatedBook("Repeated book");
                }
            }
            this.books.add(book);
        }

    public List<Book> getList (){
        return this.books;
    }
    public String getTitleFromIndex(int index){
        return this.books.get(index).getTitle();
    }
    public void addBookOnIndex (Book book, int index){
        this.books.add(index, book);
    }
    public void deleteBook(String tittle){
        boolean found = false;

        for (int i = 0; i < this.books.size(); i++){
            if (this.books.get(i).getTitle().equals(tittle)){
                found = true;
                this.books.remove(i);
                break;
            }
            if(!found){
                System.out.println("El libro no existe");
            }
        }
    }

    public List<Book> orderedList(){
        List<Book> orderedList = new ArrayList<Book>(this.books);
        Collections.sort(orderedList);
        return orderedList;
    }




}
