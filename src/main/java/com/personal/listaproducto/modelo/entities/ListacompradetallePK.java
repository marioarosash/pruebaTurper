package com.personal.listaproducto.modelo.entities;

import javax.persistence.Column;

public class ListacompradetallePK {
	
	
    @Column(name = "IDLISTACOMPRA", insertable = false, updatable = false)
	private Long idlistacompra;
    
    
    @Column(name = "IDPROCDUTO",  insertable = false, updatable = false)
	private Long idproducto;
	

}
