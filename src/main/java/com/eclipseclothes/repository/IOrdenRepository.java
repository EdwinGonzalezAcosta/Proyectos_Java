package com.eclipseclothes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eclipseclothes.model.Orden;

@Repository
public interface IOrdenRepository extends CrudRepository<Orden, Integer>{
	

}
