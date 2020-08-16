/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

/**
 *
 * @author 16476
 */
public class Demo{
    //Usman Khan, main method    
    public static void main(String[] args){
        //Usman Khan, facotry for person
        PersonFactory personFactory = PersonFactory.getInstance();
        //Usman Khan, facotry for book
        BookFactory bookFactory = BookFactory.getInstance();
        //Usman Khan, facotry for author
        Author author = (Author) personFactory.create("author", "Brad Thor", "brad.thor@authors.com", Person.Gender.MALE, "Publisher");

        AuthorView authorView = new AuthorView();
        AuthorController authorController = new AuthorController(author,authorView);
        //Usman Khan, adding books from controll
        authorController.addBook(bookFactory.create("near dark", 14.99, author));
        authorController.addBook(bookFactory.create("backlash", 8.99, author));
        authorController.addBook(bookFactory.create("The Lions of Lucerne", 12.99, author));
        authorController.addBook(bookFactory.create("spy master", 8.99, author));
        authorController.addBook(bookFactory.create("Path of the Assassin", 12.99, author));
        authorController.updateView();
    } 
}
