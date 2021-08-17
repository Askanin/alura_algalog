package com.algaworks.algalog.api.model.input;

import javax.validation.constraints.NotBlank;

import lombok.Data;

@Data
public class OcorrenciaInput {

	@NotBlank
	private String descricao;
}
