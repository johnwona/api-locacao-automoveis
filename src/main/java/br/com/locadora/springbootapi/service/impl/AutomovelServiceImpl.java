package br.com.locadora.springbootapi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.locadora.springbootapi.entity.Automovel;
import br.com.locadora.springbootapi.repository.AutomovelRepository;
import br.com.locadora.springbootapi.service.AutomovelService;

@Service
public class AutomovelServiceImpl implements AutomovelService {

	@Autowired
	private AutomovelRepository automovelReposotory;
	
	@Override
	public Automovel salvarAutomovel(Automovel automovel) {
		return automovelReposotory.save(automovel);
	}

	@Override
	public List<Automovel> listarAutomoveis() {
		return automovelReposotory.findAll();
	}

}
