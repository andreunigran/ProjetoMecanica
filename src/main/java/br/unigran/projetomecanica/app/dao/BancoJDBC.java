package br.unigran.projetomecanica.app.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BancoJDBC {
    
    private static Connection conn;
   
    private static void inicio() throws SQLException{
            conn= DriverManager.
                    getConnection("jdbc:postgresql://localhost:5432/postgres",
                            "postgres", "postgres"); 
            //conn.setAutoCommit(false);
            
    } 
    public static Connection getConn() throws SQLException{
        if(conn==null ||conn.isClosed())
            inicio();     
        return conn;
    }
}
