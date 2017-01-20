package trabajo_final;


import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conectar {

    private String URL = "jdbc:mysql://localhost/registro_vehiculos";
    private String Driver = "com.mysql.jdbc.Driver";
    private String User = "root";
    private String Pass = "";
    private Connection conexion;
    
    public Conectar(){
        
    }
        
    public void Abrir() throws SQLException, ClassNotFoundException{
       
        try{
            
            Class.forName(Driver);
            
            conexion = (Connection) DriverManager.getConnection(URL, User, Pass);
            
        }catch (Exception error){
            
            JOptionPane.showMessageDialog(null,"Error en la conexion" + error);
        }
               
    }
    
    public void Cerrar() throws SQLException{
        
        conexion.close();
                
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
}
