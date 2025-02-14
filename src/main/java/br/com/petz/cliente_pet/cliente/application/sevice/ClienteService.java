package br.com.petz.cliente_pet.cliente.application.sevice;

import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse;
import br.com.petz.cliente_pet.cliente.application.api.clienteRequest;

public interface ClienteService {
	ClienteResponse criaCliente(clienteRequest clienteRequest);

}
