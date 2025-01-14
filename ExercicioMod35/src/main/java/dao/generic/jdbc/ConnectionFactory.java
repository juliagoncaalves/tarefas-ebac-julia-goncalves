package dao.generic.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    private static Connection connection;

    private ConnectionFactory(Connection connection) {
    }

    public static Connection getConnection() throws SQLException {

        if (connection == null) {
            connection = initConnection();
            return connection;
        } else if (connection.isClosed()) {
            connection = initConnection();
            return connection;
        } else {
            return connection;
        }

    }

    private static Connection initConnection() {

        try {
            // Conexão com MySQL
            return DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/vendas_online?useSSL=false&serverTimezone=UTC",
                    "root",
                    "975312"
            );
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}