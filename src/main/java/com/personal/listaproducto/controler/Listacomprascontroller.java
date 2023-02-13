package com.personal.listaproducto.controler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.personal.listaproducto.modelo.entities.Clientes;
import com.personal.listaproducto.services.ClientesServ;

@RestController
public class Listacomprascontroller {
	@Autowired
	ClientesServ clientesServ;
	
	@GetMapping("/listarClientes")
 public List<Clientes>  listacliente(){
		return clientesServ.listar();
		
	}
	
	
	
	@PostMapping("/listarClientes")
	public ResponseEntity<Clientes> createClientes(@RequestBody Clientes cliente) {
		Clientes _cliente = clientesServ.crearCliente(cliente);
		return new ResponseEntity<>(_cliente, HttpStatus.CREATED);
	}
}
