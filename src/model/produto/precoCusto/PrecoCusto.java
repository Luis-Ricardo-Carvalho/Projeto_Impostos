package model.produto.precoCusto;

public class PrecoCusto {
	private double frete;
	private double seguro;
	private double valorProduto;
	
	public PrecoCusto(double frete, double seguro, double valorProduto){
		this.frete = frete;
		this.seguro = seguro;
		this.valorProduto = valorProduto;
	}
	
	public double getFrete() {
		return frete;
	}
	
	public double getSeguro() {
		return seguro;
	}

	public double getValorProduto() {
		return valorProduto;
	}
}
