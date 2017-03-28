package bdd;




import java.sql.*;

public class Cobdd{
//CTRL + SHIFT + O pour générer les imports
public static void main(String args[]) {

}
    Connection con;
  public Cobdd() {
     
    try {
        Class.forName("com.mysql.jdbc.Driver");
    }
    catch(ClassNotFoundException e)
    {
        System.err.println(e);
    }
      
    try{
        /*con=DriverManager.getConnection("jdbc:mysql://192.168.176.15:3306/idologis","julien","root");*/
        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bddIdologis","root","root");
      }
    catch(SQLException e){
        System.err.println(e);
      }
  }
     public Connection obtenirconnexion()
             {
                 return con;
             }
    } 
    

