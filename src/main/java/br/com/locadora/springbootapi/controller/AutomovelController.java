package br.com.locadora.springbootapi.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.locadora.springbootapi.entity.Automovel;
import br.com.locadora.springbootapi.service.AutomovelService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class AutomovelController {

	@Autowired
	private AutomovelService automovelService;

	@ApiOperation(value = "Retorna uma lista de automoveis")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Retorna a lista de automoveis cadastrados"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"), })
	@RequestMapping(value = "/automovel", method = RequestMethod.GET, produces = "application/json")
	public List<Automovel> Get() {
		return automovelService.listarAutomoveis();
	}

	@ApiOperation(value = "Cadastra um novo automovel")
	@ApiResponses(value = { @ApiResponse(code = 201, message = "Automovel cadastrado com sucesso"),
			@ApiResponse(code = 403, message = "Você não tem permissão para acessar este recurso"),
			@ApiResponse(code = 500, message = "Foi gerada uma exceção"), })
	@RequestMapping(value = "/cadastroAutomoveis", method = RequestMethod.POST, produces = "application/json", consumes = "application/json")
	public Automovel Post(@Valid @RequestBody Automovel automovel) {
		return automovelService.salvarAutomovel(automovel);
	}

}