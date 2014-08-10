/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.persist.dao;

import directhrm.persist.DbConnectionFactory;
import directhrm.domain.Admin;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class AdminDao 
{
    private static AdminDao instance;

    private AdminDao() 
    {
    }
    
    public static AdminDao getInstance() 
    {
        if (instance == null)
        {
            instance = new AdminDao();
        }
        return instance;
    }
    
    public Admin getById(int id)
    {
        Admin admin = null;
        Connection connection = null;
        PreparedStatement prepareStatement = null;
        try 
        {
            connection = getDbConnection();
            String sql = "SELECT * FROM hrm.admin where id = ?";
            prepareStatement = connection.prepareStatement(sql);
            prepareStatement.setInt(1, id);
            ResultSet result = prepareStatement.executeQuery();
            while(result.next())
            {
                String userName = result.getString(2);
                String password = result.getString(3);
                admin = new Admin(id, userName, password);
            }
        }
        catch (SQLException ex) 
        {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            closeStatement(prepareStatement);
            closeConnection(connection);
        }        
        return admin;
    }
    
    public Admin getByUserName(String userName)
    {
        Admin admin = null;
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try
        {
            connection = getDbConnection();
            String sql = "SELECT * FROM hrm.admin where admin_username= ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, userName);
            ResultSet result = preparedStatement.executeQuery();
            while (result.next())
            {
                int id = result.getInt(1);
                String password = result.getString(3);
                admin = new Admin(id, userName, password);
            }
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            closeStatement(preparedStatement);
            closeConnection(connection);
        }
        return admin;
    }
    
    public void create(Admin admin)
    {        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try
        {
            connection = getDbConnection();
            String sql = "insert into hrm.admin (admin_username, admin_password) values(?, ?)";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, admin.getAdminUserName());
            preparedStatement.setString(2, admin.getAdminPassword());
            preparedStatement.executeUpdate();
        } 
        catch (SQLException ex) 
        {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            closeStatement(preparedStatement);
            closeConnection(connection);
        }
     }
    
    public void deleteById(int id)
    {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try
        {
            connection = getDbConnection();
            String sql = "delete FROM hrm.admin where id = ?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            
        }
        catch (SQLException ex)
        {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        finally
        {
            closeStatement(preparedStatement);
            closeConnection(connection);
        }
    }
    
    private Connection getDbConnection()
    {
        return DbConnectionFactory.getInstance().getConnection();
    }
    
    private void closeStatement(PreparedStatement statement)
    {
        try
        {
            if (statement != null)
            {
                statement.close();
            }
        }
        catch (SQLException e)
        {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, e);            
        }
    }
    
    private void closeConnection(Connection connection)
    {
        try
        {
            if (connection != null)
            {
                connection.close();
            }   
        }
        catch (SQLException e)
        {
            Logger.getLogger(AdminDao.class.getName()).log(Level.SEVERE, null, e);          
        }       
    }
}
