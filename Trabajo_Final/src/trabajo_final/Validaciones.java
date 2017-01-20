package trabajo_final;

import java.sql.PreparedStatement;
import java.sql.ResultSet;


public class Validaciones {
    

     public boolean Validar_Rut(String xRut){
        int digito = 0;
        int factor = 2;
        int suma = 0; 
        
      for(int i = xRut.length() - 3; i >= 0;i--){       
                
             suma = suma + factor * (Integer.parseInt(xRut.substring(i, i +1)));
             factor++;
             if(factor > 7)
             factor = 2; 
                }
             digito =  (11 - (suma % 11));                
       
            if(digito == 11)
                digito = 0; 
            
            if(digito == 10 && (xRut.substring(xRut.length() - 1).equalsIgnoreCase("K")))
                return true;
            else 
                if(digito != 10 && (xRut.substring(xRut.length() - 1).equalsIgnoreCase("K")))
                return false;
            else 
                if(digito == (Integer.parseInt(xRut.substring(xRut.length() - 1))))
                return true;
            
            else  return false;
            
    }

}
