
package Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class citasRepository {
      
    private String user = "root";
    private String password = "12345";
    private String DB_name = "examen_consultorio";
    private String host = "localhost";
    
    private Connection conectar = null;
    
    private final String URL = "jdbc:mysql://" + host + ":3306/" + DB_name + "?serverTimezone=UTC";

    public citasRepository() {
    }

    public Connection obtener_conexion() {
        try {
            conectar = DriverManager.getConnection(URL, user, password);
        } catch (SQLException ex) {
            System.out.println("Error al intentar conectarse a la base de datos!! " + ex);
        }
        if (conectar != null) {
            System.out.println("Conectado a la base de datos....");
        }
        return conectar;
    }
}
