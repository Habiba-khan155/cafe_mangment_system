
package project;
import java.sql.*;
import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author xpert computers
 */
public class mysqlmodel {
  Connection con;
  Statement st;
  ResultSet rs;
  mysqlmodel(){
      try{
      Class.forName("com.mysql.cj.jdbc.Driver");
      con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe_mange_system","root","");
      st=con.createStatement();
      System.out.println("db is connected");
      }catch(Exception e){
          System.out.println(e);
      }
  }
  public ResultSet getmatchlogin(String Email,String Password){
        String sql="select*from  login where Email='"+Email+"' and Password='"+Password+"'";
          
          try{
              rs=st.executeQuery(sql);
          }catch(Exception e){
              System.out.println(e);
          }
          return  rs;
  }
       public int signin(String Name,int Phone_no,String Address,String Email,String Password){
       int status1=0;
       int status2=0;
    String sql="INSERT INTO registeration (Name,Phone_no,Address, Email, Password) VALUES ('" +Name+ "', '" +Phone_no+ "','"+Address+"','" +Email+ "','" +Password+ "') ";
    String sql2 = "INSERT INTO login (email, password) VALUES ('"+Email+"', '"+Password+"')";
             try{
               status1=st.executeUpdate(sql);
               status2=st.executeUpdate(sql2);
             }catch(Exception e){
                 System.out.println(e);
             }
            // Return 1 if both inserts succeeded, otherwise 0
    return (status1 > 0 && status2 > 0) ? 1 : 0;
         }
       public boolean checkEmailExists(String email) {
       boolean exists = false;
       String sql = "SELECT * FROM login WHERE Email = '" + email + "'";
       try {
        rs = st.executeQuery(sql);
        if (rs.next()) {
            exists = true;
        }
      } catch (Exception e) {
        System.out.println(e);
      }
      return exists;
}
        public boolean updatePassword(String Email, String Password) {
    boolean success = false;
    String sql1 = "UPDATE login SET Password = '" + Password + "' WHERE Email = '" + Email + "'";
    String sql2="UPDATE registeration SET password ='"+Password+"' WHERE Email = '"+Email+"'";
    try {
        int row1 = st.executeUpdate(sql1);
        int row2=st.executeUpdate(sql2);

        success = row1> 0|| row2>1;
          if (success) {
            System.out.println("Password updated for: " + Email);
        } else {
            System.out.println("No user found with email: " + Email);
        }
    } catch (Exception e) {
         e.printStackTrace(); // Better for debugging
        //System.out.println(e);
    }
    return success;
}
        public  int  contactus(String Name,String Email,String Message){
            int status=0;
            // Check if name and email both exist together in login table
    String sql1 = "SELECT * FROM registeration WHERE Name = '" + Name + "' AND Email = '" + Email + "'";
        // String sql1="select Name and Email from registeration where email= '"+Email+"'";
           String sql ="insert into contact(Name ,Email,Message) values ('"+Name+"','"+Email+"','"+Message+"')";
           try{
                ResultSet rs = st.executeQuery(sql1);  // Run SELECT query
        if (rs.next()) {  // If email exists in login table
            status = st.executeUpdate(sql);  
        }
           }catch(Exception e){
               System.out.println(e);
           }
            return status;
        }
        public int saveSale(String Item_name, int Quantity, double Price, double Total, String Date) {
    int status = 0;
    String sql = "INSERT INTO sales (Item_name, Quantity, Price, Total, Date) VALUES ('" +
                 Item_name + "', " + Quantity + ", " + Price + ", " + Total + ", '" + Date + "')";
    try {
        status = st.executeUpdate(sql);
    } catch (Exception e) {
        System.out.println(e);
    }
    return status;
}
       public ResultSet getsaleslist(){
          String sql="select *from sales";
      try{
         rs=st.executeQuery(sql); 
      }catch(Exception e){
          System.out.println(e);
      }
            return rs;   
        }
     
       
        
    public static void main (String[] argn){
       mysqlmodel m1=new mysqlmodel(); 
    
    }


   

   
}
