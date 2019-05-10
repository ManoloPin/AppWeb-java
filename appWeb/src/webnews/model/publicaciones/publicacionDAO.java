package webnews.model.publicaciones;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

//import webnews.model.publicaciones.*;

/*
 *  CONECCION A LA BASE DE DATOS Y LA TABAL PUBLICACION
 * */
public class publicacionDAO {
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
	  public static int savepublic(Publicacion e){  
		  
	        int status=0;  
	        
	        try{  
	            Connection con=publicacionDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into publicaciones(Titulo_Pu,URL) values (?,?)");
	            
	            ps.setString(1,e.getTitulo());
	            ps.setString(2,e.getUrl());  
	                    
	            status=ps.executeUpdate(); 
	               
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    } 
	  public static int save(Publicacion e){  
	        int statado=0;  
	        try{  
	            Connection con=publicacionDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "insert into publicaciones (Titulo_Pu,URL) values (?,?)"); 
	            
	            ps.setString(1,e.getTitulo());
	            ps.setString(2,e.getUrl());  
	                    
	            statado=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return statado;  
	    }
	    public static int update(Publicacion e){  
	        int status=0;  
	        try{  
	            Connection con=publicacionDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement(  
	                         "update publicaciones set Titulo_Pu=?,URL=?");    
	            ps.setString(1,e.getTitulo()); 
	            ps.setString(2,e.getUrl());  

	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static int delete(int id){  
	        int status=0;  
	        try{  
	            Connection con=publicacionDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("delete from publicaciones where ID_Publicacion=?");  
	            ps.setInt(1,id);  
	            status=ps.executeUpdate();  
	              
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return status;  
	    }  
	    public static Publicacion getEmployeeById(int id){  
	    	Publicacion e= new Publicacion();  
	          
	        try{  
	            Connection con=publicacionDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from publicaciones where ID_Publicacion=?");  
	            ps.setInt(1,id);  
	            ResultSet rs=ps.executeQuery();  
	            if(rs.next()){  
	                e.setIDNoticia(rs.getInt(1)); 
	             //   e.setCorreo_user(rs.getString(2));// porceso de cambio
	                e.setTitulo(rs.getString(2));  
	                e.setUrl(rs.getString(3)); 
	             //   e.setFecha(rs.getString(5));// proceso de cambio
	             //   e.setNComen(rs.getInt(6));
	            }  
	            con.close();  
	        }catch(Exception ex){ex.printStackTrace();}  
	          
	        return e;  
	    }  
	    public static List<Publicacion> getAllEmployees(){  
	        List<Publicacion> list=new ArrayList<Publicacion>();  
	          
	        try{  
	            Connection con=publicacionDAO.getConnection();  
	            PreparedStatement ps=con.prepareStatement("select * from publicaciones");  
	            ResultSet rs=ps.executeQuery();  
	            while(rs.next()){  
	            	Publicacion e=new Publicacion();  
	                e.setIDNoticia(rs.getInt(1));      
	                e.setTitulo(rs.getString(2));  
	                e.setUrl(rs.getString(3));
	                //e.setFecha(rs.getString(5));//porceso de cambio
	             //   e.setNComen(rs.getInt(6));
	                list.add(e);  
	            }  
	            con.close();  
	        }catch(Exception e){e.printStackTrace();}  
	          
	        return list;  
	    } 
}
