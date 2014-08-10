/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.persist;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DbConnectionFactory 
{
    private static DbConnectionFactory instance;
    
    private final String driverClassName = "com.mysql.jdbc.Driver";
    private final String databasePath = "jdbc:mysql://localhost:3306/hrm";
    private final String userName = "root";
    private final String password = "root";

    public static DbConnectionFactory getInstance() 
    {
        if (instance == null)
        {
            instance = new DbConnectionFactory();
        }
        return instance;
    }

    private DbConnectionFactory() 
    {
        try
        {
            Class.forName(driverClassName);
        }
        catch (ClassNotFoundException e)
        {
            Logger.getLogger(e.getMessage()).log(Level.SEVERE, null, e);            
        }
    }
    
    public Connection getConnection()
    {
        Connection connection = null;
        try 
        {
            connection = DriverManager.getConnection(databasePath, userName, password);
        } catch (SQLException ex) 
        {
            Logger.getLogger(DbConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
