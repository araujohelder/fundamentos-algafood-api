package com.algaworks.algafood.notificacao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import com.algaworks.algafood.modelo.Cliente;

@Component
@Profile("prod")
@TipoNotificador(NivelUrgencia.SEM_URGENCIA)
public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties notificadorProperties;
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		
		System.out.println("SMTP: "  + this.notificadorProperties.getHostServidor());
		System.out.println("Porta: " + this.notificadorProperties.getPortaServidor());
		
		System.out.printf("Notificando %s através do email: %s: %s\n",
				cliente.getNome(), cliente.getEmail(),mensagem);
	}
}
