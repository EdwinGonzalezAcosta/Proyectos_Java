package com.eclipseclothes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eclipseclothes.model.DetalleOrden;

@Repository
public interface IDetalleOrdenRepository extends CrudRepository<DetalleOrden, Integer> {
	

}
