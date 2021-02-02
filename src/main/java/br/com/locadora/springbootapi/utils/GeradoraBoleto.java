package br.com.locadora.springbootapi.utils;

public class GeradoraBoleto {

	public String gerarCodigoBoleto(double valor) {
		StringBuilder codigo = new StringBuilder();

		codigo.append("341.");// identificador do banco
		codigo.append("99.");// tipo de moeda
		codigo.append("32766 55400.");// convenio
		codigo.append("013383 13626."); // fatura
		codigo.append("40101");
		codigo.append(" 7 ");// digito verificador pré-calculado manualmente numero fake
		codigo.append("7755");// quantidade de dias passados apos a data base numero fake
		codigo.append("000");
		codigo.append(this.concatenarValor(valor)); // valor do boleto
		return codigo.toString();
	}

	private String concatenarValor(double valor) {

		String valorConcatenado = this.converterValorString(valor);
		valorConcatenado = valorConcatenado.replace(",", "");
		valorConcatenado = valorConcatenado.replace(".", "");
		return valorConcatenado;
	}
	
	private String converterValorString(double valor) {
		Double valorDouble = valor;
		return valorDouble.toString();
	}

}
