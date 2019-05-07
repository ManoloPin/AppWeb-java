package webnews.model.preguntas;

public class pregunta {
	
	private int Id_pregunta;
	private int IDUsu;
	private String Texto;
	
	
	public int getId_pregunta() {
		return Id_pregunta;
	}
	public void setId_pregunta(int id_pregunta) {
		Id_pregunta = id_pregunta;
	}
	public int getIDUsu() {
		return IDUsu;
	}
	public void setIDUsu(int iDUsu) {
		IDUsu = iDUsu;
	}
	public String getTexto() {
		return Texto;
	}
	public void setTexto(String texto) {
		Texto = texto;
	}
	
	
	
//	public pregunta(int id_pregunta, String titulo, int iDNoticia, String descripcion) {
//		
//		this.Id_pregunta = id_pregunta;
//		this.Titulo = titulo;
//		this.IDNoticia = iDNoticia;
//		this.descripcion = descripcion;
//	}
	
}
