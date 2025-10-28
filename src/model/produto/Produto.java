package model.produto;

import model.imposto.ImpostoGeral;
import model.produto.precoCusto.PrecoCusto;

public class Produto {
	private String nome;
	private double precoFinal;
	private double precoCusto;
	private double margemLucro;
	
	public Produto(String nome, double margemLucro, PrecoCusto precoCusto, ImpostoGeral impostoGeral){
		this.nome = nome;
		this.margemLucro = margemLucro;
		this.precoCusto = precoCusto.getValorProduto() + precoCusto.getSeguro() + precoCusto.getFrete();
		this.precoFinal = ((this.precoCusto)+(impostoGeral.getValorImpostos()))*(this.margemLucro);
	}

	public String getNome() {
		return nome;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public double getPrecoCusto() {
		return precoCusto;
	}

	public double getMargemLucro() {
		return margemLucro;
	}	

}
