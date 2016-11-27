package pdt;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;



public class DatabaseConnector {
    
    public Connection connect() throws SQLException, ClassNotFoundException{
        
        Connection connection = null;
        Properties properties = new Properties();
        properties.put("user", "postgres");
        properties.put("password", "postgre");
        String conn_string = "jdbc:postgresql://localhost:5432/Slovakia";
        try {
        	Class.forName("org.postgresql.Driver"); 
            connection = DriverManager.getConnection(conn_string, properties);
            System.out.println("pripojeny");
        } catch (SQLException e) {
            System.out.println("Nepripojeny");
        } 
        
        return connection;
        
    }
    
    
}