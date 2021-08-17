package com.algaworks.algalog.api.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class DestinatarioInput {

	@NotBlank
	String nome;
	
	@NotBlank
	private String logradouro;
	
	@NotBlank
	private String numero;
	
	@NotBlank
	private String complemento;
	
	@NotBlank
	private String bairro;
}
