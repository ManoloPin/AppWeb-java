package webnews.model.comentarios;

public class comentario {
	private int Id_Comentario;
	private int id_usu;
	public int getId_usu() {
		return id_usu;
	}
	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	}
	private int IDNoticia;
	private String Descripcion;

	
//	public comentario(int id_Comentario, String titulo, int iDNoticia, String descripcion) {
//		this.Id_Comentario = id_Comentario;
//		this.Titulo = titulo;
//		this.IDNoticia = iDNoticia;
//		this.Descripcion = descripcion;
//	}
	
	
	public int getId_Comentario() {
		return Id_Comentario;
	}
	public void setId_Comentario(int id_Comentario) {
		Id_Comentario = id_Comentario;
	}
	public int getIDNoticia() {
		return IDNoticia;
	}
	public void setIDNoticia(int iDNoticia) {
		IDNoticia = iDNoticia;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	
	
	
}
