package com.example.demo.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="masc")
public class Mascota {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String nombre;
		private String raza;
		
		public Mascota() {
			
		}

		public Mascota(int id, String nombre, String raza) {
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
@Service
public class InnerMascota {

	private Set<Mascota> mascotas = new HashSet<>();
    
    public Set<Mascota> findAll() {
        return mascotas;
    }

	    // // Método para mostrar las mascotas por consol
		// public void mostrarMascotas() {
		// 	System.out.println("Lista de Mascotas:");
		// 	for (Mascota mascota : mascotas) {
		// 		System.out.println(mascota.getNombre()); // Suponiendo que Mascota tiene un método getNombre() para obtener el nombre.
		// 	}
		// }
	
}
}
