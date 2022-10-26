/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


public class conexionJframe {
    
   public Connection conexion(){
         Connection conect = null;
    try{
Class.forName("org.gjt.mm.mysql.Driver");
conect = DriverManager.getConnection ("jdbc:mysql://localhost/edificio","root","");
}catch(Exception e){
    JOptionPane.showMessageDialog(null,"error "+e);
}
    return conect;
    }
   
    
}
