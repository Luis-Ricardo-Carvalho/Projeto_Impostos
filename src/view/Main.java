package view;

import model.imposto.ICMS;
import model.imposto.IPI;
import model.imposto.ImpostoGeral;
import model.produto.Produto;
import model.produto.precoCusto.PrecoCusto;

public class Main {

	public static void main(String[] args) {
		
		PrecoCusto objPrecoCusto = new PrecoCusto(10, 5, 25);
		IPI objIPI = new IPI(objPrecoCusto);
		ICMS objICMS = new ICMS(objPrecoCusto,"MG","SP");
		ImpostoGeral objImpostoGeral = new ImpostoGeral(objIPI, objICMS);
		ImpostoGeral objImpostoGeralIPI = new ImpostoGeral(objIPI);
		ImpostoGeral objImpostoGeralCMS = new ImpostoGeral(objICMS);
		
		Produto objProduto = new Produto("Sapato Padrão", 1.1, objPrecoCusto, objImpostoGeral);		
		Produto objProduto2 = new Produto("Sapato Padrão", 1.1, objPrecoCusto, objImpostoGeralIPI);
		Produto objProduto3 = new Produto("Sapato Padrão", 1.1, objPrecoCusto, objImpostoGeralCMS);
		
		System.out.println("Preco Final dois impostos: "+objProduto.getPrecoFinal());
		System.out.println("Preco Final IPI: "+objProduto2.getPrecoFinal());
		System.out.println("Preco Final ICMS: "+objProduto3.getPrecoFinal());

	}

}
