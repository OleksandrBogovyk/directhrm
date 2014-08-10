/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.domain;

import java.io.Serializable;

public class Admin implements Serializable
{
    private int id;
    
    private String adminUserName;
    
    private String adminPassword;

    public Admin(String adminUserName, String adminPassword)
    {
        this(-1, adminUserName, adminPassword);
    }
    
    public Admin(int id, String adminUserName, String adminPassword) 
    {
        this.id = id;
        this.adminUserName = adminUserName;
        this.adminPassword = adminPassword;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public void setAdminUserName(String adminUserName) 
    {
        this.adminUserName = adminUserName;
    }
    
    public void setAdminPassword(String adminPassword) 
    {
        this.adminPassword = adminPassword;
    }

    public String getAdminPassword() 
    {
        return adminPassword;
    }

    public String getAdminUserName() 
    {
        return adminUserName;
    }

    public int getId() 
    {
        return id;
    }
}
