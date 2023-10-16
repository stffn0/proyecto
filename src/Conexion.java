
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

    String bd = "Usuarios";
    String url = "jdbc:mysql://localhost:3306/";
    String user = "admin";
    String password = "admin";
    String driver = "com.mysql.cj.jdbc.Driver";
    Connection cx;

    public Conexion() {

    }
    
    public static void main(String[] args){
        Conexion conexion = new Conexion();
        conexion.conectar();
    }

    public Connection conectar() {
        try {
            Class.forName(driver);
            cx = DriverManager.getConnection(url + bd, user, password);
            System.out.println("Conexion Exitosa con BD: "+bd+" !!");
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("No se pudo conectar a bd : "+bd);
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cx;
    }
    
    public void desconectar(){
        try {
            cx.close();
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
