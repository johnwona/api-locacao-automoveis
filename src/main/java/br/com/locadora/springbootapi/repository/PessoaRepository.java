package br.com.locadora.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.locadora.springbootapi.entity.Pessoa;

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> { }