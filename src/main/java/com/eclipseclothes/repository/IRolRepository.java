package com.eclipseclothes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.eclipseclothes.model.Rol;

@Repository
public interface IRolRepository extends CrudRepository<Rol, Integer>{

}
