package com.eclipseclothes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclipseclothes.model.Usuario;
import com.eclipseclothes.repository.IUsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

	@Autowired
	private IUsuarioRepository usuarioRepository;
	
	@Override
	public Usuario crear(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	@Override
	public Usuario actualizar(Usuario usuario) {
		return usuarioRepository.save(usuario);
	}
	
	
	@Override
	public Usuario obtener(Integer id) {
		Optional<Usuario> optional = usuarioRepository.findById(id);
		
		return (optional.isPresent()) ? optional.get() : null;
	}
	
	@Override
	public List<Usuario> listar(){
		return (List<Usuario>) usuarioRepository.findAll();
	}

	@Override
	public void eliminar(Integer id) {
		usuarioRepository.deleteById(id);
		
	}

}
