package webnews.model.publicaciones;

public class Publicacion {
	
	private int IDNoticia;
	private int Id_user;
	private String fecha;
	private String Titulo;
	private String url;
	private int NComen;
	
//	public Publicacion(int id_user, String fecha, String titulo, int iDNoticia, String descripcion, String url) {
//		Id_user = id_user;
//		this.fecha = fecha;
//		this.Titulo = titulo;
//		this.IDNoticia = iDNoticia;
//		
//		this.url = url;
//	}
	
	public int getNComen() {
		return NComen;
	}
	public void setNComen(int nComen) {
		NComen = nComen;
	}
	public int getId_user() {
		return Id_user;
	}
	public void setId_user(int id_user) {
		Id_user = id_user;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public int getIDNoticia() {
		return IDNoticia;
	}
	public void setIDNoticia(int iDNoticia) {
		IDNoticia = iDNoticia;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}

