/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author C3za1
 */
public class ConexionSQL 
{
    private static Connection conn;
    
    public static Connection getConnection()
    {
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=ConexionJavaBD", "sa", "170397");
        }
        catch(Exception e)
        {
            conn=null;
        }
        return conn;
    }
    public static void main(String[] args) 
    {
        Connection prueconn=ConexionSQL.getConnection();
        if(prueconn!=null)
        {
            System.out.println("conectado");
            System.out.println(""+prueconn);
        }
        else
        {
            System.out.println("Desconectado");
        }
    }
}
