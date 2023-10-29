package com.eclipseclothes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eclipseclothes.model.DetalleOrden;
import com.eclipseclothes.repository.IDetalleOrdenRepository;

@Service
public class DetalleOrdenService implements IDetalleOrdenService {

	@Autowired 
	private IDetalleOrdenRepository detalleOrdenRepository;
	
	@Override
	public List<DetalleOrden> listar() {
		
		return (List<DetalleOrden>)detalleOrdenRepository.findAll();
	}



	

}
