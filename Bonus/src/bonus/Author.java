/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author 16476
 */
//Usman Khan, author is extended to person which is a  abstract class
public class Author extends Person{
    private List books = new ArrayList<>();
    //Usman Khan, =adding a this to name, email, gender and pubName
    public Author(String name, String email, Gender gender,
            String pName){
        this.name = name;
        this.email = email;
        this.gender = gender;
        this.publisherName = pName;
    }
    public void addBook(Book book){
        books.add(book);
    }
    public List<Book> getBooks() {
        return books;
    }
}