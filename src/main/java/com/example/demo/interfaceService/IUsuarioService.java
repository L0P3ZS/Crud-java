package com.example.demo.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.demo.modelo.Usuario;

public interface IUsuarioService {

	public List<Usuario>listar();
	public Optional<Usuario>listarId(int id);
	public int save(Usuario u);
	public void delete(int id);
	
	
}
