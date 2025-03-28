package com.endes.resource;

public class Resenha {
	protected int id;
	protected String comentario;
	protected int puntuaje;
	
	//Constructor vacío
	public Resenha() {
		
	}
	/**
	 * 
	 * @param id: identificador de la reseña
	 * @param comentario: el usuario cuenta su experiencia con el producto
	 * @param puntuaje: dice si la reseña ha sido buena o mala
	 */
	public Resenha(int id, String comentario, int puntuaje){
		this.id=id;
		this.comentario=comentario;
		this.puntuaje=puntuaje;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		if(id < 0) {
			throw new IllegalArgumentException("El id no puede ser negativo");
		}
		this.id=id;
	}
	
	public String getComentario() {
		return comentario;
	}
	
	public void setComentario(String comentario) {
		this.comentario=comentario;
	}
	
	public int getPuntuaje() {
		return puntuaje;
	}
	
	public void setPuntuaje(int puntuaje) {
		this.puntuaje=puntuaje;
	}
}
