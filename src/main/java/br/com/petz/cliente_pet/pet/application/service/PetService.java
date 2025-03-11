package br.com.petz.cliente_pet.pet.application.service;

import java.util.List;
import java.util.UUID;

import br.com.petz.cliente_pet.pet.application.api.PetClienteDetalheResponse;
import br.com.petz.cliente_pet.pet.application.api.PetClienteListResponse;
import br.com.petz.cliente_pet.pet.application.api.PetRequest;
import br.com.petz.cliente_pet.pet.application.api.PetResponse;
import jakarta.validation.Valid;


public interface PetService {
	PetResponse criaPet(UUID idCliente, @Valid PetRequest petRequest);
	List<PetClienteListResponse> buscaPetsDoClienteComId(UUID idCliente);
	PetClienteDetalheResponse buscaPetsDoClienteComId(UUID idCliente, UUID idPet);
	static void deletaPetDoClienteComID(UUID idCliente, UUID idPet) {
	}
	void deletePetDoClienteComId(UUID idCliente, UUID idPet);

}
