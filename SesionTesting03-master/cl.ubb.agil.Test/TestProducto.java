
import org.junit.Before;

import org.junit.Test;

import cl.ubb.agil.Categoria;
import cl.ubb.agil.Existencia;
import cl.ubb.agil.Producto;
import jdk.net.NetworkPermission;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;


public class TestProducto {
	
	private Producto producto;
	private String nombre;
	private int min=5;
	private int max=10;
	private Categoria categoria;
	
	@Before 
	public void setup() throws Exception{
	 producto= new Producto(nombre,min, max, categoria);
		 System.out.println("pasa");
	}
	
	@Test
	public void getStock(){
		
		 int resultado=producto.getStock();
		 assertThat(resultado,is(0));
	}

	@Test
	public void getStockProducto(){
		Producto producto;
		producto= new Producto(nombre,min,max);
		 int resultado=producto.getStock();
		 assertThat(resultado,is(0));
	}
	@Test
	public void isBajoStockProductoTrue(){
		Producto producto;
		producto= new Producto(nombre,min,max);
		 boolean resultado=producto.isBajoStock();
		 assertThat(resultado,is(true));
	}
	@Test
	public void isBajoStockProductoFalse(){
		Producto producto;
		producto= new Producto(nombre,min,max);
		 boolean resultado=producto.isBajoStock();
		 assertThat(resultado,is(false));
	}

 @Test
 public void isBajoStockTrue(){
	 boolean resultado = producto.isBajoStock();
	 assertThat(resultado, is(true));
 }

 @Test
 public void isBajoStockFalse(){
	 boolean resultado = producto.isBajoStock();
	 assertThat(resultado, is(false));
 }
 
 
 
 
 
}//fin de la clase