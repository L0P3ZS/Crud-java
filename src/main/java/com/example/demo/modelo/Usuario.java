package com.example.demo.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="masc")
public class Usuario {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	    
		private String nombre;
		private String raza;
		
		public Usuario() {
			
		}

		public Usuario(int id, String nombre, String raza) {
			super();
			this.id = id;
			this.nombre = nombre;
			this.raza = raza;
			
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public String getRaza() {
			return raza;
		}

		public void setRaza(String raza) {
			this.raza = raza;
		}

		
		
}
