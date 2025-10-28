package model.imposto;

import model.produto.precoCusto.PrecoCusto;

public class IPI {
	private double baseCauculo;
	private double valorImposto;
	
	public IPI(PrecoCusto precoCusto) {
		this.baseCauculo = precoCusto.getValorProduto()+ precoCusto.getFrete() + precoCusto.getSeguro();
		this.valorImposto = this.baseCauculo * 0.15;
	}

	public double getBaseCauculo() {
		return baseCauculo;
	}

	public double getValorImposto() {
		return valorImposto;
	}

}
