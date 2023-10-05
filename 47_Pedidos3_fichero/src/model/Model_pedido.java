package model;

import java.time.LocalDate;

public class Model_pedido {

	private String producto;
	private LocalDate fechapedido;
	private Double precio;
	public Model_pedido(String producto, LocalDate fechapedido, Double precio) {
		super();
		this.producto = producto;
		this.fechapedido = fechapedido;
		this.precio = precio;
	}
	public String getProducto() {
		return producto;
	}
	public void setProducto(String producto) {
		this.producto = producto;
	}
	public LocalDate getFechapedido() {
		return fechapedido;
	}
	public void setFechapedido(LocalDate fechapedido) {
		this.fechapedido = fechapedido;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}

}
