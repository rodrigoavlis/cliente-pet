package br.com.petz.cliente_pet.cliente.application.sevice;

import java.util.List;
import java.util.UUID;

import br.com.petz.cliente_pet.cliente.application.api.ClienteAlteracaoRequest;
import br.com.petz.cliente_pet.cliente.application.api.ClienteDetalhadoResponse;
import br.com.petz.cliente_pet.cliente.application.api.ClienteListResponse;
import br.com.petz.cliente_pet.cliente.application.api.ClienteRequest;
import br.com.petz.cliente_pet.cliente.application.api.ClienteResponse;

public interface ClienteService {
	ClienteResponse criaCliente(ClienteRequest clienteRequest);
	List<ClienteListResponse> buscaTodosClientes();
	ClienteDetalhadoResponse buscaClienteAtravsId(UUID idCliente);
	void deletaClienteAtravsId(UUID idCliente);
	void patchAlteraCliente(UUID idCliente,ClienteAlteracaoRequest clienteAlteracaoRequest);

}
