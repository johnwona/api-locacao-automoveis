package br.com.locadora.springbootapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.locadora.springbootapi.entity.Boleto;

@Repository
public interface BoletoRepository extends JpaRepository<Boleto, Long> {
}