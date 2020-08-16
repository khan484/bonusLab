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
public class Book {
    private String title;
    private double price;
    private Author author;
    //Usman Khan, constructor for title, price and author
    public Book(String title, double price, Author author){
        this.title = title;
        this.price = price;
        this.author = author;
    }
    public void setTitle(String t){
        title = title;
    }
    public void setPrice(int p){
        price = price;
    }
    public void setAuthor(Author a){
        author = author;
    }
    //Usman Khan, rest are return value for title, price and author
    public String getTitle(){
        return title;
    }
    public double getPrice(){
        return price;
    }
    public Author getAuthor(){
        return author;
    }
}
