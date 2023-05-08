package bdr;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/tienda";
        try {
            //Enlazar con el driver
            Class.forName("org.mariadb.jdbc.Driver");

            Connection con = DriverManager.getConnection(url, "antonio", "antonio");
            Statement stm = con.createStatement();
            //TODO consultas

            stm.close();
            con.close();
        } catch (SQLException e) {
            System.err.println("Ha fallado la conexion: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
