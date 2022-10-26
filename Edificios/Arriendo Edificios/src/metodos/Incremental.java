
package metodos;

import metodos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Usuario
 */
public class Incremental {
    
    public int id_incrementable(){
    
    int id = 1;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion db = new Conexion();
    try{
    ps = db.conexion().prepareStatement("SELECT MAX(ID) FROM edificios");
    rs = ps.executeQuery();
    while(rs.next())
        id = rs.getInt(1) + 1;
    
    }catch(Exception e){
    
    System.out.println("error"+e.getMessage());
    }
        return id;
    }            
     
          
     
   //-------------------------------------------------------------------------------------------------------------------   
    
     public int id_incrementableCON(){
    
    int id = 1;
    PreparedStatement ps = null;
    ResultSet rs = null;
    Conexion db = new Conexion();
    try{
    ps = db.conexion().prepareStatement("SELECT MAX(ID_Contrato) FROM contrato");
    rs = ps.executeQuery();
    while(rs.next())
        id = rs.getInt(1) + 1;
    
    }catch(Exception e){
    
    System.out.println("error"+e.getMessage());
    }
        return id;
    }    
     
}