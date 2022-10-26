
package metodos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    Connection conect = null;
    public Connection conexion(){
    try{
Class.forName("org.gjt.mm.mysql.Driver");
conect = DriverManager.getConnection ("jdbc:mysql://localhost/edificios","root","");
}catch(Exception e){
    JOptionPane.showMessageDialog(null,"error "+e);
}
    return conect;
    }
}
