package com.endes.resource;

public class Categoria {
		protected String nombre;
		
		//constructor vacio
		public Categoria() {
			
		}
		
		/**
		 * 
		 * @param nombre: nombre de la categroia 
		 */
		public Categoria(String nombre) {
			this.nombre = nombre;
		}
		
		/**
		 * 
		 * @return: devuelve el nombre de la categoria
		 */
		public String getNombre() {
			return nombre;
		}
		
		/**
		 * 
		 * @param nombre: nombre de la categoria
		 */
		public void setNombre(String nombre) {
			if (nombre == null || nombre.isBlank()) {
				throw new IllegalArgumentException("El nombre no es válido");
			}
			this.nombre = nombre;
		}
}
