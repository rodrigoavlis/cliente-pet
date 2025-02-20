package br.com.petz.cliente_pet.cliente.application.sevice;

import org.springframework.stereotype.Service;

import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse;
import br.com.petz.cliente_pet.cliente.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.application.repository.ClienteRepository;
import br.com.petz.cliente_pet.cliente.domain.Cliente;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Service
@Log4j2
@RequiredArgsConstructor
public class ClienteApplicationService implements ClienteService {

	private final ClienteRepository clienteRepository;

	@Override
	public ClienteResponse criaCliente(ClienteRequest clienteRequest) {
		log.info("[inicia] ClienteApplication - cliaCliente");
		Cliente cliente =  clienteRepository.salva(new Cliente(clienteRequest));
		log.info("[finaliza] ClienteApplication - cliaCliente");
		return ClienteResponse.builder()
				.idCliente(cliente.getIdCliente())
				.build();
	}

}
