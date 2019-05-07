package webnews.model.comentarios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * CONECCION A LA BASE DE DATOS TABLA COMENTARIOS 
 * */
public class ComentariosDAO {
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
	 public static int save(comentario e){  
	       int status=0;  
	       try{  
	           Connection con=ComentariosDAO.getConnection();  
	           PreparedStatement ps=con.prepareStatement(  
	                        "insert into comentarios(Desc_coment) values (?)");  
	           ps.setString(1,e.getDescripcion());
	                   
	           status=ps.executeUpdate();  
	             
	           con.close();  
	       }catch(Exception ex){ex.printStackTrace();}  
	         
	       return status;  
	   }  
	   public static int update(comentario e){  
	       int status=0;  
	       try{  
	           Connection con=ComentariosDAO.getConnection();  
	           PreparedStatement ps=con.prepareStatement(  
	                        "update comentairos set Desc_coment=?");    
	           ps.setString(1,e.getDescripcion());   

	           status=ps.executeUpdate();  
	             
	           con.close();  
	       }catch(Exception ex){ex.printStackTrace();}  
	         
	       return status;  
	   }  
	   public static int delete(int id){  
	       int status=0;  
	       try{  
	           Connection con=ComentariosDAO.getConnection();  
	           PreparedStatement ps=con.prepareStatement("delete from comentarios where ID_Comentarios=?");  
	           ps.setInt(1,id);  
	           status=ps.executeUpdate();  
	             
	           con.close();  
	       }catch(Exception e){e.printStackTrace();}  
	         
	       return status;  
	   }  
	   public static comentario getEmployeeById(int id){  
	   	comentario e= new comentario();  
	         
	       try{  
	           Connection con=ComentariosDAO.getConnection();  
	           PreparedStatement ps=con.prepareStatement("select * from Comentaeios where ID_Comentarios=?");  
	           ps.setInt(1,id);  
	           ResultSet rs=ps.executeQuery();  
	           if(rs.next()){  
	               e.setId_Comentario(rs.getInt(1)); 
	               e.setId_usu(rs.getInt(2));// porceso de cambio
	               e.setIDNoticia(rs.getInt(3));
	               e.setDescripcion(rs.getString(4));  
	               // crear fecha hora
	           }  
	           con.close();  
	       }catch(Exception ex){ex.printStackTrace();}  
	         
	       return e;  
	   }  
	   public static List<comentario> getAllEmployees(){  
	       List<comentario> list=new ArrayList<comentario>();  
	         
	       try{  
	           Connection con=ComentariosDAO.getConnection();  
	           PreparedStatement ps=con.prepareStatement("select * from comentarios");  
	           ResultSet rs=ps.executeQuery();  
	          
	           while(rs.next()){  
	           	comentario e=new comentario(); 
	               e.setId_Comentario(rs.getInt(1));    
	               e.setId_usu(rs.getInt(2));  
	               e.setIDNoticia(rs.getInt(3));
	               e.setDescripcion(rs.getString(4));
	               // crear fecha hora
	               list.add(e);  
	           }  
	           con.close();  
	       }catch(Exception e){e.printStackTrace();}  
	         
	       return list;  
	   } 
}
