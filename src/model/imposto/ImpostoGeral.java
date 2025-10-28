package model.imposto;

public class ImpostoGeral {
	private IPI valorIPI;
	private ICMS valorICMS;
	private double valorImpostos;
	
	public ImpostoGeral(IPI valorIPI, ICMS valorICMS) {
		this.valorIPI = valorIPI;
		this.valorICMS = valorICMS;
		this.valorImpostos = valorICMS.getValorImposto() + valorIPI.getValorImposto();
	}
	
	public ImpostoGeral(IPI valorIPI) {
		this.valorIPI = valorIPI;
		this.valorImpostos = valorIPI.getValorImposto();
	}
	
	public ImpostoGeral(ICMS valorICMS) {
		this.valorICMS = valorICMS;
		this.valorImpostos = valorICMS.getValorImposto();
	}

	public double getValorImpostos() {
		return valorImpostos;
	}

}
