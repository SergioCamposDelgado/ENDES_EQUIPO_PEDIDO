package com.endes.resource;

public class Cliente {
	protected String nombre;
	protected String correoElectronico;
	protected String telefono;
	protected String domicilio;
	
	public Cliente () {
		
	}
	
	public Cliente (String nombre, String correoElectronico, String telefono, String domicilio ) {
		
	}
	
	public String getNombre () {
		return nombre;
	}
	
	public String getCorreoElectronico () {
		return correoElectronico;
	}
	
	public String getTelefono () {
		return telefono;
	}
	
	public String getDomicilio () {
		return domicilio;
	}
	
	public void setNombre (String nombre) {
		if (nombre == null  || nombre.isBlank()) {
			throw new IllegalArgumentException("El nombre no es valido");
		}
		
		this.nombre = nombre;
	}
	
	public void setCorreoElectronico (String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	
	public void setTelefono (String telefono) {
		this.telefono = telefono;
	}
	
	public void setDomicilio (String domicilio) {
		this.domicilio = domicilio;
	}
}
