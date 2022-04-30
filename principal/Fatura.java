package principal;

import java.time.LocalDate;
import java.util.ArrayList;

public class Fatura {
	private Conta conta;
	private LocalDate dataQuitacao;
	private float juros;
	private int quantParcelas;
	private ArrayList<Parcela> parcelas;
	
	public Fatura() {
		
	}
	public Fatura(Conta conta, LocalDate dataQuitacao, float juros, int quantParcelas, ArrayList<Parcela> parcelas) {
		this.conta = conta;
		this.dataQuitacao = dataQuitacao;
		this.juros = juros;
		this.quantParcelas = quantParcelas;
		this.parcelas = parcelas;
	}
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public LocalDate getDataQuitacao() {
		return dataQuitacao;
	}
	public void setDataQuitacao(LocalDate dataQuitacao) {
		this.dataQuitacao = dataQuitacao;
	}
	public float getJuros() {
		return juros;
	}
	public void setJuros(float juros) {
		this.juros = juros;
	}
	public int getQuantParcelas() {
		return quantParcelas;
	}
	public void setQuantParcelas(int quantParcelas) {
		this.quantParcelas = quantParcelas;
	}
	public ArrayList<Parcela> getParcelas() {
		return parcelas;
	}
	public void setParcelas(ArrayList<Parcela> parcelas) {
		this.parcelas = parcelas;
	}
	
}
