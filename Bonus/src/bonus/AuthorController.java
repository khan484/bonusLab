
package bonus;

public class AuthorController {
/**
 *
 * @author 16476
 */
    private Author model;
    AuthorView view;
    //Usman Khan, adding this to model and view
    public AuthorController(Author model, AuthorView view){
        this.model = model;
        this.view = view;
    }
    public void updateView(){
        view.printAuthorDetails(model.getName(), model.getEmail(), model.getBooks());
    }
    public void addBook(Book book){
        model.addBook(book);
    }
    //Usman Khan, these are getters for, name, email, gender and publisher
    public String getAuthorName(){
        return model.getName();
    }
    public String getAuthorEmail(){
        return model.getEmail();
    }
    public Person.Gender getAuthorGender(){
        return model.getGender();
    }
    public String getAuthorPublisher(){
        return model.getPublisherName();
    }
    //Usman Khan, the rest will be setters, setting values for name, email, gender and publisher
    public void setAuthorName(String name){
        model.setName(name);
    }
    public void setAuthorEmail(String email){
        model.setEmail(email);
    }
    public void setAuthorGender(Person.Gender gender){
        model.setGender(gender);
    }
    public void setAuthorPublisher(String publisher){
        model.setPublisherName(publisher);
    }
    
}

