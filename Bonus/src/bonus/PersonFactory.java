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
public class PersonFactory{
    private static PersonFactory personFactoryInstance = null;
    private PersonFactory(){
    }
    //Usman Khan, Singleton Class
    public static PersonFactory getInstance(){
        if(personFactoryInstance == null){
           personFactoryInstance = new PersonFactory();
        }
           return personFactoryInstance;}
    //Usman Khan, Factory method
    public Person create(String type, String name, String email,Person.Gender gender,
            String publisherName){
        if(type.equalsIgnoreCase("AUTHOR")){
            return new Author(name,email,gender,publisherName);}   
        return null;}
}
