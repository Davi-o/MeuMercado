package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author Davi Alves, Kerollyn Lopes
 * @version 0.1 Beta
 * @since 08/04/2019
 */
public class DBConnection {

    private static String url = "jdbc:mysql://localhost:3306/estoque?useTimezone=true&serverTimezone=UTC";
    private static String user = "root";
    private static String password = "root";

    public static Connection createConnection() throws SQLException {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, user, password);
        } catch (SQLException se) {
            throw new SQLException("Erro ao conectar! " + se.getMessage());
        }
        return connection;
    }
}
