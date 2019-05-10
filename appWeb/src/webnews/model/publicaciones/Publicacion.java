package webnews.model.publicaciones;

public class Publicacion {
	
	private int IDNoticia;
	//private String correo_user;
	private String fecha;
	private String Titulo;
	private String url;

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

