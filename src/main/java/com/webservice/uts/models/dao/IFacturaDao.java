package com.webservice.uts.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.webservice.uts.models.entites.Factura;

public interface IFacturaDao  extends CrudRepository<Factura, Long>{

}
