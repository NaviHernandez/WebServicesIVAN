package com.webservice.uts.models.services;

import java.util.List;

import com.webservice.uts.models.entites.Cliente;
import com.webservice.uts.models.entites.Factura;
import com.webservice.uts.models.entites.Producto;
import com.webservice.uts.models.entites.Region;

public interface IClienteService {
	
	public	List<Cliente> findAll();
	
	public 	Cliente findById(Long id);
	
	public 	Cliente save(Cliente cliente);
	
	public void delete(Cliente cliente);
	
	public List<Region> findAllRegiones();
	
	public Factura findFacturaById(Long id);
	
	public List<Factura> findFacturaAll();
	
	public Factura saveFactura(Factura factura);
	
	public void deleteFacturaById(Long id);

	public List<Producto> findProductoByNombre(String term);

}
