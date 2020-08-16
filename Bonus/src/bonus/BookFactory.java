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
public class BookFactory {
    private static BookFactory bookFactoryInstance = null;
    private BookFactory(){  
    }
    //Usman Khan, factory method
    public static BookFactory getInstance(){
        if(bookFactoryInstance == null){
           bookFactoryInstance = new BookFactory();
        }
        
           return bookFactoryInstance;
    } 
    public Book create(String title,double price, Author author){
        return new Book(title,price,author);
    }
}
