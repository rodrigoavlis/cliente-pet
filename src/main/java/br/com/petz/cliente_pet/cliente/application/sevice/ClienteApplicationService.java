package br.com.petz.cliente_pet.cliente.application.sevice;

import org.springframework.stereotype.Service;

import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse;
import br.com.petz.cliente_pet.cliente.application.api.clienteRequest;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
public class ClienteApplicationService implements ClienteService {

	@Override
	public ClienteResponse criaCliente(clienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplication - cliaCliente");
		Cliente cliente = clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplication - cliaCliente");
		return null;
	}

}
