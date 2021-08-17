package com.algaworks.algalog.api.model.input;

import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
public class ClienteIdInput {

	@NotNull
	Long id;
}
