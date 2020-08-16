/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonus;

import java.util.List;
 /**
 *
 * @author 16476
 */
public class AuthorView {
   //Usman Khan, can see their information through here 
    public void printAuthorDetails(String name, String email,List<Book> books){
        System.out.println(name + "(" + email + ")" + "Books:");
        for(Book book : books){
            System.out.println(book.getTitle() + ", " + book.getPrice() + "$");
        }}
}
