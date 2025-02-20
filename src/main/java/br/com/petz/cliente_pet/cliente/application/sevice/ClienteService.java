package br.com.petz.cliente_pet.cliente.application.sevice;

import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse;

import java.util.List;

import br.com.petz.cliente_pet.cliente.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.application.api.ClienteRequest;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();

}
