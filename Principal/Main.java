
package Principal;
import Vistas.*;
import Modelo.*;
import java.sql.SQLException;


public class Main {

   
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        
        Conexion conexionDB = new Conexion ();
        Login login = new  Login ();
        login.setVisible(true);
      
    }
    
}
 