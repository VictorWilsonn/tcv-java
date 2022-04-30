package principal;

import java.time.LocalDate;
import java.util.ArrayList;

enum TipoCompra{
	A_VISTA,
	A_PRAZO
}

public class Compra {
	private ArrayList<Produto> produtos;
	private LocalDate data;
	private Cliente cliente;
	private TipoCompra tipo;
	
	public Compra() {
		
	}
	public Compra(ArrayList<Produto> produtos, LocalDate data, Cliente cliente, TipoCompra tipo) {
		this.produtos = produtos;
		this.data = data;
		this.cliente = cliente;
		this.tipo = tipo;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
		this.data = data;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public TipoCompra getTipo() {
		return tipo;
	}
	public void setTipo(TipoCompra tipo) {
		this.tipo = tipo;
	}	
}
