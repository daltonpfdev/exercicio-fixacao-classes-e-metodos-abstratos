package entities;

public abstract class Pessoa {
	
	private String nome;
	protected Double rendaAnual;
	
	public Pessoa() {
		
	}
	
	public Pessoa(String nome, Double rendaAnual) {
		this.nome = nome;
		this.rendaAnual = rendaAnual;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getRendaAnual() {
		return rendaAnual;
	}

	public abstract double imposto();
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(nome + ": $ ");
		sb.append(imposto() + "Reais");
		return sb.toString();
	}
	
}
