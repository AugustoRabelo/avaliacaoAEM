package connections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnection() throws SQLException {
        String url = "jdbc:mysql://localhost/";
        String db = "avaliacao";
        String options = "?useTimezone=true&serverTimezone=UTC";
        return DriverManager.getConnection(url + db + options, "root", "root");
    }
}