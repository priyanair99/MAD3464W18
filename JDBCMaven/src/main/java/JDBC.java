import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 732069
 */
public class JDBC {
    static Connection conn;
    static PreparedStatement stmt;
    static ResultSet rs;
    static String USER = "root";
    static String PASS = "";
    
    
    public static void main(String [] args){
        connectDB();
        selectDB();
        insertDB();
        deleteDB();
        updateDB();
        
    }
  static void connectDB(){
      try{
          Class.forName("com.mysql.jdbc.Driver");
          conn = DriverManager.getConnection("jdbc:mysql://localhost/MADWinter18", USER, PASS);
          
      }catch(Exception e){
                  e.printStackTrace();
                  
                  }
      }
  
  static void insertDB(){ 
     try{
          stmt = conn.prepareStatement("Insert into person values(?,?,?,?)");
          stmt.setInt(1, 102);
          stmt.setString(2, "priya");
          stmt.setString(3, "nair");
          stmt.setInt(4, 23);
          
          int i=stmt.executeUpdate();
          System.out.println(i + " records inserted ");
     }
          catch(SQLException se){
                  se.printStackTrace();
                  }
      }
      
      
  
   static void selectDB(){
try{
stmt = conn.prepareStatement("Select * from Person");
rs = stmt.executeQuery();
while(rs.next()){
    System.out.println(" ID : " + rs.getInt(1) + " FirstName : " + rs.getString("Firstname") +  " Lastname : " + rs.getString("Lastname") + " Age : " + rs.getInt("Age") );
}

}
catch(SQLException e){
e.printStackTrace();
}
}
      static void deleteDB(){
        try{
            stmt = conn.prepareStatement("DELETE FROM person WHERE Id = ?");
            stmt.setInt(1, 102);
            
            int nrec = stmt.executeUpdate();
            System.out.println(nrec + " records inserted");
           
        }
        catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    static void updateDB(){
        try{
            stmt = conn.prepareStatement("UPDATE person SET Firstname = ?, Lastname = ?, Age = ? WHERE Id = ?");
            stmt.setInt(1, 103);
            stmt.setString(2, "priya");
            stmt.setString(3, "anoop");
            stmt.setInt(4, 22);
            
            
            
            int nrec = stmt.executeUpdate();
            System.out.println(nrec + " records inserted");
           
        }
        catch(SQLException e){
            e.printStackTrace();
        }        
    }
    
    static void closeDB(){
            try{
                if (conn!= null){
                    conn.close();
              
            }
            }
            catch(SQLException e){
                e.printStackTrace();;
            }
        }
    
    
}
    

