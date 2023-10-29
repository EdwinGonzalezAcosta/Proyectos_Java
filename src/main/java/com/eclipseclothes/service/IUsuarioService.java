package com.eclipseclothes.service;

import java.util.List;

import com.eclipseclothes.model.Usuario;

public interface IUsuarioService {
	
	Usuario crear(Usuario usuario);
	Usuario actualizar(Usuario usuario);
	
	void eliminar(Integer id);
	
	Usuario obtener(Integer id);
	
	List<Usuario> listar();

}
