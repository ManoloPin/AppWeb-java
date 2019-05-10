package webnews.model.usuarios;

//import java.util.ArrayList;
//import java.util.List;

public class user {
	private int Id;
	private String Correo;
	private String Password;
//    private List<Error> errors;
    
//    private user(String Correo, String Password) {
//        this.Correo = Correo;
//        this.Password = Password;
//        errors = new ArrayList<Error>();
//    }

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCorreo() {
		return Correo;
	}

	public void setCorreo(String correo) {
		Correo = correo;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}
//	
//	 public void addError(Error error){
//	        errors.add(error);
//	    }
//	    
//	    public boolean errorExist(){
//	        return !errors.isEmpty();
//	    }
//
//	    public List<Error> getErrors() {
//	        return errors;
//	    }
//	

}

