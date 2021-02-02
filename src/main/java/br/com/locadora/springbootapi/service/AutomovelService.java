package br.com.locadora.springbootapi.service;

import java.util.List;

import br.com.locadora.springbootapi.entity.Automovel;

public interface AutomovelService {
	
	public Automovel salvarAutomovel(Automovel automovel);
	public List<Automovel> listarAutomoveis();

}
