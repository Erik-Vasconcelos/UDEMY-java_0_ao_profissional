package lambdas;

public class Produto {
	
	final String nome;
	final double preco;
	final double desconto;
	
	/*usando o construtor gerado pelo o eclipse Alt + Shift + S e 
	Generate Constructor using Fields*/
	
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	
	public String getNome() {
		return nome;
	}

	public double getPreco() {
		return preco;
	}

	public double getDesconto() {
		return desconto;
	}

	@Override
	public String toString() {
		double precoFinal = preco * (1-desconto);
		return nome+" Preco = "+precoFinal;
	}
	
	
	
	
}
