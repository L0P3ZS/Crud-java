package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.interfaceService.IUsuarioService;
import com.example.demo.modelo.Usuario;


@RestController
@Controller
@RequestMapping("/usuarios")
public class Controlador {
	
	@Autowired
	private IUsuarioService service;
	
	@GetMapping()
	@ResponseBody
	public List<Usuario> listar(Model model) {
		return service.listar();
	}
	
	/*
	@PostMapping()
	public String save(@Validated Usuario u,  Model model) {
		service.save(u);
		return null;
	}
	*/
	/*
	   @PostMapping("/usuarios/save")
	    public String save(@RequestParam("name") String name, 
	                       @RequestParam("email") String email,
	                       @RequestParam("username") String username,
	                       @RequestParam("password") String password,
	                       @RequestParam("lastname") String lastname) {
	      
	        Usuario u = new Usuario();
	        u.setName(name);
	        u.setEmail(email);
	        u.setUsername(username);
	        u.setPassword(password);
	        u.setLastname(lastname);
	   
	        
	        service.save(u); 
	        
	        return "redirect:/usuarios";
	    }*/
	   
	 @PostMapping()
	    public String save(@Validated @RequestBody Usuario u) {
	        service.save(u); // Guardar el usuario
	        return "Guardado exitosamente";
	    }
	
	@GetMapping("/update/{id}")
	public String update(@PathVariable int id,  Model model) {
		Optional<Usuario>usuario = service.listarId(id);
		model.addAttribute("usuario", usuario);
		return "redirect:/usuarios";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/listar";
	}
}
