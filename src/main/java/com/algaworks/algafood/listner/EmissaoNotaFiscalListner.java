package com.algaworks.algafood.listner;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.service.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalListner {

	
	@EventListener
	public void clienteAtivadoListner(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal do cliente:" + event.getCliente().getNome());
	}
	
}
