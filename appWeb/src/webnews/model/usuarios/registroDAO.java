package webnews.model.usuarios;

import java.util.*;  
import java.sql.*;  
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
  
public class registroDAO {
	
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
	    
	    public static int save(user e){  
	        int status=0;  
	        try{  
	            Connection con=registroDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into usuarios(Correo,Clave) values (?,?)");  
	            ps.setString(1,e.getCorreo());
	            ps.setString(2,e.getPassword());  
	                    
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }
	    // validar
	    public static int validate(user e ) {
	    	int status =0;
	    	try {
	    		Connection con=registroDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "select * from usuarios  where Correo =? and Clave=?");
	            
	            ps.setString(1, e.getCorreo());
	            ps.setString(2, e.getPassword());
	            
	            status=ps.executeUpdate();
	            
	    	}catch(Exception ex){ex.printStackTrace();}  
	    	return status;
	    }
	    public static user validar2(user e) {
	    	
	    	try {
	    		Connection con=registroDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "select * from usuarios  where Correo =? and Clave=?");
	            

	            //ResultSet rs=ps.executeQuery();
	            
				if(e.getPassword().equalsIgnoreCase("select * from usuarios  where Correo =?")) {
					   
					ps.setString(1, e.getCorreo());
					/*ok*/
					if(e.getPassword().equalsIgnoreCase("select * from usuarios  where Clave =?")) {
						/*ok*/
						ps.setString(2, e.getPassword());
						return new user();
					}else {
						/*contraseña incorrecta*/
						user newUser= new user();
					    newUser.addError(new Error(001,"contraseña incorrecta"));
					    return newUser;
					}
				}else {
					/*email incorrecto*/
					user newUser= new user();
					 newUser.addError(new Error(001,"correo incorrecto"));
				    return newUser;
				}	
	    	}catch(Exception ex){ex.printStackTrace();}  
	    	return e;

				
		}
	    
	    
	    public static int update(user e){  
	        int status=0;  
	        try{  
	            Connection con=registroDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "update usuarios set Correo=?,Clave=?");    
	            ps.setString(1,e.getCorreo()); 
	            ps.setString(2,e.getPassword());  

	            
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static int delete(int id){  
	        int status=0;  
	        try{  
	            Connection con=registroDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from usuarios where ID_Usuario=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static user getUser(int id){  
	    	user e= new user();  
	          
	        try{  
	            Connection con=registroDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from usuarios where ID_Usuario=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                e.setId(rs.getInt(1));   
	                e.setCorreo(rs.getString(2));  
	                e.setPassword(rs.getString(3));  
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return e;  
	    }  
	    public static List<user> getAllUsers(){  
	        List<user> list=new ArrayList<user>();  
	          
	        try{  
	            Connection con=registroDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from usuarios");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	            	user e=new user();  
	                e.setId(rs.getInt(1));    
	                e.setCorreo(rs.getString(2));  
	                e.setPassword(rs.getString(3));  
	                list.add(e);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    } 
}
