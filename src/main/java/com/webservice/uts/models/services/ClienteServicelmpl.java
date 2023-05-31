package com.webservice.uts.models.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.webservice.uts.models.entites.Cliente;
import com.webservice.uts.models.entites.Factura;
import com.webservice.uts.models.entites.Producto;
import com.webservice.uts.models.entites.Region;


import com.webservice.uts.models.dao.IClienteDao;
import com.webservice.uts.models.dao.IFacturaDao;
import com.webservice.uts.models.dao.IProductoDao;

@Service
public class ClienteServicelmpl  implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;
	
	@Autowired
	private IFacturaDao facturaDao;
	
	@Autowired
	private IProductoDao productoDao;
	
	@Override
	
	public List<Cliente> findAll(){
		return (List<Cliente>) clienteDao.findAll();
	}
	
	
	@Override
	public Cliente findById(Long id) {
		return  clienteDao.findById(id).orElse(null);
	}
	
	@Override
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}
	
	
	@Override
	public void delete(Cliente cliente) {
		clienteDao.delete(cliente);
	}
	
	@Override
	@Transactional(readOnly = true)
	public List<Region> findAllRegiones() {
		return clienteDao.findAllRegiones();
	}
	
	@Override
	@Transactional(readOnly=true)
	public Factura findFacturaById(Long id) {
		return facturaDao.findById(id).orElse(null);
		
	}

	@Override
	@Transactional
	public Factura saveFactura(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	@Transactional
	public void deleteFacturaById(Long id) {
		facturaDao.deleteById(id);
		
	}

	@Override
	@Transactional(readOnly = true)
	public List<Producto> findProductoByNombre(String term) {
		return productoDao.findByNombreContainingIgnoreCase(term);
	}

	@Override
	public List<Factura> findFacturaAll() {
		 return (List<Factura>) facturaDao.findAll();
	}

}
