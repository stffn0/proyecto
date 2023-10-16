
import java.sql.*;
public class Conexion {
  
    public static Connection obtenerConexion(){
        String url="jbdc:sqlserver://localhost:1433;"
                +"database=usuarios;"
                +"user=sa;"
                +"password=12345;";
        
        try {
        Connection con = DriverManager.getConnection(url);
        return con;
        } catch (SQLException ex){
            System.out.println(ex.toString());
            return null;
        }
    }
}
