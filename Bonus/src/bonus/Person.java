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
public abstract class Person {
    //Usman Khan, enum for gender and protecting the name, email, gender, string
    public enum Gender{MALE,FEMALE};
    protected String name;
    protected String email;
    protected Gender gender;
    protected String publisherName;
    //Usman Khan, returning name, email, gender, pname
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public Gender getGender(){
        return gender;
    }
    public String getPublisherName(){
        return publisherName;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public void setGender(Gender gender){
        this.gender = gender;
    }
    
    public void setPublisherName(String publisherName){
        this.publisherName = publisherName;
    }   
}
