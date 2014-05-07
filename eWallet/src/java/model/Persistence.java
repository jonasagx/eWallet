package model;

import com.mongodb.*;
import java.net.UnknownHostException;
import java.util.Arrays;

/**
 * @author jonas
 * 
 * Classe responsável pelo acesso aos dados para leitura e escrita.
 *
 * Essa classe possui:
 * - conexão com banco
 * - transforma objetos java em tuplas
 * - transforma tuplas do banco em objetos Java
 */
public class Persistence {
    
    private Mongo con;
    
    private Persistence() throws UnknownHostException{
        if(con == null){
            con = new Mongo("localhost", 27017);
        }
        
    public Mongo getInstance(){
        return this.con;
    }
    
    }
}
