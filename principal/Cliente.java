package principal;


public class Cliente {
	private String cpf;
	private String cnpj;
	private String nome;
	private Endereco endereco;
	private double limiteDeCredito;
	
	public Cliente() {
	
	}
	public Cliente(String cpf, String cnpj, String nome, Endereco endereco, double limiteDeCredito) {
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.nome = nome;
		this.endereco = endereco;
		this.limiteDeCredito = limiteDeCredito;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCnpj() {
		return cnpj;
	}
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public double getLimiteDeCredito() {
		return limiteDeCredito;
	}
	public void setLimiteDeCredito(double limiteDeCredito) {
		this.limiteDeCredito = limiteDeCredito;
	}
	
	
	
}

	