package model;

/**
 * @author jonas
 */
public class Operation {
    private int id;
    private int id_user;
    private float amount;
    private String description;
    private String date;
    
    public Operation(){
        
    }
    
    public Operation(int id, int id_user, 
            float amount, String description, String date){
        this.id = id;
        this.id_user = id_user;
        this.amount = amount;
        this.description = description;
        this.date = date;
    }
    
    public int getId(){
        return this.id;
    }
    
    public int getUserId(){
        return this.id_user;
    } 
    
    public float getAmount(){
        return this.amount;
    }
    
    public String getDescription(){
        return this.description;
    }
    
    public void setDescription(String description){
        this.description = description;
    }

    public String getDate(){
        return this.date;
    }
}
