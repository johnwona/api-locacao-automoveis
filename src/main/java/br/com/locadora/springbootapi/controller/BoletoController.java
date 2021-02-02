package br.com.locadora.springbootapi.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.locadora.springbootapi.entity.Boleto;
import br.com.locadora.springbootapi.repository.BoletoRepository;
import br.com.locadora.springbootapi.service.BoletoService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class BoletoController {

	@Autowired
	private BoletoService boletoService;

	@ApiOperation(value = "Cadastra um novo boleto")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "boleto cadastrado com sucesso"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"), })
	@RequestMapping(value = "/boleto", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Boleto Post(@Valid @RequestBody Boleto boleto) {
		return boletoService.salvarBoleto(boleto);
	}

}