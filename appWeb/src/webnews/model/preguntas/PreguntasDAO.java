/**
 * 
 */
package webnews.model.preguntas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 *  CONECCION A LA TABLA PREGUTAS
 * */
public class PreguntasDAO {
	public static Connection getConnection() throws  SQLException, ClassNotFoundException{  
   	 // Initialize all the information regarding 
       // Database Connection 
       String dbDriver = "com.mysql.jdbc.Driver"; 
       String dbURL = "jdbc:mysql://localhost:3306/"; 
       // Database name to access 
       String dbName = "basedatos_web?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"; 
       String dbUsername = "root"; 
       String dbPassword = ""; 
       Class.forName(dbDriver); 
       Connection con = DriverManager.getConnection(dbURL + dbName,dbUsername,dbPassword); 
       return con;
       
   }
 public static int save(pregunta e){  
       int status=0;  
       try{  
           Connection con=PreguntasDAO.getConnection();  
           PreparedStatement ps=con.prepareStatement(  
                        "insert into preguntas(Texto) values (?)");  
           ps.setString(1,e.getTexto());
                   
           status=ps.executeUpdate();  
             
           con.close();  
       }catch(Exception ex){ex.printStackTrace();}  
         
       return status;  
   }  
   public static int update(pregunta e){  
       int status=0;  
       try{  
           Connection con=PreguntasDAO.getConnection();  
           PreparedStatement ps=con.prepareStatement(  
                        "update preguntas set Texto=?");    
           ps.setString(1,e.getTexto());   

           status=ps.executeUpdate();  
             
           con.close();  
       }catch(Exception ex){ex.printStackTrace();}  
         
       return status;  
   }  
   public static int delete(int id){  
       int status=0;  
       try{  
           Connection con=PreguntasDAO.getConnection();  
           PreparedStatement ps=con.prepareStatement("delete from publicaciones where ID_Preguntas=?");  
           ps.setInt(1,id);  
           status=ps.executeUpdate();  
             
           con.close();  
       }catch(Exception e){e.printStackTrace();}  
         
       return status;  
   }  
   public static pregunta getEmployeeById(int id){  
   	pregunta e= new pregunta();  
         
       try{  
           Connection con=PreguntasDAO.getConnection();  
           PreparedStatement ps=con.prepareStatement("select * from preguntas where ID_Preguntas=?");  
           ps.setInt(1,id);  
           ResultSet rs=ps.executeQuery();  
           if(rs.next()){  
               e.setId_pregunta(rs.getInt(1)); 
               e.setIDUsu(rs.getInt(2));// porceso de cambio
               e.setTexto(rs.getString(3));  
               // crear fecha hora
           }  
           con.close();  
       }catch(Exception ex){ex.printStackTrace();}  
         
       return e;  
   }  
   public static List<pregunta> getAllEmployees(){  
       List<pregunta> list=new ArrayList<pregunta>();  
         
       try{  
           Connection con=PreguntasDAO.getConnection();  
           PreparedStatement ps=con.prepareStatement("select * from preguntas");  
           ResultSet rs=ps.executeQuery();  
          
           while(rs.next()){  
           	pregunta e=new pregunta(); 
               e.setId_pregunta(rs.getInt(1));    
               e.setIDUsu(rs.getInt(2));  
               e.setTexto(rs.getString(3));  
               // crear fecha hora
               list.add(e);  
           }  
           con.close();  
       }catch(Exception e){e.printStackTrace();}  
         
       return list;  
   } 
}
