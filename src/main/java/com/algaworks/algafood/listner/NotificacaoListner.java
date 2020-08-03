package com.algaworks.algafood.listner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.algaworks.algafood.notificacao.NivelUrgencia;
import com.algaworks.algafood.notificacao.Notificador;
import com.algaworks.algafood.notificacao.TipoNotificador;
import com.algaworks.algafood.service.ClienteAtivadoEvent;


@Component
public class NotificacaoListner {
	
	@Autowired
	@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListner(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Cliente Ativado");
	}

}
