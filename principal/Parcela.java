package principal;

import java.time.LocalDate;
enum TipoPagamento{
	DINHEIRO,
	CARTAO_DE_CREDITO,
	CARTAO_DE_DEBITO,
	PIX
}

public class Parcela {
	private LocalDate dataVecto;
	private double valor;
	private float juros;
	private TipoPagamento tipo;
	private LocalDate dataPagto;
	
	public Parcela() {
		
	}
	public Parcela(LocalDate dataVecto, double valor, float juros, TipoPagamento tipo, LocalDate dataPagto) {
		this.dataVecto = dataVecto;
		this.valor = valor;
		this.juros = juros;
		this.tipo = tipo;
		this.dataPagto = dataPagto;
	}
	public LocalDate getDataVecto() {
		return dataVecto;
	}
	public void setDataVecto(LocalDate dataVecto) {
		this.dataVecto = dataVecto;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public float getJuros() {
		return juros;
	}
	public void setJuros(float juros) {
		this.juros = juros;
	}
	public TipoPagamento getTipo() {
		return tipo;
	}
	public void setTipo(TipoPagamento tipo) {
		this.tipo = tipo;
	}
	public LocalDate getDataPagto() {
		return dataPagto;
	}
	public void setDataPagto(LocalDate dataPagto) {
		this.dataPagto = dataPagto;
	}
	
	
	
}
