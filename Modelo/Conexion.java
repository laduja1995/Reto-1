
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Conexion {
    Connection connection;

    public Conexion() throws ClassNotFoundException, SQLException {
        
        try {
            
        Class.forName ("com.mysql.cj.jbdc.Driver");
            connection= DriverManager.getConnection("jdbc: mysql: //localhost/admint");     
            
        
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/reto1_g56_db , root,")
            Object conection = null;
        if(conection  != null) {
            System.out.println ("conexión exitosa");
              
           } 
        }Catch   (ClassNotFoundException | SQLException e) {  
            String jdbc = null;   
          System.out.println("conexión fallida");
       
        } 
        
    }
    
    public Connection getConnection (){
        return connection;
    }
    
}
