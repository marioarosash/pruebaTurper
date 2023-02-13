package com.personal.listaproducto.services.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.personal.listaproducto.modelo.entities.Clientes;
import com.personal.listaproducto.modelo.entities.dao.ClientesDao;
import com.personal.listaproducto.services.ClientesServ;

@Service
public class clientesServImpl implements ClientesServ{
	
	@Autowired
	ClientesDao clientesDao;

	@Override
	public List<Clientes> listar() {
		List<Clientes> lista = (List<Clientes>) clientesDao.findAll();
		return  lista;
	}
	@Transactional
	@Override
	public Clientes crearCliente(Clientes c) {
		Clientes cliente = clientesDao.save(c);
		return cliente;
	}
	


}
