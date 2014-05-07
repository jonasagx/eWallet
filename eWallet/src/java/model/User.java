package model;

/**
 * @author jonas
 */
public class User {
    private int id;
    private String firstName;
    private String secondName;
    private String password;
    private String email;
    //Security question
    private String question;
    //Security answer
    private String answear;
    
    public User(){    }
    
    public User(int id, String firstName, 
            String secondName, String email, String question, String answer){
        this.firstName = firstName;
        this.secondName = secondName;
        this.email = email;
        this.question = question;
        this.answear = answer;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }
    
    public String getHashPassword(){
        return this.password;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public String getQuestion(){
        return this.question;
    }
    
    public void setAnswer(String answer){
        this.answear = answer;
    }
    
    public String getAnswer(){
        return this.answear;
    }
    
    public String getPassword(){
        return this.password;
    }
}
