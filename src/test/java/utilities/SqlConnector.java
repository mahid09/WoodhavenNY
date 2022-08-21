package utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

import java.sql.*;

public class SqlConnector {
    private static final String userName = ReadConfigFiles.getPropertyValues("DbUser");
    private static final String password = ReadConfigFiles.getPropertyValues("DbPassword");
    private static final String databaseName = ReadConfigFiles.getPropertyValues("DbName");
    private static final String Url = String.format("jdbc:postgresql://localhost:5432/%s", databaseName);

    private static final Logger LOGGER = LogManager.getLogger(SqlConnector.class);

    /**
     * Connect to the postgresSQL database
     * @return a connection object
     */

    private static Connection connect(){
        Connection conn = null;
        try {
          conn = DriverManager.getConnection(Url,userName,password);
          LOGGER.info("Successfully Connected to the DataBase");

        } catch (SQLException e) {
            LOGGER.error("SQL Connection Exception: " + e.getMessage());
        }
        return conn;
    }

    /**
     * Reading Data from Database
     * @param sqlQuery is the parameter to pass the query
     * @return a ResultSet object
     * @throws SQLException
     */
    public static ResultSet readData(String sqlQuery) throws SQLException {
        ResultSet rs = null;
        Connection conn = null;
        try {
            conn = connect();
            Statement stmt = conn.createStatement();
            rs = stmt.executeQuery(sqlQuery);
        } catch (SQLException e) {
            LOGGER.error("SQL ResultSet Exception: " + e.getMessage());
        } finally {
            conn.close();
        }
        return rs;
    }
}
