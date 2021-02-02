package br.com.locadora.springbootapi.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Automovel
{
	   @ApiModelProperty(value = "id do automovel")
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id_automovel;

	    @ApiModelProperty(value = "Marca do automovel")
	    @Column(nullable = false)
	    private String marca;
	    
	    @ApiModelProperty(value = "Modelo do automovel")
	    @Column(nullable = false)
	    private String modelo;
        
	    @ApiModelProperty(value = "Modelo do automovel")
	    @Column(nullable = false)
	    private double  valor;
	    
	    @ApiModelProperty(value = "Modelo de castro do automovel")
	    @Column(nullable = false)
	    private Date  data_cadastro;
}