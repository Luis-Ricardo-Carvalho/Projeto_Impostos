package model.imposto;

import model.produto.precoCusto.PrecoCusto;

public class ICMS {
	private String origem;
	private String destino;
	private double valorDestino;
	private double valorProduto;
	private double valorImposto;
	
	public ICMS(PrecoCusto precoCusto, String destino, String origem) {
		this.origem = origem;
		this.destino = destino;
		this.valorDestino = aliquotaDestino();
		this.valorProduto = precoCusto.getValorProduto();
		this.valorImposto = (this.valorProduto)*(this.valorDestino);
	}

	public double getValorImposto() {
		return valorImposto;
	}
	
	private double aliquotaDestino() {		
		if(this.destino.equals("MG") && this.origem.equals("MG"))
			return 0.12;		
		if(this.destino.equals("MG") && this.origem.equals("SP"))
			return 0.07;
		
		return 0;
	}

}
