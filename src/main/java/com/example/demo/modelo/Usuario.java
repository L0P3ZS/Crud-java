package com.example.demo.modelo;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usuarios")
public class Usuario {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
	    
		private String name;
		private String lastname;
		private String username;
		private String password;
		private String email;
		
		public Usuario() {
			
		}

		public Usuario(int id, String name, String lastname, String username, String password, String email) {
			super();
			this.id = id;
			this.name = name;
			this.lastname = lastname;
			this.username = username;
			this.password = password;
			this.email = email;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getLastname() {
			return lastname;
		}

		public void setLastname(String lastname) {
			this.lastname = lastname;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}
		
}
