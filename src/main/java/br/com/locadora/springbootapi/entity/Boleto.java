package br.com.locadora.springbootapi.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class Boleto
{
	   @ApiModelProperty(value = "id do boleto")
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private long id_boleto;
	   
	    @ApiModelProperty(value = "Codigo do boleto")
	    @Column(nullable = true)
	    private String codigo_boleto;

	    @ApiModelProperty(value = "Marca do automovel")
	    @Column(nullable = false)
	    private String marca;
	    
	    @ApiModelProperty(value = "Modelo do automovel")
	    @Column(nullable = false)
	    private String modelo;
        
	    @ApiModelProperty(value = "Modelo do automovel")
	    @Column(nullable = false)
	    private double  valor;
	    
	    @ApiModelProperty(value = "Modelo de vencimento do boleto")
	    @Column(nullable = false)
	    private Date  data_vencimento;

		public long getId_boleto() {
			return id_boleto;
		}

		public void setId_boleto(long id_boleto) {
			this.id_boleto = id_boleto;
		}

		public String getCodigo_boleto() {
			return codigo_boleto;
		}

		public void setCodigo_boleto(String codigo_boleto) {
			this.codigo_boleto = codigo_boleto;
		}

		public String getMarca() {
			return marca;
		}

		public void setMarca(String marca) {
			this.marca = marca;
		}

		public String getModelo() {
			return modelo;
		}

		public void setModelo(String modelo) {
			this.modelo = modelo;
		}

		public double getValor() {
			return valor;
		}

		public void setValor(double valor) {
			this.valor = valor;
		}

		public Date getData_vencimento() {
			return data_vencimento;
		}

		public void setData_vencimento(Date data_vencimento) {
			this.data_vencimento = data_vencimento;
		}
	    
	    
}