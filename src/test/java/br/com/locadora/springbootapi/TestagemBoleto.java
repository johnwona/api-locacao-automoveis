package br.com.locadora.springbootapi;

import br.com.locadora.springbootapi.utils.GeradoraBoleto;

public class TestagemBoleto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GeradoraBoleto testeBoleto =  new GeradoraBoleto();
		System.out.println(testeBoleto.gerarCodigoBoleto(3500.93));

	}

}
