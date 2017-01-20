package trabajo_final;

import java.sql.SQLException;
import java.util.Locale;


public class Trabajo_Final {

    
  
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
      
        String pass = "";
        Mnt_Vehiculos Ventana = new Mnt_Vehiculos(pass);
        Ventana.setLocationRelativeTo(null);
        Ventana.setVisible(true);
        
        
    }
    
}
