package com.personal.listaproducto.services;

import java.util.List;

import com.personal.listaproducto.modelo.entities.Clientes;


public interface ClientesServ {
	public List<Clientes> listar();
	
	public Clientes  crearCliente(Clientes c);
}
