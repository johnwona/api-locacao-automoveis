package br.com.locadora.springbootapi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.locadora.springbootapi.entity.Boleto;
import br.com.locadora.springbootapi.repository.BoletoRepository;
import br.com.locadora.springbootapi.service.BoletoService;
import br.com.locadora.springbootapi.utils.GeradoraBoleto;

@Service
public class BoletoServiceImpl implements BoletoService {

	@Autowired
	private BoletoRepository boletoReposotory;

	@Override
	public Boleto salvarBoleto(Boleto boleto) {
		GeradoraBoleto gerarBoleto = new GeradoraBoleto();
		boleto.setCodigo_boleto(gerarBoleto.gerarCodigoBoleto(boleto.getValor()));
		return boletoReposotory.save(boleto);
	}

}
