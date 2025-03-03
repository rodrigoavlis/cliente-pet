package br.com.petz.cliente_pet.cliente.application.api;

import java.time.LocalDate;

import br.com.petz.cliente_pet.cliente.domain.Sexo;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ClienteAlteracaoRequest {

	@NotBlank
	private String nomeCompleto;

	@NotBlank
	private String celular;

	private String telefone;

	private Sexo sexo;

	@NotNull
	private LocalDate dataDeNascimento;

	@NotNull
	private Boolean aceitaTermos;
}
