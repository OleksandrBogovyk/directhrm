/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package directhrm.db.login;


/**
 *
 * @author ABogovik
 */
public class DbLoginManager {
    public int opstatus;
    
    public int DbLoginTo(String logname, String logpassword) {
        if (logname.isEmpty() && logpassword.isEmpty()) {
            opstatus = 1;
            //Check
            System.out.println(logname+" "+logpassword);
            return opstatus;
        }
        return 0;
          
    
    }
    
}

    /*
    public String logname, logpassword, loghost, logport;
    
    public void setName(String newname) {
        this.logname = newname;
    }
    
    public void setPassword(String newpass) {
        this.logpassword = newpass;
    }
    
    public void setDb(String newdb) {
        this.loghost = newdb;
    }
    
    public void setPort(String newport) {
        this.logport = newport;
    }
    */
    
    /*
    public void logInto(String logname, String logpassword, String loghost, String logport) throws SQLException {
                try {
        Class.forName("com.mysql.jdbc.Driver").newInstance();
        String URL = "jdbc:mysql://"+this.loghost+":"+this.logport+"/hrms";
        Connection conn = (Connection) DriverManager.getConnection(URL,this.logname,this.logpassword);
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("SELECT name FROM admin_tb");
        while(rst.next()){
                String name = rst.getString("name");
                System.out.println(name);
            }
            stm.close();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException ex) {
            System.out.println(ex);
        }
    */

