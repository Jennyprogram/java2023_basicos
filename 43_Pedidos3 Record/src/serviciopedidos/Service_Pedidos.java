package serviciopedidos;

import java.time.LocalDate;
import java.util.ArrayList;

import model.Model_Pedido;



public class Service_Pedidos {

	ArrayList<Model_pedido> pedidos=new ArrayList<>();

	public void AddPedido(String producto, LocalDate fechapedido, Double precio) {
		pedidos.add(new Service_pedido(producto,fechapedido,precio));
	}

	public void Imppedidos() {
		for(int i=0; i < pedidos.size() ; i++) {
			
			System.out.print("Producto :"+ pedidos.get(i).getProducto());
			System.out.print(" "+ pedidos.get(i).getFechapedido());
			System.out.println(" Precio "+ pedidos.get(i).getPrecio());
		
		}
	}
	
	public void Bus_pedido_reciente() {
		for(int i=0; i < pedidos.size() ; i++) {
			
			System.out.print("Producto :"+ pedidos.get(i).getProducto());
			System.out.print(" "+ pedidos.get(i).getFechapedido());
			System.out.println(" Precio "+ pedidos.get(i).getPrecio());
		
		}
	}
	

}
