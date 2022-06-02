
package conexao;

import java.sql.*;
import java.util.logging.*;



/**
 *
 * @author marcosfilipi
 */
public class ConexaoBD {

    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/barbasbank?zeroDateTimeBehavior=CONVERT_TO_NULL";
    private static final String USER = "barbas";
    private static final String PASS = "";
    



   public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão", ex);
        }
    }
    
    public static void closeConnection (Connection con){
        try{
            if(con!=null) 
              con.close();
        }catch(SQLException ex){
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void closeConnection (Connection con, PreparedStatement stmt){
        closeConnection(con);
        try{
            if(stmt!=null)
                stmt.close();
        }catch(SQLException ex){
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public static void closeConnection (Connection con, PreparedStatement stmt, ResultSet rs){
        closeConnection(con, stmt);
        try{
            if(stmt!=null)
                rs.close();
        }catch(SQLException ex){
            Logger.getLogger(ConexaoBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
